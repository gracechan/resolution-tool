/*
*  MyShape: See ShapeDemo2 for an example how to use this class.
*
*/
import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.vecmath.*;


// simple shape class
class Shape2d implements Shape {
	Shape shape;
	int x;
	int y;
	Color colour;
	boolean selected = false;
	boolean visible = true;
	double downScale = 1;
	double magnifyScale = 1;
	
	void setX(int x) { this.x = x; }
	void setY(int y) { this.y = y; }
	void setColour(Color c) { this.colour = c; }
	boolean getSelected() {	return selected; }
	void setSelected(boolean selected) { this.selected = selected; }
	boolean getVisible() { return visible; }
	void setVisible(boolean visible) { this.visible = visible; }
	double getDownScale() { return downScale; }
	void setDownScale(double downScale) { this.downScale = downScale; }
	double getMagnifyScale() { return magnifyScale; }
	void setMagnifyScale(double magnifyScale) { this.magnifyScale = magnifyScale; }
	
	Shape2d(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.colour = c;
	}
    
 // paint the shape
    public void paint(Graphics2D g2) {
    }
        
    // find closest distance from mouse to this shape
    
    // find closest point
    static Point2d closestPoint(Point2d M, Point2d P1, Point2d P2)
    {    	
    	Vector2d v = new Vector2d();
		v.sub(P2,P1); // v = P2 - P1
		
		// early out if line is less than 1 pixel long
		if (v.lengthSquared() < 0.5)
			return P1;
		
		Vector2d u = new Vector2d();
		u.sub(M,P1); // u = M - P1
	
		// scalar of vector projection ...
		double s = u.dot(v)  // u dot v 
				 / v.dot(v); // v dot v
		
		// find point for constrained line segment
		if (s < 0) 
			return P1;
		else if (s > 1)
			return P2;
		else {
			Point2d I = P1;
	    	Vector2d w = new Vector2d();
	    	w.scale(s, v); // w = s * v
			I.add(w); // I = P1 + w
			return I;
		}
    }
    
    // return perpendicular vector
    static public Vector2d perp(Vector2d a)
    {
    	return new Vector2d(-a.y, a.x);
    }
    
    // line-line intersection
    // return (NaN,NaN) if not intersection, otherwise returns intersecting point
    static Point2d lineLineIntersection(Point2d P0, Point2d P1, Point2d Q0, Point2d Q1)
    {
    	
    	// TODO: implement

    	return new Point2d();
    }
    

    // affine transform helper
    // return P_prime = T * P    
    Point2d transform( AffineTransform T, Point2d P) {
    	Point2D.Double p = new Point2D.Double(P.x, P.y);
    	Point2D.Double q = new Point2D.Double();
    	T.transform(p, q);
    	return new Point2d(q.x, q.y);
    }
    
    static double distance(Point2d M, Point2d P) {
    	Vector2d v = new Vector2d();
		v.sub(M,P);		
    	return v.length();
    }
    
    // hit test with this shape
    public boolean hittest(double x, double y)
    {
    	return false;
    }
    
    public static class Rectangle extends Shape2d {
    	int width;
    	int height;
    	
		public Rectangle(int x, int y, Color c, int width, int height) {			
			super(x, y, c);
			this.width = width;
			this.height = height;
		}
		
		public void paint(Graphics2D g2) {
	    	g2.setColor(colour);
	        g2.fillRect(x, y, width, height);

	        if (selected) {
	        	g2.setColor(Color.BLUE);
	        	g2.setStroke(new BasicStroke(1.0f));
	        	g2.drawRect(x, y, width, height);
	        	g2.setStroke(new BasicStroke(0.0f));
	        }
	    }
	}
    public static class Path extends Shape2d {  
    	Shape shape;
		public Path(int x, int y, Color c, Shape s) {
			super(x, y, c);
			shape = s;	
		}
		
		public void paint(Graphics2D g2) {
	    	g2.setColor(colour);
	        g2.fill(shape);

	        if (selected) {
	        	g2.setColor(Color.BLUE);
	        	g2.setStroke(new BasicStroke(1.0f));
		        g2.fill(shape);
	        	g2.setStroke(new BasicStroke(0.0f));
	        }
	    }
	}
    
    public static class PathTranslate extends Shape2d {  
    	Shape shape;
		public PathTranslate(int x, int y, Color c, Shape s) {
			super(x, y, c);
			shape = s;	
		}
		
		public void paint(Graphics2D g2) {
			java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();
	        transformations.offer(g2.getTransform());
	        g2.transform(new AffineTransform(1, 0, 0, 1, 290.5f, 128.5f));
	    	g2.setColor(colour);
	        g2.fill(shape);

	        if (selected) {
	        	g2.setColor(Color.BLUE);
	        	g2.setStroke(new BasicStroke(1.0f));
		        g2.fill(shape);
	        	g2.setStroke(new BasicStroke(0.0f));
	        }

	        g2.setTransform(transformations.poll()); // _0
	    }
	}
    
    public static class PathWithStroke extends Shape2d {
    	Shape shape;
    	Color cstroke;
		public PathWithStroke(int x, int y, Color fill, Color stroke, Shape s) {
			super(x, y, fill);
			shape = s;
			cstroke = stroke;
		}
		
		public void paint(Graphics2D g2) {
	    	g2.setColor(colour);
	        g2.fill(shape);
	        g2.setColor(cstroke);
	        g2.setStroke(new BasicStroke(1.0f));
	        g2.draw(shape);
	        g2.setStroke(new BasicStroke(0.0f));

	        if (selected) {
	        	g2.setColor(Color.BLUE);
	        	g2.setStroke(new BasicStroke(1.0f));
		        g2.fill(shape);
	        	g2.setStroke(new BasicStroke(0.0f));
	        }
	    }
    }
    
    public static class Path2 extends Shape2d {  
    	Shape shape;
		public Path2(int x, int y, Color c, Shape s) {
			super(x, y, c);
			shape = s;	
		}
		
		public void paint(Graphics2D g2) {
	    	g2.setColor(colour);
            AffineTransform M = g2.getTransform();
            AffineTransform S = AffineTransform.getScaleInstance(2, 2);
            AffineTransform T = AffineTransform.getTranslateInstance(-47, -70);
            S.concatenate(T);
        	g2.setTransform(S);
	        g2.fill(shape);
        	g2.setTransform(M);

	        if (selected) {
	        	g2.setColor(Color.BLUE);
	        	g2.setStroke(new BasicStroke(1.0f));
	        	g2.setTransform(S);
		        g2.fill(shape);
	        	g2.setTransform(M);
	        	g2.setStroke(new BasicStroke(0.0f));
	        }
	    }
	}
    
	@Override
	public boolean contains(Point2D p) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public java.awt.Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean intersects(Rectangle2D r) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean intersects(double x, double y, double w, double h) {
		// TODO Auto-generated method stub
		return false;
	}
}
