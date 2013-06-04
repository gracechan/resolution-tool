import wx
import wx.lib.wxcairo
import cairo
import math

class BufferedCanvas(wx.Panel):
    buffer = None
    backbuffer = None
    
    def __init__(self, parent, ID=-1, pos=wx.DefaultPosition, size=wx.DefaultSize, style=wx.NO_FULL_REPAINT_ON_RESIZE):
        wx.Panel.__init__(self, parent, ID, pos, size, style)
        self.Bind(wx.EVT_PAINT, self.onPaint)
        self.Bind(wx.EVT_SIZE, self.onSize)
        
        def disable_event(*pargs, **kwargs):
            pass
        self.Bind(wx.EVT_ERASE_BACKGROUND, disable_event)
        self.onSize(None)
        
    def draw(self, dc):
        # called when the canvas needs to be re-drawn
        pass
    
    def flip(self):
        # flips the front and back buffers
        self.buffer, self.backbuffer = self.backbuffer, self.buffer
        self.Refresh()
    
    def update(self):
        # causes the canvas to be updated
        dc = wx.MemoryDC()
        dc.SelectObject(self.backbuffer)
        dc.BeginDrawing()
        self.draw(dc)
        dc.EndDrawing()
        self.flip()
        
    #event handlers
    def onPaint(self, event):
        #Blit the front buffer to the screen
        dc = wx.BufferedPaintDC(self, self.buffer)
        
    def onSize(self, event):
        # create a new off-screen buffer to hold the in-progress drawings on
        width, height = self.GetClientSizeTuple()
        if width == 0:
            width = 1
        if height == 0:
            height = 1
        self.buffer = wx.EmptyBitmap(width, height)
        self.backbuffer = wx.EmptyBitmap(width, height)
        # update the screen
        self.update()

# let rank = 0 and proportion = 0 essentially mean that the values are undefined
class TreeNode:
    def __init__(self, name, shape, rank=0, proportion=0):
        self.name = name
        self.shapeLayer = shape
        self.parent = None
        self.children = []
        self.level = 1
        self.rank = rank
        self.proportion = proportion
        
    def addChild(self, node):
        self.children += [node]
        node.assignParent(self)
        node.level = self.level + 1
        
    def assignParent(self, node):
        self.parent = node

class Shape:
    def __init__(self, x, y, rgb):
        self.x = x;
        self.y = y;
        self.rgb = rgb;
        self.selectedShape = False;
        
    def paint(self, cpanel):
        cpanel.set_source_rgb(1,0,0)
        self.paintShape(cpanel)
        
        if (self.selectedShape):
            cpanel.set_line_width(10)
            cpanel.stroke_preserve();
            
        cpanel.set_source_rgb(self.rgb[0], self.rgb[1], self.rgb[2])
        cpanel.fill()
        
    def paintShape(self, cpanel):
        pass
        
class Rectangle(Shape):
    def __init__(self, x, y, width, height, rgb):
        self.width = width;
        self.height = height;
        Shape.__init__(self, x, y, rgb);
        
    def paintShape(self, cpanel):
        cpanel.rectangle(self.x, self.y, self.width, self.height)
        
class Circle(Shape):
    def __init__(self, x, y, radius, rgb):
        self.radius = radius;
        Shape.__init__(self, x, y, rgb);
        
    def paintShape(self, cpanel):
        cpanel.arc(self.x, self.y, self.radius, 0, 2 * math.pi);
        
class MyFrame(wx.Frame):
    def __init__(self, parent, title, nodes, ID=-1, pos=wx.DefaultPosition,
                 size=wx.DefaultSize, style=wx.DEFAULT_FRAME_STYLE):
        wx.Frame.__init__(self, parent, ID, title, pos, size=(640, 480), style=style)
        #self.canvas = CairoPanel(self, nodes)
        self.canvas = CairoPanel(self, nodes)
        self.Bind(wx.EVT_CLOSE, self.onClose)
        
    def onClose(self, event):
        self.Show(False)
        self.Destroy()
        
