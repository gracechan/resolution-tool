

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
public class Dancer extends Shape2d implements javax.swing.Icon {

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
    public Dancer() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 20;
        int y = 35;
        
        root = new TreeNode("DANCER", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);

        // backShawl
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.333, 104.667);
        ((GeneralPath) shape).curveTo(22.768, 107.293, 30.333, 125.667, 36.0, 134.334);
        ((GeneralPath) shape).curveTo(41.667, 143.001, 59.667, 170.66699, 61.333, 177.334);
        ((GeneralPath) shape).curveTo(62.999, 184.001, 63.0, 187.334, 63.0, 187.334);
        ((GeneralPath) shape).curveTo(63.0, 187.334, 57.667, 196.666, 65.333, 206.0);
        ((GeneralPath) shape).curveTo(72.999, 215.334, 77.333, 223.334, 81.666, 223.66699);
        ((GeneralPath) shape).curveTo(85.999, 223.99998, 113.0, 226.0, 123.333, 228.0);
        ((GeneralPath) shape).curveTo(133.666, 230.0, 162.666, 231.001, 171.33301, 225.334);
        ((GeneralPath) shape).curveTo(180.00002, 219.66699, 194.33301, 208.334, 194.33301, 208.334);
        ((GeneralPath) shape).lineTo(177.0, 182.334);
        ((GeneralPath) shape).curveTo(177.0, 182.334, 172.66699, 191.001, 167.0, 193.334);
        ((GeneralPath) shape).curveTo(161.33301, 195.66699, 153.0, 200.333, 151.0, 199.0);
        ((GeneralPath) shape).curveTo(149.0, 197.667, 134.0, 187.0, 128.66699, 180.0);
        ((GeneralPath) shape).curveTo(123.333984, 173.0, 71.0, 126.333, 71.0, 126.333);
        ((GeneralPath) shape).curveTo(71.0, 126.333, 41.0, 100.0, 29.333, 104.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xDB944E), shape);
        TreeNode backShawl = new TreeNode("backShawl", s2, 3);

        // leftArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(96.167, 76.667);
        ((GeneralPath) shape).curveTo(96.167, 76.667, 92.167, 77.834, 87.5, 78.834);
        ((GeneralPath) shape).curveTo(82.833, 79.834, 76.085, 79.609, 80.167, 88.667);
        ((GeneralPath) shape).curveTo(87.0, 103.834, 91.334, 124.667, 91.334, 124.667);
        ((GeneralPath) shape).curveTo(91.334, 124.667, 75.667, 116.834, 69.667, 115.167);
        ((GeneralPath) shape).curveTo(63.667, 113.5, 53.167, 111.834, 53.167, 111.834);
        ((GeneralPath) shape).curveTo(53.167, 111.834, 41.167, 102.667, 39.334, 103.834);
        ((GeneralPath) shape).curveTo(37.501, 105.001, 46.834, 121.667, 49.334, 123.001);
        ((GeneralPath) shape).curveTo(51.834, 124.335, 59.334, 122.001, 65.667, 125.334);
        ((GeneralPath) shape).curveTo(72.0, 128.66699, 91.173996, 142.465, 95.334, 142.16699);
        ((GeneralPath) shape).curveTo(111.667, 141.0, 96.167, 76.667, 96.167, 76.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFDEBB), shape);
        TreeNode leftArm = new TreeNode("leftArm", s2, 3);

        // backHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(125.0, 46.0);
        ((GeneralPath) shape).curveTo(125.625, 56.5, 118.83, 78.088, 118.0, 86.0);
        ((GeneralPath) shape).curveTo(113.0, 133.66699, 147.0, 153.33301, 147.0, 153.33301);
        ((GeneralPath) shape).curveTo(147.0, 153.33301, 142.334, 154.33301, 139.66699, 152.666);
        ((GeneralPath) shape).curveTo(136.99998, 150.999, 134.0, 149.666, 134.0, 149.666);
        ((GeneralPath) shape).curveTo(134.0, 149.666, 136.333, 153.33301, 139.33301, 156.666);
        ((GeneralPath) shape).curveTo(142.33302, 159.999, 148.33301, 163.999, 148.33301, 163.999);
        ((GeneralPath) shape).curveTo(148.33301, 163.999, 97.50001, 155.749, 103.75001, 102.74899);
        s2 = new Shape2d.Path(x, y, new Color(0xF08F39), shape);
        TreeNode backHair = new TreeNode("backHair", s2, 3);

        // waist
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(120.333, 103.833);
        ((GeneralPath) shape).curveTo(117.5, 109.0, 113.833, 111.833, 114.0, 116.666);
        ((GeneralPath) shape).curveTo(114.167, 121.499, 123.5, 132.666, 125.167, 139.166);
        ((GeneralPath) shape).curveTo(126.834, 145.666, 95.334, 172.83301, 95.334, 172.83301);
        ((GeneralPath) shape).curveTo(95.334, 172.83301, 79.334, 153.16602, 80.667, 142.5);
        ((GeneralPath) shape).curveTo(82.0, 131.83398, 90.5, 127.833, 91.5, 121.0);
        ((GeneralPath) shape).curveTo(92.5, 114.167, 89.667, 105.667, 89.667, 105.667);
        ((GeneralPath) shape).curveTo(89.667, 105.667, 97.834, 101.667, 103.167, 102.0);
        ((GeneralPath) shape).curveTo(108.5, 102.333, 120.333, 103.833, 120.333, 103.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCEAD4), shape);
        TreeNode waist = new TreeNode("waist", s2, 3);

        // bellybutton
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(96.833, 134.833);
        ((GeneralPath) shape).curveTo(96.833, 134.833, 97.833, 136.66599, 97.666, 137.66599);
        ((GeneralPath) shape).curveTo(97.499, 138.66599, 99.166, 135.16599, 99.166, 135.16599);
        ((GeneralPath) shape).curveTo(99.166, 135.16599, 97.667, 133.667, 96.833, 134.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xDB9F6E), shape);
        TreeNode bellybutton = new TreeNode("bellybutton", s2, 3);

        // rightArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(113.833, 71.833);
        ((GeneralPath) shape).lineTo(112.167, 87.5);
        ((GeneralPath) shape).lineTo(124.167, 97.167);
        ((GeneralPath) shape).lineTo(127.167, 94.667);
        ((GeneralPath) shape).curveTo(127.167, 94.667, 131.66699, 105.833, 132.5, 109.5);
        ((GeneralPath) shape).curveTo(133.33301, 113.167, 137.16699, 124.834, 139.83301, 128.66699);
        ((GeneralPath) shape).curveTo(142.49902, 132.49998, 162.16602, 154.66699, 165.33301, 161.33398);
        ((GeneralPath) shape).curveTo(168.5, 168.00098, 168.83301, 181.50098, 171.16602, 185.16699);
        ((GeneralPath) shape).curveTo(173.49902, 188.83301, 181.16602, 196.00099, 181.99902, 194.83398);
        ((GeneralPath) shape).curveTo(182.83203, 193.66698, 174.16602, 185.99998, 177.49902, 183.33398);
        ((GeneralPath) shape).curveTo(180.83203, 180.66798, 192.66602, 190.16798, 194.33203, 196.33398);
        ((GeneralPath) shape).curveTo(195.99805, 202.49998, 196.16502, 199.33398, 196.99904, 199.16698);
        ((GeneralPath) shape).curveTo(197.83305, 198.99997, 197.49904, 189.33398, 189.16605, 179.16698);
        ((GeneralPath) shape).curveTo(180.83305, 168.99997, 172.883, 151.813, 167.5, 140.0);
        ((GeneralPath) shape).curveTo(161.5, 126.833, 153.16699, 124.833, 149.83301, 115.333);
        ((GeneralPath) shape).curveTo(146.49902, 105.833, 139.83301, 81.333, 133.83301, 77.333);
        ((GeneralPath) shape).curveTo(127.83301, 73.333, 122.833, 75.667, 113.833, 71.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCEAD4), shape);
        TreeNode rightArm = new TreeNode("rightArm", s2, 3);

        // top
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(97.667, 66.5);
        ((GeneralPath) shape).curveTo(97.667, 66.5, 99.167, 66.833, 103.5, 65.5);
        ((GeneralPath) shape).curveTo(107.833, 64.167, 111.5, 60.167, 111.5, 60.167);
        ((GeneralPath) shape).curveTo(111.5, 60.167, 110.667, 64.833, 112.0, 68.0);
        ((GeneralPath) shape).curveTo(113.333, 71.167, 120.0, 73.833, 120.0, 73.833);
        ((GeneralPath) shape).curveTo(120.0, 73.833, 113.0, 73.333, 114.667, 81.666);
        ((GeneralPath) shape).curveTo(116.334, 89.999, 118.0, 92.5, 121.833, 94.5);
        ((GeneralPath) shape).curveTo(125.666, 96.5, 126.5, 94.0, 126.5, 94.0);
        ((GeneralPath) shape).lineTo(127.167, 96.0);
        ((GeneralPath) shape).lineTo(120.667, 105.167);
        ((GeneralPath) shape).curveTo(120.667, 105.167, 111.5, 104.834, 104.834, 105.167);
        ((GeneralPath) shape).curveTo(98.168, 105.5, 89.834, 108.0, 89.834, 108.0);
        ((GeneralPath) shape).curveTo(89.834, 108.0, 83.667, 103.0, 83.001, 98.5);
        ((GeneralPath) shape).curveTo(82.335, 94.0, 90.001, 88.667, 91.668, 84.833);
        ((GeneralPath) shape).curveTo(93.335, 80.999, 94.835, 76.166, 94.835, 76.166);
        ((GeneralPath) shape).curveTo(94.835, 76.166, 98.835, 74.666, 99.668, 71.833);
        ((GeneralPath) shape).lineTo(97.667, 66.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x822111), shape);
        TreeNode top = new TreeNode("top", s2, 3);

        // rightCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(156.0, 150.333);
        ((GeneralPath) shape).curveTo(156.0, 150.333, 154.5, 153.16599, 155.667, 154.333);
        ((GeneralPath) shape).curveTo(156.83401, 155.5, 162.667, 162.16599, 162.667, 163.833);
        ((GeneralPath) shape).curveTo(162.667, 165.5, 160.5, 164.5, 161.5, 167.16599);
        ((GeneralPath) shape).curveTo(162.5, 169.83197, 162.333, 173.83298, 163.167, 176.16599);
        ((GeneralPath) shape).curveTo(164.00102, 178.499, 171.83401, 181.83298, 178.0, 180.16599);
        ((GeneralPath) shape).curveTo(184.16599, 178.499, 190.0, 175.83298, 189.83301, 174.33298);
        ((GeneralPath) shape).curveTo(189.66602, 172.83298, 187.99901, 172.49998, 188.166, 170.16599);
        ((GeneralPath) shape).curveTo(188.333, 167.83199, 189.33301, 163.33298, 187.999, 162.33298);
        ((GeneralPath) shape).curveTo(186.66498, 161.33298, 182.832, 161.33298, 182.832, 161.33298);
        ((GeneralPath) shape).curveTo(182.832, 161.33298, 175.0, 148.0, 174.5, 145.667);
        ((GeneralPath) shape).curveTo(174.0, 143.33401, 170.0, 143.5, 170.0, 143.5);
        ((GeneralPath) shape).lineTo(172.333, 146.333);
        ((GeneralPath) shape).curveTo(172.333, 146.333, 172.16599, 149.5, 167.333, 151.0);
        ((GeneralPath) shape).curveTo(162.5, 152.5, 157.5, 152.167, 157.5, 152.167);
        ((GeneralPath) shape).lineTo(156.0, 150.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF59E1A), shape);
        TreeNode rightCuff = new TreeNode("rightCuff", s2, 3);

        // leftCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.833, 114.333);
        ((GeneralPath) shape).curveTo(71.833, 116.666, 72.499, 120.333, 72.166, 123.666);
        ((GeneralPath) shape).curveTo(71.833, 126.999, 70.499, 130.666, 70.499, 130.666);
        ((GeneralPath) shape).lineTo(62.832, 126.833);
        ((GeneralPath) shape).curveTo(62.832, 126.833, 59.332, 135.0, 61.999, 137.33301);
        ((GeneralPath) shape).curveTo(64.666, 139.66602, 73.166, 143.16602, 73.166, 143.16602);
        ((GeneralPath) shape).curveTo(73.166, 143.16602, 75.499, 142.33302, 76.666, 140.83302);
        ((GeneralPath) shape).curveTo(77.833, 139.33302, 77.833, 139.33302, 77.833, 139.33302);
        ((GeneralPath) shape).lineTo(82.833, 141.50003);
        ((GeneralPath) shape).curveTo(82.833, 141.50003, 87.499, 136.16702, 88.166, 132.50003);
        ((GeneralPath) shape).curveTo(88.833, 128.83304, 89.0, 122.833, 89.0, 122.833);
        ((GeneralPath) shape).curveTo(89.0, 122.833, 82.833, 121.166, 80.167, 119.333);
        ((GeneralPath) shape).curveTo(77.501, 117.5, 75.333, 116.0, 73.0, 115.0);
        ((GeneralPath) shape).curveTo(70.667, 114.0, 68.833, 114.333, 68.833, 114.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF59E1A), shape);
        TreeNode leftCuff = new TreeNode("leftCuff", s2, 3);

        // rightShawl
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(178.5, 183.0);
        ((GeneralPath) shape).curveTo(176.379, 183.707, 178.0, 199.75, 180.25, 212.75);
        ((GeneralPath) shape).curveTo(182.5, 225.75, 184.0, 247.75, 185.5, 249.25);
        ((GeneralPath) shape).curveTo(187.0, 250.75, 195.25, 249.25, 195.25, 249.25);
        ((GeneralPath) shape).lineTo(197.5, 253.25);
        ((GeneralPath) shape).curveTo(197.5, 253.25, 205.25, 253.0, 205.75, 249.5);
        ((GeneralPath) shape).curveTo(206.25, 246.0, 203.25, 237.25, 203.25, 237.25);
        ((GeneralPath) shape).lineTo(206.0, 235.25);
        ((GeneralPath) shape).lineTo(213.5, 246.0);
        ((GeneralPath) shape).curveTo(213.5, 246.0, 213.75, 237.0, 214.0, 235.0);
        ((GeneralPath) shape).curveTo(214.25, 233.0, 216.0, 231.75, 216.0, 231.75);
        ((GeneralPath) shape).lineTo(196.25, 193.25);
        ((GeneralPath) shape).curveTo(196.25, 193.25, 198.75, 200.25, 196.0, 200.75);
        ((GeneralPath) shape).curveTo(193.25, 201.25, 194.5, 192.83301, 188.0, 187.5);
        ((GeneralPath) shape).curveTo(182.796, 183.23, 180.75, 182.25, 178.5, 183.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF0CD9D), shape);
        TreeNode rightShawl = new TreeNode("rightShawl", s2, 3);

        // leftShawl
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.0, 104.667);
        ((GeneralPath) shape).curveTo(31.667, 104.5, 35.667, 107.0, 37.167, 111.0);
        ((GeneralPath) shape).curveTo(38.667, 115.0, 47.667, 137.33301, 48.167, 151.33301);
        ((GeneralPath) shape).curveTo(48.667, 165.33301, 49.334, 181.83301, 49.334, 181.83301);
        ((GeneralPath) shape).curveTo(49.334, 181.83301, 56.167, 177.0, 57.834, 172.33301);
        ((GeneralPath) shape).curveTo(59.501, 167.66602, 62.167, 140.0, 62.5, 135.5);
        ((GeneralPath) shape).curveTo(62.833, 131.0, 67.833, 116.333, 67.0, 113.167);
        ((GeneralPath) shape).curveTo(66.167, 110.001, 55.333, 102.667, 55.333, 102.667);
        ((GeneralPath) shape).lineTo(54.5, 100.834);
        ((GeneralPath) shape).curveTo(54.5, 100.834, 48.833, 98.834, 43.167, 99.667);
        ((GeneralPath) shape).curveTo(37.501, 100.5, 29.667, 102.167, 28.0, 104.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF0CD9D), shape);
        TreeNode leftShawl = new TreeNode("leftShawl", s2, 3);

        root.addChild(torso);
        torso.addChild(backShawl);
        torso.addChild(leftArm);
        torso.addChild(backHair);
        torso.addChild(waist);
        torso.addChild(bellybutton);
        torso.addChild(rightArm);
        torso.addChild(top);
        torso.addChild(rightCuff);
        torso.addChild(leftCuff);
        torso.addChild(rightShawl);
        torso.addChild(leftShawl);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.5, 33.375);
        ((GeneralPath) shape).curveTo(84.5, 33.375, 84.0, 46.5, 84.375, 47.75);
        ((GeneralPath) shape).curveTo(84.75, 49.0, 87.125, 50.625, 87.125, 52.5);
        ((GeneralPath) shape).curveTo(87.125, 54.375, 86.375, 56.875, 88.25, 59.125);
        ((GeneralPath) shape).curveTo(90.125, 61.375, 94.25, 65.625, 97.0, 65.75);
        ((GeneralPath) shape).curveTo(99.75, 65.875, 99.5, 64.5, 99.5, 64.5);
        ((GeneralPath) shape).lineTo(100.75, 71.25);
        ((GeneralPath) shape).lineTo(110.25, 70.125);
        ((GeneralPath) shape).lineTo(110.0, 56.25);
        ((GeneralPath) shape).curveTo(110.0, 56.25, 117.5, 51.375, 117.75, 41.5);
        ((GeneralPath) shape).curveTo(118.0, 31.625, 112.125, 20.125, 102.375, 22.0);
        ((GeneralPath) shape).curveTo(92.625, 23.875, 85.125, 29.625, 84.5, 33.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCEAD4), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // rightBrow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(93.0, 46.5);
        ((GeneralPath) shape).lineTo(94.375, 46.75);
        ((GeneralPath) shape).curveTo(94.375, 46.75, 98.0, 43.0, 101.375, 43.0);
        ((GeneralPath) shape).curveTo(104.75, 43.0, 103.125, 42.375, 103.125, 42.375);
        ((GeneralPath) shape).curveTo(103.125, 42.375, 98.125, 42.125, 96.25, 43.875);
        ((GeneralPath) shape).curveTo(94.375, 45.625, 93.0, 46.5, 93.0, 46.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x8B3F28), shape);
        TreeNode rightBrow = new TreeNode("rightBrow", s2, 3);

        // leftBrow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.375, 44.375);
        ((GeneralPath) shape).curveTo(84.375, 44.375, 87.125, 45.625, 87.625, 46.5);
        ((GeneralPath) shape).curveTo(88.125, 47.375, 87.375, 47.375, 87.375, 47.375);
        ((GeneralPath) shape).lineTo(84.25, 45.5);
        ((GeneralPath) shape).lineTo(84.375, 44.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x8B3F28), shape);
        TreeNode leftBrow = new TreeNode("leftBrow", s2, 3);

        // rightEye
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(94.875, 49.125);
        ((GeneralPath) shape).curveTo(95.375, 48.5, 96.5, 47.125, 98.75, 47.25);
        ((GeneralPath) shape).curveTo(101.0, 47.375, 104.0, 49.25, 104.0, 49.25);
        ((GeneralPath) shape).lineTo(99.875, 49.0);
        ((GeneralPath) shape).curveTo(99.875, 49.0, 100.5, 53.875, 98.5, 53.875);
        ((GeneralPath) shape).curveTo(96.5, 53.875, 97.0, 49.125, 97.0, 49.125);
        ((GeneralPath) shape).lineTo(94.875, 49.125);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x4B1713), shape);
        TreeNode rightEye = new TreeNode("rightEye", s2, 3);

        // leftEye
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.75, 48.0);
        ((GeneralPath) shape).curveTo(86.75, 48.5, 88.125, 50.125, 88.125, 50.125);
        ((GeneralPath) shape).lineTo(87.0, 49.875);
        ((GeneralPath) shape).curveTo(87.0, 49.875, 88.0, 51.625, 87.75, 52.5);
        ((GeneralPath) shape).curveTo(87.5, 53.375, 86.875, 52.5, 86.875, 52.5);
        ((GeneralPath) shape).lineTo(84.75, 48.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x4B1713), shape);
        TreeNode leftEye = new TreeNode("leftEye", s2, 3);

        // mouh
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(93.875, 61.375);
        ((GeneralPath) shape).lineTo(97.75, 61.625);
        ((GeneralPath) shape).curveTo(97.75, 61.625, 95.606, 62.836, 94.875, 62.625);
        ((GeneralPath) shape).curveTo(94.49, 62.514, 93.875, 61.375, 93.875, 61.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xD87042), shape);
        TreeNode mouh = new TreeNode("mouh", s2, 3);

        // frontHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(103.75, 102.75);
        ((GeneralPath) shape).curveTo(103.75, 102.75, 114.75, 63.5, 114.5, 52.25);
        ((GeneralPath) shape).curveTo(114.372, 46.468, 107.375, 37.25, 107.375, 37.25);
        ((GeneralPath) shape).curveTo(107.375, 37.25, 110.75, 45.125, 111.875, 52.125);
        ((GeneralPath) shape).curveTo(113.0, 59.125, 106.875, 65.25, 106.875, 65.25);
        ((GeneralPath) shape).curveTo(106.875, 65.25, 107.25, 53.25, 106.375, 51.25);
        ((GeneralPath) shape).curveTo(105.5, 49.25, 96.625, 43.625, 92.25, 41.125);
        ((GeneralPath) shape).curveTo(87.875, 38.625, 83.249, 32.415, 83.625, 31.625);
        ((GeneralPath) shape).curveTo(87.5, 23.5, 98.625, 16.375, 110.125, 18.25);
        ((GeneralPath) shape).curveTo(121.625, 20.125, 124.427, 35.497, 125.0, 46.0);
        ((GeneralPath) shape).curveTo(125.5, 55.167, 109.667, 92.5, 103.75, 102.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF8C35D), shape);
        TreeNode frontHair = new TreeNode("frontHair", s2, 3);

        root.addChild(head);
        head.addChild(face);
        head.addChild(rightBrow);
        head.addChild(leftBrow);
        head.addChild(rightEye);
        head.addChild(leftEye);
        head.addChild(mouh);
        head.addChild(frontHair);

        // leftSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(88.667, 312.0);
        ((GeneralPath) shape).curveTo(85.667, 316.167, 84.167, 318.333, 84.5, 321.833);
        ((GeneralPath) shape).curveTo(84.833, 325.333, 84.833, 327.333, 85.5, 330.833);
        ((GeneralPath) shape).curveTo(86.167, 334.333, 85.167, 338.834, 90.667, 341.667);
        ((GeneralPath) shape).curveTo(96.167, 344.49997, 104.001, 347.666, 108.334, 341.33298);
        ((GeneralPath) shape).curveTo(112.667, 334.99997, 106.667, 328.0, 105.0, 324.5);
        ((GeneralPath) shape).curveTo(103.333, 321.0, 102.167, 312.333, 98.5, 312.0);
        ((GeneralPath) shape).curveTo(94.833, 311.667, 88.667, 312.0, 88.667, 312.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x611805), shape);
        TreeNode leftSole = new TreeNode("leftSole", s2, 3);

        // rightSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(99.667, 319.0);
        ((GeneralPath) shape).curveTo(99.197, 321.506, 105.0, 322.999, 111.0, 322.333);
        ((GeneralPath) shape).curveTo(117.0, 321.66702, 118.333, 323.5, 121.0, 321.5);
        ((GeneralPath) shape).curveTo(123.667, 319.5, 126.333, 312.667, 131.5, 310.667);
        ((GeneralPath) shape).curveTo(136.66699, 308.667, 145.5, 306.167, 146.33301, 304.5);
        ((GeneralPath) shape).curveTo(147.16602, 302.833, 142.50002, 297.001, 133.83301, 299.667);
        ((GeneralPath) shape).curveTo(125.166, 302.33298, 111.167, 315.5, 111.167, 315.5);
        ((GeneralPath) shape).curveTo(111.167, 315.5, 100.167, 316.333, 99.667, 319.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x611805), shape);
        TreeNode rightSole = new TreeNode("rightSole", s2, 3);

        // leftFoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(88.5, 291.833);
        ((GeneralPath) shape).curveTo(88.5, 291.833, 88.5, 309.667, 87.0, 314.667);
        ((GeneralPath) shape).curveTo(85.5, 319.667, 85.167, 322.166, 86.5, 326.833);
        ((GeneralPath) shape).curveTo(87.833, 331.50003, 86.0, 335.334, 88.0, 337.167);
        ((GeneralPath) shape).curveTo(90.0, 338.99997, 97.833, 343.167, 101.0, 342.667);
        ((GeneralPath) shape).curveTo(104.167, 342.167, 109.833, 338.33298, 109.0, 334.83298);
        ((GeneralPath) shape).curveTo(108.167, 331.33298, 101.667, 323.33298, 101.5, 318.49997);
        ((GeneralPath) shape).curveTo(101.333, 313.66696, 104.833, 292.33298, 104.833, 292.33298);
        ((GeneralPath) shape).lineTo(88.5, 291.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCEAD4), shape);
        TreeNode leftFoot = new TreeNode("leftFoot", s2, 3);

        // leftSandal
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(87.0, 296.333);
        ((GeneralPath) shape).curveTo(87.0, 296.333, 87.0, 304.0, 87.333, 306.0);
        ((GeneralPath) shape).curveTo(87.666, 308.0, 89.666, 308.499, 89.833, 312.833);
        ((GeneralPath) shape).curveTo(90.0, 317.16702, 85.166, 324.167, 85.166, 324.167);
        ((GeneralPath) shape).curveTo(85.166, 324.167, 85.166, 325.999, 85.333, 329.33298);
        ((GeneralPath) shape).curveTo(85.5, 332.66696, 86.833, 337.99997, 86.833, 337.99997);
        ((GeneralPath) shape).curveTo(86.833, 337.99997, 87.666, 333.33398, 91.333, 331.66696);
        ((GeneralPath) shape).curveTo(95.0, 329.99994, 102.0, 328.49896, 106.333, 331.83295);
        ((GeneralPath) shape).curveTo(110.666, 335.16693, 110.333, 338.16696, 110.333, 338.16696);
        ((GeneralPath) shape).curveTo(110.333, 338.16696, 111.499, 335.16595, 108.666, 330.33295);
        ((GeneralPath) shape).curveTo(105.833, 325.49994, 104.333, 321.0, 104.333, 321.0);
        ((GeneralPath) shape).curveTo(104.333, 321.0, 100.333, 315.501, 100.166, 311.667);
        ((GeneralPath) shape).curveTo(99.999, 307.83298, 102.166, 301.667, 102.166, 301.667);
        ((GeneralPath) shape).lineTo(101.666, 294.5);
        ((GeneralPath) shape).lineTo(87.0, 296.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xC85722), shape);
        TreeNode leftSandal = new TreeNode("leftSandal", s2, 3);

        // rightFoot
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(118.333, 278.5);
        ((GeneralPath) shape).curveTo(118.333, 278.5, 123.5, 291.16602, 121.833, 295.833);
        ((GeneralPath) shape).curveTo(120.166, 300.5, 107.667, 313.0, 107.667, 313.0);
        ((GeneralPath) shape).curveTo(107.667, 313.0, 100.5, 316.333, 101.5, 317.833);
        ((GeneralPath) shape).curveTo(102.5, 319.333, 109.833, 320.334, 115.0, 318.66702);
        ((GeneralPath) shape).curveTo(120.167, 317.00003, 126.0, 307.834, 130.83301, 306.16702);
        ((GeneralPath) shape).curveTo(135.66602, 304.50003, 140.33301, 303.833, 141.83301, 301.833);
        ((GeneralPath) shape).curveTo(143.33301, 299.833, 142.83301, 294.499, 136.5, 290.333);
        ((GeneralPath) shape).curveTo(130.16699, 286.16702, 130.66699, 276.5, 130.66699, 276.5);
        ((GeneralPath) shape).lineTo(118.333, 278.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCEAD4), shape);
        TreeNode rightFoot = new TreeNode("rightFoot", s2, 3);

        // rightSandal
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(116.5, 287.833);
        ((GeneralPath) shape).lineTo(116.833, 297.0);
        ((GeneralPath) shape).curveTo(116.833, 297.0, 114.833, 298.167, 114.333, 302.167);
        ((GeneralPath) shape).curveTo(113.833, 306.167, 108.833, 309.83298, 106.5, 310.833);
        ((GeneralPath) shape).curveTo(104.167, 311.83304, 105.167, 313.833, 106.0, 315.833);
        ((GeneralPath) shape).curveTo(106.833, 317.833, 107.167, 320.5, 107.167, 320.5);
        ((GeneralPath) shape).curveTo(107.167, 320.5, 115.0, 321.667, 117.667, 320.0);
        ((GeneralPath) shape).curveTo(120.334, 318.333, 126.167, 312.333, 126.167, 312.333);
        ((GeneralPath) shape).curveTo(126.167, 312.333, 124.834, 310.16702, 124.5, 305.0);
        ((GeneralPath) shape).curveTo(124.166, 299.83298, 126.333, 299.833, 126.667, 298.0);
        ((GeneralPath) shape).curveTo(127.001, 296.167, 126.0, 290.666, 128.16699, 289.333);
        ((GeneralPath) shape).curveTo(130.33398, 288.00003, 116.5, 287.833, 116.5, 287.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xC85722), shape);
        TreeNode rightSandal = new TreeNode("rightSandal", s2, 3);

        // skirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.75, 149.5);
        ((GeneralPath) shape).curveTo(78.75, 149.5, 85.5, 165.75, 94.25, 164.75);
        ((GeneralPath) shape).curveTo(103.0, 163.75, 127.75, 147.0, 127.75, 147.0);
        ((GeneralPath) shape).curveTo(127.75, 147.0, 135.75, 155.5, 130.25, 176.5);
        ((GeneralPath) shape).curveTo(124.75, 197.5, 112.0, 204.25, 117.25, 213.5);
        ((GeneralPath) shape).curveTo(122.5, 222.75, 130.25, 230.5, 130.5, 240.0);
        ((GeneralPath) shape).curveTo(130.75, 249.5, 130.25, 275.0, 132.5, 280.25);
        ((GeneralPath) shape).curveTo(134.75, 285.5, 142.25, 288.5, 127.5, 291.25);
        ((GeneralPath) shape).curveTo(112.75, 294.0, 106.25, 296.75, 101.25, 300.5);
        ((GeneralPath) shape).curveTo(96.25, 304.25, 83.5, 300.0, 84.0, 297.5);
        ((GeneralPath) shape).curveTo(84.5, 295.0, 87.5, 290.25, 87.0, 279.25);
        ((GeneralPath) shape).curveTo(86.5, 268.25, 85.0, 241.0, 90.25, 227.25);
        ((GeneralPath) shape).curveTo(95.5, 213.5, 87.75, 201.25, 85.0, 195.5);
        ((GeneralPath) shape).curveTo(82.25, 189.75, 77.0, 178.25, 77.5, 168.25);
        ((GeneralPath) shape).curveTo(78.0, 158.25, 78.75, 149.5, 78.75, 149.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x7F3E21), shape);
        TreeNode skirt = new TreeNode("skirt", s2, 3);

        // chain
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.5, 160.75);
        ((GeneralPath) shape).curveTo(81.75, 169.75, 81.5, 190.5, 83.0, 194.25);
        ((GeneralPath) shape).curveTo(84.5, 198.0, 84.0, 199.75, 86.25, 200.0);
        ((GeneralPath) shape).curveTo(88.5, 200.25, 89.75, 205.75, 89.25, 207.75);
        ((GeneralPath) shape).curveTo(88.75, 209.75, 84.75, 233.0, 87.0, 234.0);
        ((GeneralPath) shape).curveTo(89.25, 235.0, 92.25, 227.25, 94.5, 214.5);
        ((GeneralPath) shape).curveTo(96.75, 201.75, 107.25, 184.75, 108.25, 176.0);
        ((GeneralPath) shape).curveTo(109.25, 167.25, 107.75, 160.25, 107.75, 160.25);
        ((GeneralPath) shape).lineTo(84.5, 160.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFD561), shape);
        TreeNode chain = new TreeNode("chain", s2, 3);

        // belt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.5, 142.25);
        ((GeneralPath) shape).lineTo(73.25, 150.5);
        ((GeneralPath) shape).curveTo(73.25, 150.5, 83.0, 170.0, 94.25, 169.5);
        ((GeneralPath) shape).curveTo(105.5, 169.0, 110.25, 164.25, 110.25, 164.25);
        ((GeneralPath) shape).lineTo(112.25, 167.75);
        ((GeneralPath) shape).curveTo(112.25, 167.75, 103.5, 177.75, 109.75, 181.5);
        ((GeneralPath) shape).curveTo(116.0, 185.25, 118.0, 177.5, 118.0, 177.5);
        ((GeneralPath) shape).curveTo(118.0, 177.5, 120.25, 178.25, 123.25, 177.25);
        ((GeneralPath) shape).curveTo(126.25, 176.25, 127.5, 173.5, 127.5, 173.5);
        ((GeneralPath) shape).lineTo(134.0, 176.0);
        ((GeneralPath) shape).lineTo(136.25, 169.5);
        ((GeneralPath) shape).lineTo(127.5, 167.5);
        ((GeneralPath) shape).lineTo(125.25, 158.75);
        ((GeneralPath) shape).lineTo(120.5, 159.5);
        ((GeneralPath) shape).lineTo(115.25, 164.75);
        ((GeneralPath) shape).lineTo(114.25, 161.5);
        ((GeneralPath) shape).curveTo(114.25, 161.5, 120.75, 154.75, 123.75, 153.5);
        ((GeneralPath) shape).curveTo(126.75, 152.25, 129.75, 150.5, 129.75, 150.5);
        ((GeneralPath) shape).curveTo(129.75, 150.5, 132.0, 139.0, 127.25, 140.0);
        ((GeneralPath) shape).curveTo(122.5, 141.0, 111.75, 153.5, 107.5, 155.25);
        ((GeneralPath) shape).curveTo(103.25, 157.0, 92.75, 163.0, 85.75, 154.0);
        ((GeneralPath) shape).curveTo(78.75, 145.0, 80.75, 144.25, 78.5, 142.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF59E1A), shape);
        TreeNode belt = new TreeNode("belt", s2, 3);

        root.addChild(bottom);
        bottom.addChild(leftSole);
        bottom.addChild(rightSole);
        bottom.addChild(leftFoot);
        bottom.addChild(leftSandal);
        bottom.addChild(rightFoot);
        bottom.addChild(rightSandal);
        bottom.addChild(skirt);
        bottom.addChild(chain);
        bottom.addChild(belt);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Dancer(int width, int height) {
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

