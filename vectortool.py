import wx
import wx.lib.wxcairo
import cairo
from bufferedcanvas import BufferedCanvas
from myshapes import Rectangle, Circle
from datatree import TreeNode
        
class MyFrame(wx.Frame):
    def __init__(self, parent, title, nodes, ID=-1, pos=wx.DefaultPosition,
                 size=wx.DefaultSize, style=wx.DEFAULT_FRAME_STYLE):
        wx.Frame.__init__(self, parent, ID, title, pos, size=(640, 480), style=style)
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
    
    def changeLayer(self, mouseX, mouseY):
        origY = self.lstY - self.lstH
        deltaY = mouseY - origY
        index = int(deltaY / self.lstH)
        box = wx.TextEntryDialog(None, "Change rank of Layer '" + self.orderedLayers[index].name + "' to",
                                 self.orderedLayers[index].name, str(self.orderedLayers[index].rank))
        if (box.ShowModal()==wx.ID_OK):
            answer = box.GetValue()
            self.orderedLayers[index].rank = int(answer)
        box.Destroy()
        
    def reorderLayersFromTreeRoot(self, root):
        childStack = [root]

        while childStack != []:
            currentNode = childStack[0]
            childStack = childStack[1:]
            childStack = currentNode.children + childStack
            self.orderedLayers += [currentNode]
            
    def checkMouseBounds(self, mouseX, mouseY):
        rectX = self.lstX
        rectY = self.lstY - self.lstH
        rectW = self.lstW
        rectH = (self.lstH * len(self.orderedLayers))
            
        return (mouseX >= rectX and mouseX <= rectX + rectW and
                mouseY >= rectY and mouseY <= rectY + rectH)
            
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
            
            levelColor = (currentNode.level - 1) * 0.15
            
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
                cr.set_source_rgb(0,0,1);
                if (self.selectedLayer != None):
                    self.selectedLayer.selectedShape = False
                self.selectedLayer = currentNode.shapeLayer
                self.selectedLayer.selectedShape = True

            # not hovering over anything in the box
            elif (mouseX < lstBoxX or mouseX > lstBoxX + lstBoxW or
                  mouseY < lstBoxY or mouseY > lstBoxY + lstBoxH):
                cr.set_source_rgb(0 + levelColor, 0.1 + levelColor, 0.1 + levelColor)
                if (self.selectedLayer != None):
                    self.selectedLayer.selectedShape = False
                self.selectedLayer = None

            # hovering over another layer list item
            else:
                cr.set_source_rgb(0 + levelColor, 0.1 + levelColor, 0.1 + levelColor)

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
        self.nodes = nodes
        self.layerList = LayerListBox(350, 130, 250, 30)
        self.mouseX = 0;
        self.mouseY = 0;
        
        if (len(self.nodes) > 1):
            self.layerList.reorderLayersFromTreeRoot(self.nodes[0])
        
        BufferedCanvas.__init__(self, parent, -1)
        self.Bind(wx.EVT_MOTION, self.getCoords)
        self.Bind(wx.EVT_LEFT_UP, self.mouseClicked)
        
    def mouseClicked(self, evt):
        if (self.layerList.checkMouseBounds(self.mouseX, self.mouseY)):
            self.layerList.changeLayer(self.mouseX, self.mouseY)
            self.update()
        
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
        
        # white canvas
        cr.rectangle(30, 50, 280, 300)
        cr.set_source_rgb(1, 1, 1)
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
face = TreeNode("Face", Rectangle(70, 100, 200, 200, (0.8, 0.2, 0.2)), 10)
leftEyeWhite = TreeNode("Left Eye White", Rectangle(90, 120, 40, 60, (1, 1, 1)), 5)
leftPupil = TreeNode("Left Pupil", Rectangle(100, 140, 20, 20, (0, 0, 0)), 8)
nose = TreeNode("Nose", Circle(170, 220, 20, (0.6, 0.6, 0.9)), 4)
rightEyeWhite = TreeNode("Right Eye White", Rectangle(210, 120, 40, 60, (1, 1, 1)), 5)
rightPupil = TreeNode("Right Pupil", Rectangle(220, 140, 20, 20, (0, 0, 0)), 8)

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