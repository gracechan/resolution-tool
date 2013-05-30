import wx
import wx.lib.wxcairo
import cairo
import math

# let rank = 0 and proportion = 0 essentially mean that the values are undefined

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

class TreeNode:
    def __init__(self, name, shape, rank=0, proportion=0):
        self.name = name
        self.shapeLayer = shape
        self.parent = None
        self.children = []
        self.rank = rank;
        self.proportion = proportion;
        
    def addChild(self, node):
        self.children += [node]
        node.assignParent(self)
        
    def assignParent(self, node):
        self.parent = node

class Rectangle:
    def __init__(self, x, y, width, height, rgb):
        self.x = x;
        self.y = y;
        self.width = width;
        self.height = height;
        self.rgb = rgb;
        
    def paint(self, cpanel):
        cpanel.set_source_rgb(self.rgb[0], self.rgb[1], self.rgb[2])
        cpanel.rectangle(self.x, self.y, self.width, self.height)
        cpanel.fill()
        
class Circle:
    def __init__(self, x, y, radius, rgb):
        self.x = x;
        self.y = y;
        self.radius = radius;
        self.rgb = rgb;
        
    def paint(self, cpanel):
        cpanel.set_source_rgb(self.rgb[0], self.rgb[1], self.rgb[2])
        cpanel.arc(self.x, self.y, self.radius, 0, 2 * math.pi);
        cpanel.fill()
        
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
        
class CairoPanel(BufferedCanvas):
    def __init__(self, parent, nodes):
        #wx.Panel.__init__(self, parent, style=wx.BORDER_SIMPLE)
        #self.Bind(wx.EVT_PAINT, self.OnPaint)
        self.text = 'Hello World!'
        self.nodes = []
        self.nodes = nodes
        self.mouseX = 0;
        
        BufferedCanvas.__init__(self, parent, -1)
        self.Bind(wx.EVT_MOTION, self.getCoords)
        
    def getCoords(self, evt):
        self.mouseX = evt.GetX()
        self.update()
        
    def draw(self, dc):
        #dc.SetBackground(wx.Brush("Black"))
        #dc.Clear()
        #dc.SetBrush(wx.BLUE_BRUSH)
        #dc.SetPen(wx.Pen('Red', 4))
        #dc.DrawRectangle(20,20,300,200)
        width, height = self.GetClientSize()
        cr = wx.lib.wxcairo.ContextFromDC(dc)
        
        size = min(width, height)
        #cr.scale(size, size)     # only include this if you want everything to shrink according to the window size
        
        cr.rectangle(0, 0, width, height)
        cr.set_source_rgb(0, 0, 0)
        cr.fill()
        
        cr.move_to(500, 20);
        cr.line_to(573, 69);
        cr.line_to(456, 44);
        cr.close_path();
        cr.set_source_rgb(0.5, 0.9, 0.8);
        cr.fill();
        
        
        #cr.set_source_rgb(1, 1, 1);
        #cr.arc(450, 300, 50, 0, 2 * math.pi);
        #cr.stroke_preserve();
        #cr.set_source_rgb(0.6, 0.6, 0.9);
        #cr.fill();
        
        for node in self.nodes:
            node.shapeLayer.paint(cr)       

        root = self.nodes[0]
        childStack = [root]
        levelStack = [1]
        ycounter = 0;
    
        
        cr.set_source_rgb(1,1,1)
        cr.set_line_width(0.04)
        cr.select_font_face("Sans", cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_BOLD)
        cr.set_font_size(0.04)
        while childStack != []:
            currentNode = childStack[0]
            childStack = childStack[1:]
            childStack = currentNode.children + childStack
    
            currentLevel = levelStack[0]
            levelStack = levelStack[1:]
            levelStack = [currentLevel + 1] * len(currentNode.children) + levelStack
            cr.move_to(400, 100 + ycounter)
            cr.show_text("--" * (currentLevel - 1) + currentNode.name)
            cr.stroke()
            cr.move_to(550, 100 + ycounter)
            cr.show_text(str(currentNode.rank))
            cr.stroke()
            ycounter += 20
            
        cr.set_source_rgb(1,1,1)
        cr.set_line_width(0.04)
        cr.select_font_face("Sans", cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_BOLD)
        cr.set_font_size(0.07)
        cr.move_to(20, 400)
        cr.show_text("" + str(self.mouseX))
        cr.stroke()
        
    def SetText(self, text):
        self.text = text
        self.Refresh()
        

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

#print "BREADTH FIRST SEARCH"
#root = face
#childQueue = [root]

#while childQueue != []:
    #currentNode = childQueue[0]
    #childQueue = childQueue[1:]
    #childQueue += currentNode.children
    #print currentNode.name

#print "DEPTH FIRST SEARCH"
#childStack = [root]
#levelStack = [1]

#while childStack != []:
    #currentNode = childStack[0]
    #childStack = childStack[1:]
    #childStack = currentNode.children + childStack
    
    #currentLevel = levelStack[0]
    #levelStack = levelStack[1:]
    #levelStack = [currentLevel + 1] * len(currentNode.children) + levelStack
        
    #print currentNode.name, currentLevel
    
nodes = [face,
          leftEyeWhite,
          leftPupil,
          nose,
          rightEyeWhite,
          rightPupil]

#app = wx.App(False)
#theFrame = MyFrame(None, 'Resolution Tool', nodes)
#app.MainLoop()

app = wx.PySimpleApp()
frame = MyFrame(None, 'Resolution Tool', nodes)
frame.Show(True)
app.MainLoop()