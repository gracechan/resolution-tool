

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
public class Squire extends Shape2d implements javax.swing.Icon {

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
    public Squire() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 20;
        int y = 35;
        
        root = new TreeNode("SQUIRE", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);
        
     // rightLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-206.25, 24.25);
        ((GeneralPath) shape).curveTo(-196.75, 22.75, -190.5, 26.25, -189.0, 30.75);
        ((GeneralPath) shape).curveTo(-187.5, 35.25, -179.0, 68.5, -179.25, 73.25);
        ((GeneralPath) shape).curveTo(-179.5, 78.0, -178.25, 90.0, -174.5, 96.75);
        ((GeneralPath) shape).curveTo(-170.75, 103.5, -169.75, 114.0, -169.5, 120.5);
        ((GeneralPath) shape).curveTo(-169.25, 127.0, -179.0, 133.0, -182.75, 130.25);
        ((GeneralPath) shape).curveTo(-186.5, 127.5, -190.25, 102.0, -192.25, 97.5);
        ((GeneralPath) shape).curveTo(-194.25, 93.0, -207.0, 61.0, -209.5, 54.25);
        ((GeneralPath) shape).curveTo(-212.0, 47.5, -213.0, 42.5, -215.75, 40.75);
        ((GeneralPath) shape).curveTo(-218.5, 39.0, -227.75, 37.0, -223.75, 33.0);
        ((GeneralPath) shape).curveTo(-219.75, 29.0, -206.25, 24.25, -206.25, 24.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x4B0F0F), shape);
        TreeNode rightLeg = new TreeNode("rightLeg", s2, 3);

        // leftLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-222.75, 41.0);
        ((GeneralPath) shape).curveTo(-218.929, 37.854, -216.75, 41.75, -212.5, 38.5);
        ((GeneralPath) shape).curveTo(-208.25, 35.25, -229.5, 5.25, -242.25, 24.5);
        ((GeneralPath) shape).curveTo(-255.0, 43.75, -253.75, 72.5, -252.75, 79.5);
        ((GeneralPath) shape).curveTo(-251.75, 86.5, -251.5, 90.25, -253.5, 95.75);
        ((GeneralPath) shape).curveTo(-255.5, 101.25, -255.5, 124.75, -247.0, 134.25);
        ((GeneralPath) shape).curveTo(-238.5, 143.75, -233.5, 116.0, -233.25, 106.25);
        ((GeneralPath) shape).curveTo(-233.0, 96.5, -231.25, 94.25, -230.75, 86.25);
        ((GeneralPath) shape).curveTo(-230.25, 78.25, -227.0, 44.5, -222.75, 41.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x4B0F0F), shape);
        TreeNode leftLeg = new TreeNode("leftLeg", s2, 3);

        // rightKneeGuard
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-201.75, 80.5);
        ((GeneralPath) shape).curveTo(-201.75, 80.5, -199.5, 81.5, -195.5, 82.0);
        ((GeneralPath) shape).curveTo(-191.5, 82.5, -187.5, 82.25, -187.5, 82.25);
        ((GeneralPath) shape).curveTo(-187.5, 82.25, -185.25, 81.5, -181.25, 80.25);
        ((GeneralPath) shape).curveTo(-177.25, 79.0, -174.75, 78.0, -174.75, 78.0);
        ((GeneralPath) shape).curveTo(-174.75, 78.0, -173.5, 92.75, -174.75, 95.75);
        ((GeneralPath) shape).curveTo(-176.0, 98.75, -176.25, 100.5, -173.0, 104.5);
        ((GeneralPath) shape).curveTo(-169.75, 108.5, -168.75, 122.5, -178.0, 124.0);
        ((GeneralPath) shape).curveTo(-187.25, 125.5, -192.5, 115.5, -192.75, 112.25);
        ((GeneralPath) shape).curveTo(-193.0, 109.0, -192.25, 104.25, -193.25, 101.5);
        ((GeneralPath) shape).curveTo(-194.25, 98.75, -198.0, 94.0, -199.25, 90.5);
        ((GeneralPath) shape).curveTo(-200.5, 87.0, -201.75, 80.5, -201.75, 80.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFEFEFD), shape);
        TreeNode rightKneeGuard = new TreeNode("rightKneeGuard", s2, 3);

        // leftKneeGuard
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-255.5, 83.75);
        ((GeneralPath) shape).curveTo(-255.5, 83.75, -253.25, 85.0, -248.25, 86.0);
        ((GeneralPath) shape).curveTo(-243.25, 87.0, -240.0, 88.0, -240.0, 88.0);
        ((GeneralPath) shape).curveTo(-240.0, 88.0, -236.75, 87.25, -233.0, 85.25);
        ((GeneralPath) shape).curveTo(-229.25, 83.25, -228.0, 82.5, -228.0, 82.5);
        ((GeneralPath) shape).curveTo(-228.0, 82.5, -228.25, 94.5, -230.0, 99.0);
        ((GeneralPath) shape).curveTo(-231.75, 103.5, -232.25, 108.75, -231.5, 116.0);
        ((GeneralPath) shape).curveTo(-230.75, 123.25, -238.75, 133.75, -241.25, 135.5);
        ((GeneralPath) shape).curveTo(-243.75, 137.25, -248.75, 125.25, -249.25, 120.5);
        ((GeneralPath) shape).curveTo(-249.75, 115.75, -249.0, 105.0, -249.0, 105.0);
        ((GeneralPath) shape).curveTo(-249.0, 105.0, -253.25, 101.0, -254.0, 97.0);
        ((GeneralPath) shape).curveTo(-254.75, 93.0, -255.5, 83.75, -255.5, 83.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFEFEFD), shape);
        TreeNode leftKneeGuard = new TreeNode("leftKneeGuard", s2, 3);

        // rightBoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-186.5, 126.75);
        ((GeneralPath) shape).curveTo(-186.5, 126.75, -182.25, 136.0, -182.5, 141.0);
        ((GeneralPath) shape).curveTo(-182.75, 146.0, -182.5, 147.75, -180.0, 152.5);
        ((GeneralPath) shape).curveTo(-177.5, 157.25, -179.75, 178.5, -179.0, 183.25);
        ((GeneralPath) shape).curveTo(-178.25, 188.0, -172.0, 190.25, -165.75, 189.0);
        ((GeneralPath) shape).curveTo(-159.5, 187.75, -156.0, 187.75, -155.25, 184.0);
        ((GeneralPath) shape).curveTo(-154.5, 180.25, -160.25, 172.5, -162.75, 166.5);
        ((GeneralPath) shape).curveTo(-165.25, 160.5, -163.75, 157.0, -165.25, 152.5);
        ((GeneralPath) shape).curveTo(-166.75, 148.0, -167.5, 139.0, -165.25, 132.5);
        ((GeneralPath) shape).curveTo(-163.0, 126.0, -186.5, 126.75, -186.5, 126.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x7A2B08), shape);
        TreeNode rightBoot = new TreeNode("rightBoot", s2, 3);

        // leftBoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-253.75, 139.5);
        ((GeneralPath) shape).curveTo(-253.75, 139.5, -246.5, 151.25, -246.25, 156.0);
        ((GeneralPath) shape).curveTo(-246.0, 160.75, -245.25, 163.75, -244.0, 168.0);
        ((GeneralPath) shape).curveTo(-242.75, 172.25, -244.25, 177.25, -244.25, 177.25);
        ((GeneralPath) shape).curveTo(-244.25, 177.25, -250.25, 188.75, -250.0, 193.0);
        ((GeneralPath) shape).curveTo(-249.75, 197.25, -244.5, 202.5, -235.25, 201.5);
        ((GeneralPath) shape).curveTo(-226.0, 200.5, -224.75, 195.5, -227.0, 187.75);
        ((GeneralPath) shape).curveTo(-229.25, 180.0, -225.75, 179.5, -229.75, 170.0);
        ((GeneralPath) shape).curveTo(-233.75, 160.5, -228.5, 161.25, -230.25, 153.75);
        ((GeneralPath) shape).curveTo(-232.0, 146.25, -230.0, 141.5, -228.25, 138.75);
        ((GeneralPath) shape).curveTo(-226.5, 136.0, -253.75, 139.5, -253.75, 139.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x7A2B08), shape);
        TreeNode leftBoot = new TreeNode("leftBoot", s2, 3);

        // ShoelaceTopRight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-173.25, 140.333);
        ((GeneralPath) shape).curveTo(-173.25, 140.333, -169.833, 135.41699, -168.66699, 136.16699);
        ((GeneralPath) shape).curveTo(-167.50099, 136.91699, -171.74998, 141.083, -171.74998, 141.083);
        ((GeneralPath) shape).curveTo(-171.74998, 141.083, -167.16699, 143.00099, -167.99998, 144.16699);
        ((GeneralPath) shape).curveTo(-168.83298, 145.333, -173.49998, 142.16699, -173.49998, 142.16699);
        ((GeneralPath) shape).curveTo(-173.49998, 142.16699, -177.16699, 146.583, -177.99998, 145.333);
        ((GeneralPath) shape).curveTo(-178.83298, 144.083, -174.91699, 141.5, -174.91699, 141.5);
        ((GeneralPath) shape).curveTo(-174.91699, 141.5, -180.0, 138.001, -178.66699, 136.91699);
        ((GeneralPath) shape).curveTo(-177.33398, 135.83298, -173.25, 140.333, -173.25, 140.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFCCE6C), shape);
        TreeNode ShoelaceTopRight = new TreeNode("ShoelaceTopRight", s2, 3);

        // ShoelaceBottomRight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-172.25, 147.999);
        ((GeneralPath) shape).curveTo(-172.25, 147.999, -168.833, 143.083, -167.66699, 143.833);
        ((GeneralPath) shape).curveTo(-166.50099, 144.583, -170.74998, 148.749, -170.74998, 148.749);
        ((GeneralPath) shape).curveTo(-170.74998, 148.749, -166.16699, 150.66699, -166.99998, 151.833);
        ((GeneralPath) shape).curveTo(-167.83298, 152.999, -172.49998, 149.833, -172.49998, 149.833);
        ((GeneralPath) shape).curveTo(-172.49998, 149.833, -176.16699, 154.249, -176.99998, 152.999);
        ((GeneralPath) shape).curveTo(-177.83298, 151.749, -173.91699, 149.166, -173.91699, 149.166);
        ((GeneralPath) shape).curveTo(-173.91699, 149.166, -179.0, 145.667, -177.66699, 144.58301);
        ((GeneralPath) shape).curveTo(-176.33398, 143.49901, -172.25, 147.999, -172.25, 147.999);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFCCE6C), shape);
        TreeNode ShoelaceBottomRight = new TreeNode("ShoelaceBottomRight", s2, 3);

        // ShoelaceTopLeft
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-238.333, 148.999);
        ((GeneralPath) shape).curveTo(-238.333, 148.999, -234.91599, 144.083, -233.75, 144.833);
        ((GeneralPath) shape).curveTo(-232.58401, 145.583, -236.833, 149.749, -236.833, 149.749);
        ((GeneralPath) shape).curveTo(-236.833, 149.749, -232.25, 151.66699, -233.083, 152.833);
        ((GeneralPath) shape).curveTo(-233.91599, 153.999, -238.583, 150.833, -238.583, 150.833);
        ((GeneralPath) shape).curveTo(-238.583, 150.833, -242.25, 155.249, -243.083, 153.999);
        ((GeneralPath) shape).curveTo(-243.91599, 152.749, -240.0, 150.166, -240.0, 150.166);
        ((GeneralPath) shape).curveTo(-240.0, 150.166, -245.08301, 146.667, -243.75, 145.58301);
        ((GeneralPath) shape).curveTo(-242.41699, 144.49901, -238.333, 148.999, -238.333, 148.999);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFCCE6C), shape);
        TreeNode ShoelaceTopLeft = new TreeNode("ShoelaceTopLeft", s2, 3);

        // ShoelaceBottomLeft
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-237.583, 156.25);
        ((GeneralPath) shape).curveTo(-237.583, 156.25, -234.16599, 151.334, -233.0, 152.084);
        ((GeneralPath) shape).curveTo(-231.83401, 152.834, -236.083, 157.0, -236.083, 157.0);
        ((GeneralPath) shape).curveTo(-236.083, 157.0, -231.5, 158.918, -232.333, 160.084);
        ((GeneralPath) shape).curveTo(-233.16599, 161.25, -237.833, 158.084, -237.833, 158.084);
        ((GeneralPath) shape).curveTo(-237.833, 158.084, -241.5, 162.5, -242.333, 161.25);
        ((GeneralPath) shape).curveTo(-243.16599, 160.0, -239.25, 157.417, -239.25, 157.417);
        ((GeneralPath) shape).curveTo(-239.25, 157.417, -244.33301, 153.91801, -243.0, 152.83401);
        ((GeneralPath) shape).curveTo(-241.66699, 151.75002, -237.583, 156.25, -237.583, 156.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFCCE6C), shape);
        TreeNode ShoelaceBottomLeft = new TreeNode("ShoelaceBottomLeft", s2, 3);

        // leftBootFold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-254.75, 105.5);
        ((GeneralPath) shape).curveTo(-254.75, 105.5, -260.0, 106.75, -259.75, 109.5);
        ((GeneralPath) shape).curveTo(-259.5, 112.25, -261.0, 128.0, -261.5, 130.75);
        ((GeneralPath) shape).curveTo(-262.0, 133.5, -263.75, 137.0, -263.5, 138.0);
        ((GeneralPath) shape).curveTo(-263.25, 139.0, -256.5, 146.5, -240.0, 144.75);
        ((GeneralPath) shape).curveTo(-223.5, 143.0, -219.5, 134.5, -219.25, 133.75);
        ((GeneralPath) shape).curveTo(-219.0, 133.0, -223.5, 122.0, -224.25, 117.25);
        ((GeneralPath) shape).curveTo(-225.0, 112.5, -224.25, 105.5, -227.5, 104.25);
        ((GeneralPath) shape).curveTo(-230.75, 103.0, -231.5, 104.5, -231.5, 104.5);
        ((GeneralPath) shape).lineTo(-231.875, 106.125);
        ((GeneralPath) shape).curveTo(-231.875, 106.125, -228.75, 105.875, -228.5, 107.625);
        ((GeneralPath) shape).curveTo(-228.25, 109.375, -232.0, 112.0, -241.875, 112.25);
        ((GeneralPath) shape).curveTo(-251.75, 112.5, -256.25, 111.5, -256.5, 109.875);
        ((GeneralPath) shape).curveTo(-256.75, 108.25, -254.75, 108.0, -254.75, 108.0);
        ((GeneralPath) shape).lineTo(-254.75, 105.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xDD9253), shape);
        TreeNode leftBootFold = new TreeNode("leftBootFold", s2, 3);

        // rightBootFold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-194.75, 98.375);
        ((GeneralPath) shape).curveTo(-194.75, 98.375, -199.75, 101.375, -199.375, 105.25);
        ((GeneralPath) shape).curveTo(-199.0, 109.125, -197.375, 109.625, -197.375, 116.375);
        ((GeneralPath) shape).curveTo(-197.375, 123.125, -199.0, 132.25, -199.0, 132.25);
        ((GeneralPath) shape).curveTo(-199.0, 132.25, -189.75, 141.5, -175.125, 138.125);
        ((GeneralPath) shape).curveTo(-160.5, 134.75, -156.125, 125.5, -156.125, 122.5);
        ((GeneralPath) shape).curveTo(-156.125, 119.5, -163.25, 112.875, -163.875, 106.0);
        ((GeneralPath) shape).curveTo(-164.5, 99.125, -167.625, 97.25, -169.625, 96.5);
        ((GeneralPath) shape).curveTo(-171.625, 95.75, -174.25, 95.375, -174.25, 95.375);
        ((GeneralPath) shape).lineTo(-173.25, 98.75);
        ((GeneralPath) shape).curveTo(-173.25, 98.75, -168.5, 99.375, -168.0, 102.25);
        ((GeneralPath) shape).curveTo(-167.5, 105.125, -171.25, 107.375, -180.625, 108.5);
        ((GeneralPath) shape).curveTo(-190.0, 109.625, -195.375, 106.875, -195.75, 104.875);
        ((GeneralPath) shape).curveTo(-196.125, 102.875, -193.25, 101.5, -193.25, 101.5);
        ((GeneralPath) shape).lineTo(-194.75, 98.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xDD9253), shape);
        TreeNode rightBootFold = new TreeNode("rightBootFold", s2, 3);

        root.addChild(bottom);
        bottom.addChild(rightLeg);
        bottom.addChild(leftLeg);
        bottom.addChild(rightKneeGuard);
        bottom.addChild(leftKneeGuard);
        bottom.addChild(rightBoot);
        bottom.addChild(leftBoot);
        bottom.addChild(ShoelaceTopRight);
        bottom.addChild(ShoelaceBottomRight);
        bottom.addChild(ShoelaceTopLeft);
        bottom.addChild(ShoelaceBottomLeft);
        bottom.addChild(leftBootFold);
        bottom.addChild(rightBootFold);

        // hiltYellow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-220.0, 61.0);
        ((GeneralPath) shape).lineTo(-276.333, 73.333);
        ((GeneralPath) shape).curveTo(-276.333, 73.333, -288.16602, 75.167, -287.333, 78.0);
        ((GeneralPath) shape).curveTo(-286.5, 80.833, -275.66602, 78.333, -275.66602, 78.333);
        ((GeneralPath) shape).lineTo(-218.66602, 68.5);
        ((GeneralPath) shape).lineTo(-220.0, 61.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEF7F01), shape);
        TreeNode hiltYellow = new TreeNode("hiltYellow", s2, 3);

        // rightSleeve
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-196.833, -39.667);
        ((GeneralPath) shape).curveTo(-196.833, -39.667, -190.16599, -49.5, -184.333, -45.667);
        ((GeneralPath) shape).curveTo(-178.5, -41.834, -179.16599, -29.334, -180.66599, -21.667);
        ((GeneralPath) shape).curveTo(-182.16599, -14.0, -185.5, -10.833, -182.0, -5.5);
        ((GeneralPath) shape).curveTo(-178.5, -0.16699982, -176.83301, 15.499001, -177.16699, 24.333);
        ((GeneralPath) shape).curveTo(-177.50098, 33.167, -197.33398, 28.167, -197.33398, 28.167);
        ((GeneralPath) shape).lineTo(-210.83398, -10.166);
        ((GeneralPath) shape).lineTo(-196.833, -39.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xB14D1B), shape);
        TreeNode rightSleeve = new TreeNode("rightSleeve", s2, 3);

        // rightSleeveBottom
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-191.5, 21.667);
        ((GeneralPath) shape).curveTo(-191.5, 21.667, -186.83301, 22.0, -183.16699, 22.5);
        ((GeneralPath) shape).curveTo(-179.50098, 23.0, -177.16699, 23.334, -177.16699, 23.334);
        ((GeneralPath) shape).curveTo(-177.16699, 23.334, -176.16699, 39.667, -175.66699, 44.333);
        ((GeneralPath) shape).curveTo(-175.16699, 48.999, -173.334, 55.333, -173.334, 55.333);
        ((GeneralPath) shape).lineTo(-182.167, 56.0);
        ((GeneralPath) shape).curveTo(-182.167, 56.0, -184.86101, 43.205, -186.0, 39.0);
        ((GeneralPath) shape).curveTo(-187.188, 34.611, -191.5, 21.667, -191.5, 21.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xA06E60), shape);
        TreeNode rightSleeveBottom = new TreeNode("rightSleeveBottom", s2, 3);

        // rightSleeveGold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-194.125, 18.25);
        ((GeneralPath) shape).curveTo(-194.125, 18.25, -193.25, 20.5, -187.0, 20.75);
        ((GeneralPath) shape).curveTo(-180.75, 21.0, -177.25, 22.375, -177.25, 22.375);
        ((GeneralPath) shape).lineTo(-177.0, 28.875);
        ((GeneralPath) shape).curveTo(-177.0, 28.875, -178.75, 25.625, -180.75, 24.875);
        ((GeneralPath) shape).curveTo(-182.75, 24.125, -189.5, 23.5, -192.5, 22.125);
        ((GeneralPath) shape).curveTo(-195.5, 20.75, -194.125, 18.25, -194.125, 18.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF9BF4D), shape);
        TreeNode rightSleeveGold = new TreeNode("rightSleeveGold", s2, 3);

        // shirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-227.0, -56.833);
        ((GeneralPath) shape).curveTo(-227.0, -56.833, -227.5, -52.833, -230.167, -51.833);
        ((GeneralPath) shape).curveTo(-232.83401, -50.833, -241.33401, -50.166, -243.0, -47.333);
        ((GeneralPath) shape).curveTo(-244.66599, -44.5, -244.5, 37.167, -244.5, 37.167);
        ((GeneralPath) shape).curveTo(-244.5, 37.167, -234.5, 33.167, -223.0, 35.0);
        ((GeneralPath) shape).curveTo(-211.5, 36.833, -200.66699, 40.001, -194.66699, 38.167);
        ((GeneralPath) shape).curveTo(-188.66699, 36.333, -189.33398, 35.833, -187.66699, 33.5);
        ((GeneralPath) shape).curveTo(-186.0, 31.167, -186.49998, 29.333, -186.49998, 29.333);
        ((GeneralPath) shape).curveTo(-186.49998, 29.333, -190.83298, 25.5, -192.33298, 16.5);
        ((GeneralPath) shape).curveTo(-193.83298, 7.5, -193.66597, 6.0, -196.33298, 2.0);
        ((GeneralPath) shape).curveTo(-198.99998, -2.0, -202.83298, -4.167, -202.99997, -6.833);
        ((GeneralPath) shape).curveTo(-203.16696, -9.499001, -201.33296, -19.833, -199.33296, -24.166);
        ((GeneralPath) shape).curveTo(-197.33296, -28.499, -195.16696, -42.166, -196.49997, -47.666);
        ((GeneralPath) shape).curveTo(-197.83298, -53.166, -206.66696, -55.166, -206.66696, -55.166);
        ((GeneralPath) shape).lineTo(-227.0, -56.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x963E17), shape);
        TreeNode shirt = new TreeNode("shirt", s2, 3);

        // beltGreen
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-200.726, -4.399);
        ((GeneralPath) shape).curveTo(-200.726, -4.399, -198.028, -1.7370002, -201.707, 2.199);
        ((GeneralPath) shape).curveTo(-205.386, 6.135, -216.667, 15.049, -216.667, 15.049);
        ((GeneralPath) shape).lineTo(-209.8, 22.805);
        ((GeneralPath) shape).curveTo(-209.8, 22.805, -198.641, 15.282001, -196.311, 11.346001);
        ((GeneralPath) shape).curveTo(-193.981, 7.410001, -193.614, 6.1370006, -193.614, 6.1370006);
        ((GeneralPath) shape).curveTo(-193.614, 6.1370006, -193.859, 3.7060006, -195.698, 1.3910007);
        ((GeneralPath) shape).curveTo(-197.538, -0.927, -200.726, -4.399, -200.726, -4.399);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x314E0C), shape);
        TreeNode beltGreen = new TreeNode("beltGreen", s2, 3);

        // leftGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-246.833, 62.0);
        ((GeneralPath) shape).curveTo(-246.833, 62.0, -245.833, 70.001, -243.66599, 72.167);
        ((GeneralPath) shape).curveTo(-241.49898, 74.333, -239.99898, 75.666, -238.499, 75.833);
        ((GeneralPath) shape).curveTo(-236.99901, 76.0, -236.499, 75.167, -236.499, 75.167);
        ((GeneralPath) shape).curveTo(-236.499, 75.167, -234.499, 76.833, -233.33199, 76.5);
        ((GeneralPath) shape).curveTo(-232.16498, 76.167, -231.16498, 75.667, -231.16498, 75.667);
        ((GeneralPath) shape).curveTo(-231.16498, 75.667, -229.83199, 76.334, -227.99797, 76.167);
        ((GeneralPath) shape).curveTo(-226.16396, 76.0, -225.99797, 74.167, -225.99797, 74.167);
        ((GeneralPath) shape).curveTo(-225.99797, 74.167, -224.49797, 75.001, -223.16498, 73.667);
        ((GeneralPath) shape).curveTo(-221.83199, 72.333, -221.99797, 68.166, -223.49797, 65.333);
        ((GeneralPath) shape).curveTo(-224.99797, 62.5, -228.49797, 57.667, -228.49797, 57.667);
        ((GeneralPath) shape).lineTo(-246.833, 62.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD97228), shape);
        TreeNode leftGlove = new TreeNode("leftGlove", s2, 3);

        // rightShoulderPad
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-203.25, -53.75);
        ((GeneralPath) shape).curveTo(-203.25, -53.75, -192.875, -60.25, -185.0, -55.625);
        ((GeneralPath) shape).curveTo(-177.125, -51.0, -175.0, -41.375, -175.0, -41.375);
        ((GeneralPath) shape).curveTo(-175.0, -41.375, -180.875, -34.25, -183.75, -32.625);
        ((GeneralPath) shape).curveTo(-186.625, -31.0, -193.25, -29.625, -195.125, -31.625);
        ((GeneralPath) shape).curveTo(-197.0, -33.625, -194.625, -43.0, -197.75, -47.875);
        ((GeneralPath) shape).curveTo(-200.875, -52.75, -203.25, -53.75, -203.25, -53.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF4EBE4), shape);
        TreeNode rightShoulderPad = new TreeNode("rightShoulderPad", s2, 3);

        // chestTopPlate
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-225.875, -51.375);
        ((GeneralPath) shape).curveTo(-225.875, -51.375, -226.125, -50.125, -226.75, -46.875);
        ((GeneralPath) shape).curveTo(-227.375, -43.625, -228.375, -42.125, -228.375, -42.125);
        ((GeneralPath) shape).curveTo(-228.375, -42.125, -219.125, -38.125, -213.0, -39.25);
        ((GeneralPath) shape).curveTo(-206.875, -40.375, -201.5, -45.25, -201.5, -45.25);
        ((GeneralPath) shape).curveTo(-201.5, -45.25, -203.5, -49.125, -203.75, -50.0);
        ((GeneralPath) shape).curveTo(-204.0, -50.875, -204.625, -52.625, -204.625, -52.625);
        ((GeneralPath) shape).curveTo(-204.625, -52.625, -209.0, -49.625, -215.125, -49.75);
        ((GeneralPath) shape).curveTo(-221.25, -49.875, -225.875, -51.375, -225.875, -51.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFFFFFF), shape);
        TreeNode chestTopPlate = new TreeNode("chestTopPlate", s2, 3);

        // chestPlate
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-225.125, -40.625);
        ((GeneralPath) shape).curveTo(-225.125, -40.625, -218.625, -39.125, -212.75, -40.0);
        ((GeneralPath) shape).curveTo(-206.875, -40.875, -203.125, -43.375, -203.125, -43.375);
        ((GeneralPath) shape).curveTo(-203.125, -43.375, -197.25, -35.375, -197.125, -31.875);
        ((GeneralPath) shape).curveTo(-197.0, -28.375, -196.5, -25.125, -201.0, -16.875);
        ((GeneralPath) shape).curveTo(-205.5, -8.625, -210.625, -6.375, -210.625, -6.375);
        ((GeneralPath) shape).curveTo(-210.625, -6.375, -219.125, -8.875, -224.75, -13.125);
        ((GeneralPath) shape).curveTo(-230.375, -17.375, -234.125, -23.375, -234.125, -23.375);
        ((GeneralPath) shape).curveTo(-234.125, -23.375, -229.125, -24.375, -227.0, -31.25);
        ((GeneralPath) shape).curveTo(-224.875, -38.125, -225.125, -40.625, -225.125, -40.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF4EBE4), shape);
        TreeNode chestPlate = new TreeNode("chestPlate", s2, 3);

        // chestCentreJewel
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-210.875, -36.875);
        ((GeneralPath) shape).lineTo(-213.625, -32.5);
        ((GeneralPath) shape).lineTo(-209.5, -28.0);
        ((GeneralPath) shape).lineTo(-206.875, -33.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFD0001), shape);
        TreeNode chestCentreJewel = new TreeNode("chestCentreJewel", s2, 3);

        // chestLeftJewel
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-220.875, -36.875);
        ((GeneralPath) shape).lineTo(-215.75, -32.0);
        ((GeneralPath) shape).lineTo(-219.125, -27.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x7DB9E0), shape);
        TreeNode chestLeftJewel = new TreeNode("chestLeftJewel", s2, 3);

        // beltGold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-201.217, -4.052);
        ((GeneralPath) shape).curveTo(-201.455, -4.4570003, -200.849, -5.094, -199.98999, -4.399);
        ((GeneralPath) shape).curveTo(-199.13199, -3.7050002, -197.538, -0.46300006, -201.217, 3.3569999);
        ((GeneralPath) shape).curveTo(-204.896, 7.177, -213.847, 13.892, -213.847, 13.892);
        ((GeneralPath) shape).lineTo(-208.574, 21.648);
        ((GeneralPath) shape).curveTo(-208.574, 21.648, -198.641, 14.239, -196.311, 10.187);
        ((GeneralPath) shape).curveTo(-193.981, 6.135, -193.85901, 5.557, -193.85901, 5.557);
        ((GeneralPath) shape).curveTo(-193.85901, 5.557, -192.755, 5.788, -193.12302, 7.525);
        ((GeneralPath) shape).curveTo(-193.49101, 9.262, -195.20702, 11.924, -199.49902, 15.976999);
        ((GeneralPath) shape).curveTo(-203.79102, 20.028, -208.20502, 22.921, -208.20502, 22.921);
        ((GeneralPath) shape).curveTo(-208.20502, 22.921, -207.10101, 23.848, -208.81802, 24.890999);
        ((GeneralPath) shape).curveTo(-210.53502, 25.932, -212.12903, 23.732998, -212.12903, 23.732998);
        ((GeneralPath) shape).lineTo(-215.19403, 25.467999);
        ((GeneralPath) shape).curveTo(-215.19403, 25.467999, -213.60004, 27.668, -215.19403, 28.130999);
        ((GeneralPath) shape).curveTo(-216.78802, 28.593998, -218.50504, 25.005, -218.50504, 25.005);
        ((GeneralPath) shape).lineTo(-220.83504, 25.236);
        ((GeneralPath) shape).curveTo(-220.83504, 25.236, -218.38203, 28.361, -221.32603, 29.519001);
        ((GeneralPath) shape).curveTo(-224.26903, 30.676, -225.61804, 27.204, -225.61804, 27.204);
        ((GeneralPath) shape).lineTo(-229.91003, 28.710001);
        ((GeneralPath) shape).lineTo(-231.74904, 23.963001);
        ((GeneralPath) shape).lineTo(-228.19304, 23.385002);
        ((GeneralPath) shape).curveTo(-228.19304, 23.385002, -230.15504, 19.102001, -227.58003, 18.406002);
        ((GeneralPath) shape).curveTo(-225.00504, 17.712002, -223.16603, 21.532001, -223.16603, 21.532001);
        ((GeneralPath) shape).lineTo(-220.83603, 20.838001);
        ((GeneralPath) shape).curveTo(-220.83603, 20.838001, -223.77902, 16.786001, -222.43002, 16.323002);
        ((GeneralPath) shape).curveTo(-221.08102, 15.859002, -218.87402, 18.870003, -218.87402, 18.870003);
        ((GeneralPath) shape).lineTo(-215.80902, 16.323002);
        ((GeneralPath) shape).curveTo(-215.80902, 16.323002, -218.62903, 13.313002, -217.03502, 12.734002);
        ((GeneralPath) shape).curveTo(-215.44102, 12.155003, -215.07301, 12.734002, -215.07301, 12.734002);
        ((GeneralPath) shape).curveTo(-215.07301, 12.734002, -208.81902, 8.219002, -205.14001, 4.630002);
        ((GeneralPath) shape).curveTo(-201.462, 1.041, -199.377, -0.927, -201.217, -4.052);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFBA428), shape);
        TreeNode beltGold = new TreeNode("beltGold", s2, 3);

        // chestRightJewel
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-205.125, -34.375);
        ((GeneralPath) shape).lineTo(-202.625, -31.375);
        ((GeneralPath) shape).lineTo(-202.25, -38.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x7DB9E0), shape);
        TreeNode chestRightJewel = new TreeNode("chestRightJewel", s2, 3);

        // shirtFleur
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-237.5, -0.667);
        ((GeneralPath) shape).curveTo(-240.667, -3.334, -235.333, -21.334, -235.333, -21.334);
        ((GeneralPath) shape).curveTo(-235.333, -21.334, -229.16699, -18.334, -228.5, -10.167);
        ((GeneralPath) shape).curveTo(-227.83301, -2.0, -232.83301, -5.667, -234.0, 2.1660004);
        ((GeneralPath) shape).curveTo(-235.16699, 9.999001, -234.167, 7.6660004, -234.167, 7.6660004);
        ((GeneralPath) shape).curveTo(-234.167, 7.6660004, -234.0, 3.6660004, -229.83401, -0.50099945);
        ((GeneralPath) shape).curveTo(-225.66803, -4.6679993, -225.501, -8.500999, -225.501, -8.500999);
        ((GeneralPath) shape).curveTo(-225.501, -8.500999, -222.167, -2.0009995, -224.834, 0.49900055);
        ((GeneralPath) shape).curveTo(-227.50099, 2.9990005, -228.834, 3.9990005, -228.834, 3.9990005);
        ((GeneralPath) shape).curveTo(-228.834, 3.9990005, -224.16699, 2.4990005, -221.66699, 4.9990005);
        ((GeneralPath) shape).curveTo(-219.16699, 7.4990005, -223.0, 10.5, -223.0, 10.5);
        ((GeneralPath) shape).curveTo(-223.0, 10.5, -222.167, 8.0, -224.0, 7.167);
        ((GeneralPath) shape).curveTo(-225.833, 6.3339996, -233.0, 5.3339996, -234.33301, 10.167);
        ((GeneralPath) shape).curveTo(-235.66602, 15.0, -237.5, -0.667, -237.5, -0.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFBFDFD), shape);
        TreeNode shirtFleur = new TreeNode("shirtFleur", s2, 3);

        // leftSleeve
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-256.0, -39.833);
        ((GeneralPath) shape).lineTo(-260.167, -34.5);
        ((GeneralPath) shape).curveTo(-260.167, -34.5, -261.33398, -23.833, -262.83398, -19.5);
        ((GeneralPath) shape).curveTo(-264.33398, -15.167, -267.167, -11.5, -266.83398, 9.667);
        ((GeneralPath) shape).curveTo(-266.50098, 30.834, -265.00098, 39.667, -265.00098, 39.667);
        ((GeneralPath) shape).lineTo(-227.16797, 36.5);
        ((GeneralPath) shape).curveTo(-227.16797, 36.5, -229.83498, 23.334, -230.83498, 16.5);
        ((GeneralPath) shape).curveTo(-231.83498, 9.667, -236.66797, -3.3330002, -235.66797, -15.5);
        ((GeneralPath) shape).curveTo(-234.66797, -27.667, -235.00096, -36.833, -238.16797, -40.667);
        ((GeneralPath) shape).curveTo(-241.33498, -44.501, -256.0, -39.833, -256.0, -39.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xB14D1B), shape);
        TreeNode leftSleeve = new TreeNode("leftSleeve", s2, 3);

        // leftSleeveFleur
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-258.0, -8.167);
        ((GeneralPath) shape).curveTo(-258.0, -8.167, -257.5, -15.000999, -258.0, -16.334);
        ((GeneralPath) shape).curveTo(-258.5, -17.667, -259.833, -18.501, -259.667, -19.501);
        ((GeneralPath) shape).curveTo(-259.50098, -20.501, -255.16699, -29.501, -255.16699, -29.501);
        ((GeneralPath) shape).curveTo(-255.16699, -29.501, -251.99998, -22.501, -251.99998, -20.334);
        ((GeneralPath) shape).curveTo(-251.99998, -18.167, -254.33298, -19.0, -255.16699, -16.167);
        ((GeneralPath) shape).curveTo(-256.001, -13.334, -255.834, -7.667, -255.834, -7.667);
        ((GeneralPath) shape).curveTo(-255.834, -7.667, -251.667, -16.5, -245.5, -15.0);
        ((GeneralPath) shape).curveTo(-239.333, -13.5, -241.16699, -4.833, -241.16699, -4.833);
        ((GeneralPath) shape).curveTo(-241.16699, -4.833, -242.49998, -11.999001, -246.16699, -11.666);
        ((GeneralPath) shape).curveTo(-249.834, -11.333, -253.16699, -10.833, -254.83398, -4.833);
        ((GeneralPath) shape).curveTo(-256.50098, 1.1669998, -255.66698, 2.8339996, -255.66698, 2.8339996);
        ((GeneralPath) shape).lineTo(-251.66698, 3.1669996);
        ((GeneralPath) shape).curveTo(-251.66698, 3.1669996, -253.99997, 4.167, -255.33398, 12.834);
        ((GeneralPath) shape).curveTo(-256.668, 21.501, -256.83398, 24.334, -256.83398, 24.334);
        ((GeneralPath) shape).curveTo(-256.83398, 24.334, -259.50098, 20.001, -260.50098, 12.334);
        ((GeneralPath) shape).curveTo(-261.50098, 4.667, -261.66797, 2.3339996, -261.66797, 2.3339996);
        ((GeneralPath) shape).lineTo(-259.50098, 2.3339996);
        ((GeneralPath) shape).curveTo(-259.50098, 2.3339996, -258.66797, -4.1660004, -260.66797, -6.9990005);
        ((GeneralPath) shape).curveTo(-262.66797, -9.832001, -264.66797, -5.6660004, -264.66797, -5.6660004);
        ((GeneralPath) shape).curveTo(-264.66797, -5.6660004, -266.16797, -13.833, -263.00098, -13.666);
        ((GeneralPath) shape).curveTo(-259.83398, -13.499001, -258.0, -8.167, -258.0, -8.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFBFDFD), shape);
        TreeNode leftSleeveFleur = new TreeNode("leftSleeveFleur", s2, 3);

        // leftShoulderPad
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-234.375, -50.75);
        ((GeneralPath) shape).curveTo(-234.375, -50.75, -230.625, -46.5, -230.375, -39.875);
        ((GeneralPath) shape).curveTo(-230.125, -33.25, -230.25, -29.875, -233.625, -26.625);
        ((GeneralPath) shape).curveTo(-237.0, -23.375, -244.75, -23.625, -250.25, -27.25);
        ((GeneralPath) shape).curveTo(-255.75, -30.875, -260.375, -34.625, -260.375, -34.625);
        ((GeneralPath) shape).curveTo(-260.375, -34.625, -259.5, -45.0, -251.375, -49.75);
        ((GeneralPath) shape).curveTo(-243.25, -54.5, -234.375, -50.75, -234.375, -50.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF4EBE4), shape);
        TreeNode leftShoulderPad = new TreeNode("leftShoulderPad", s2, 3);

        // leftBottomSleeve
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-265.833, 31.0);
        ((GeneralPath) shape).curveTo(-265.833, 31.0, -264.833, 42.334, -263.66602, 49.167);
        ((GeneralPath) shape).curveTo(-262.49902, 56.0, -260.16602, 63.167, -260.16602, 63.167);
        ((GeneralPath) shape).curveTo(-260.16602, 63.167, -242.99902, 62.0, -239.66602, 62.167);
        ((GeneralPath) shape).curveTo(-236.33301, 62.334, -222.16602, 56.834, -222.16602, 56.834);
        ((GeneralPath) shape).curveTo(-222.16602, 56.834, -225.33302, 44.167, -226.33301, 39.667);
        ((GeneralPath) shape).curveTo(-227.333, 35.167, -229.83301, 25.834, -229.83301, 25.834);
        ((GeneralPath) shape).curveTo(-229.83301, 25.834, -236.667, 30.333, -245.0, 30.5);
        ((GeneralPath) shape).curveTo(-253.333, 30.667, -265.833, 31.0, -265.833, 31.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xA06E60), shape);
        TreeNode leftBottomSleeve = new TreeNode("leftBottomSleeve", s2, 3);

        // leftSleeveGold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-222.5, 55.334);
        ((GeneralPath) shape).curveTo(-222.5, 55.334, -229.16699, 59.166, -234.66699, 60.0);
        ((GeneralPath) shape).curveTo(-240.16699, 60.834, -257.167, 61.834, -257.167, 61.834);
        ((GeneralPath) shape).lineTo(-234.0, 30.334);
        ((GeneralPath) shape).curveTo(-234.0, 30.334, -231.666, 29.334, -230.833, 28.834);
        ((GeneralPath) shape).curveTo(-229.99998, 28.334, -229.0, 27.625, -229.0, 27.625);
        ((GeneralPath) shape).lineTo(-229.75, 24.375);
        ((GeneralPath) shape).curveTo(-229.75, 24.375, -233.25, 26.625, -238.0, 27.75);
        ((GeneralPath) shape).curveTo(-242.75, 28.875, -254.375, 29.25, -260.75, 29.25);
        ((GeneralPath) shape).curveTo(-267.125, 29.25, -266.25, 29.125, -266.25, 29.125);
        ((GeneralPath) shape).lineTo(-265.5, 37.0);
        ((GeneralPath) shape).curveTo(-265.5, 37.0, -259.875, 45.25, -250.625, 51.125);
        ((GeneralPath) shape).curveTo(-241.375, 57.0, -232.375, 61.0, -232.375, 61.0);
        ((GeneralPath) shape).lineTo(-224.875, 58.375);
        ((GeneralPath) shape).curveTo(-224.875, 58.375, -237.25, 55.75, -248.875, 47.625);
        ((GeneralPath) shape).curveTo(-260.5, 39.5, -263.75, 33.0, -263.75, 33.0);
        ((GeneralPath) shape).curveTo(-263.75, 33.0, -257.625, 33.125, -251.125, 32.625);
        ((GeneralPath) shape).curveTo(-244.625, 32.125, -239.625, 31.25, -239.625, 31.25);
        ((GeneralPath) shape).curveTo(-239.625, 31.25, -242.75, 36.75, -249.25, 45.0);
        ((GeneralPath) shape).curveTo(-255.75, 53.25, -261.25, 60.375, -261.25, 60.375);
        ((GeneralPath) shape).lineTo(-260.125, 65.0);
        ((GeneralPath) shape).curveTo(-260.125, 65.0, -243.0, 64.375, -234.875, 62.75);
        ((GeneralPath) shape).curveTo(-226.75, 61.125, -221.625, 57.875, -221.625, 57.875);
        ((GeneralPath) shape).lineTo(-222.5, 55.334);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xF9BF4D), shape);
        TreeNode leftSleeveGold = new TreeNode("leftSleeveGold", s2, 3);

        // beltRed
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-217.158, 21.646);
        ((GeneralPath) shape).curveTo(-217.158, 21.646, -221.205, 16.667, -219.242, 15.857);
        ((GeneralPath) shape).curveTo(-217.28, 15.047, -216.422, 17.248001, -216.422, 17.248001);
        ((GeneralPath) shape).curveTo(-216.422, 17.248001, -209.678, 11.113001, -207.103, 14.470001);
        ((GeneralPath) shape).curveTo(-204.528, 17.827002, -213.357, 22.574001, -213.357, 22.574001);
        ((GeneralPath) shape).curveTo(-213.357, 22.574001, -211.273, 25.351002, -212.74399, 26.047);
        ((GeneralPath) shape).curveTo(-214.215, 26.74, -216.054, 23.384, -217.158, 21.646);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFD0001), shape);
        TreeNode beltRed = new TreeNode("beltRed", s2, 3);

        // rightGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-182.667, 54.167);
        ((GeneralPath) shape).curveTo(-182.667, 54.167, -180.167, 63.667, -179.5, 67.167);
        ((GeneralPath) shape).curveTo(-178.833, 70.667, -178.833, 70.667, -178.833, 70.667);
        ((GeneralPath) shape).curveTo(-178.833, 70.667, -175.66599, 72.166, -174.5, 66.833);
        ((GeneralPath) shape).curveTo(-173.33401, 61.5, -173.5, 58.499, -176.333, 52.833);
        ((GeneralPath) shape).curveTo(-179.16599, 47.167, -182.667, 54.167, -182.667, 54.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xD97228), shape);
        TreeNode rightGlove = new TreeNode("rightGlove", s2, 3);

        // blade
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-219.0, 59.0);
        ((GeneralPath) shape).curveTo(-219.0, 59.0, -86.0, 30.999, -79.33299, 30.333);
        ((GeneralPath) shape).curveTo(-72.665985, 29.667, -47.332993, 28.333, -47.332993, 28.333);
        ((GeneralPath) shape).curveTo(-47.332993, 28.333, -58.667, 36.0, -73.333, 39.0);
        ((GeneralPath) shape).curveTo(-87.999, 42.0, -218.0, 70.333, -218.0, 70.333);
        ((GeneralPath) shape).lineTo(-219.0, 59.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xEBDFDB), shape);
        TreeNode blade = new TreeNode("blade", s2, 3);

        // hiltBlue
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-271.167, 71.333);
        ((GeneralPath) shape).lineTo(-270.833, 78.167);
        ((GeneralPath) shape).lineTo(-244.5, 73.5);
        ((GeneralPath) shape).lineTo(-246.667, 66.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x5D94AB), shape);
        TreeNode hiltBlue = new TreeNode("hiltBlue", s2, 3);

        // swordGuard
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-223.5, 43.0);
        ((GeneralPath) shape).lineTo(-218.83301, 42.333);
        ((GeneralPath) shape).lineTo(-216.50002, 63.167);
        ((GeneralPath) shape).lineTo(-201.66702, 60.667);
        ((GeneralPath) shape).lineTo(-216.00003, 65.167);
        ((GeneralPath) shape).lineTo(-213.83302, 88.667);
        ((GeneralPath) shape).lineTo(-218.66602, 89.833);
        ((GeneralPath) shape).curveTo(-218.66602, 89.833, -219.49901, 70.333, -220.49901, 63.5);
        ((GeneralPath) shape).curveTo(-221.49901, 56.667, -223.5, 43.0, -223.5, 43.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFD0001), shape);
        TreeNode swordGuard = new TreeNode("swordGuard", s2, 3);

        // hiltRed
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-276.167, 72.667);
        ((GeneralPath) shape).lineTo(-271.167, 71.333);
        ((GeneralPath) shape).lineTo(-270.833, 78.167);
        ((GeneralPath) shape).lineTo(-275.667, 79.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFD0001), shape);
        TreeNode hiltRed = new TreeNode("hiltRed", s2, 3);

        root.addChild(torso);
        torso.addChild(hiltYellow);
        torso.addChild(rightSleeve);
        torso.addChild(rightSleeveBottom);
        torso.addChild(rightSleeveGold);
        torso.addChild(shirt);
        torso.addChild(beltGreen);
        torso.addChild(leftGlove);
        torso.addChild(rightShoulderPad);
        torso.addChild(chestTopPlate);
        torso.addChild(chestPlate);
        torso.addChild(chestCentreJewel);
        torso.addChild(chestLeftJewel);
        torso.addChild(beltGold);
        torso.addChild(chestRightJewel);
        torso.addChild(shirtFleur);
        torso.addChild(leftSleeve);
        torso.addChild(leftSleeveFleur);
        torso.addChild(leftShoulderPad);
        torso.addChild(leftBottomSleeve);
        torso.addChild(leftSleeveGold);
        torso.addChild(beltRed);
        torso.addChild(rightGlove);
        torso.addChild(blade);
        torso.addChild(hiltBlue);
        torso.addChild(swordGuard);
        torso.addChild(hiltRed);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-234.167, -76.667);
        ((GeneralPath) shape).curveTo(-231.83401, -73.0, -231.33401, -70.5, -231.33401, -68.667);
        ((GeneralPath) shape).curveTo(-231.33401, -66.834, -232.167, -64.0, -229.33401, -60.667);
        ((GeneralPath) shape).curveTo(-226.50102, -57.334, -221.0, -55.0, -221.0, -55.0);
        ((GeneralPath) shape).lineTo(-206.83301, -64.0);
        ((GeneralPath) shape).curveTo(-206.83301, -64.0, -200.16602, -71.167, -201.5, -80.0);
        ((GeneralPath) shape).curveTo(-202.83398, -88.833, -228.83301, -91.0, -232.33301, -85.0);
        ((GeneralPath) shape).curveTo(-235.83301, -79.0, -234.167, -76.667, -234.167, -76.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFCEED4), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // hair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-210.167, -97.333);
        ((GeneralPath) shape).curveTo(-214.90302, -100.975, -227.83401, -98.833, -231.667, -96.166);
        ((GeneralPath) shape).curveTo(-235.5, -93.499, -240.667, -88.166, -238.0, -80.833);
        ((GeneralPath) shape).curveTo(-235.333, -73.5, -230.66699, -70.333, -230.66699, -70.333);
        ((GeneralPath) shape).lineTo(-233.18399, -74.99);
        ((GeneralPath) shape).curveTo(-233.18399, -74.99, -231.66699, -73.333, -230.50099, -72.499);
        ((GeneralPath) shape).curveTo(-229.33499, -71.665, -228.168, -71.691, -228.168, -71.691);
        ((GeneralPath) shape).lineTo(-230.668, -76.499);
        ((GeneralPath) shape).curveTo(-230.668, -76.499, -228.168, -74.999, -227.668, -74.332);
        ((GeneralPath) shape).curveTo(-227.168, -73.665, -226.50099, -72.665, -226.50099, -72.665);
        ((GeneralPath) shape).lineTo(-228.50099, -78.498);
        ((GeneralPath) shape).lineTo(-221.83398, -72.831);
        ((GeneralPath) shape).lineTo(-223.16698, -76.831);
        ((GeneralPath) shape).curveTo(-223.16698, -76.831, -222.49997, -76.498, -220.49997, -74.998);
        ((GeneralPath) shape).curveTo(-218.49997, -73.498, -216.33298, -72.498, -216.33298, -72.498);
        ((GeneralPath) shape).curveTo(-216.33298, -72.498, -218.33298, -74.331, -219.49998, -75.665);
        ((GeneralPath) shape).curveTo(-220.66699, -76.999, -221.49998, -78.998, -221.49998, -78.998);
        ((GeneralPath) shape).curveTo(-221.49998, -78.998, -219.49998, -76.998, -218.66699, -76.498);
        ((GeneralPath) shape).curveTo(-217.834, -75.998, -215.16699, -74.665, -215.16699, -74.665);
        ((GeneralPath) shape).lineTo(-217.943, -79.0);
        ((GeneralPath) shape).curveTo(-217.943, -79.0, -213.166, -75.667, -212.666, -73.833);
        ((GeneralPath) shape).curveTo(-212.166, -71.999, -212.166, -69.5, -212.166, -69.5);
        ((GeneralPath) shape).lineTo(-211.166, -73.5);
        ((GeneralPath) shape).lineTo(-210.166, -71.692);
        ((GeneralPath) shape).lineTo(-210.166, -74.5);
        ((GeneralPath) shape).lineTo(-208.999, -73.333);
        ((GeneralPath) shape).lineTo(-207.666, -77.0);
        ((GeneralPath) shape).lineTo(-206.33301, -75.167);
        ((GeneralPath) shape).curveTo(-206.33301, -75.167, -200.33301, -81.501, -202.16602, -87.334);
        ((GeneralPath) shape).curveTo(-203.99902, -93.167, -205.833, -94.0, -210.167, -97.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xFFCB48), shape);
        TreeNode hair = new TreeNode("hair", s2, 3);

        // hood
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-231.667, -96.167);
        ((GeneralPath) shape).curveTo(-231.667, -96.167, -220.501, -103.834, -214.83401, -102.167);
        ((GeneralPath) shape).curveTo(-209.16702, -100.5, -201.83401, -97.937, -198.501, -88.385);
        ((GeneralPath) shape).curveTo(-195.16801, -78.833, -195.334, -77.667, -195.834, -76.0);
        ((GeneralPath) shape).curveTo(-196.334, -74.333, -197.349, -73.988, -200.334, -71.692);
        ((GeneralPath) shape).curveTo(-203.319, -69.396, -199.834, -67.999, -200.334, -62.666);
        ((GeneralPath) shape).curveTo(-200.834, -57.333, -202.834, -53.999, -202.834, -53.999);
        ((GeneralPath) shape).curveTo(-202.834, -53.999, -209.501, -50.166, -215.334, -49.999);
        ((GeneralPath) shape).curveTo(-221.16699, -49.832, -228.501, -53.832, -228.501, -53.832);
        ((GeneralPath) shape).curveTo(-228.501, -53.832, -227.395, -54.125, -227.001, -56.165);
        ((GeneralPath) shape).curveTo(-226.60701, -58.205, -227.44801, -58.853, -227.44801, -58.853);
        ((GeneralPath) shape).curveTo(-227.44801, -58.853, -221.88701, -56.331, -217.94402, -59.165);
        ((GeneralPath) shape).curveTo(-214.00102, -61.999, -212.66702, -64.665, -212.66702, -64.665);
        ((GeneralPath) shape).curveTo(-212.66702, -64.665, -209.33403, -63.332, -206.66702, -66.998);
        ((GeneralPath) shape).curveTo(-204.00002, -70.664, -203.40903, -74.034004, -204.66702, -74.831);
        ((GeneralPath) shape).curveTo(-205.92502, -75.628, -205.92502, -75.628, -205.92502, -75.628);
        ((GeneralPath) shape).curveTo(-205.92502, -75.628, -204.00102, -81.664, -207.33401, -87.331);
        ((GeneralPath) shape).curveTo(-210.667, -92.998, -216.008, -97.916, -221.5, -98.0);
        ((GeneralPath) shape).curveTo(-226.992, -98.084, -231.667, -96.167, -231.667, -96.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x912F10), shape);
        TreeNode hood = new TreeNode("hood", s2, 3);

        // eyebrow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-224.333, -75.833);
        ((GeneralPath) shape).lineTo(-224.152, -74.805);
        ((GeneralPath) shape).curveTo(-224.152, -74.805, -219.68799, -75.451004, -217.943, -75.319);
        ((GeneralPath) shape).curveTo(-216.198, -75.187, -214.25, -74.416, -214.25, -74.416);
        ((GeneralPath) shape).curveTo(-214.25, -74.416, -216.148, -76.237, -217.943, -76.096);
        ((GeneralPath) shape).curveTo(-219.738, -75.955, -224.333, -75.833, -224.333, -75.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xA90F00), shape);
        TreeNode eyebrow = new TreeNode("eyebrow", s2, 3);

        // pupil
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-222.04, -73.452);
        ((GeneralPath) shape).curveTo(-220.077, -73.893005, -219.29199, -72.985, -219.29199, -71.693);
        ((GeneralPath) shape).curveTo(-219.29199, -69.501, -220.27599, -68.317, -220.963, -68.325);
        ((GeneralPath) shape).curveTo(-223.227, -68.352, -222.04, -73.452, -222.04, -73.452);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x2F0300), shape);
        TreeNode pupil = new TreeNode("pupil", s2, 3);

        // eyelid
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-223.045, -73.863);
        ((GeneralPath) shape).lineTo(-222.66699, -72.75);
        ((GeneralPath) shape).curveTo(-222.66699, -72.75, -220.808, -73.364, -219.29199, -73.307);
        ((GeneralPath) shape).curveTo(-217.77599, -73.25, -216.24998, -71.693, -216.24998, -71.693);
        ((GeneralPath) shape).curveTo(-216.24998, -71.693, -216.98898, -73.298004, -218.53598, -73.691);
        ((GeneralPath) shape).curveTo(-220.083, -74.084, -223.045, -73.863, -223.045, -73.863);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0x4B0600), shape);
        TreeNode eyelid = new TreeNode("eyelid", s2, 3);

        // mouth
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-227.813, -61.188);
        ((GeneralPath) shape).curveTo(-227.834, -61.375, -227.5, -61.813, -226.563, -61.688);
        ((GeneralPath) shape).curveTo(-225.626, -61.563, -225.063, -61.188, -225.063, -61.0);
        ((GeneralPath) shape).curveTo(-225.063, -60.812, -225.438, -60.875, -226.501, -60.812);
        ((GeneralPath) shape).curveTo(-227.56401, -60.749, -227.75, -60.625, -227.813, -61.188);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.PathTranslate(x, y, new Color(0xBE7755), shape);
        TreeNode mouth = new TreeNode("mouth", s2, 3);

        root.addChild(head);
        head.addChild(face);
        head.addChild(hair);
        head.addChild(hood);
        head.addChild(eyebrow);
        head.addChild(pupil);
        head.addChild(eyelid);
        head.addChild(mouth);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Squire(int width, int height) {
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

