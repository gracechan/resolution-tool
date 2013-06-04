import math

class Shape:
    def __init__(self, x, y, rgb):
        self.x = x;
        self.y = y;
        self.rgb = rgb;
        self.selectedShape = False;
        
    def paint(self, cpanel):
        cpanel.set_source_rgb(0,0,1)
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