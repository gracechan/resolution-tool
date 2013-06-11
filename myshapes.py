import math

class Shape:
    def __init__(self, x, y, rgb, canvasPoint):
        self.x = x;
        self.y = y;
        self.rgb = rgb;
        self.selectedShape = False;
        self.downscale = 1;
        self.magnifyscale = 1;
        self.canvasPoint = canvasPoint
        
    def paint(self, cpanel):
        cpanel.set_source_rgb(0,0,1)
        self.paintShape(cpanel)
        
        if (self.selectedShape):
            cpanel.set_line_width(10 * self.downscale * self.magnifyscale)
            cpanel.stroke_preserve();
            
        cpanel.set_source_rgb(self.rgb[0], self.rgb[1], self.rgb[2])
        cpanel.fill()
        
    def paintShape(self, cpanel):
        pass
    
    def changeDownScale(self, newScale):
        self.downscale = newScale
        
    def changeMagnifyScale(self, newScale):
        self.magnifyscale = newScale
        
class Rectangle(Shape):
    def __init__(self, x, y, width, height, rgb, canvasPoint):
        self.width = width;
        self.height = height;
        Shape.__init__(self, x, y, rgb, canvasPoint);
        
    def paintShape(self, cpanel):
        cpanel.rectangle(int(self.x * self.downscale * self.magnifyscale + self.canvasPoint[0]),
                         int(self.y * self.downscale * self.magnifyscale + self.canvasPoint[1]),
                         int(self.width * self.downscale * self.magnifyscale),
                         int(self.height * self.downscale * self.magnifyscale))
        
class Circle(Shape):
    def __init__(self, x, y, radius, rgb, canvasPoint):
        self.radius = radius;
        Shape.__init__(self, x, y, rgb, canvasPoint);
        
    def paintShape(self, cpanel):
        cpanel.arc(int(self.x * self.downscale * self.magnifyscale + self.canvasPoint[0]),
                   int(self.y * self.downscale * self.magnifyscale + self.canvasPoint[1]),
                   int(self.radius * self.downscale * self.magnifyscale),
                   0,
                   2 * math.pi);