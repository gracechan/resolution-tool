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