import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.MouseInputListener;

class LayerList extends JPanel implements MouseInputListener {
	private BufferedImage imgdata;
	ArrayList<LayerItem> layerItems;
	TreeNode root;
	Canvas drawingCanvas = null;
	LayerItem selectedItem = null;
	
	void setRoot(TreeNode root) {
		this.root = root;
	}
	
	void setDrawingCanvas(Canvas c) {
		drawingCanvas = c;
	}
	
	LayerList(TreeNode root) {
		this.root = root;
		layerItems = new ArrayList<LayerItem>();
        // add listeners
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
	}
	
	void reorderLayers() {
		layerItems = new ArrayList<LayerItem>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		TreeNode t;
		ArrayList<TreeNode> c;
		int yItem = 0;
		
		while (!s.isEmpty()) {
			t = s.pop();
			c = t.getChildren();
			for (int i = 0 ; i < c.size(); i++) {
				s.push(c.get(i));
			}
			layerItems.add(new LayerItem(t, 0, yItem, 284, 20));
			yItem += 20;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		imgdata = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = (Graphics2D) g;
		getBufferedImage();
		g2.drawImage(imgdata, null, null);
	}

	// add all the drawing code here
	private void getBufferedImage() {
		Graphics2D g2 = imgdata.createGraphics();
		g2.setBackground(Color.white);
		g2.clearRect(0, 0, getWidth(), getHeight());
		g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
							java.awt.RenderingHints.VALUE_ANTIALIAS_OFF );

		// black background
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, getWidth(), getHeight());

		for (int i = 0 ; i < layerItems.size() ; i++) {
			layerItems.get(i).paint(g2);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub		
		if (selectedItem != null) {
			selectedItem.setSelected(false);
		}
		if (e.getY() < layerItems.size() * 20) {
			int index = e.getY() / 20;
			selectedItem = layerItems.get(index);
			selectedItem.setSelected(true);
		}
		
		if (drawingCanvas != null) drawingCanvas.repaint();
		repaint();
	}
}