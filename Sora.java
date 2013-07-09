

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import static java.awt.Color.*;
import static java.awt.MultipleGradientPaint.CycleMethod.*;
import static java.awt.MultipleGradientPaint.ColorSpaceType.*;

/**
 * This class has been automatically generated using
 * <a href="https://flamingo.dev.java.net">Flamingo SVG transcoder</a>.
 */
public class Sora extends Shape2d implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /** The rendered image. */
    private BufferedImage image;
    
    private TreeNode root = null;
    public TreeNode getRoot() { return root; }

    /**
     * Creates a new transcoded SVG image.
     */
    public Sora() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 20;
        int y = 35;
        
        root = new TreeNode("SORA", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);

     // leftLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-206.0, 47.833);
        ((GeneralPath) shape).curveTo(-206.0, 47.833, -201.16699, 56.499, -200.16699, 59.833);
        ((GeneralPath) shape).curveTo(-199.16699, 63.167, -192.66699, 82.667, -190.5, 90.667);
        ((GeneralPath) shape).curveTo(-188.33301, 98.667, -183.66699, 102.167, -182.66699, 96.167);
        ((GeneralPath) shape).curveTo(-181.66699, 90.167, -182.16699, 92.667, -182.66699, 82.0);
        ((GeneralPath) shape).curveTo(-183.16699, 71.333, -181.834, 65.333, -184.16699, 61.0);
        ((GeneralPath) shape).curveTo(-186.49998, 56.667, -187.44199, 58.187, -187.834, 54.469);
        ((GeneralPath) shape).curveTo(-188.226, 50.751, -188.0, 40.5, -188.0, 40.5);
        ((GeneralPath) shape).lineTo(-206.0, 47.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD38D54), shape);
        TreeNode leftLeg = new TreeNode("leftLeg", s2, 3);

        // rightLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-173.5, 45.833);
        ((GeneralPath) shape).curveTo(-173.5, 45.833, -166.33301, 50.999, -165.83301, 52.833);
        ((GeneralPath) shape).curveTo(-165.33301, 54.667, -161.83301, 70.333, -158.5, 74.833);
        ((GeneralPath) shape).curveTo(-155.16699, 79.333, -147.166, 97.334, -146.33301, 102.167);
        ((GeneralPath) shape).curveTo(-145.50002, 107.0, -139.83301, 104.834, -140.0, 102.167);
        ((GeneralPath) shape).curveTo(-140.16699, 99.5, -144.5, 77.999, -145.0, 72.833);
        ((GeneralPath) shape).curveTo(-145.5, 67.667, -146.333, 63.499, -149.16699, 58.833);
        ((GeneralPath) shape).curveTo(-152.00099, 54.167, -153.0, 56.834, -153.0, 47.167);
        ((GeneralPath) shape).curveTo(-153.0, 37.5, -159.33301, 36.333, -159.33301, 36.333);
        ((GeneralPath) shape).lineTo(-173.5, 45.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD38D54), shape);
        TreeNode rightLeg = new TreeNode("rightLeg", s2, 3);

        // shorts
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-201.75, -16.227);
        ((GeneralPath) shape).curveTo(-201.75, -16.227, -205.75, -11.749999, -205.75, -10.249999);
        ((GeneralPath) shape).curveTo(-205.75, -8.749999, -204.333, -10.020999, -204.333, -10.020999);
        ((GeneralPath) shape).curveTo(-204.333, -10.020999, -218.75, 7.0, -217.0, 23.75);
        ((GeneralPath) shape).curveTo(-215.25, 40.5, -212.375, 42.75, -212.375, 42.75);
        ((GeneralPath) shape).curveTo(-212.375, 42.75, -216.5, 43.75, -215.625, 46.0);
        ((GeneralPath) shape).curveTo(-214.75, 48.25, -210.688, 52.75, -198.969, 52.25);
        ((GeneralPath) shape).curveTo(-187.25, 51.75, -177.25, 47.25, -177.25, 47.25);
        ((GeneralPath) shape).lineTo(-174.0, 49.25);
        ((GeneralPath) shape).curveTo(-174.0, 49.25, -177.0, 53.0, -174.0, 54.125);
        ((GeneralPath) shape).curveTo(-171.0, 55.25, -168.375, 53.25, -168.375, 53.25);
        ((GeneralPath) shape).curveTo(-168.375, 53.25, -173.75, 53.833, -168.375, 50.833);
        ((GeneralPath) shape).curveTo(-163.0, 47.833, -152.333, 44.0, -148.5, 44.5);
        ((GeneralPath) shape).curveTo(-144.667, 45.0, -153.0, 47.167, -153.0, 47.167);
        ((GeneralPath) shape).lineTo(-152.333, 48.833);
        ((GeneralPath) shape).curveTo(-152.333, 48.833, -140.833, 45.499, -140.833, 42.333);
        ((GeneralPath) shape).curveTo(-140.833, 39.167, -145.333, 40.333, -145.333, 37.0);
        ((GeneralPath) shape).curveTo(-145.333, 33.667, -143.0, 26.45, -150.833, 14.975);
        ((GeneralPath) shape).curveTo(-158.66599, 3.5, -162.92499, -1.2040005, -165.21199, -6.6849995);
        ((GeneralPath) shape).curveTo(-167.499, -12.165998, -173.06499, -15.202, -173.06499, -15.202);
        ((GeneralPath) shape).lineTo(-201.75, -16.227);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xBE000F), shape);
        TreeNode shorts = new TreeNode("shorts", s2, 3);

        // rightShoe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-151.354, 88.656);
        ((GeneralPath) shape).curveTo(-151.354, 88.656, -155.83301, 93.667, -153.33301, 98.167);
        ((GeneralPath) shape).curveTo(-150.83301, 102.667, -150.166, 105.036, -150.166, 105.036);
        ((GeneralPath) shape).curveTo(-150.166, 105.036, -149.166, 106.999, -150.166, 108.833);
        ((GeneralPath) shape).curveTo(-151.166, 110.667, -151.906, 111.333, -151.906, 111.333);
        ((GeneralPath) shape).curveTo(-151.906, 111.333, -156.24101, 113.357, -158.283, 118.107);
        ((GeneralPath) shape).curveTo(-161.336, 125.211, -159.49901, 134.5, -159.49901, 134.5);
        ((GeneralPath) shape).curveTo(-159.49901, 134.5, -155.78001, 122.477, -140.19801, 122.333);
        ((GeneralPath) shape).curveTo(-122.03101, 122.166, -119.777016, 133.66699, -119.777016, 133.66699);
        ((GeneralPath) shape).curveTo(-119.777016, 133.66699, -118.624016, 120.99999, -123.832016, 115.16699);
        ((GeneralPath) shape).curveTo(-127.807014, 110.71599, -131.33202, 110.33299, -131.33202, 110.33299);
        ((GeneralPath) shape).curveTo(-131.33202, 110.33299, -132.0, 104.0, -132.5, 103.5);
        ((GeneralPath) shape).curveTo(-133.0, 103.0, -133.0, 103.0, -133.0, 103.0);
        ((GeneralPath) shape).lineTo(-132.167, 100.833);
        ((GeneralPath) shape).lineTo(-133.5, 93.333);
        ((GeneralPath) shape).curveTo(-133.5, 93.333, -133.5, 89.166, -136.667, 86.833);
        ((GeneralPath) shape).curveTo(-139.83401, 84.5, -142.95001, 85.294, -142.95001, 85.294);
        ((GeneralPath) shape).lineTo(-142.39801, 88.315);
        ((GeneralPath) shape).curveTo(-142.39801, 88.315, -137.83401, 88.002, -137.001, 90.66901);
        ((GeneralPath) shape).curveTo(-136.168, 93.33601, -139.67001, 94.85801, -143.83401, 95.83501);
        ((GeneralPath) shape).curveTo(-147.99802, 96.812004, -151.16702, 96.83501, -151.33401, 95.50201);
        ((GeneralPath) shape).curveTo(-151.501, 94.16901, -150.10501, 91.546005, -150.10501, 91.546005);
        ((GeneralPath) shape).lineTo(-151.354, 88.656);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF2CA25), shape);
        TreeNode rightShoe = new TreeNode("rightShoe", s2, 3);

        // rightSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-160.667, 140.667);
        ((GeneralPath) shape).curveTo(-160.667, 140.667, -160.43102, 129.893, -159.71, 126.936005);
        ((GeneralPath) shape).curveTo(-154.25, 128.375, -155.625, 120.942, -140.199, 121.00001);
        ((GeneralPath) shape).curveTo(-124.145004, 121.06301, -124.12501, 128.625, -119.73201, 126.936005);
        ((GeneralPath) shape).curveTo(-119.10401, 129.468, -119.73201, 140.667, -119.73201, 140.667);
        ((GeneralPath) shape).lineTo(-160.667, 140.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x54545C), shape);
        TreeNode rightSole = new TreeNode("rightSole", s2, 3);

        // leftShoe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-192.943, 82.432);
        ((GeneralPath) shape).curveTo(-196.833, 83.667, -197.66699, 85.667, -197.0, 88.0);
        ((GeneralPath) shape).curveTo(-196.33301, 90.333, -196.0, 97.125, -196.0, 97.125);
        ((GeneralPath) shape).curveTo(-199.447, 98.967, -198.648, 98.54, -201.375, 99.875);
        ((GeneralPath) shape).curveTo(-203.708, 101.018, -208.33301, 101.5, -208.33301, 101.5);
        ((GeneralPath) shape).curveTo(-208.33301, 101.5, -214.0, 94.5, -225.83301, 97.0);
        ((GeneralPath) shape).curveTo(-237.66602, 99.5, -236.45001, 108.165, -236.45001, 108.165);
        ((GeneralPath) shape).curveTo(-236.45001, 108.165, -228.33401, 122.499, -216.50002, 122.333);
        ((GeneralPath) shape).curveTo(-204.66602, 122.167, -172.667, 111.0, -172.667, 111.0);
        ((GeneralPath) shape).curveTo(-172.667, 111.0, -171.83401, 104.766, -172.667, 102.383);
        ((GeneralPath) shape).curveTo(-173.5, 100.00001, -176.0, 99.001, -176.0, 96.667);
        ((GeneralPath) shape).curveTo(-176.0, 94.333, -174.333, 85.001, -176.5, 81.667);
        ((GeneralPath) shape).curveTo(-178.667, 78.333, -182.774, 78.499, -182.774, 78.499);
        ((GeneralPath) shape).lineTo(-182.667, 82.0);
        ((GeneralPath) shape).curveTo(-182.667, 82.0, -178.667, 81.667, -178.667, 84.167);
        ((GeneralPath) shape).curveTo(-178.667, 86.667, -182.666, 90.027, -186.33401, 91.167);
        ((GeneralPath) shape).curveTo(-190.00203, 92.307, -194.59001, 89.667, -194.04501, 87.667);
        ((GeneralPath) shape).curveTo(-193.50002, 85.667, -192.10402, 85.164, -192.10402, 85.164);
        ((GeneralPath) shape).lineTo(-192.943, 82.432);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF2CA25), shape);
        TreeNode leftShoe = new TreeNode("leftShoe", s2, 3);

        // leftSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-236.485, 105.945);
        ((GeneralPath) shape).curveTo(-236.485, 105.945, -237.506, 106.181, -238.166, 107.667);
        ((GeneralPath) shape).curveTo(-238.826, 109.153, -239.499, 110.833, -239.499, 110.833);
        ((GeneralPath) shape).curveTo(-239.499, 110.833, -236.166, 124.833, -223.16599, 126.5);
        ((GeneralPath) shape).curveTo(-210.16597, 128.16699, -197.999, 124.5, -197.999, 124.5);
        ((GeneralPath) shape).lineTo(-197.999, 120.956);
        ((GeneralPath) shape).curveTo(-197.999, 120.956, -195.33199, 120.499, -191.832, 123.333);
        ((GeneralPath) shape).curveTo(-188.33202, 126.167, -181.499, 124.667, -178.332, 124.167);
        ((GeneralPath) shape).curveTo(-175.16501, 123.667, -172.295, 122.334, -172.295, 122.334);
        ((GeneralPath) shape).lineTo(-172.295, 108.0);
        ((GeneralPath) shape).curveTo(-172.295, 108.0, -176.666, 108.666, -183.166, 111.333);
        ((GeneralPath) shape).curveTo(-189.666, 114.0, -202.166, 119.167, -214.33301, 118.0);
        ((GeneralPath) shape).curveTo(-226.50002, 116.833, -236.485, 105.945, -236.485, 105.945);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x54545C), shape);
        TreeNode leftSole = new TreeNode("leftSole", s2, 3);

        // leftShoeDetail
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-196.625, 97.217);
        ((GeneralPath) shape).curveTo(-196.625, 97.217, -195.81, 92.51601, -196.905, 88.383);
        ((GeneralPath) shape).curveTo(-198.0, 84.25, -198.319, 81.380005, -196.905, 82.5);
        ((GeneralPath) shape).curveTo(-195.491, 83.62, -193.0, 84.631, -193.0, 89.003);
        ((GeneralPath) shape).curveTo(-193.0, 93.375, -193.0, 96.875, -193.0, 96.875);
        ((GeneralPath) shape).curveTo(-193.0, 96.875, -191.625, 99.25, -185.25, 98.0);
        ((GeneralPath) shape).curveTo(-178.875, 96.75, -175.889, 94.999, -175.889, 94.999);
        ((GeneralPath) shape).lineTo(-174.914, 99.189);
        ((GeneralPath) shape).curveTo(-174.914, 99.189, -175.75, 100.875, -179.125, 103.875);
        ((GeneralPath) shape).curveTo(-182.5, 106.875, -185.875, 108.375, -185.875, 108.375);
        ((GeneralPath) shape).curveTo(-185.875, 108.375, -185.75, 105.125, -188.75, 102.0);
        ((GeneralPath) shape).curveTo(-191.75, 98.875, -194.044, 97.625, -194.044, 97.625);
        ((GeneralPath) shape).lineTo(-196.25, 99.189);
        ((GeneralPath) shape).curveTo(-196.25, 99.189, -191.875, 102.19701, -190.75, 105.036);
        ((GeneralPath) shape).curveTo(-189.625, 107.875, -188.75, 109.832, -188.75, 109.832);
        ((GeneralPath) shape).curveTo(-188.75, 109.832, -190.5, 110.625, -193.25, 111.375);
        ((GeneralPath) shape).curveTo(-196.0, 112.125, -197.849, 112.125, -197.849, 112.125);
        ((GeneralPath) shape).lineTo(-197.849, 100.416);
        ((GeneralPath) shape).lineTo(-200.875, 100.416);
        ((GeneralPath) shape).lineTo(-200.875, 112.125);
        ((GeneralPath) shape).curveTo(-200.875, 112.125, -204.281, 112.5, -204.391, 111.25);
        ((GeneralPath) shape).curveTo(-204.501, 110.0, -204.796, 105.875, -205.89801, 104.25);
        ((GeneralPath) shape).curveTo(-207.00002, 102.625, -207.92201, 102.187, -207.62502, 101.413);
        ((GeneralPath) shape).curveTo(-202.782, 100.416, -196.625, 97.217, -196.625, 97.217);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x172025), shape);
        TreeNode leftShoeDetail = new TreeNode("leftShoeDetail", s2, 3);

        // rightShoeDetail
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-144.644, 102.491);
        ((GeneralPath) shape).curveTo(-144.644, 102.491, -144.884, 100.308, -146.75, 97.75);
        ((GeneralPath) shape).curveTo(-148.616, 95.192, -156.0, 88.625, -149.125, 86.375);
        ((GeneralPath) shape).curveTo(-142.25, 84.125, -142.466, 90.48, -141.625, 97.217);
        ((GeneralPath) shape).curveTo(-140.784, 103.954, -138.375, 104.75, -136.5, 104.375);
        ((GeneralPath) shape).curveTo(-134.625, 104.0, -133.0, 103.0, -133.0, 103.0);
        ((GeneralPath) shape).lineTo(-133.0, 105.036);
        ((GeneralPath) shape).curveTo(-133.0, 105.036, -134.25, 105.89, -136.25, 105.945);
        ((GeneralPath) shape).curveTo(-138.25, 106.0, -138.875, 105.945, -138.875, 105.945);
        ((GeneralPath) shape).lineTo(-138.375, 108.0);
        ((GeneralPath) shape).curveTo(-138.375, 108.0, -135.625, 107.625, -133.0, 108.375);
        ((GeneralPath) shape).curveTo(-130.375, 109.125, -131.435, 109.426, -131.435, 109.426);
        ((GeneralPath) shape).lineTo(-131.333, 110.333);
        ((GeneralPath) shape).curveTo(-131.333, 110.333, -135.25, 108.417, -140.583, 109.084);
        ((GeneralPath) shape).curveTo(-145.91599, 109.751, -151.51099, 110.893, -151.51099, 110.893);
        ((GeneralPath) shape).lineTo(-150.43298, 109.305);
        ((GeneralPath) shape).curveTo(-150.43298, 109.305, -149.08298, 109.085, -146.49998, 108.751);
        ((GeneralPath) shape).curveTo(-143.91699, 108.417, -143.33298, 108.417, -143.33298, 108.417);
        ((GeneralPath) shape).lineTo(-143.74998, 106.417);
        ((GeneralPath) shape).curveTo(-143.74998, 106.417, -145.49998, 106.585, -147.16699, 106.751);
        ((GeneralPath) shape).curveTo(-148.834, 106.917, -149.73099, 107.258, -149.73099, 107.258);
        ((GeneralPath) shape).lineTo(-149.85498, 105.945);
        ((GeneralPath) shape).curveTo(-149.85498, 105.945, -147.07999, 106.097, -145.49599, 105.228);
        ((GeneralPath) shape).curveTo(-143.91199, 104.35899, -144.644, 102.491, -144.644, 102.491);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x172025), shape);
        TreeNode rightShoeDetail = new TreeNode("rightShoeDetail", s2, 3);

        // shortsZipper
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-194.0, -10.25);
        ((GeneralPath) shape).lineTo(-191.625, -10.5);
        ((GeneralPath) shape).curveTo(-191.625, -10.5, -193.125, -1.5, -192.813, 4.0);
        ((GeneralPath) shape).curveTo(-192.501, 9.5, -191.625, 12.667, -191.625, 12.667);
        ((GeneralPath) shape).lineTo(-193.625, 12.667);
        ((GeneralPath) shape).curveTo(-193.625, 12.667, -195.166, 9.167, -194.833, 4.167);
        ((GeneralPath) shape).curveTo(-194.49998, -0.8330002, -194.0, -10.25, -194.0, -10.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x878787), shape);
        TreeNode shortsZipper = new TreeNode("shortsZipper", s2, 3);

        // chain
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-168.875, 1.0);
        ((GeneralPath) shape).lineTo(-170.0, 2.125);
        ((GeneralPath) shape).lineTo(-166.0, 6.5);
        ((GeneralPath) shape).lineTo(-164.875, 5.625);
        ((GeneralPath) shape).lineTo(-163.375, 7.875);
        ((GeneralPath) shape).lineTo(-164.25, 8.75);
        ((GeneralPath) shape).lineTo(-159.875, 14.25);
        ((GeneralPath) shape).lineTo(-158.75, 13.375);
        ((GeneralPath) shape).lineTo(-156.625, 16.25);
        ((GeneralPath) shape).lineTo(-157.5, 17.375);
        ((GeneralPath) shape).lineTo(-153.625, 23.0);
        ((GeneralPath) shape).lineTo(-152.875, 22.375);
        ((GeneralPath) shape).lineTo(-152.25, 23.75);
        ((GeneralPath) shape).lineTo(-153.0, 24.5);
        ((GeneralPath) shape).lineTo(-150.5, 28.75);
        ((GeneralPath) shape).lineTo(-149.375, 28.0);
        ((GeneralPath) shape).lineTo(-148.125, 29.5);
        ((GeneralPath) shape).lineTo(-148.875, 30.75);
        ((GeneralPath) shape).lineTo(-145.0, 33.75);
        ((GeneralPath) shape).lineTo(-143.0, 31.375);
        ((GeneralPath) shape).lineTo(-146.125, 27.75);
        ((GeneralPath) shape).lineTo(-146.875, 28.625);
        ((GeneralPath) shape).lineTo(-148.0, 27.375);
        ((GeneralPath) shape).lineTo(-147.375, 26.375);
        ((GeneralPath) shape).lineTo(-150.25, 22.0);
        ((GeneralPath) shape).lineTo(-151.0, 22.75);
        ((GeneralPath) shape).lineTo(-151.625, 21.375);
        ((GeneralPath) shape).lineTo(-151.0, 20.5);
        ((GeneralPath) shape).lineTo(-154.75, 14.875);
        ((GeneralPath) shape).lineTo(-155.75, 15.375);
        ((GeneralPath) shape).lineTo(-157.625, 12.625);
        ((GeneralPath) shape).lineTo(-156.625, 11.875);
        ((GeneralPath) shape).lineTo(-161.0, 6.5);
        ((GeneralPath) shape).lineTo(-162.0, 7.125);
        ((GeneralPath) shape).lineTo(-163.875, 4.75);
        ((GeneralPath) shape).lineTo(-162.5, 3.75);
        ((GeneralPath) shape).lineTo(-166.625, -0.75);
        ((GeneralPath) shape).lineTo(-167.625, 0.0);
        ((GeneralPath) shape).lineTo(-168.5, -1.125);
        ((GeneralPath) shape).lineTo(-167.667, -2.0);
        ((GeneralPath) shape).lineTo(-171.75, -6.25);
        ((GeneralPath) shape).lineTo(-172.833, -5.333);
        ((GeneralPath) shape).lineTo(-174.75, -7.583);
        ((GeneralPath) shape).lineTo(-173.833, -8.417);
        ((GeneralPath) shape).lineTo(-179.583, -13.25);
        ((GeneralPath) shape).lineTo(-183.167, -11.309);
        ((GeneralPath) shape).lineTo(-177.0, -5.333);
        ((GeneralPath) shape).lineTo(-176.0, -6.988);
        ((GeneralPath) shape).lineTo(-173.833, -4.667);
        ((GeneralPath) shape).lineTo(-174.75, -2.71);
        ((GeneralPath) shape).lineTo(-171.0, 1.083);
        ((GeneralPath) shape).lineTo(-169.875, 0.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x878787), shape);
        TreeNode chain = new TreeNode("chain", s2, 3);

        root.addChild(bottom);
        bottom.addChild(leftLeg);
        bottom.addChild(rightLeg);
        bottom.addChild(shorts);
        bottom.addChild(rightShoe);
        bottom.addChild(rightSole);
        bottom.addChild(leftShoe);
        bottom.addChild(leftSole);
        bottom.addChild(leftShoeDetail);
        bottom.addChild(rightShoeDetail);
        bottom.addChild(shortsZipper);
        bottom.addChild(chain);

        // neck
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.083, -67.083);
        ((GeneralPath) shape).curveTo(-185.083, -67.083, -184.333, -61.416, -184.66599, -60.5);
        ((GeneralPath) shape).curveTo(-184.99898, -59.584, -189.33298, -58.75, -189.33298, -58.75);
        ((GeneralPath) shape).curveTo(-189.33298, -58.75, -189.49998, -49.25, -183.33298, -49.75);
        ((GeneralPath) shape).curveTo(-177.16597, -50.25, -165.16599, -58.417, -165.16599, -58.417);
        ((GeneralPath) shape).curveTo(-165.16599, -58.417, -172.33298, -60.084, -172.249, -63.0);
        ((GeneralPath) shape).curveTo(-172.16501, -65.916, -171.749, -72.75, -171.749, -72.75);
        ((GeneralPath) shape).lineTo(-185.083, -67.083);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD38D54), shape);
        TreeNode neck = new TreeNode("neck", s2, 3);

        // spikyHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-188.667, -110.833);
        ((GeneralPath) shape).curveTo(-188.667, -110.833, -190.33401, -112.166, -194.83401, -113.833);
        ((GeneralPath) shape).curveTo(-199.33401, -115.5, -202.66702, -118.666, -202.66702, -118.666);
        ((GeneralPath) shape).curveTo(-202.66702, -118.666, -202.00102, -115.333, -201.33403, -113.666);
        ((GeneralPath) shape).curveTo(-200.66704, -111.999, -199.50104, -109.833, -199.50104, -109.833);
        ((GeneralPath) shape).curveTo(-199.50104, -109.833, -199.83403, -110.0, -204.66803, -111.333);
        ((GeneralPath) shape).curveTo(-209.50203, -112.666, -212.50104, -114.333, -212.50104, -114.333);
        ((GeneralPath) shape).curveTo(-212.50104, -114.333, -207.50104, -108.666, -206.00104, -105.833);
        ((GeneralPath) shape).curveTo(-204.50104, -103.0, -204.66805, -101.5, -204.66805, -101.5);
        ((GeneralPath) shape).curveTo(-204.66805, -101.5, -208.00104, -101.167, -213.66805, -101.0);
        ((GeneralPath) shape).curveTo(-219.33505, -100.833, -224.66805, -101.333, -224.66805, -101.333);
        ((GeneralPath) shape).curveTo(-224.66805, -101.333, -221.16805, -99.833, -219.50104, -98.5);
        ((GeneralPath) shape).curveTo(-217.83403, -97.167, -213.16803, -94.833, -212.16803, -94.5);
        ((GeneralPath) shape).curveTo(-211.16803, -94.167, -209.66803, -94.167, -209.66803, -94.167);
        ((GeneralPath) shape).curveTo(-209.66803, -94.167, -211.16803, -91.5, -212.83504, -89.334);
        ((GeneralPath) shape).curveTo(-214.50204, -87.168, -217.00204, -85.834, -217.00204, -85.834);
        ((GeneralPath) shape).curveTo(-217.00204, -85.834, -214.00204, -86.667, -212.33505, -87.167);
        ((GeneralPath) shape).curveTo(-210.66806, -87.667, -208.33505, -88.667, -208.33505, -88.667);
        ((GeneralPath) shape).curveTo(-208.33505, -88.667, -209.66805, -85.5, -212.00206, -81.667);
        ((GeneralPath) shape).curveTo(-214.33607, -77.834, -217.33505, -74.834, -217.33505, -74.834);
        ((GeneralPath) shape).curveTo(-217.33505, -74.834, -212.00105, -74.501, -208.66806, -75.334);
        ((GeneralPath) shape).curveTo(-205.33507, -76.167, -204.00107, -76.834, -204.00107, -76.834);
        ((GeneralPath) shape).lineTo(-203.83406, -69.001);
        ((GeneralPath) shape).curveTo(-203.83406, -69.001, -203.33406, -70.334, -202.16705, -71.834);
        ((GeneralPath) shape).curveTo(-201.00005, -73.334, -201.00005, -73.334, -201.00005, -73.334);
        ((GeneralPath) shape).curveTo(-201.00005, -73.334, -200.66705, -73.501, -200.50005, -71.501);
        ((GeneralPath) shape).curveTo(-200.33304, -69.501, -199.33304, -67.501, -199.33304, -67.501);
        ((GeneralPath) shape).curveTo(-199.33304, -67.501, -199.25005, -68.751, -198.62505, -70.126);
        ((GeneralPath) shape).curveTo(-198.00005, -71.501, -197.00005, -72.626, -197.00005, -72.626);
        ((GeneralPath) shape).curveTo(-197.00005, -72.626, -196.375, -71.0, -195.125, -69.0);
        ((GeneralPath) shape).curveTo(-193.875, -67.0, -192.5, -65.25, -192.5, -65.25);
        ((GeneralPath) shape).curveTo(-192.5, -65.25, -193.375, -67.0, -193.875, -68.875);
        ((GeneralPath) shape).curveTo(-194.375, -70.75, -194.25, -73.375, -194.25, -73.375);
        ((GeneralPath) shape).curveTo(-194.25, -73.375, -192.875, -69.75, -191.625, -67.75);
        ((GeneralPath) shape).curveTo(-190.375, -65.75, -189.0, -64.25, -189.0, -64.25);
        ((GeneralPath) shape).curveTo(-189.0, -64.25, -189.875, -66.0, -190.125, -68.375);
        ((GeneralPath) shape).curveTo(-190.375, -70.75, -190.75, -73.0, -190.75, -73.0);
        ((GeneralPath) shape).lineTo(-175.0, -73.0);
        ((GeneralPath) shape).curveTo(-175.0, -73.0, -173.5, -72.125, -172.0, -69.75);
        ((GeneralPath) shape).curveTo(-170.5, -67.375, -169.125, -64.625, -169.125, -64.625);
        ((GeneralPath) shape).curveTo(-169.125, -64.625, -169.0, -65.875, -169.125, -68.625);
        ((GeneralPath) shape).curveTo(-169.25, -71.375, -169.625, -73.875, -169.625, -73.875);
        ((GeneralPath) shape).curveTo(-169.625, -73.875, -168.0, -72.625, -166.625, -71.25);
        ((GeneralPath) shape).curveTo(-165.25, -69.875, -163.25, -67.875, -163.25, -67.875);
        ((GeneralPath) shape).curveTo(-163.25, -67.875, -163.875, -70.375, -164.25, -72.25);
        ((GeneralPath) shape).curveTo(-164.625, -74.125, -165.125, -77.875, -165.125, -77.875);
        ((GeneralPath) shape).curveTo(-165.125, -77.875, -164.125, -76.75, -162.5, -75.375);
        ((GeneralPath) shape).curveTo(-160.875, -74.0, -159.5, -73.625, -159.5, -73.625);
        ((GeneralPath) shape).curveTo(-159.5, -73.625, -161.875, -77.125, -162.5, -78.875);
        ((GeneralPath) shape).curveTo(-163.125, -80.625, -163.625, -83.25, -163.625, -83.25);
        ((GeneralPath) shape).curveTo(-163.625, -83.25, -162.25, -82.625, -159.75, -81.75);
        ((GeneralPath) shape).curveTo(-157.25, -80.875, -155.0, -81.125, -155.0, -81.125);
        ((GeneralPath) shape).curveTo(-155.0, -81.125, -157.75, -81.75, -159.375, -83.625);
        ((GeneralPath) shape).curveTo(-161.0, -85.5, -162.0, -87.625, -162.0, -87.625);
        ((GeneralPath) shape).curveTo(-162.0, -87.625, -159.5, -87.125, -157.5, -86.5);
        ((GeneralPath) shape).curveTo(-155.5, -85.875, -152.375, -85.0, -152.375, -85.0);
        ((GeneralPath) shape).curveTo(-152.375, -85.0, -155.0, -87.5, -156.5, -88.625);
        ((GeneralPath) shape).curveTo(-158.0, -89.75, -158.75, -90.5, -158.75, -90.5);
        ((GeneralPath) shape).curveTo(-158.75, -90.5, -155.5, -91.75, -152.25, -93.375);
        ((GeneralPath) shape).curveTo(-149.0, -95.0, -146.0, -97.5, -146.0, -97.5);
        ((GeneralPath) shape).curveTo(-146.0, -97.5, -155.875, -100.625, -160.75, -102.375);
        ((GeneralPath) shape).curveTo(-165.625, -104.125, -168.625, -105.75, -172.375, -106.875);
        ((GeneralPath) shape).curveTo(-176.125, -108.0, -177.375, -108.0, -177.375, -108.0);
        ((GeneralPath) shape).curveTo(-177.375, -108.0, -177.25, -109.5, -176.375, -111.25);
        ((GeneralPath) shape).curveTo(-175.5, -113.0, -175.0, -114.0, -175.0, -114.0);
        ((GeneralPath) shape).curveTo(-175.0, -114.0, -177.75, -113.125, -179.75, -112.125);
        ((GeneralPath) shape).curveTo(-181.75, -111.125, -183.0, -110.25, -183.0, -110.25);
        ((GeneralPath) shape).curveTo(-183.0, -110.25, -182.375, -111.875, -181.875, -112.75);
        ((GeneralPath) shape).curveTo(-181.375, -113.625, -180.0, -115.75, -180.0, -115.75);
        ((GeneralPath) shape).curveTo(-180.0, -115.75, -181.5, -115.25, -184.125, -113.625);
        ((GeneralPath) shape).curveTo(-186.75, -112.0, -188.667, -110.833, -188.667, -110.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x422515), shape);
        TreeNode spikyHair = new TreeNode("spikyHair", s2, 3);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-198.583, -84.0);
        ((GeneralPath) shape).curveTo(-196.769, -79.164, -194.5, -71.75, -191.75, -69.333);
        ((GeneralPath) shape).curveTo(-189.0, -66.916, -182.33301, -62.916, -178.25, -64.416);
        ((GeneralPath) shape).curveTo(-174.16699, -65.916, -167.66699, -73.333, -168.5, -79.249);
        ((GeneralPath) shape).curveTo(-169.33301, -85.165, -172.66699, -93.499, -173.16699, -93.999);
        ((GeneralPath) shape).curveTo(-173.66699, -94.499, -180.91699, -102.582, -191.0, -98.832);
        ((GeneralPath) shape).curveTo(-201.08301, -95.082, -198.833, -84.667, -198.583, -84.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEEA968), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // bangs
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-203.875, -92.125);
        ((GeneralPath) shape).curveTo(-203.875, -92.125, -203.192, -101.229996, -192.75, -103.625);
        ((GeneralPath) shape).curveTo(-172.58301, -108.25, -167.125, -87.625, -167.125, -87.625);
        ((GeneralPath) shape).curveTo(-167.125, -87.625, -173.625, -90.25, -175.75, -91.125);
        ((GeneralPath) shape).curveTo(-177.875, -92.0, -182.75, -93.0, -182.75, -93.0);
        ((GeneralPath) shape).curveTo(-182.75, -93.0, -182.75, -91.625, -182.875, -88.5);
        ((GeneralPath) shape).curveTo(-183.0, -85.375, -183.75, -83.5, -183.75, -83.5);
        ((GeneralPath) shape).curveTo(-183.75, -83.5, -184.0, -85.625, -185.375, -88.125);
        ((GeneralPath) shape).curveTo(-186.75, -90.625, -188.625, -91.75, -188.625, -91.75);
        ((GeneralPath) shape).curveTo(-188.625, -91.75, -189.0, -89.875, -189.0, -88.0);
        ((GeneralPath) shape).curveTo(-189.0, -86.125, -189.125, -81.625, -189.125, -81.625);
        ((GeneralPath) shape).curveTo(-189.125, -81.625, -190.875, -86.5, -191.875, -87.875);
        ((GeneralPath) shape).curveTo(-192.875, -89.25, -194.75, -92.125, -194.75, -92.125);
        ((GeneralPath) shape).curveTo(-194.75, -92.125, -195.25, -90.0, -196.25, -87.375);
        ((GeneralPath) shape).curveTo(-197.25, -84.75, -198.75, -78.5, -198.25, -76.375);
        ((GeneralPath) shape).curveTo(-197.75, -74.25, -202.5, -84.875, -202.5, -84.875);
        ((GeneralPath) shape).lineTo(-203.875, -92.125);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x422515), shape);
        TreeNode bangs = new TreeNode("bangs", s2, 3);

        // rightEyeBrow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-183.188, -86.313);
        ((GeneralPath) shape).lineTo(-182.313, -86.0);
        ((GeneralPath) shape).curveTo(-182.313, -86.0, -180.188, -88.438, -178.438, -88.938);
        ((GeneralPath) shape).curveTo(-176.688, -89.438, -175.75, -89.12601, -175.75, -89.12601);
        ((GeneralPath) shape).curveTo(-175.75, -89.12601, -177.5, -90.43901, -179.25, -89.62601);
        ((GeneralPath) shape).curveTo(-181.0, -88.813, -183.188, -86.313, -183.188, -86.313);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x422515), shape);
        TreeNode rightEyeBrow = new TreeNode("rightEyeBrow", s2, 3);

        // leftEyeBrow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-189.625, -84.875);
        ((GeneralPath) shape).lineTo(-190.063, -83.875);
        ((GeneralPath) shape).curveTo(-190.063, -83.875, -193.313, -84.5, -194.251, -84.063);
        ((GeneralPath) shape).curveTo(-195.18901, -83.62601, -196.376, -82.5, -196.376, -82.5);
        ((GeneralPath) shape).curveTo(-196.376, -82.5, -195.751, -85.375, -192.813, -85.25);
        ((GeneralPath) shape).curveTo(-189.875, -85.125, -189.625, -84.875, -189.625, -84.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x422515), shape);
        TreeNode leftEyeBrow = new TreeNode("leftEyeBrow", s2, 3);

        // rightEyeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-180.938, -82.75);
        ((GeneralPath) shape).curveTo(-180.938, -82.75, -180.625, -85.188, -178.313, -85.75);
        ((GeneralPath) shape).curveTo(-176.001, -86.312, -174.063, -84.5, -174.063, -84.5);
        ((GeneralPath) shape).curveTo(-174.063, -84.5, -174.688, -82.5, -176.876, -82.0);
        ((GeneralPath) shape).curveTo(-179.06401, -81.5, -180.938, -82.75, -180.938, -82.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFFFFFF), shape);
        TreeNode rightEyeWhite = new TreeNode("rightEyeWhite", s2, 3);

        // leftEyeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-187.875, -80.5);
        ((GeneralPath) shape).curveTo(-187.875, -80.5, -189.563, -82.375, -191.563, -81.5);
        ((GeneralPath) shape).curveTo(-193.563, -80.625, -194.0, -78.625, -194.0, -78.625);
        ((GeneralPath) shape).curveTo(-194.0, -78.625, -192.375, -77.375, -190.437, -77.937);
        ((GeneralPath) shape).curveTo(-188.499, -78.49899, -187.875, -80.5, -187.875, -80.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFFFFFF), shape);
        TreeNode leftEyeWhite = new TreeNode("leftEyeWhite", s2, 3);

        // rightPupil
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-177.813, -85.813);
        ((GeneralPath) shape).curveTo(-175.66301, -86.406006, -174.438, -83.313, -177.063, -82.625);
        ((GeneralPath) shape).curveTo(-179.688, -81.937, -179.625, -85.313, -177.813, -85.813);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x1C7BAF), shape);
        TreeNode rightPupil = new TreeNode("rightPupil", s2, 3);

        // leftPupil
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-191.063, -81.625);
        ((GeneralPath) shape).curveTo(-188.628, -82.321, -188.0, -79.125, -190.25, -78.562);
        ((GeneralPath) shape).curveTo(-192.5, -77.99899, -193.25, -81.0, -191.063, -81.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x1C7BAF), shape);
        TreeNode leftPupil = new TreeNode("leftPupil", s2, 3);

        // nose
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.813, -79.813);
        ((GeneralPath) shape).curveTo(-185.813, -79.813, -185.063, -78.813, -184.938, -77.75);
        ((GeneralPath) shape).curveTo(-184.813, -76.687, -184.25, -75.687, -183.813, -75.625);
        ((GeneralPath) shape).curveTo(-183.376, -75.563, -181.563, -75.125, -181.563, -75.125);
        ((GeneralPath) shape).curveTo(-181.563, -75.125, -184.563, -74.5, -185.001, -74.687);
        ((GeneralPath) shape).curveTo(-185.43901, -74.87399, -185.501, -76.625, -185.501, -77.125);
        ((GeneralPath) shape).curveTo(-185.501, -77.625, -185.813, -79.813, -185.813, -79.813);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xB7562B), shape);
        TreeNode nose = new TreeNode("nose", s2, 3);

        // mouth
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.75, -71.0);
        ((GeneralPath) shape).curveTo(-186.25, -70.875, -186.313, -70.687, -185.625, -70.437);
        ((GeneralPath) shape).curveTo(-184.937, -70.187, -184.187, -70.312, -184.187, -70.312);
        ((GeneralPath) shape).curveTo(-184.187, -70.312, -184.562, -69.562, -183.562, -69.24899);
        ((GeneralPath) shape).curveTo(-182.562, -68.93599, -181.812, -68.81099, -180.062, -69.74899);
        ((GeneralPath) shape).curveTo(-178.312, -70.687, -177.624, -71.49899, -177.624, -71.812);
        ((GeneralPath) shape).curveTo(-177.624, -72.125, -179.562, -70.687, -180.249, -70.312);
        ((GeneralPath) shape).curveTo(-180.93599, -69.937, -182.374, -69.24899, -182.999, -69.74899);
        ((GeneralPath) shape).curveTo(-183.624, -70.24899, -182.499, -70.812, -180.499, -71.812);
        ((GeneralPath) shape).curveTo(-178.499, -72.812, -177.374, -73.5, -177.374, -73.937);
        ((GeneralPath) shape).curveTo(-177.374, -74.37399, -177.812, -74.5, -178.437, -73.87399);
        ((GeneralPath) shape).curveTo(-179.062, -73.247986, -180.937, -72.31099, -181.312, -72.06099);
        ((GeneralPath) shape).curveTo(-181.687, -71.81099, -183.625, -70.93599, -183.625, -70.93599);
        ((GeneralPath) shape).lineTo(-185.75, -71.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xB7562B), shape);
        TreeNode mouth = new TreeNode("mouth", s2, 3);

        root.addChild(head);
        head.addChild(neck);
        head.addChild(spikyHair);
        head.addChild(face);
        head.addChild(bangs);
        head.addChild(rightEyeBrow);
        head.addChild(leftEyeBrow);
        head.addChild(rightEyeWhite);
        head.addChild(leftEyeWhite);
        head.addChild(rightPupil);
        head.addChild(leftPupil);
        head.addChild(nose);
        head.addChild(mouth);

        // shirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-193.625, -58.375);
        ((GeneralPath) shape).curveTo(-193.625, -58.375, -192.25, -62.75, -190.625, -63.125);
        ((GeneralPath) shape).curveTo(-189.0, -63.5, -174.75, -63.125, -166.75, -59.625);
        ((GeneralPath) shape).curveTo(-158.75, -56.125, -170.5, -38.75, -170.5, -32.375);
        ((GeneralPath) shape).curveTo(-170.5, -26.0, -168.875, -16.625, -168.875, -16.625);
        ((GeneralPath) shape).curveTo(-168.875, -16.625, -186.625, -10.125, -193.375, -11.5);
        ((GeneralPath) shape).curveTo(-200.125, -12.875, -202.375, -17.125, -202.375, -17.125);
        ((GeneralPath) shape).curveTo(-202.375, -17.125, -198.0, -22.625, -196.0, -29.625);
        ((GeneralPath) shape).curveTo(-194.0, -36.625, -193.875, -57.375, -193.625, -58.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xBE000F), shape);
        TreeNode shirt = new TreeNode("shirt", s2, 3);

        // shirtZipper
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.5, -54.625);
        ((GeneralPath) shape).lineTo(-183.375, -54.25);
        ((GeneralPath) shape).curveTo(-183.375, -54.25, -185.375, -49.875, -185.75, -43.375);
        ((GeneralPath) shape).curveTo(-186.125, -36.875, -187.5, -29.625, -189.125, -23.625);
        ((GeneralPath) shape).curveTo(-190.75, -17.625, -191.625, -10.5, -191.625, -10.5);
        ((GeneralPath) shape).lineTo(-193.625, -10.25);
        ((GeneralPath) shape).curveTo(-193.625, -10.25, -192.0, -21.375, -191.125, -23.5);
        ((GeneralPath) shape).curveTo(-190.25, -25.625, -187.875, -38.25, -187.875, -42.75);
        ((GeneralPath) shape).curveTo(-187.875, -46.883, -185.5, -54.625, -185.5, -54.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x878787), shape);
        TreeNode shirtZipper = new TreeNode("shirtZipper", s2, 3);

        // belt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-201.625, -20.0);
        ((GeneralPath) shape).curveTo(-202.541, -19.738, -204.0, -15.75, -203.5, -14.375);
        ((GeneralPath) shape).curveTo(-203.0, -13.0, -198.25, -9.75, -195.625, -6.875);
        ((GeneralPath) shape).curveTo(-193.0, -4.0, -190.75, 0.0, -190.0, 0.0);
        ((GeneralPath) shape).curveTo(-189.25, 0.0, -186.375, -2.75, -186.25, -4.125);
        ((GeneralPath) shape).curveTo(-186.125, -5.5, -188.75, -8.75, -188.75, -8.75);
        ((GeneralPath) shape).curveTo(-188.75, -8.75, -185.875, -8.875, -182.25, -10.125);
        ((GeneralPath) shape).curveTo(-178.625, -11.375, -172.75, -12.25, -170.75, -11.875);
        ((GeneralPath) shape).curveTo(-168.75, -11.5, -164.375, -10.25, -164.375, -10.25);
        ((GeneralPath) shape).lineTo(-164.625, -17.875);
        ((GeneralPath) shape).curveTo(-164.625, -17.875, -169.919, -21.399, -179.625, -17.5);
        ((GeneralPath) shape).curveTo(-189.58301, -13.5, -196.625, -15.25, -196.625, -15.25);
        ((GeneralPath) shape).curveTo(-196.625, -15.25, -199.625, -17.375, -200.25, -18.375);
        ((GeneralPath) shape).curveTo(-200.875, -19.375, -200.75, -20.25, -201.625, -20.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x11408E), shape);
        TreeNode belt = new TreeNode("belt", s2, 3);

        // key
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-246.0, -24.0);
        ((GeneralPath) shape).lineTo(-265.5, 132.25);
        ((GeneralPath) shape).lineTo(-238.25, 132.25);
        ((GeneralPath) shape).lineTo(-238.25, 127.25);
        ((GeneralPath) shape).lineTo(-248.25, 127.0);
        ((GeneralPath) shape).curveTo(-248.25, 127.0, -246.0, 124.25, -244.75, 124.25);
        ((GeneralPath) shape).curveTo(-243.5, 124.25, -239.75, 125.25, -239.75, 122.625);
        ((GeneralPath) shape).curveTo(-239.75, 120.0, -241.5, 121.5, -244.0, 120.5);
        ((GeneralPath) shape).curveTo(-246.5, 119.5, -249.5, 116.375, -249.5, 116.375);
        ((GeneralPath) shape).curveTo(-249.5, 116.375, -245.625, 114.125, -243.75, 114.625);
        ((GeneralPath) shape).curveTo(-241.875, 115.125, -239.625, 115.875, -239.125, 114.875);
        ((GeneralPath) shape).curveTo(-238.625, 113.875, -239.75, 111.5, -241.875, 111.5);
        ((GeneralPath) shape).curveTo(-244.0, 111.5, -245.375, 107.0, -245.375, 107.0);
        ((GeneralPath) shape).curveTo(-245.375, 107.0, -242.25, 107.375, -240.875, 108.125);
        ((GeneralPath) shape).curveTo(-239.5, 108.875, -237.0, 110.0, -237.0, 110.0);
        ((GeneralPath) shape).lineTo(-235.875, 106.25);
        ((GeneralPath) shape).lineTo(-251.625, 98.375);
        ((GeneralPath) shape).lineTo(-238.25, -22.375);
        ((GeneralPath) shape).lineTo(-246.0, -24.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x90939A), shape);
        TreeNode key = new TreeNode("key", s2, 3);

        // keyTop
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-258.167, -28.0);
        ((GeneralPath) shape).curveTo(-258.167, -28.0, -253.66699, -30.5, -242.66699, -29.833);
        ((GeneralPath) shape).curveTo(-231.66699, -29.166, -227.0, -24.833, -227.0, -24.833);
        ((GeneralPath) shape).curveTo(-227.0, -24.833, -220.66699, -27.333, -219.16699, -22.666);
        ((GeneralPath) shape).curveTo(-217.66699, -17.999, -221.49998, -16.624, -221.49998, -16.624);
        ((GeneralPath) shape).lineTo(-227.49998, 10.000999);
        ((GeneralPath) shape).curveTo(-227.49998, 10.000999, -231.21898, 13.809, -235.49998, 14.976);
        ((GeneralPath) shape).curveTo(-242.01099, 16.751, -248.21799, 15.613, -248.21799, 15.613);
        ((GeneralPath) shape).lineTo(-247.333, 11.334);
        ((GeneralPath) shape).curveTo(-247.333, 11.334, -241.819, 11.667, -238.493, 10.667);
        ((GeneralPath) shape).curveTo(-235.16699, 9.667, -233.01, 8.5, -233.01, 8.5);
        ((GeneralPath) shape).lineTo(-229.333, -17.833);
        ((GeneralPath) shape).curveTo(-229.333, -17.833, -234.333, -19.252, -243.0, -20.042);
        ((GeneralPath) shape).curveTo(-251.667, -20.831999, -257.5, -20.042, -257.5, -20.042);
        ((GeneralPath) shape).lineTo(-258.167, 4.8339996);
        ((GeneralPath) shape).curveTo(-258.167, 4.8339996, -253.94699, 8.400999, -252.0, 9.667);
        ((GeneralPath) shape).curveTo(-248.667, 11.834, -244.533, 11.381, -244.533, 11.381);
        ((GeneralPath) shape).lineTo(-244.418, 15.955);
        ((GeneralPath) shape).curveTo(-244.418, 15.955, -249.0, 15.973, -254.275, 13.666);
        ((GeneralPath) shape).curveTo(-258.976, 11.612, -264.167, 6.0, -264.167, 6.0);
        ((GeneralPath) shape).lineTo(-264.167, -21.0);
        ((GeneralPath) shape).curveTo(-264.167, -21.0, -266.5, -24.333, -264.167, -27.0);
        ((GeneralPath) shape).curveTo(-261.83398, -29.667, -258.167, -28.0, -258.167, -28.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF3C600), shape);
        TreeNode keyTop = new TreeNode("keyTop", s2, 3);

        // rightVest
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-170.125, -57.75);
        ((GeneralPath) shape).curveTo(-167.639, -60.391, -162.875, -65.125, -159.75, -65.0);
        ((GeneralPath) shape).curveTo(-156.625, -64.875, -156.25, -58.5, -156.25, -58.5);
        ((GeneralPath) shape).curveTo(-156.25, -58.5, -135.5, -51.25, -135.625, -50.25);
        ((GeneralPath) shape).curveTo(-135.75, -49.25, -136.125, -48.125, -136.125, -48.125);
        ((GeneralPath) shape).curveTo(-136.125, -48.125, -135.75, -49.75, -137.875, -49.375);
        ((GeneralPath) shape).curveTo(-140.0, -49.0, -143.25, -47.5, -144.375, -44.75);
        ((GeneralPath) shape).curveTo(-145.5, -42.0, -145.875, -39.875, -145.0, -39.625);
        ((GeneralPath) shape).curveTo(-144.125, -39.375, -143.625, -39.125, -143.625, -39.125);
        ((GeneralPath) shape).lineTo(-141.125, -37.75);
        ((GeneralPath) shape).curveTo(-141.125, -37.75, -145.0, -33.75, -146.375, -34.0);
        ((GeneralPath) shape).curveTo(-147.75, -34.25, -153.25, -42.25, -155.75, -42.625);
        ((GeneralPath) shape).curveTo(-158.25, -43.0, -164.75, -40.75, -165.25, -35.0);
        ((GeneralPath) shape).curveTo(-165.75, -29.25, -164.75, -23.0, -164.75, -21.25);
        ((GeneralPath) shape).curveTo(-164.75, -19.5, -165.375, -17.625, -165.375, -17.625);
        ((GeneralPath) shape).curveTo(-165.375, -17.625, -166.625, -19.625, -169.5, -18.625);
        ((GeneralPath) shape).curveTo(-172.375, -17.625, -181.25, -13.125, -181.25, -13.125);
        ((GeneralPath) shape).curveTo(-181.25, -13.125, -180.125, -19.75, -179.875, -25.875);
        ((GeneralPath) shape).curveTo(-179.625, -32.0, -179.875, -43.75, -178.625, -46.25);
        ((GeneralPath) shape).curveTo(-177.375, -48.75, -176.814, -49.873, -176.25, -50.625);
        ((GeneralPath) shape).curveTo(-174.375, -53.125, -171.625, -56.157, -170.125, -57.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x13131B), shape);
        TreeNode rightVest = new TreeNode("rightVest", s2, 3);

        // leftArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-211.333, -45.167);
        ((GeneralPath) shape).lineTo(-216.0, -39.667);
        ((GeneralPath) shape).lineTo(-230.16699, -39.5);
        ((GeneralPath) shape).curveTo(-230.16699, -39.5, -234.5, -33.0, -229.66699, -32.0);
        ((GeneralPath) shape).curveTo(-224.83398, -31.0, -213.66699, -31.167, -213.66699, -31.167);
        ((GeneralPath) shape).lineTo(-204.33398, -41.5);
        ((GeneralPath) shape).lineTo(-211.333, -45.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEEA968), shape);
        TreeNode leftArm = new TreeNode("leftArm", s2, 3);

        // leftVest
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-187.875, -62.75);
        ((GeneralPath) shape).curveTo(-187.875, -62.75, -189.5, -64.625, -191.5, -63.75);
        ((GeneralPath) shape).curveTo(-193.5, -62.875, -194.875, -61.5, -194.875, -61.5);
        ((GeneralPath) shape).lineTo(-215.625, -45.625);
        ((GeneralPath) shape).curveTo(-215.625, -45.625, -214.625, -42.25, -210.25, -38.125);
        ((GeneralPath) shape).curveTo(-205.875, -34.0, -203.625, -32.5, -203.625, -32.5);
        ((GeneralPath) shape).lineTo(-195.375, -42.625);
        ((GeneralPath) shape).curveTo(-195.375, -42.625, -194.375, -37.0, -196.375, -32.875);
        ((GeneralPath) shape).curveTo(-198.375, -28.75, -202.625, -23.75, -202.75, -22.0);
        ((GeneralPath) shape).curveTo(-202.875, -20.25, -201.375, -16.625, -201.375, -16.625);
        ((GeneralPath) shape).curveTo(-201.375, -16.625, -195.25, -26.75, -193.875, -32.5);
        ((GeneralPath) shape).curveTo(-192.5, -38.25, -192.125, -47.125, -192.125, -51.5);
        ((GeneralPath) shape).curveTo(-192.125, -55.875, -191.375, -62.0, -190.375, -62.5);
        ((GeneralPath) shape).curveTo(-189.375, -63.0, -187.875, -62.75, -187.875, -62.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x13131B), shape);
        TreeNode leftVest = new TreeNode("leftVest", s2, 3);

        // rightSleeve
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-155.5, -59.0);
        ((GeneralPath) shape).curveTo(-155.5, -59.0, -157.125, -61.5, -160.125, -59.25);
        ((GeneralPath) shape).curveTo(-163.125, -57.0, -161.75, -54.375, -164.5, -52.25);
        ((GeneralPath) shape).curveTo(-167.25, -50.125, -177.0, -45.625, -177.0, -45.625);
        ((GeneralPath) shape).curveTo(-177.0, -45.625, -174.5, -36.25, -168.25, -34.5);
        ((GeneralPath) shape).curveTo(-162.0, -32.75, -157.75, -36.125, -157.75, -36.125);
        ((GeneralPath) shape).lineTo(-149.375, -33.25);
        ((GeneralPath) shape).curveTo(-149.375, -33.25, -151.25, -41.625, -146.875, -46.75);
        ((GeneralPath) shape).curveTo(-142.5, -51.875, -137.25, -52.0, -137.25, -52.0);
        ((GeneralPath) shape).lineTo(-155.5, -59.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEFE8EF), shape);
        TreeNode rightSleeve = new TreeNode("rightSleeve", s2, 3);

        // rightHand
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-168.75, -6.375);
        ((GeneralPath) shape).curveTo(-168.75, -6.375, -167.875, -1.125, -165.375, 0.375);
        ((GeneralPath) shape).curveTo(-162.875, 1.875, -160.875, 2.25, -159.25, 1.0);
        ((GeneralPath) shape).curveTo(-157.625, -0.25, -156.375, -2.375, -157.125, -3.375);
        ((GeneralPath) shape).curveTo(-157.875, -4.375, -160.375, -2.75, -160.375, -2.75);
        ((GeneralPath) shape).curveTo(-160.375, -2.75, -165.0, -7.375, -166.625, -7.125);
        ((GeneralPath) shape).curveTo(-168.25, -6.875, -168.875, -7.75, -168.75, -6.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEEA968), shape);
        TreeNode rightHand = new TreeNode("rightHand", s2, 3);

        // leftSleeve
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-194.0, -62.625);
        ((GeneralPath) shape).lineTo(-212.375, -48.875);
        ((GeneralPath) shape).curveTo(-212.375, -48.875, -211.875, -45.875, -207.625, -42.0);
        ((GeneralPath) shape).curveTo(-203.375, -38.125, -200.25, -35.75, -200.25, -35.75);
        ((GeneralPath) shape).lineTo(-194.875, -41.625);
        ((GeneralPath) shape).curveTo(-194.875, -41.625, -193.625, -44.625, -194.625, -52.125);
        ((GeneralPath) shape).curveTo(-195.625, -59.625, -194.0, -62.625, -194.0, -62.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEFE8EF), shape);
        TreeNode leftSleeve = new TreeNode("leftSleeve", s2, 3);

        // rightArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-149.167, -42.167);
        ((GeneralPath) shape).lineTo(-142.33401, -39.167);
        ((GeneralPath) shape).lineTo(-151.667, -31.0);
        ((GeneralPath) shape).curveTo(-151.667, -31.0, -153.001, -28.167, -150.83401, -26.5);
        ((GeneralPath) shape).curveTo(-148.66702, -24.833, -141.66702, -28.0, -135.66702, -31.833);
        ((GeneralPath) shape).curveTo(-129.66702, -35.666, -126.66702, -38.333, -127.66702, -40.666);
        ((GeneralPath) shape).curveTo(-128.66702, -42.999, -138.0, -49.0, -142.167, -49.833);
        ((GeneralPath) shape).curveTo(-146.33401, -50.666, -149.167, -42.167, -149.167, -42.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEEA968), shape);
        TreeNode rightArm = new TreeNode("rightArm", s2, 3);

        // rightGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-151.5, -36.333);
        ((GeneralPath) shape).curveTo(-151.5, -36.333, -146.5, -31.833, -145.16699, -29.666);
        ((GeneralPath) shape).curveTo(-143.83398, -27.499, -141.49998, -22.166, -141.49998, -22.166);
        ((GeneralPath) shape).lineTo(-147.16699, -19.499);
        ((GeneralPath) shape).lineTo(-148.0, -22.167);
        ((GeneralPath) shape).curveTo(-148.0, -22.167, -149.833, -22.167, -150.5, -20.334);
        ((GeneralPath) shape).curveTo(-151.167, -18.501, -152.5, -16.834, -153.833, -12.667);
        ((GeneralPath) shape).curveTo(-155.16599, -8.5, -156.5, -4.8339996, -156.5, -4.8339996);
        ((GeneralPath) shape).curveTo(-156.5, -4.8339996, -160.5, -0.50099945, -163.66699, -1.3339996);
        ((GeneralPath) shape).curveTo(-166.83398, -2.1669998, -171.83398, -8.000999, -167.16699, -15.500999);
        ((GeneralPath) shape).curveTo(-162.5, -23.001, -162.33398, -25.334, -159.16699, -28.334);
        ((GeneralPath) shape).curveTo(-156.0, -31.334, -155.99998, -31.334, -155.99998, -31.334);
        ((GeneralPath) shape).lineTo(-156.5, -32.0);
        ((GeneralPath) shape).lineTo(-151.5, -36.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xC3CBCD), shape);
        TreeNode rightGlove = new TreeNode("rightGlove", s2, 3);

        // leftGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-228.625, -42.875);
        ((GeneralPath) shape).lineTo(-222.125, -44.25);
        ((GeneralPath) shape).curveTo(-222.125, -44.25, -219.375, -41.5, -220.75, -35.875);
        ((GeneralPath) shape).curveTo(-222.125, -30.25, -225.625, -28.0, -225.625, -28.0);
        ((GeneralPath) shape).lineTo(-230.375, -30.875);
        ((GeneralPath) shape).curveTo(-230.375, -30.875, -233.875, -31.125, -235.5, -31.25);
        ((GeneralPath) shape).curveTo(-237.125, -31.375, -239.5, -32.625, -241.375, -34.5);
        ((GeneralPath) shape).curveTo(-243.25, -36.375, -246.875, -38.25, -248.875, -37.875);
        ((GeneralPath) shape).curveTo(-250.875, -37.5, -255.125, -38.0, -254.125, -39.625);
        ((GeneralPath) shape).curveTo(-253.125, -41.25, -251.625, -43.5, -249.625, -43.375);
        ((GeneralPath) shape).curveTo(-247.625, -43.25, -247.75, -42.75, -244.75, -43.125);
        ((GeneralPath) shape).curveTo(-241.75, -43.5, -241.125, -44.875, -239.25, -43.875);
        ((GeneralPath) shape).curveTo(-237.375, -42.875, -234.875, -42.375, -233.5, -42.125);
        ((GeneralPath) shape).curveTo(-232.125, -41.875, -228.625, -42.875, -228.625, -42.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xC3CBCD), shape);
        TreeNode leftGlove = new TreeNode("leftGlove", s2, 3);

        // leftHand
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-253.125, -40.875);
        ((GeneralPath) shape).curveTo(-253.125, -40.875, -255.625, -38.125, -255.75, -34.625);
        ((GeneralPath) shape).curveTo(-255.875, -31.125, -255.75, -28.0, -254.75, -28.0);
        ((GeneralPath) shape).curveTo(-253.75, -28.0, -253.125, -28.25, -253.125, -28.25);
        ((GeneralPath) shape).curveTo(-253.125, -28.25, -252.75, -27.375, -251.375, -26.875);
        ((GeneralPath) shape).curveTo(-250.0, -26.375, -248.25, -26.875, -248.125, -27.75);
        ((GeneralPath) shape).curveTo(-248.0, -28.625, -249.75, -31.5, -248.375, -34.375);
        ((GeneralPath) shape).curveTo(-247.0, -37.25, -246.75, -36.625, -246.75, -36.625);
        ((GeneralPath) shape).curveTo(-246.75, -36.625, -247.5, -34.375, -247.25, -31.5);
        ((GeneralPath) shape).curveTo(-247.0, -28.625, -247.125, -27.5, -245.25, -27.5);
        ((GeneralPath) shape).curveTo(-243.375, -27.5, -244.5, -29.875, -243.875, -33.125);
        ((GeneralPath) shape).curveTo(-243.25, -36.375, -241.125, -37.375, -239.5, -35.5);
        ((GeneralPath) shape).curveTo(-237.875, -33.625, -238.625, -30.75, -240.375, -29.75);
        ((GeneralPath) shape).curveTo(-242.125, -28.75, -243.25, -27.0, -241.625, -26.375);
        ((GeneralPath) shape).curveTo(-240.0, -25.75, -237.375, -26.375, -235.375, -28.375);
        ((GeneralPath) shape).curveTo(-233.375, -30.375, -231.75, -33.5, -234.375, -35.25);
        ((GeneralPath) shape).curveTo(-237.0, -37.0, -237.625, -35.5, -239.375, -36.75);
        ((GeneralPath) shape).curveTo(-241.125, -38.0, -240.5, -38.625, -242.875, -39.375);
        ((GeneralPath) shape).curveTo(-245.25, -40.125, -246.125, -39.0, -246.125, -39.0);
        ((GeneralPath) shape).curveTo(-246.125, -39.0, -246.0, -40.125, -247.625, -40.375);
        ((GeneralPath) shape).curveTo(-249.25, -40.625, -250.5, -40.0, -250.5, -40.0);
        ((GeneralPath) shape).curveTo(-250.5, -40.0, -250.875, -40.625, -252.0, -41.0);
        ((GeneralPath) shape).curveTo(-253.125, -41.375, -253.125, -40.875, -253.125, -40.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEEA968), shape);
        TreeNode leftHand = new TreeNode("leftHand", s2, 3);

        // necklace
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-185.0, -62.083);
        ((GeneralPath) shape).lineTo(-184.875, -60.333);
        ((GeneralPath) shape).curveTo(-184.875, -60.333, -187.625, -59.708, -188.625, -56.458);
        ((GeneralPath) shape).curveTo(-189.625, -53.208, -189.75, -43.833, -189.75, -43.833);
        ((GeneralPath) shape).lineTo(-188.875, -41.958);
        ((GeneralPath) shape).lineTo(-186.125, -45.958);
        ((GeneralPath) shape).lineTo(-184.625, -41.708);
        ((GeneralPath) shape).curveTo(-184.625, -41.708, -180.75, -51.708, -177.25, -55.708);
        ((GeneralPath) shape).curveTo(-173.75, -59.708, -169.875, -61.833, -169.875, -61.833);
        ((GeneralPath) shape).lineTo(-168.375, -61.458);
        ((GeneralPath) shape).curveTo(-168.375, -61.458, -175.625, -56.958, -178.5, -51.083);
        ((GeneralPath) shape).curveTo(-181.375, -45.208, -183.5, -38.083, -183.5, -38.083);
        ((GeneralPath) shape).lineTo(-191.75, -37.833);
        ((GeneralPath) shape).lineTo(-191.875, -44.958);
        ((GeneralPath) shape).lineTo(-190.875, -44.333);
        ((GeneralPath) shape).curveTo(-190.875, -44.333, -191.125, -56.708, -189.375, -58.708);
        ((GeneralPath) shape).curveTo(-187.625, -60.708, -185.0, -62.083, -185.0, -62.083);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD8D8D8), shape);
        TreeNode necklace = new TreeNode("necklace", s2, 3);

        root.addChild(torso);
        torso.addChild(shirt);
        torso.addChild(shirtZipper);
        torso.addChild(belt);
        torso.addChild(key);
        torso.addChild(keyTop);
        torso.addChild(rightVest);
        torso.addChild(leftArm);
        torso.addChild(leftVest);
        torso.addChild(rightSleeve);
        torso.addChild(rightHand);
        torso.addChild(leftSleeve);
        torso.addChild(rightArm);
        torso.addChild(rightGlove);
        torso.addChild(leftGlove);
        torso.addChild(leftHand);
        torso.addChild(necklace);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Sora(int width, int height) {
    	super(111, 224, new Color(250, 60, 38));
        this.width = width;
        this.height = height;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (image == null) {
            image = new BufferedImage(getIconWidth(), getIconHeight(), BufferedImage.TYPE_INT_ARGB);
            double coef = Math.min((double) width / (double) 111, (double) height / (double) 225);
            
            Graphics2D g2d = image.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.scale(coef, coef);
            paint(g2d);
            g2d.dispose();
        }
        
        g.drawImage(image, x, y, null);
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     * 
     * @param g Graphics context.
     */
    public void paint(Graphics2D g) {
        Shape shape = null;
        
        float origAlpha = 1.0f;
        
        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();

    }
}

