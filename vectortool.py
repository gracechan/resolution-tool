import wx
import wx.lib.wxcairo
import cairo
from bufferedcanvas import BufferedCanvas
from myshapes import Rectangle, Circle
from datatree import TreeNode
from slider import Slider
from layerlistbox import LayerListBox

canvasX = 30;
canvasY = 50;
        
class MyFrame(wx.Frame):
    def __init__(self, parent, title, nodes, ID=-1, pos=wx.DefaultPosition,
                 size=wx.DefaultSize, style=wx.DEFAULT_FRAME_STYLE):
        wx.Frame.__init__(self, parent, ID, title, pos, size=(640, 480), style=style)
        self.canvas = CairoPanel(self, nodes)
        self.Bind(wx.EVT_CLOSE, self.onClose)
        
    def onClose(self, event):
        self.Show(False)
        self.Destroy()
        
class CairoPanel(BufferedCanvas):
    def __init__(self, parent, nodes):
        self.nodes = nodes
        self.layerList = LayerListBox(350, 70, 250, 30)
        self.downScale = Slider(350, 300, 250, 10, [1,2,3], "Down Scale Factor")
        self.magnifyScale = Slider(350, 350, 250, 10, [1,2,3], "Magnify Scale Factor")
        self.mouseX = 0;
        self.mouseY = 0;
        
        if (len(self.nodes) > 1):
            self.layerList.reorderLayersFromTreeRoot(self.nodes[0])
        
        BufferedCanvas.__init__(self, parent, -1)
        self.Bind(wx.EVT_MOTION, self.mouseMoving)
        self.Bind(wx.EVT_LEFT_UP, self.mouseReleased) # TODO: We need an actual click event for layer stuff or simulate one
        self.Bind(wx.EVT_LEFT_DOWN, self.mousePressed)
        
    def mouseReleased(self, evt):
        if (self.layerList.checkMouseBounds(self.mouseX, self.mouseY)):
            self.layerList.changeLayer(self.mouseX, self.mouseY)
            self.update()
        if (self.downScale.isMoving):
            self.downScale.changeMoveStatus(False)
            self.downScale.snapToIndex()
            self.update()
        elif (self.magnifyScale.isMoving):
            self.magnifyScale.changeMoveStatus(False)
            self.magnifyScale.snapToIndex()
            self.update()
            
    def mousePressed(self, evt):
        if (self.downScale.checkMouseBounds(self.mouseX, self.mouseY)):
            self.downScale.changeMoveStatus(True)
        elif (self.magnifyScale.checkMouseBounds(self.mouseX, self.mouseY)):
            self.magnifyScale.changeMoveStatus(True)
        
    def mouseMoving(self, evt):
        self.mouseX = evt.GetX()
        self.mouseY = evt.GetY()
        
        if (self.downScale.isMoving):
            needToRescale = self.downScale.updateSlider(self.mouseX, self.mouseY)
            if (needToRescale):
                for node in self.nodes:
                    node.shapeLayer.changeDownScale(1.0 / self.downScale.getCurValue())
        elif (self.magnifyScale.isMoving):
            needToRescale = self.magnifyScale.updateSlider(self.mouseX, self.mouseY)
            if (needToRescale):
                for node in self.nodes:
                    node.shapeLayer.changeMagnifyScale(self.magnifyScale.getCurValue())
        
        self.update()
        
    def draw(self, dc):
        width, height = self.GetClientSize()
        cr = wx.lib.wxcairo.ContextFromDC(dc)
        
        size = min(width, height)
        
        # black background
        cr.rectangle(0, 0, width, height)
        cr.set_source_rgb(0, 0, 0)
        cr.fill()
        
        # grey border
        cr.rectangle(20, 40, 300, 320)
        cr.set_source_rgb(0.5, 0.5, 0.5)
        cr.fill()
        
        # white canvas
        cr.rectangle(canvasX, canvasY, 280, 300)
        cr.set_source_rgb(1, 1, 1)
        cr.fill()
        
        # draw the shape layers
        for node in self.nodes:
            node.shapeLayer.paint(cr)
            
        # redraw part of black background and grey border as prelim clipping implementation
        cr.set_source_rgb(0, 0, 0)
        cr.rectangle(320, 0, width - 320, height)
        cr.fill()
        cr.rectangle(0, 360, width, height - 360)
        cr.fill()
        
        cr.set_source_rgb(0.5, 0.5, 0.5)
        cr.rectangle(310, 40, 10, 320)
        cr.fill()
        cr.rectangle(20, 350, 300, 10)
        cr.fill()
        
            
        ## show grid
        #cr.set_source_rgb(0.5,0.5,0.5)
        #cr.set_line_width(1)
        
        #for i in range(canvasY, canvasY + 300, 10):
            #cr.move_to(canvasX, i)
            #cr.line_to(canvasX + 280, i)
            
        #for i in range(canvasX, canvasX + 280, 10):
            #cr.move_to(i, canvasY)
            #cr.line_to(i, canvasY + 300)
            
        #cr.stroke()
        
        # draw the layer list box
        self.layerList.paint(cr, self.mouseX, self.mouseY)
        
        # draw sliders
        self.downScale.paint(cr)
        self.magnifyScale.paint(cr)
            
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
face = TreeNode("Face", Rectangle(40, 50, 200, 200, (0.8, 0.2, 0.2), (canvasX, canvasY)), 10)
leftEyeWhite = TreeNode("Left Eye White", Rectangle(60, 70, 40, 60, (1, 1, 1), (canvasX, canvasY)), 5)
leftPupil = TreeNode("Left Pupil", Rectangle(70, 90, 20, 20, (0, 0, 0), (canvasX, canvasY)), 8)
nose = TreeNode("Nose", Circle(140, 170, 20, (0.6, 0.6, 0.9), (canvasX, canvasY)), 4)
rightEyeWhite = TreeNode("Right Eye White", Rectangle(180, 70, 40, 60, (1, 1, 1), (canvasX, canvasY)), 5)
rightPupil = TreeNode("Right Pupil", Rectangle(190, 90, 20, 20, (0, 0, 0), (canvasX, canvasY)), 8)
mouth = TreeNode("Mouth", Rectangle(100, 220, 80, 1, (0, 0, 0), (canvasX, canvasY)), 53)

face.addChild(leftEyeWhite)
face.addChild(rightEyeWhite)
face.addChild(nose)
leftEyeWhite.addChild(leftPupil)
rightEyeWhite.addChild(rightPupil)
face.addChild(mouth)
    
nodes = [face,
         leftEyeWhite,
         leftPupil,
         nose,
         rightEyeWhite,
         rightPupil,
         mouth]

#app = wx.App(False)
app = wx.PySimpleApp()
frame = MyFrame(None, 'Resolution Tool', nodes)
frame.Show(True)
app.MainLoop()