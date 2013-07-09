

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
public class Ash extends Shape2d implements javax.swing.Icon {

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
    public Ash() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 0;
        int y = 0;
        
        root = new TreeNode("ASH", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);

        // leftLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 96.167, y +  217.667);
        ((GeneralPath) shape).lineTo(x + 84.0, y +  270.334);
        ((GeneralPath) shape).lineTo(x + 94.167, y +  275.001);
        ((GeneralPath) shape).lineTo(x + 109.167, y +  217.334);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x48465E), shape);
        TreeNode leftLeg = new TreeNode("leftLeg", s2, 3);

        // rightLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 114.5, y +  215.667);
        ((GeneralPath) shape).lineTo(x + 111.833, y +  264.167);
        ((GeneralPath) shape).lineTo(x + 121.667, y +  264.834);
        ((GeneralPath) shape).lineTo(x + 128.167, y +  210.834);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x48465E), shape);
        TreeNode rightLeg = new TreeNode("rightLeg", s2, 3);

        // leftBoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 83.0, y +  264.167);
        ((GeneralPath) shape).lineTo(x + 97.833, y +  266.83398);
        ((GeneralPath) shape).curveTo(x + 97.833, y +  266.83398, x +  92.0, y +  285.167, x +  91.666, y +  291.33398);
        ((GeneralPath) shape).curveTo(x + 91.332, y +  297.50098, x +  91.333, y +  301.167, x +  91.333, y +  301.167);
        ((GeneralPath) shape).curveTo(x + 91.333, y +  301.167, x +  96.333, y +  317.335, x +  86.5, y +  317.00098);
        ((GeneralPath) shape).curveTo(x + 76.667, y +  316.66696, x +  80.5, y +  301.167, x +  80.5, y +  301.167);
        ((GeneralPath) shape).lineTo(x + 83.0, y +  264.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xC9AC8C), shape);
        TreeNode leftBoot = new TreeNode("leftBoot", s2, 3);

        // rightBoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 111.0, y +  259.501);
        ((GeneralPath) shape).lineTo(x + 124.333, y +  259.501);
        ((GeneralPath) shape).lineTo(x + 123.5, y +  288.001);
        ((GeneralPath) shape).curveTo(x + 123.5, y +  288.001, x +  138.334, y +  290.834, x +  138.66699, y +  295.334);
        ((GeneralPath) shape).curveTo(x + 138.99998, y +  299.834, x +  137.99998, y +  305.16702, x +  129.83398, y +  303.834);
        ((GeneralPath) shape).curveTo(x + 121.667984, y +  302.501, x +  112.833984, y +  300.001, x +  112.833984, y +  300.001);
        ((GeneralPath) shape).lineTo(x + 111.0, y +  259.501);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xC9AC8C), shape);
        TreeNode rightBoot = new TreeNode("rightBoot", s2, 3);

        // leftBootStraps
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 86.625, y +  268.5);
        ((GeneralPath) shape).lineTo(x + 84.25, y +  296.75);
        ((GeneralPath) shape).lineTo(x + 84.75, y +  308.875);
        ((GeneralPath) shape).lineTo(x + 87.875, y +  309.0);
        ((GeneralPath) shape).lineTo(x + 88.0, y +  295.875);
        ((GeneralPath) shape).lineTo(x + 91.375, y +  269.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x8A3866), shape);
        TreeNode leftBootStraps = new TreeNode("leftBootStraps", s2, 3);

        // rightBootStraps
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 118.375, y +  262.0);
        ((GeneralPath) shape).lineTo(x + 122.75, y +  261.25);
        ((GeneralPath) shape).lineTo(x + 123.25, y +  289.125);
        ((GeneralPath) shape).lineTo(x + 133.375, y +  292.0);
        ((GeneralPath) shape).lineTo(x + 132.0, y +  294.875);
        ((GeneralPath) shape).lineTo(x + 119.875, y +  292.125);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x8A3866), shape);
        TreeNode rightBootStraps = new TreeNode("rightBootStraps", s2, 3);

        // leftAnklet
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 111.125, y +  279.5);
        ((GeneralPath) shape).lineTo(x + 112.125, y +  289.875);
        ((GeneralPath) shape).curveTo(x + 112.125, y +  289.875, x +  115.5, y +  291.875, x +  119.375, y +  291.0);
        ((GeneralPath) shape).curveTo(x + 123.25, y +  290.125, x +  124.5, y +  287.375, x +  124.5, y +  287.375);
        ((GeneralPath) shape).lineTo(x + 124.25, y +  277.75);
        ((GeneralPath) shape).curveTo(x + 124.25, y +  277.75, x +  120.25, y +  280.125, x +  116.875, y +  280.5);
        ((GeneralPath) shape).curveTo(x + 113.5, y +  280.875, x +  111.125, y +  279.5, x +  111.125, y +  279.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x7F738B), shape);
        TreeNode leftAnklet = new TreeNode("leftAnklet", s2, 3);

        // rightAnklet
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 80.5, y +  285.5);
        ((GeneralPath) shape).lineTo(x + 80.0, y +  296.25);
        ((GeneralPath) shape).curveTo(x + 80.0, y +  296.25, x +  83.375, y +  298.25, x +  86.375, y +  298.25);
        ((GeneralPath) shape).curveTo(x + 89.375, y +  298.25, x +  91.5, y +  297.5, x +  91.5, y +  297.5);
        ((GeneralPath) shape).lineTo(x + 92.75, y +  287.75);
        ((GeneralPath) shape).curveTo(x + 92.75, y +  287.75, x +  88.875, y +  288.875, x +  86.875, y +  288.5);
        ((GeneralPath) shape).curveTo(x + 84.875, y +  288.125, x +  80.5, y +  285.5, x +  80.5, y +  285.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x7F738B), shape);
        TreeNode rightAnklet = new TreeNode("rightAnklet", s2, 3);

        root.addChild(bottom);
        bottom.addChild(leftLeg);
        bottom.addChild(rightLeg);
        bottom.addChild(leftBoot);
        bottom.addChild(rightBoot);
        bottom.addChild(leftBootStraps);
        bottom.addChild(rightBootStraps);
        bottom.addChild(leftAnklet);
        bottom.addChild(rightAnklet);

        // backScarf
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 81.0, y +  145.25);
        ((GeneralPath) shape).curveTo(x + 77.25, y +  155.0, x +  64.75, y +  181.75, x +  66.75, y +  188.75);
        ((GeneralPath) shape).curveTo(x + 68.75, y +  195.75, x +  75.75, y +  214.75, x +  74.25, y +  220.25);
        ((GeneralPath) shape).curveTo(x + 72.75, y +  225.75, x +  62.75, y +  237.5, x +  62.75, y +  237.5);
        ((GeneralPath) shape).lineTo(x + 65.5, y +  243.5);
        ((GeneralPath) shape).lineTo(x + 74.0, y +  233.25);
        ((GeneralPath) shape).lineTo(x + 77.75, y +  248.75);
        ((GeneralPath) shape).lineTo(x + 83.0, y +  246.0);
        ((GeneralPath) shape).lineTo(x + 80.75, y +  233.5);
        ((GeneralPath) shape).lineTo(x + 92.0, y +  242.75);
        ((GeneralPath) shape).lineTo(x + 94.75, y +  237.5);
        ((GeneralPath) shape).lineTo(x + 87.25, y +  231.0);
        ((GeneralPath) shape).lineTo(x + 97.25, y +  233.25);
        ((GeneralPath) shape).lineTo(x + 99.25, y +  227.75);
        ((GeneralPath) shape).curveTo(x + 99.25, y +  227.75, x +  91.0, y +  228.75, x +  88.25, y +  220.25);
        ((GeneralPath) shape).curveTo(x + 85.5, y +  211.75, x +  93.5, y +  148.5, x +  93.5, y +  148.5);
        ((GeneralPath) shape).lineTo(x + 81.0, y +  145.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x562B73), shape);
        TreeNode backScarf = new TreeNode("backScarf", s2, 3);

        // shirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 96.5, y +  221.0);
        ((GeneralPath) shape).curveTo(x + 96.5, y +  221.0, x +  109.167, y +  220.999, x +  114.167, y +  219.333);
        ((GeneralPath) shape).curveTo(x + 119.167, y +  217.66699, x +  128.834, y +  214.333, x +  128.834, y +  214.333);
        ((GeneralPath) shape).lineTo(x + 112.167, y +  152.333);
        ((GeneralPath) shape).lineTo(x + 94.667, y +  150.16599);
        ((GeneralPath) shape).lineTo(x + 96.5, y +  221.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x91316E), shape);
        TreeNode shirt = new TreeNode("shirt", s2, 3);

        // rightArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 115.375, y +  153.125);
        ((GeneralPath) shape).curveTo(x + 121.0, y +  155.375, x +  121.25, y +  169.0, x +  123.0, y +  175.125);
        ((GeneralPath) shape).curveTo(x + 124.75, y +  181.25, x +  130.25, y +  202.875, x +  130.375, y +  206.875);
        ((GeneralPath) shape).curveTo(x + 130.5, y +  210.875, x +  123.0, y +  213.25, x +  123.0, y +  213.25);
        ((GeneralPath) shape).curveTo(x + 123.0, y +  213.25, x +  118.5, y +  182.875, x +  116.75, y +  178.0);
        ((GeneralPath) shape).curveTo(x + 115.0, y +  173.125, x +  112.375, y +  156.875, x +  112.375, y +  156.875);
        ((GeneralPath) shape).curveTo(x + 112.375, y +  156.875, x +  114.313, y +  154.188, x +  115.375, y +  153.125);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode rightArm = new TreeNode("rightArm", s2, 3);

        // rightCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 120.359, y +  205.916);
        ((GeneralPath) shape).lineTo(x + 122.744, y +  214.609);
        ((GeneralPath) shape).lineTo(x + 134.439, y +  211.92);
        ((GeneralPath) shape).lineTo(x + 132.451, y +  203.482);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x7F738B), shape);
        TreeNode rightCuff = new TreeNode("rightCuff", s2, 3);

        // vest
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 91.125, y +  147.375);
        ((GeneralPath) shape).curveTo(x + 91.125, y +  147.375, x +  103.625, y +  152.375, x +  107.0, y +  151.75);
        ((GeneralPath) shape).curveTo(x + 110.375, y +  151.125, x +  113.375, y +  149.75, x +  113.375, y +  149.75);
        ((GeneralPath) shape).curveTo(x + 113.375, y +  149.75, x +  117.75, y +  159.25, x +  118.125, y +  165.5);
        ((GeneralPath) shape).curveTo(x + 118.5, y +  171.75, x +  132.0, y +  213.75, x +  132.0, y +  213.75);
        ((GeneralPath) shape).lineTo(x + 122.0, y +  218.0);
        ((GeneralPath) shape).lineTo(x + 108.25, y +  155.625);
        ((GeneralPath) shape).lineTo(x + 104.875, y +  155.125);
        ((GeneralPath) shape).lineTo(x + 116.875, y +  218.0);
        ((GeneralPath) shape).curveTo(x + 116.875, y +  218.0, x +  108.375, y +  221.875, x +  101.375, y +  221.875);
        ((GeneralPath) shape).curveTo(x + 94.375, y +  221.875, x +  88.125, y +  222.25, x +  88.125, y +  222.25);
        ((GeneralPath) shape).curveTo(x + 88.125, y +  222.25, x +  85.458, y +  160.25, x +  84.833, y +  156.5);
        ((GeneralPath) shape).curveTo(x + 84.208, y +  152.75, x +  91.125, y +  147.375, x +  91.125, y +  147.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xE3D3B1), shape);
        TreeNode vest = new TreeNode("vest", s2, 3);

        // frontScarf
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 95.25, y +  138.0);
        ((GeneralPath) shape).lineTo(x + 87.0, y +  136.167);
        ((GeneralPath) shape).curveTo(x + 87.0, y +  136.167, x +  95.0, y +  140.667, x +  101.167, y +  142.83401);
        ((GeneralPath) shape).curveTo(x + 107.334, y +  145.00102, x +  115.001, y +  147.33401, x +  116.334, y +  146.83401);
        ((GeneralPath) shape).curveTo(x + 117.667, y +  146.33401, x +  101.876, y +  141.376, x +  101.876, y +  141.376);
        ((GeneralPath) shape).lineTo(x + 102.251, y +  138.501);
        ((GeneralPath) shape).curveTo(x + 102.251, y +  138.501, x +  122.668, y +  144.168, x +  122.168, y +  146.33401);
        ((GeneralPath) shape).curveTo(x + 121.668, y +  148.50003, x +  114.5, y +  153.5, x +  114.5, y +  153.5);
        ((GeneralPath) shape).curveTo(x + 114.5, y +  153.5, x +  117.167, y +  153.5, x +  117.0, y +  155.167);
        ((GeneralPath) shape).curveTo(x + 116.833, y +  156.83401, x +  111.0, y +  157.0, x +  107.833, y +  156.5);
        ((GeneralPath) shape).curveTo(x + 104.666, y +  156.0, x +  83.833, y +  149.33301, x +  83.833, y +  149.33301);
        ((GeneralPath) shape).curveTo(x + 83.833, y +  149.33301, x +  67.167, y +  164.0, x +  63.167, y +  173.0);
        ((GeneralPath) shape).curveTo(x + 59.167, y +  182.0, x +  56.334, y +  185.83301, x +  56.334, y +  188.0);
        ((GeneralPath) shape).curveTo(x + 56.334, y +  190.16699, x +  60.167, y +  196.33301, x +  63.834, y +  196.5);
        ((GeneralPath) shape).curveTo(x + 67.501, y +  196.66699, x +  79.834, y +  196.833, x +  79.834, y +  196.833);
        ((GeneralPath) shape).lineTo(x + 80.0, y +  202.0);
        ((GeneralPath) shape).lineTo(x + 65.333, y +  203.167);
        ((GeneralPath) shape).curveTo(x + 65.333, y +  203.167, x +  69.0, y +  206.5, x +  71.833, y +  211.0);
        ((GeneralPath) shape).curveTo(x + 74.666, y +  215.5, x +  77.166, y +  219.83301, x +  77.166, y +  219.83301);
        ((GeneralPath) shape).lineTo(x + 72.333, y +  227.167);
        ((GeneralPath) shape).lineTo(x + 62.0, y +  210.667);
        ((GeneralPath) shape).curveTo(x + 62.0, y +  210.667, x +  59.333, y +  223.666, x +  57.333, y +  227.83301);
        ((GeneralPath) shape).curveTo(x + 55.333, y +  232.00002, x +  52.666, y +  236.33301, x +  52.666, y +  236.33301);
        ((GeneralPath) shape).lineTo(x + 48.166, y +  232.50002);
        ((GeneralPath) shape).lineTo(x + 53.666, y +  216.66702);
        ((GeneralPath) shape).lineTo(x + 38.833, y +  230.66702);
        ((GeneralPath) shape).lineTo(x + 35.5, y +  227.33302);
        ((GeneralPath) shape).lineTo(x + 45.167, y +  218.16702);
        ((GeneralPath) shape).lineTo(x + 29.167, y +  221.16702);
        ((GeneralPath) shape).lineTo(x + 28.667, y +  216.00003);
        ((GeneralPath) shape).lineTo(x + 45.167, y +  211.66702);
        ((GeneralPath) shape).curveTo(x + 45.167, y +  211.66702, x +  32.0, y +  206.50003, x +  33.0, y +  197.00003);
        ((GeneralPath) shape).curveTo(x + 34.0, y +  187.50003, x +  46.167, y +  163.83304, x +  48.667, y +  161.16702);
        ((GeneralPath) shape).curveTo(x + 51.167, y +  158.501, x +  73.520996, y +  135.60103, x +  84.667, y +  134.50003);
        ((GeneralPath) shape).curveTo(x + 91.0, y +  133.875, x +  95.25, y +  138.0, x +  95.25, y +  138.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x8A3866), shape);
        TreeNode frontScarf = new TreeNode("frontScarf", s2, 3);

        // leftHand
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 85.225, y +  212.44);
        ((GeneralPath) shape).lineTo(x + 84.208, y +  224.732);
        ((GeneralPath) shape).curveTo(x + 84.208, y +  224.732, x +  88.646, y +  228.38899, x +  90.208, y +  228.045);
        ((GeneralPath) shape).curveTo(x + 91.266, y +  227.812, x +  91.631, y +  225.48, x +  92.14, y +  225.48);
        ((GeneralPath) shape).curveTo(x + 92.649, y +  225.48, x +  94.18, y +  225.926, x +  94.275, y +  225.374);
        ((GeneralPath) shape).curveTo(x + 94.885, y +  221.847, x +  92.75, y +  212.334, x +  92.75, y +  212.334);
        ((GeneralPath) shape).lineTo(x + 85.225, y +  212.44);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFBE1E2), shape);
        TreeNode leftHand = new TreeNode("leftHand", s2, 3);

        // leftArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 87.0, y +  155.862);
        ((GeneralPath) shape).curveTo(x + 84.5, y +  158.632, x +  84.5, y +  172.132, x +  84.375, y +  177.194);
        ((GeneralPath) shape).curveTo(x + 84.25, y +  182.256, x +  84.875, y +  213.021, x +  84.875, y +  213.021);
        ((GeneralPath) shape).lineTo(x + 92.875, y +  213.541);
        ((GeneralPath) shape).curveTo(x + 92.875, y +  213.541, x +  92.25, y +  175.377, x +  93.125, y +  169.925);
        ((GeneralPath) shape).curveTo(x + 94.0, y +  164.473, x +  95.833, y +  160.709, x +  95.833, y +  160.709);
        ((GeneralPath) shape).curveTo(x + 95.833, y +  160.709, x +  92.667, y +  152.574, x +  87.0, y +  155.862);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode leftArm = new TreeNode("leftArm", s2, 3);

        // ringNW
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 103.833, y +  192.542);
        ((GeneralPath) shape).curveTo(x + 101.5, y +  194.375, x +  101.5, y +  196.70901, x +  102.0, y +  198.542);
        ((GeneralPath) shape).curveTo(x + 102.5, y +  200.375, x +  105.270996, y +  202.10501, x +  107.667, y +  201.375);
        ((GeneralPath) shape).curveTo(x + 110.438, y +  200.532, x +  111.417, y +  197.271, x +  110.584, y +  195.104);
        ((GeneralPath) shape).curveTo(x + 109.751, y +  192.93701, x +  108.501, y +  191.541, x +  106.167, y +  191.70801);
        ((GeneralPath) shape).curveTo(x + 106.145996, y +  192.729, x +  106.520996, y +  193.416, x +  106.520996, y +  193.416);
        ((GeneralPath) shape).curveTo(x + 106.520996, y +  193.416, x +  108.071, y +  193.762, x +  108.834, y +  195.166);
        ((GeneralPath) shape).curveTo(x + 109.645996, y +  196.661, x +  109.614, y +  199.239, x +  107.584, y +  199.916);
        ((GeneralPath) shape).curveTo(x + 105.444, y +  200.629, x +  104.164, y +  199.593, x +  103.681, y +  198.173);
        ((GeneralPath) shape).curveTo(x + 103.195, y +  196.741, x +  103.517, y +  194.919, x +  104.584, y +  194.104);
        ((GeneralPath) shape).curveTo(x + 104.521, y +  193.542, x +  103.833, y +  192.542, x +  103.833, y +  192.542);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode ringNW = new TreeNode("ringNW", s2, 3);

        // ringSW
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 106.5, y +  206.375);
        ((GeneralPath) shape).curveTo(x + 104.167, y +  208.209, x +  104.167, y +  210.541, x +  104.667, y +  212.375);
        ((GeneralPath) shape).curveTo(x + 105.167, y +  214.209, x +  107.938, y +  215.938, x +  110.334, y +  215.209);
        ((GeneralPath) shape).curveTo(x + 113.104996, y +  214.365, x +  114.084, y +  211.104, x +  113.251, y +  208.938);
        ((GeneralPath) shape).curveTo(x + 112.418, y +  206.772, x +  111.168, y +  205.375, x +  108.834, y +  205.542);
        ((GeneralPath) shape).curveTo(x + 108.812996, y +  206.563, x +  109.187996, y +  207.251, x +  109.187996, y +  207.251);
        ((GeneralPath) shape).curveTo(x + 109.187996, y +  207.251, x +  110.738, y +  207.597, x +  111.501, y +  209.001);
        ((GeneralPath) shape).curveTo(x + 112.312996, y +  210.49501, x +  112.281, y +  213.074, x +  110.251, y +  213.751);
        ((GeneralPath) shape).curveTo(x + 108.111, y +  214.464, x +  106.831, y +  213.429, x +  106.348, y +  212.00801);
        ((GeneralPath) shape).curveTo(x + 105.862, y +  210.576, x +  106.184, y +  208.75401, x +  107.251, y +  207.93901);
        ((GeneralPath) shape).curveTo(x + 107.188, y +  207.375, x +  106.5, y +  206.375, x +  106.5, y +  206.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode ringSW = new TreeNode("ringSW", s2, 3);

        // ringNE
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 119.784, y +  188.541);
        ((GeneralPath) shape).curveTo(x + 117.876, y +  190.374, x +  117.876, y +  192.70801, x +  118.284996, y +  194.541);
        ((GeneralPath) shape).curveTo(x + 118.69399, y +  196.374, x +  120.959, y +  198.103, x +  122.918, y +  197.374);
        ((GeneralPath) shape).curveTo(x + 125.183, y +  196.53099, x +  125.983, y +  193.26999, x +  125.302, y +  191.103);
        ((GeneralPath) shape).curveTo(x + 124.621, y +  188.93599, x +  123.599, y +  187.54, x +  121.691, y +  187.707);
        ((GeneralPath) shape).curveTo(x + 121.674, y +  188.728, x +  121.981, y +  189.415, x +  121.981, y +  189.415);
        ((GeneralPath) shape).curveTo(x + 121.981, y +  189.415, x +  123.248, y +  189.76099, x +  123.872, y +  191.165);
        ((GeneralPath) shape).curveTo(x + 124.536, y +  192.65999, x +  124.51, y +  195.23799, x +  122.85, y +  195.915);
        ((GeneralPath) shape).curveTo(x + 121.1, y +  196.62799, x +  120.054, y +  195.592, x +  119.659, y +  194.172);
        ((GeneralPath) shape).curveTo(x + 119.26199, y +  192.73999, x +  119.524994, y +  190.918, x +  120.396996, y +  190.103);
        ((GeneralPath) shape).curveTo(x + 120.346, y +  189.541, x +  119.784, y +  188.541, x +  119.784, y +  188.541);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode ringNE = new TreeNode("ringNE", s2, 3);

        // ringSE
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 122.95, y +  201.541);
        ((GeneralPath) shape).curveTo(x + 121.042, y +  203.375, x +  121.042, y +  205.707, x +  121.451, y +  207.541);
        ((GeneralPath) shape).curveTo(x + 121.85999, y +  209.375, x +  124.125, y +  211.104, x +  126.084, y +  210.375);
        ((GeneralPath) shape).curveTo(x + 128.349, y +  209.531, x +  129.149, y +  206.27, x +  128.468, y +  204.104);
        ((GeneralPath) shape).curveTo(x + 127.787, y +  201.937, x +  126.765, y +  200.541, x +  124.857, y +  200.70801);
        ((GeneralPath) shape).curveTo(x + 124.840004, y +  201.729, x +  125.147, y +  202.416, x +  125.147, y +  202.416);
        ((GeneralPath) shape).curveTo(x + 125.147, y +  202.416, x +  126.414, y +  202.762, x +  127.038, y +  204.166);
        ((GeneralPath) shape).curveTo(x + 127.702, y +  205.66, x +  127.676, y +  208.239, x +  126.016, y +  208.916);
        ((GeneralPath) shape).curveTo(x + 124.266, y +  209.629, x +  123.22, y +  208.594, x +  122.825, y +  207.173);
        ((GeneralPath) shape).curveTo(x + 122.42799, y +  205.741, x +  122.690994, y +  203.919, x +  123.562996, y +  203.104);
        ((GeneralPath) shape).curveTo(x + 123.512, y +  202.541, x +  122.95, y +  201.541, x +  122.95, y +  201.541);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x555964), shape);
        TreeNode ringSE = new TreeNode("ringSE", s2, 3);

        // leftCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 82.833, y +  207.833);
        ((GeneralPath) shape).lineTo(x + 83.333, y +  216.833);
        ((GeneralPath) shape).lineTo(x + 95.333, y +  216.667);
        ((GeneralPath) shape).lineTo(x + 95.167, y +  208.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x7F738B), shape);
        TreeNode leftCuff = new TreeNode("leftCuff", s2, 3);

        root.addChild(torso);
        torso.addChild(backScarf);
        torso.addChild(shirt);
        torso.addChild(rightArm);
        torso.addChild(rightCuff);
        torso.addChild(vest);
        torso.addChild(frontScarf);
        torso.addChild(leftHand);
        torso.addChild(leftArm);
        torso.addChild(ringNW);
        torso.addChild(ringSW);
        torso.addChild(ringNE);
        torso.addChild(ringSE);
        torso.addChild(leftCuff);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 106.917, y +  139.833);
        ((GeneralPath) shape).curveTo(x + 106.917, y +  139.833, x +  113.834, y +  134.66599, x +  114.5, y +  132.25);
        ((GeneralPath) shape).curveTo(x + 115.166, y +  129.83401, x +  114.917, y +  126.833, x +  116.083, y +  123.5);
        ((GeneralPath) shape).curveTo(x + 117.249, y +  120.167, x +  116.916, y +  112.667, x +  110.166, y +  110.833);
        ((GeneralPath) shape).curveTo(x + 103.416, y +  108.999, x +  97.916, y +  112.749, x +  96.583, y +  116.166);
        ((GeneralPath) shape).curveTo(x + 95.25, y +  119.583, x +  95.083, y +  121.499, x +  95.083, y +  121.499);
        ((GeneralPath) shape).curveTo(x + 95.083, y +  121.499, x +  92.583, y +  121.332, x +  92.583, y +  124.832);
        ((GeneralPath) shape).curveTo(x + 92.583, y +  128.332, x +  95.75, y +  131.66501, x +  95.75, y +  131.66501);
        ((GeneralPath) shape).lineTo(x + 93.583, y +  139.082);
        ((GeneralPath) shape).lineTo(x + 102.083, y +  143.249);
        ((GeneralPath) shape).lineTo(x + 103.583, y +  137.582);
        ((GeneralPath) shape).lineTo(x + 106.917, y +  139.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFBE1E2), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // hair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 98.625, y +  107.875);
        ((GeneralPath) shape).lineTo(x + 97.875, y +  100.875);
        ((GeneralPath) shape).lineTo(x + 100.625, y +  104.375);
        ((GeneralPath) shape).curveTo(x + 100.625, y +  104.375, x +  101.75, y +  99.25, x +  105.375, y +  97.0);
        ((GeneralPath) shape).curveTo(x + 109.0, y +  94.75, x +  112.5, y +  92.375, x +  112.5, y +  92.375);
        ((GeneralPath) shape).lineTo(x + 108.0, y +  107.125);
        ((GeneralPath) shape).lineTo(x + 121.5, y +  102.75);
        ((GeneralPath) shape).lineTo(x + 114.375, y +  108.875);
        ((GeneralPath) shape).curveTo(x + 114.375, y +  108.875, x +  119.625, y +  110.375, x +  122.5, y +  112.375);
        ((GeneralPath) shape).curveTo(x + 125.375, y +  114.375, x +  129.125, y +  117.375, x +  129.125, y +  117.375);
        ((GeneralPath) shape).lineTo(x + 121.375, y +  117.5);
        ((GeneralPath) shape).lineTo(x + 125.875, y +  129.5);
        ((GeneralPath) shape).lineTo(x + 119.125, y +  124.0);
        ((GeneralPath) shape).lineTo(x + 119.563, y +  134.438);
        ((GeneralPath) shape).lineTo(x + 113.688, y +  119.5);
        ((GeneralPath) shape).lineTo(x + 111.25, y +  127.625);
        ((GeneralPath) shape).lineTo(x + 108.188, y +  116.0);
        ((GeneralPath) shape).lineTo(x + 105.75, y +  122.938);
        ((GeneralPath) shape).lineTo(x + 106.0, y +  113.813);
        ((GeneralPath) shape).lineTo(x + 100.812, y +  120.063);
        ((GeneralPath) shape).lineTo(x + 100.687, y +  130.126);
        ((GeneralPath) shape).curveTo(x + 100.687, y +  130.126, x +  97.312, y +  121.063, x +  95.37399, y +  121.313);
        ((GeneralPath) shape).curveTo(x + 93.43599, y +  121.563, x +  92.62399, y +  123.563, x +  92.62399, y +  125.438);
        ((GeneralPath) shape).curveTo(x + 92.62399, y +  127.313, x +  95.187, y +  130.501, x +  95.187, y +  130.501);
        ((GeneralPath) shape).lineTo(x + 93.12399, y +  138.626);
        ((GeneralPath) shape).lineTo(x + 89.93599, y +  129.626);
        ((GeneralPath) shape).lineTo(x + 86.93599, y +  133.31401);
        ((GeneralPath) shape).lineTo(x + 88.06099, y +  126.37601);
        ((GeneralPath) shape).lineTo(x + 81.747986, y +  128.376);
        ((GeneralPath) shape).lineTo(x + 88.622986, y +  117.87601);
        ((GeneralPath) shape).lineTo(x + 82.622986, y +  118.31401);
        ((GeneralPath) shape).curveTo(x + 82.622986, y +  118.31401, x +  87.747986, y +  112.75101, x +  89.997986, y +  111.62601);
        ((GeneralPath) shape).curveTo(x + 92.247986, y +  110.50101, x +  94.31099, y +  110.62601, x +  94.31099, y +  110.62601);
        ((GeneralPath) shape).lineTo(x + 88.43599, y +  106.12601);
        ((GeneralPath) shape).lineTo(x + 98.625, y +  107.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x42658D), shape);
        TreeNode hair = new TreeNode("hair", s2, 3);

        // leftEye
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 103.0, y +  126.0);
        ((GeneralPath) shape).curveTo(x + 103.0, y +  126.0, x +  103.167, y +  124.083, x +  104.75, y +  123.917);
        ((GeneralPath) shape).curveTo(x + 105.856, y +  123.8, x +  107.667, y +  125.167, x +  107.667, y +  125.167);
        ((GeneralPath) shape).lineTo(x + 106.167, y +  128.084);
        ((GeneralPath) shape).curveTo(x + 106.167, y +  128.083, x +  103.583, y +  128.0, x +  103.0, y +  126.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x42658D), shape);
        TreeNode leftEye = new TreeNode("leftEye", s2, 3);

        // rightEye
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 111.25, y +  127.625);
        ((GeneralPath) shape).curveTo(x + 111.25, y +  127.625, x +  111.833, y +  126.25, x +  113.083, y +  126.167);
        ((GeneralPath) shape).curveTo(x + 114.333, y +  126.084, x +  115.166, y +  127.0, x +  115.166, y +  127.0);
        ((GeneralPath) shape).lineTo(x + 113.833, y +  130.083);
        ((GeneralPath) shape).curveTo(x + 113.833, y +  130.083, x +  113.0, y +  130.41599, x +  112.083, y +  129.66599);
        ((GeneralPath) shape).curveTo(x + 111.329, y +  129.049, x +  110.917, y +  128.333, x +  111.25, y +  127.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x42658D), shape);
        TreeNode rightEye = new TreeNode("rightEye", s2, 3);

        // mouth
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(x + 104.375, y +  135.625);
        ((GeneralPath) shape).curveTo(x + 104.375, y +  135.625, x +  104.469, y +  135.607, x +  104.628, y +  135.581);
        ((GeneralPath) shape).curveTo(x + 105.407, y +  135.45299, x +  107.752, y +  135.12799, x +  108.375, y +  135.75);
        s2 = new Shape2d.Path(x, y, new Color(0x42658D), shape);
        TreeNode mouth = new TreeNode("mouth", s2, 3);

        root.addChild(head);
        head.addChild(face);
        head.addChild(hair);
        head.addChild(leftEye);
        head.addChild(rightEye);
        head.addChild(mouth);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Ash(int width, int height) {
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

