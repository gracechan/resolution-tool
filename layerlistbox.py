import wx
import wx.lib.wxcairo
import cairo

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