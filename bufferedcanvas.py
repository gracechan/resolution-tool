import wx

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