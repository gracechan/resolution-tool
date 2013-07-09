/*
* CS 349 Java Code Examples
*
* ShapeDemo    Demo of MyShape class: draw shapes using mouse.
*
*/
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Vector;

import javax.vecmath.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

// create the window and run the demo
public class Canvas extends JPanel implements MouseInputListener, KeyListener {
	private BufferedImage imgdata;
	TreeNode treeData = null;
	LayerList layerbox = null;
	int downscale = 2;
	
	Canvas(LayerList layerbox) {
		//treeData = TestShapes.head();
		treeData = TestShapes.ash();
		//treeData = TestShapes.marona();
		//treeData = TestShapes.rozalin();
		//treeData = TestShapes.dancer();
		//treeData = TestShapes.sora();
		//treeData = TestShapes.squire();
		//treeData = TestShapes.maronaOutline();
		this.layerbox = layerbox;
		layerbox.setDrawingCanvas(this);
		layerbox.setRoot(treeData);
		layerbox.reorderLayers();
        // add listeners        
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
    }
	
	public void setDownScale(int ds) {
		downscale = ds;
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
        
        AffineTransform M = g2.getTransform();
		//AffineTransform S = AffineTransform.getScaleInstance(5, 5);
        AffineTransform S = AffineTransform.getScaleInstance(1, 1);
		g2.setTransform(S);
        // paint the layers stored in the tree
        treeData.paint(g2);

		g2.setTransform(M);
        
        // paint the grid
        g2.setColor(new Color(200, 200, 200, 50));
        for (int i = 0 ; i < getWidth(); i+= (downscale * 5)) {
        	g2.drawLine(i, 0, i, getHeight());
        }
        for (int i = 0 ; i < getHeight(); i+= (downscale * 5)) {
        	g2.drawLine(0, i, getWidth(), i);
        }
	}
    

    @Override
    public void mouseClicked(MouseEvent arg0) {    
    	// clear shapes if user double clicks the circle
    	if (arg0.getClickCount() == 2) { 
    	}
    	repaint();
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }
    
    @Override
    public void mousePressed(MouseEvent arg0) {
		repaint();
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
		repaint();
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
}

