import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputListener;

class SliderList extends JPanel implements MouseInputListener, ChangeListener {
	private BufferedImage imgdata;
	Canvas drawingCanvas = null;
	JSlider downScaler;
	
	SliderList(Canvas c) {
		drawingCanvas = c;
		downScaler = new JSlider(JSlider.HORIZONTAL, 1, 8, 1);
		downScaler.setBorder(BorderFactory.createTitledBorder("Down Scale"));
		downScaler.setMajorTickSpacing(2);
		downScaler.setMinorTickSpacing(1);
		downScaler.setPaintTicks(true);
		downScaler.setPaintLabels(true);
		downScaler.addChangeListener(this);
		add(downScaler);
        // add listeners    
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
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
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		JSlider source = (JSlider)e.getSource();
		if (!source.getValueIsAdjusting() && drawingCanvas != null) {
			drawingCanvas.setDownScale(source.getValue());
			drawingCanvas.repaint();
		}
	}
}