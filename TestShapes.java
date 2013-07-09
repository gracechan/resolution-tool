import java.awt.Color;
import java.awt.geom.Path2D;
import java.util.Vector;

public class TestShapes {
	public static TreeNode head() {
		// TODO: HAVE A SCENE NODE
		Shape2d shape;
		Path2D path;
		shape = new Shape2d.Rectangle(6, 6, new Color(255, 100, 100, 255), 40, 40);		
		TreeNode face = new TreeNode("face", shape, 10);
		
		shape = new Shape2d.Rectangle(10, 10, new Color(255, 255, 255, 255), 8, 14);
		TreeNode leftEyeWhite = new TreeNode("left eye white", shape, 5);
		
		shape = new Shape2d.Rectangle(34, 10, new Color(255, 255, 255, 255), 8, 14);
		TreeNode rightEyeWhite = new TreeNode("right eye white", shape, 5);
		
		shape = new Shape2d.Rectangle(11, 17, new Color(0, 0, 0, 255), 6, 6);
		TreeNode leftPupil = new TreeNode("left pupil", shape, 8);
		
		shape = new Shape2d.Rectangle(35, 17, new Color(0, 0, 0, 255), 6, 6);
		TreeNode rightPupil = new TreeNode("right pupil", shape, 8);
		
		shape = new Shape2d.Rectangle(24, 27, new Color(100, 100, 30, 255), 4, 4);
		TreeNode nose = new TreeNode("nose", shape, 2);

		shape = new Shape2d.Rectangle(20, 35, new Color(200, 30, 30, 255), 12, 6);
		TreeNode mouth = new TreeNode("mouth", shape, 3);
		face.addChild(mouth);
		face.addChild(nose);
		face.addChild(rightEyeWhite);
		face.addChild(leftEyeWhite);
		rightEyeWhite.addChild(rightPupil);
		leftEyeWhite.addChild(leftPupil);
		return face;
	}
	
	public static TreeNode ash() {
		Ash a = new Ash();
		TreeNode ash = a.getRoot();
		return ash;
	}
	
	public static TreeNode rozalin() {
		Rozalin r = new Rozalin();
		TreeNode rozalin = r.getRoot();
		return rozalin;
	}
	
	public static TreeNode dancer() {
		Dancer d = new Dancer();
		TreeNode dancer = d.getRoot();
		return dancer;
	}
	
	public static TreeNode marona() {
		Marona m = new Marona();
		TreeNode marona = m.getRoot();
		return marona;
	}
	
	public static TreeNode sora() {
		Sora s = new Sora();
		TreeNode sora = s.getRoot();
		return sora;
	}
	
	public static TreeNode squire() {
		Squire s = new Squire();
		TreeNode squire = s.getRoot();
		return squire;
	}
	
	public static TreeNode maronaOutline() {
		MaronaOutline m = new MaronaOutline();
		TreeNode maronaOutline = m.getRoot();
		return maronaOutline;
	}
}