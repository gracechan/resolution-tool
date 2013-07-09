import java.awt.Graphics2D;
import java.util.ArrayList;

class TreeNode {
	private String name;
	private Shape2d shape = null;
	private TreeNode parent;
	private ArrayList<TreeNode> children;
	private int level = 1;
	private int rank = 0;
	private int proportion = 0;
	
	String getName() 					{ return name; }
	Shape2d getShape() 					{ return shape; }
	int getLevel() 						{ return level; }
	int getRank() 						{ return rank; }
	ArrayList<TreeNode> getChildren() 	{ return children; }
	TreeNode getParent() 				{ return parent; }
	void setParent(TreeNode parent) 	{ this.parent = parent; }
	
	TreeNode(String name, Shape2d shape, int rank) {
		this.name = name;
		this.shape = shape;
		this.rank = rank;
		parent = null;
		children = new ArrayList<TreeNode>();
	}
	
	void addChild(TreeNode child) {
		children.add(child);
		child.setParent(this);
		child.level = level + 1;
	}
	
	void updateNode() {
		if (shape == null) return;
		double downScale = shape.getDownScale();
		double value = rank * downScale / level;
		
		if (value < 1) {
			System.out.println("INVISIBLE");
			shape.setVisible(false);
		} else {
			System.out.println("VISIBLE");
			shape.setVisible(true);
		}
	}
	
	void downScale(double newScale) {
		if (shape == null) return;
		shape.setDownScale(newScale);
		updateNode();
	}
	
	void paint(Graphics2D g2) {
		if (shape != null)
			shape.paint(g2);
		for (int i = 0 ; i < children.size(); i++) {
			children.get(i).paint(g2);
		}
	}
}