class LayerListBox:
    def __init__(self, x, y, w, h):
        self.lstX = x
        self.lstY = y
        self.lstW = w
        self.lstH = h
        self.orderedLayers = []
        self.selectedLayer = None
        
    def reorderLayersFromTreeRoot(self, root):
        childStack = [root]
        levelStack = [1]
        ycounter = 0;
        
        while childStack != []:
            currentNode = childStack[0]
            childStack = childStack[1:]
            childStack = currentNode.children + childStack
    
            currentLevel = levelStack[0]
            levelStack = levelStack[1:]
            levelStack = [currentLevel + 1] * len(currentNode.children) + levelStack
            
            self.orderedLayers += [currentNode]
            
    def paint(self, cr, mouseX, mouseY):
        cr.set_line_width(0.04)
        cr.select_font_face("Sans", cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_BOLD)
        cr.set_font_size(0.04)
        
        ycounter = 0;
        drawLayers = self.orderedLayers
        
        lstBoxX = self.lstX
        lstBoxY = self.lstY - self.lstH
        lstBoxW = self.lstW
        lstBoxH = self.lstH * len(drawLayers)
        
        while drawLayers != []:
            currentNode = drawLayers[0]
            drawLayers = drawLayers[1:]
            
            levelColor = (currentNode.level - 1) * 0.1
            
            rectX = self.lstX + (currentNode.level - 1) * 15
            rectY = self.lstY + ycounter - self.lstH
            rectW = self.lstW - (currentNode.level - 1) * 15
            rectH = self.lstH - 2
            
            cr.rectangle(lstBoxX, rectY, self.lstW, self.lstH - 2)
            cr.set_source_rgb(1, 1, 1)
            cr.fill()
            
            cr.rectangle(rectX, rectY, rectW, rectH)
            
            # hovering over layer list item
            if (mouseX >= rectX and mouseX <= rectX + rectW and
                mouseY >= rectY and mouseY <= rectY + rectH):
                cr.set_source_rgb(1,0,0);
                if (self.selectedLayer != None):
                    self.selectedLayer.selectedShape = False
                self.selectedLayer = currentNode.shapeLayer
                self.selectedLayer.selectedShape = True

            # not hovering over anything in the box
            elif (mouseX < lstBoxX or mouseX > lstBoxX + lstBoxW or
                  mouseY < lstBoxY or mouseY > lstBoxY + lstBoxH):
                cr.set_source_rgb(0 + levelColor, 0.1 + levelColor, 0.3 + levelColor)
                if (self.selectedLayer != None):
                    self.selectedLayer.selectedShape = False
                self.selectedLayer = None

            # hovering over another layer list item
            else:
                cr.set_source_rgb(0 + levelColor, 0.1 + levelColor, 0.3 + levelColor)

            cr.fill()
            
            # layer text
            cr.set_source_rgb(1,1,1)
            cr.move_to(self.lstX + 30 + (currentNode.level - 1) * 15, self.lstY + ycounter - 10)
            cr.show_text(currentNode.name)
            cr.stroke()
            cr.move_to(self.lstX + self.lstW - 30, self.lstY + ycounter - 10)
            cr.show_text(str(currentNode.rank))
            cr.stroke()
            ycounter += self.lstH
        
class CairoPanel(BufferedCanvas):
    def __init__(self, parent, nodes):
        self.text = 'Hello World!'
        self.nodes = nodes
        self.layerList = LayerListBox(360, 100, 250, 30)
        self.mouseX = 0;
        self.mouseY = 0;
        
        if (len(self.nodes) > 1):
            self.layerList.reorderLayersFromTreeRoot(self.nodes[0])
        
        BufferedCanvas.__init__(self, parent, -1)
        self.Bind(wx.EVT_MOTION, self.getCoords)
        
    def getCoords(self, evt):
        self.mouseX = evt.GetX()
        self.mouseY = evt.GetY()        
        self.update()
        
    def draw(self, dc):
        width, height = self.GetClientSize()
        cr = wx.lib.wxcairo.ContextFromDC(dc)
        
        size = min(width, height)
        
        # black background
        cr.rectangle(0, 0, width, height)
        cr.set_source_rgb(0, 0, 0)
        cr.fill()
        
        # draw the shape layers
        for node in self.nodes:
            node.shapeLayer.paint(cr)
        
        # draw the layer list box
        self.layerList.paint(cr, self.mouseX, self.mouseY)
            
        # show the mouse coordinates
        cr.set_source_rgb(1,1,1)
        cr.set_line_width(0.04)
        cr.select_font_face("Sans", cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_BOLD)
        cr.set_font_size(0.07)
        cr.move_to(20, 400)
        cr.show_text("" + str(self.mouseX) + ", " + str(self.mouseY))
        cr.stroke()
        
    def SetText(self, text):
        self.text = text
        self.Refresh()
        

# START MAIN SCRIPT
face = TreeNode("face", Rectangle(100, 100, 200, 200, (0.8, 0.2, 0.2)), 10)
leftEyeWhite = TreeNode("left eye white", Rectangle(120, 120, 40, 60, (1, 1, 1)), 5)
leftPupil = TreeNode("left pupil", Rectangle(130, 140, 20, 20, (0, 0, 0)), 8)
nose = TreeNode("nose", Circle(200, 220, 20, (0.6, 0.6, 0.9)), 4)
rightEyeWhite = TreeNode("right eye white", Rectangle(240, 120, 40, 60, (1, 1, 1)), 5)
rightPupil = TreeNode("right pupil", Rectangle(250, 140, 20, 20, (0, 0, 0)), 8)

face.addChild(leftEyeWhite)
face.addChild(rightEyeWhite)
face.addChild(nose)
leftEyeWhite.addChild(leftPupil)
rightEyeWhite.addChild(rightPupil)
    
nodes = [face,
         leftEyeWhite,
         leftPupil,
         nose,
         rightEyeWhite,
         rightPupil]

#app = wx.App(False)
app = wx.PySimpleApp()
frame = MyFrame(None, 'Resolution Tool', nodes)
frame.Show(True)
app.MainLoop()