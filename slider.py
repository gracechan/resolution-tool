import cairo

class Slider:
    def __init__(self, x, y, w, h, values, name):
        self.x = x
        self.y = y
        self.w = w
        self.h = h
        self.values = values
        self.name = name
        self.curIndex = 0
        self.pickerX = 0
        self.adjspace = w / (len(values) - 1)
        self.isMoving = False;
        
    def changeMoveStatus(self, status):
        self.isMoving = status
        
    def getCurValue(self):
        return self.values[self.curIndex]
        
    def updateSnapPoint(self):
        offset = self.pickerX % self.adjspace
        index = int(self.pickerX / self.adjspace)
        if (offset >= self.adjspace / 2):
            index += 1
        if (self.curIndex != index):
            self.curIndex = index
            return True
        return False
        
    def snapToIndex(self):        
        xval = self.curIndex * self.adjspace - 15
        if (self.curIndex == 0):
            xval += 15
        if (self.curIndex == len(self.values) - 1):
            xval -= 15
        self.pickerX = xval
        
    def paint(self, cpanel):
        # show the mouse coordinates
        cpanel.set_source_rgb(1,1,1)
        cpanel.set_line_width(0.04)
        cpanel.select_font_face("Sans", cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_BOLD)
        cpanel.set_font_size(0.07)
        cpanel.move_to(self.x, self.y - 10)
        cpanel.show_text(self.name + ": " + str(self.values[self.curIndex]))
        cpanel.stroke()
        
        cpanel.set_source_rgb(0.75, 0.75, 0.75)
        cpanel.rectangle(self.x, self.y, self.w, self.h)
        cpanel.fill()
        
        cpanel.set_source_rgb(0.5, 0.5, 0.5)
        cpanel.rectangle(self.x + self.pickerX, self.y - 2, 30, 14)
        cpanel.fill()
        
    def checkMouseBounds(self, x, y):
        return (x >= self.x and x <= self.x + self.w and
                y >= self.y and y <= self.y + self.h)
    
    def updateSlider(self, x, y):
        delta = x - self.x - 15
        if (delta <= 0):
            delta = 0
        if (delta >= self.w - 30):
            delta = self.w - 30
        self.pickerX = delta
        snapPointChanged = self.updateSnapPoint()
        return snapPointChanged