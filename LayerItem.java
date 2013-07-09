import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

class LayerItem {
	TreeNode layer;
	int x;
	int y;
	int w;
	int h;
	boolean selected = false;
	
	LayerItem(TreeNode layer, int x, int y, int w, int h) {
		this.layer = layer;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	void paint(Graphics2D g2) {
		Color bg;
		if (selected) {
			bg = new Color(0, 0, 255, 255);
		} else {
			bg = new Color(100, 100, 100, 100);
		}
		g2.setColor(bg);
		g2.fillRect(x, y, w, h);
		g2.setColor(Color.WHITE);
    	g2.setStroke(new BasicStroke(2.0f));
		g2.drawRect(x, y, w, h);
		g2.setFont(new Font("default", Font.BOLD, 14));
		g2.drawString(layer.getName(), x + ((layer.getLevel() - 1) * 15 + 10), y + 15);
		g2.drawString("" + layer.getRank(), x + w - 30, y + 15);
	}
	
	void setSelected(boolean selected) {
		this.selected = selected;
		Shape2d shape = layer.getShape();
		if (shape == null) return;
		shape.setSelected(selected);
	}
}