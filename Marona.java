

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
public class Marona extends Shape2d implements javax.swing.Icon {

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
    public Marona() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 20;
        int y = 35;
        
        root = new TreeNode("MARONA", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);

        // skirtBehind
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.855, 120.735);
        ((GeneralPath) shape).curveTo(18.855, 120.735, 19.875, 130.0, 22.75, 131.375);
        ((GeneralPath) shape).curveTo(25.625, 132.75, 27.794, 132.125, 27.794, 132.125);
        ((GeneralPath) shape).curveTo(27.794, 132.125, 28.021, 137.011, 31.875, 137.691);
        ((GeneralPath) shape).curveTo(35.729, 138.37099, 41.105, 136.887, 41.105, 136.887);
        ((GeneralPath) shape).curveTo(41.105, 136.887, 44.746, 144.124, 48.934998, 143.749);
        ((GeneralPath) shape).curveTo(53.123997, 143.374, 55.248997, 140.916, 55.248997, 140.916);
        ((GeneralPath) shape).curveTo(55.248997, 140.916, 59.364, 147.117, 63.873997, 146.999);
        ((GeneralPath) shape).curveTo(68.383995, 146.88098, 71.597, 142.91699, 71.597, 142.91699);
        ((GeneralPath) shape).lineTo(49.624, 110.43299);
        ((GeneralPath) shape).lineTo(19.5, 120.5);
        s2 = new Shape2d.Path(x, y, new Color(0x1E234B), shape);
        TreeNode skirtBehind = new TreeNode("skirtBehind", s2, 3);

        // leftSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.25, 198.917);
        ((GeneralPath) shape).lineTo(24.239, 206.667);
        ((GeneralPath) shape).curveTo(24.239, 206.667, 25.833, 211.99901, 31.75, 211.58301);
        ((GeneralPath) shape).curveTo(37.667, 211.167, 39.294, 208.58401, 41.105, 206.417);
        ((GeneralPath) shape).curveTo(42.916, 204.25, 42.916, 203.751, 43.5, 203.667);
        ((GeneralPath) shape).curveTo(44.084, 203.58301, 44.5, 204.917, 44.5, 204.917);
        ((GeneralPath) shape).lineTo(47.583, 204.25);
        ((GeneralPath) shape).curveTo(47.583, 204.25, 48.033, 201.497, 47.583, 198.25);
        ((GeneralPath) shape).curveTo(47.133, 195.003, 39.833, 194.933, 37.166, 194.925);
        ((GeneralPath) shape).curveTo(34.499, 194.917, 24.25, 198.917, 24.25, 198.917);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFDAB83), shape);
        TreeNode leftSole = new TreeNode("leftSole", s2, 3);

        // rightSole
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(71.115, 213.986);
        ((GeneralPath) shape).lineTo(71.503, 220.568);
        ((GeneralPath) shape).curveTo(71.503, 220.568, 73.417, 224.833, 79.75, 224.0);
        ((GeneralPath) shape).curveTo(86.083, 223.167, 86.75, 220.568, 86.75, 220.568);
        ((GeneralPath) shape).lineTo(87.515, 213.58899);
        ((GeneralPath) shape).curveTo(87.515, 213.58899, 80.417, 211.71298, 78.167, 211.607);
        ((GeneralPath) shape).curveTo(75.917, 211.501, 71.115, 213.986, 71.115, 213.986);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFDAB83), shape);
        TreeNode rightSole = new TreeNode("rightSole", s2, 3);

        // rightLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.375, 132.375);
        ((GeneralPath) shape).curveTo(54.569, 138.119, 59.0, 149.625, 63.375, 150.875);
        ((GeneralPath) shape).curveTo(67.75, 152.125, 67.958, 143.174, 67.5, 137.375);
        ((GeneralPath) shape).curveTo(67.042, 131.576, 50.75, 119.75, 53.375, 132.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode rightLeg = new TreeNode("rightLeg", s2, 3);

        // leftLeg
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.875, 132.0);
        ((GeneralPath) shape).curveTo(35.658, 138.212, 37.25, 148.125, 39.875, 148.375);
        ((GeneralPath) shape).curveTo(42.5, 148.625, 44.841, 142.389, 44.67, 136.319);
        ((GeneralPath) shape).curveTo(44.498997, 130.249, 34.001, 125.062, 34.875, 132.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode leftLeg = new TreeNode("leftLeg", s2, 3);

        // rightSock
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.999, 142.918);
        ((GeneralPath) shape).curveTo(56.999, 142.918, 59.125, 144.5, 62.125, 143.875);
        ((GeneralPath) shape).curveTo(65.125, 143.25, 67.642, 139.917, 67.642, 139.917);
        ((GeneralPath) shape).curveTo(67.642, 139.917, 68.25, 142.875, 68.375, 146.375);
        ((GeneralPath) shape).curveTo(68.5, 149.875, 67.875, 152.375, 70.625, 156.125);
        ((GeneralPath) shape).curveTo(73.375, 159.875, 74.75, 160.0, 76.125, 172.25);
        ((GeneralPath) shape).curveTo(77.5, 184.5, 80.75, 184.375, 83.0, 189.125);
        ((GeneralPath) shape).curveTo(85.25, 193.875, 76.875, 195.5, 75.125, 194.75);
        ((GeneralPath) shape).curveTo(73.375, 194.0, 73.254, 185.375, 70.189, 178.75);
        ((GeneralPath) shape).curveTo(67.12401, 172.125, 64.375, 166.5, 63.750004, 162.375);
        ((GeneralPath) shape).curveTo(63.125008, 158.25, 62.875004, 155.625, 61.250004, 152.375);
        ((GeneralPath) shape).curveTo(59.625004, 149.125, 57.345005, 143.64, 57.345005, 143.64);
        s2 = new Shape2d.Path(x, y, new Color(0xF2F2F2), shape);
        TreeNode rightSock = new TreeNode("rightSock", s2, 3);

        // leftSock
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.711, 137.691);
        ((GeneralPath) shape).curveTo(35.711, 137.691, 36.5, 139.959, 39.375, 139.91699);
        ((GeneralPath) shape).curveTo(42.25, 139.87498, 45.194, 138.534, 45.194, 138.534);
        ((GeneralPath) shape).curveTo(45.194, 138.534, 44.233, 149.111, 44.679, 150.993);
        ((GeneralPath) shape).curveTo(45.125, 152.875, 46.5, 154.375, 46.5, 158.875);
        ((GeneralPath) shape).curveTo(46.5, 163.375, 45.125, 180.75, 44.125, 184.875);
        ((GeneralPath) shape).curveTo(43.125, 189.0, 38.25, 188.25, 37.75, 184.875);
        ((GeneralPath) shape).curveTo(37.25, 181.5, 38.25, 161.625, 37.5, 158.5);
        ((GeneralPath) shape).curveTo(36.75, 155.375, 36.048, 151.758, 35.711, 137.691);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF2F2F2), shape);
        TreeNode leftSock = new TreeNode("leftSock", s2, 3);

        // rightShoe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(71.704, 182.864);
        ((GeneralPath) shape).curveTo(71.704, 182.864, 66.75, 184.263, 67.5, 187.694);
        ((GeneralPath) shape).curveTo(68.25, 191.125, 71.158, 194.875, 71.704, 198.75);
        ((GeneralPath) shape).curveTo(72.25001, 202.625, 69.125, 214.54199, 72.75, 218.16699);
        ((GeneralPath) shape).curveTo(76.375, 221.79199, 84.25, 220.91699, 86.25, 218.16699);
        ((GeneralPath) shape).curveTo(88.25, 215.41699, 87.869, 208.62099, 85.625, 199.625);
        ((GeneralPath) shape).curveTo(83.381, 190.62901, 87.5, 190.625, 86.375, 185.625);
        ((GeneralPath) shape).curveTo(85.25, 180.625, 78.403, 181.92, 78.403, 181.92);
        ((GeneralPath) shape).lineTo(79.503, 183.918);
        ((GeneralPath) shape).curveTo(79.503, 183.918, 83.012, 183.5, 83.381, 185.375);
        ((GeneralPath) shape).curveTo(83.74999, 187.25, 81.375, 189.625, 76.375, 189.625);
        ((GeneralPath) shape).curveTo(71.375, 189.625, 69.962, 188.668, 70.189, 187.001);
        ((GeneralPath) shape).curveTo(70.41601, 185.33401, 72.272, 184.975, 72.272, 184.975);
        ((GeneralPath) shape).lineTo(71.704, 182.864);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x9E6941), shape);
        TreeNode rightShoe = new TreeNode("rightShoe", s2, 3);

        // leftShoe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.661, 175.088);
        ((GeneralPath) shape).curveTo(37.661, 175.088, 33.583, 175.583, 33.25, 177.75);
        ((GeneralPath) shape).curveTo(32.917, 179.917, 35.083, 187.58301, 33.25, 190.25);
        ((GeneralPath) shape).curveTo(31.417, 192.91699, 23.917, 195.751, 24.25, 198.91699);
        ((GeneralPath) shape).curveTo(24.583, 202.08298, 26.0, 206.91699, 34.25, 205.16699);
        ((GeneralPath) shape).curveTo(42.5, 203.41699, 47.583, 198.25, 47.583, 198.25);
        ((GeneralPath) shape).curveTo(47.583, 198.25, 46.75, 193.751, 47.083, 191.41699);
        ((GeneralPath) shape).curveTo(47.416, 189.08298, 51.083, 182.66699, 50.916, 178.66699);
        ((GeneralPath) shape).curveTo(50.749, 174.66699, 45.407, 175.088, 45.407, 175.088);
        ((GeneralPath) shape).lineTo(45.268, 176.493);
        ((GeneralPath) shape).curveTo(45.268, 176.493, 49.083, 176.16699, 48.416, 178.66699);
        ((GeneralPath) shape).curveTo(47.749, 181.16699, 43.249, 180.91599, 40.166, 180.833);
        ((GeneralPath) shape).curveTo(37.083, 180.75, 35.672, 179.91699, 35.711, 178.41699);
        ((GeneralPath) shape).curveTo(35.749996, 176.91699, 37.579998, 176.833, 37.579998, 176.833);
        ((GeneralPath) shape).lineTo(37.661, 175.088);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x9E6941), shape);
        TreeNode leftShoe = new TreeNode("leftShoe", s2, 3);

        // leftShoeStripe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.827, 201.565);
        ((GeneralPath) shape).curveTo(24.709, 202.785, 26.218, 204.674, 28.239, 205.091);
        ((GeneralPath) shape).curveTo(30.26, 205.50801, 30.26, 205.50801, 30.26, 205.50801);
        ((GeneralPath) shape).curveTo(30.26, 205.50801, 28.625, 201.06201, 31.5, 198.87401);
        ((GeneralPath) shape).curveTo(34.375, 196.686, 38.494, 195.97801, 39.31, 193.48901);
        ((GeneralPath) shape).curveTo(40.126003, 191.00002, 40.688, 180.84601, 40.688, 180.84601);
        ((GeneralPath) shape).curveTo(40.688, 180.84601, 39.312, 180.843, 38.602, 180.705);
        ((GeneralPath) shape).curveTo(37.892002, 180.567, 36.892002, 180.215, 36.892002, 180.215);
        ((GeneralPath) shape).curveTo(36.892002, 180.215, 37.125004, 189.049, 36.625004, 190.305);
        ((GeneralPath) shape).curveTo(36.125004, 191.56099, 34.0, 193.5, 31.188, 194.5);
        ((GeneralPath) shape).curveTo(28.376, 195.5, 25.153, 198.193, 24.827, 201.565);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xCAF291), shape);
        TreeNode leftShoeStripe = new TreeNode("leftShoeStripe", s2, 3);

        // rightShoeStripe
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(73.936, 189.526);
        ((GeneralPath) shape).curveTo(73.936, 189.526, 74.89, 189.702, 76.375, 189.625);
        ((GeneralPath) shape).curveTo(77.86, 189.548, 79.937, 189.133, 79.937, 189.133);
        ((GeneralPath) shape).curveTo(79.937, 189.133, 79.436, 194.75, 79.937, 200.25);
        ((GeneralPath) shape).curveTo(80.437996, 205.75, 81.75, 210.125, 81.625, 213.625);
        ((GeneralPath) shape).curveTo(81.5, 217.125, 81.634, 220.405, 81.634, 220.405);
        ((GeneralPath) shape).curveTo(81.634, 220.405, 80.311005, 220.63, 79.315, 220.568);
        ((GeneralPath) shape).curveTo(78.319, 220.50598, 75.501, 219.875, 75.501, 219.875);
        ((GeneralPath) shape).curveTo(75.501, 219.875, 75.251, 212.625, 75.251, 209.937);
        ((GeneralPath) shape).curveTo(75.251, 207.249, 76.126, 204.687, 75.939, 200.499);
        ((GeneralPath) shape).curveTo(75.75201, 196.31099, 73.937004, 189.749, 73.937004, 189.749);
        s2 = new Shape2d.Path(x, y, new Color(0xCAF291), shape);
        TreeNode rightShoeStripe = new TreeNode("rightShoeStripe", s2, 3);

        // rightShoelace
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.487, 199.084);
        ((GeneralPath) shape).lineTo(69.583, 199.084);
        ((GeneralPath) shape).curveTo(69.583, 199.084, 69.416, 200.083, 69.583, 201.66699);
        ((GeneralPath) shape).curveTo(69.75, 203.25099, 70.189, 204.834, 70.189, 204.834);
        ((GeneralPath) shape).lineTo(75.0, 201.959);
        ((GeneralPath) shape).curveTo(75.0, 201.959, 75.208, 203.208, 74.25, 204.458);
        ((GeneralPath) shape).curveTo(73.292, 205.708, 72.667, 206.083, 72.667, 206.083);
        ((GeneralPath) shape).lineTo(73.667, 207.625);
        ((GeneralPath) shape).curveTo(73.667, 207.625, 75.001, 206.708, 75.792, 204.875);
        ((GeneralPath) shape).curveTo(76.583, 203.042, 76.958, 201.833, 76.958, 201.833);
        ((GeneralPath) shape).lineTo(79.875, 201.91699);
        ((GeneralPath) shape).curveTo(79.875, 201.91699, 80.458, 204.04099, 81.125, 205.083);
        ((GeneralPath) shape).curveTo(81.792, 206.125, 83.708, 207.875, 83.708, 207.875);
        ((GeneralPath) shape).lineTo(85.083, 206.125);
        ((GeneralPath) shape).curveTo(85.083, 206.125, 83.124, 205.291, 82.708, 204.083);
        ((GeneralPath) shape).curveTo(82.292, 202.87498, 82.0, 202.0, 82.0, 202.0);
        ((GeneralPath) shape).curveTo(82.0, 202.0, 83.584, 202.209, 84.792, 202.542);
        ((GeneralPath) shape).curveTo(86.0, 202.87502, 87.958, 203.667, 87.958, 203.667);
        ((GeneralPath) shape).curveTo(87.958, 203.667, 88.166, 201.542, 87.958, 200.25);
        ((GeneralPath) shape).curveTo(87.75, 198.958, 86.875, 196.875, 86.875, 196.875);
        ((GeneralPath) shape).curveTo(86.875, 196.875, 85.137, 197.376, 83.381, 198.042);
        ((GeneralPath) shape).curveTo(81.62499, 198.70801, 80.583, 199.20801, 80.583, 199.20801);
        ((GeneralPath) shape).lineTo(77.487, 199.084);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x374B7E), shape);
        TreeNode rightShoelace = new TreeNode("rightShoelace", s2, 3);

        // leftShoelace
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.375, 189.188);
        ((GeneralPath) shape).curveTo(37.25, 189.188, 38.438, 190.307, 38.438, 190.307);
        ((GeneralPath) shape).curveTo(38.438, 190.307, 40.751, 191.063, 41.751, 192.063);
        ((GeneralPath) shape).curveTo(42.751, 193.063, 44.064, 194.376, 44.064, 194.376);
        ((GeneralPath) shape).lineTo(40.219997, 197.376);
        ((GeneralPath) shape).curveTo(40.219997, 197.376, 40.250996, 195.501, 39.814, 194.313);
        ((GeneralPath) shape).curveTo(39.377003, 193.125, 38.0, 192.5, 38.0, 192.5);
        ((GeneralPath) shape).lineTo(38.063, 197.875);
        ((GeneralPath) shape).lineTo(36.012, 197.875);
        ((GeneralPath) shape).lineTo(36.438, 192.0);
        ((GeneralPath) shape).curveTo(36.438, 192.0, 35.188, 191.5, 34.188, 192.25);
        ((GeneralPath) shape).curveTo(33.188, 193.0, 31.25, 194.125, 31.25, 194.125);
        ((GeneralPath) shape).lineTo(30.383, 192.734);
        ((GeneralPath) shape).lineTo(31.505, 191.924);
        ((GeneralPath) shape).curveTo(31.505, 191.924, 31.061998, 190.812, 31.186998, 189.562);
        ((GeneralPath) shape).curveTo(31.311998, 188.312, 31.499998, 187.694, 31.499998, 187.694);
        ((GeneralPath) shape).curveTo(31.499998, 187.694, 32.259, 188.55, 33.786, 188.931);
        ((GeneralPath) shape).curveTo(35.313, 189.312, 36.375, 189.188, 36.375, 189.188);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x374B7E), shape);
        TreeNode leftShoelace = new TreeNode("leftShoelace", s2, 3);

        root.addChild(bottom);
        bottom.addChild(skirtBehind);
        bottom.addChild(leftSole);
        bottom.addChild(rightSole);
        bottom.addChild(rightLeg);
        bottom.addChild(leftLeg);
        bottom.addChild(rightSock);
        bottom.addChild(leftSock);
        bottom.addChild(rightShoe);
        bottom.addChild(leftShoe);
        bottom.addChild(leftShoeStripe);
        bottom.addChild(rightShoeStripe);
        bottom.addChild(rightShoelace);
        bottom.addChild(leftShoelace);

        // rightHand_1_
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.773, 74.25);
        ((GeneralPath) shape).curveTo(68.773, 74.25, 75.484, 71.263, 78.083, 76.667);
        ((GeneralPath) shape).curveTo(80.682, 82.071, 79.5, 90.0, 81.417, 96.0);
        ((GeneralPath) shape).curveTo(83.334, 102.0, 83.75, 102.083, 84.25, 105.917);
        ((GeneralPath) shape).curveTo(84.75, 109.751, 85.667, 118.084, 85.667, 118.084);
        ((GeneralPath) shape).lineTo(81.084, 119.918);
        ((GeneralPath) shape).curveTo(81.084, 119.918, 76.584, 112.751, 76.084, 108.001);
        ((GeneralPath) shape).curveTo(75.584, 103.251, 76.0, 101.668, 75.167, 98.168);
        ((GeneralPath) shape).curveTo(74.334, 94.668, 73.667, 88.752, 72.084, 87.085);
        ((GeneralPath) shape).curveTo(70.501, 85.418, 67.92, 88.085, 67.92, 88.085);
        ((GeneralPath) shape).curveTo(67.92, 88.085, 66.084, 84.085, 66.501, 80.168);
        ((GeneralPath) shape).curveTo(66.918, 76.251, 68.773, 74.25, 68.773, 74.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode rightHand_1_ = new TreeNode("rightHand_1_", s2, 3);

        // rightHand
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(83.667, 136.833);
        ((GeneralPath) shape).curveTo(84.991, 139.148, 87.251, 139.0, 88.584, 138.5);
        ((GeneralPath) shape).curveTo(89.917, 138.0, 93.25, 135.751, 96.167, 137.167);
        ((GeneralPath) shape).curveTo(99.084, 138.58301, 99.667, 140.917, 101.167, 140.917);
        ((GeneralPath) shape).curveTo(102.667, 140.917, 102.917, 140.666, 103.084, 140.33301);
        ((GeneralPath) shape).curveTo(103.251, 140.00002, 101.0, 137.79901, 99.917, 136.77301);
        ((GeneralPath) shape).curveTo(98.834, 135.74901, 98.167, 134.33301, 98.167, 134.33301);
        ((GeneralPath) shape).curveTo(98.167, 134.33301, 100.501, 133.666, 102.584, 133.83301);
        ((GeneralPath) shape).curveTo(104.667, 134.00002, 106.917, 134.49901, 107.334, 133.33301);
        ((GeneralPath) shape).curveTo(107.751, 132.167, 106.25, 131.417, 104.667, 131.25002);
        ((GeneralPath) shape).curveTo(103.084, 131.08302, 97.667, 131.25002, 97.667, 131.25002);
        ((GeneralPath) shape).curveTo(97.667, 131.25002, 100.084, 128.83301, 101.25, 128.00002);
        ((GeneralPath) shape).curveTo(102.416, 127.16702, 104.333, 125.99502, 104.0, 124.53902);
        ((GeneralPath) shape).curveTo(103.667, 123.083015, 101.083, 123.417015, 99.25, 125.417015);
        ((GeneralPath) shape).curveTo(97.417, 127.417015, 94.833, 128.66702, 94.833, 128.66702);
        ((GeneralPath) shape).lineTo(94.5, 128.25);
        ((GeneralPath) shape).curveTo(94.5, 128.25, 96.667, 125.333, 96.25, 123.0);
        ((GeneralPath) shape).curveTo(95.833, 120.667, 94.333, 118.417, 93.5, 120.667);
        ((GeneralPath) shape).curveTo(92.667, 122.917, 92.552, 124.943, 91.583, 125.833);
        ((GeneralPath) shape).curveTo(90.613, 126.723, 88.75, 126.083, 88.75, 126.083);
        ((GeneralPath) shape).lineTo(83.583, 131.33301);
        ((GeneralPath) shape).curveTo(83.583, 131.333, 82.667, 135.083, 83.667, 136.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode rightHand = new TreeNode("rightHand", s2, 3);

        // leftArm
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.083, 73.775);
        ((GeneralPath) shape).curveTo(58.5, 73.5, 55.917, 73.917, 50.0, 77.0);
        ((GeneralPath) shape).curveTo(44.083, 80.083, 37.75, 81.5, 35.667, 82.417);
        ((GeneralPath) shape).curveTo(33.584, 83.334, 28.417, 84.584, 27.834, 86.584);
        ((GeneralPath) shape).curveTo(27.251, 88.584, 33.25, 102.667, 34.417, 104.417);
        ((GeneralPath) shape).curveTo(35.584, 106.167, 41.0, 102.083, 41.0, 102.083);
        ((GeneralPath) shape).curveTo(41.0, 102.083, 38.917, 98.416, 38.0, 95.416);
        ((GeneralPath) shape).curveTo(37.083, 92.416, 36.583, 88.666, 36.583, 88.666);
        ((GeneralPath) shape).curveTo(36.583, 88.666, 40.249, 88.499, 47.166, 85.666);
        ((GeneralPath) shape).curveTo(54.083, 82.833, 61.833, 81.083, 61.833, 81.083);
        ((GeneralPath) shape).lineTo(63.083, 73.775);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode leftArm = new TreeNode("leftArm", s2, 3);

        // innerShirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.333, 69.444);
        ((GeneralPath) shape).curveTo(64.333, 69.444, 65.088, 73.15, 64.333, 73.775);
        ((GeneralPath) shape).curveTo(63.578003, 74.4, 60.626, 73.25, 58.021, 76.417);
        ((GeneralPath) shape).curveTo(55.416, 79.584, 51.228, 84.609, 52.648, 89.279);
        ((GeneralPath) shape).curveTo(54.067997, 93.949, 69.708, 95.668, 70.313, 92.834);
        ((GeneralPath) shape).curveTo(70.917, 90.0, 71.25, 88.084, 71.25, 88.084);
        ((GeneralPath) shape).curveTo(71.25, 88.084, 69.584, 85.486, 69.417, 81.826996);
        ((GeneralPath) shape).curveTo(69.25, 78.168, 72.94, 73.77599, 72.94, 73.77599);
        ((GeneralPath) shape).curveTo(72.94, 73.77599, 71.75, 74.00299, 71.75, 72.75199);
        ((GeneralPath) shape).curveTo(71.75, 71.50099, 71.671, 67.24299, 71.671, 67.24299);
        ((GeneralPath) shape).lineTo(64.333, 69.444);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x1F3B6D), shape);
        TreeNode innerShirt = new TreeNode("innerShirt", s2, 3);

        // innerSkirt
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.0, 112.917);
        ((GeneralPath) shape).curveTo(30.0, 112.917, 26.584, 116.0, 24.417, 117.084);
        ((GeneralPath) shape).curveTo(22.25, 118.168, 18.25, 119.918, 18.25, 119.918);
        ((GeneralPath) shape).curveTo(18.25, 119.918, 23.049, 126.75, 26.274, 126.834);
        ((GeneralPath) shape).curveTo(29.499, 126.918, 31.667, 125.177, 31.667, 125.177);
        ((GeneralPath) shape).curveTo(31.667, 125.177, 30.583, 131.668, 32.5, 132.418);
        ((GeneralPath) shape).curveTo(34.417, 133.168, 36.167, 132.418, 36.167, 132.418);
        ((GeneralPath) shape).curveTo(36.167, 132.418, 36.834, 135.668, 40.167, 136.668);
        ((GeneralPath) shape).curveTo(43.5, 137.668, 45.083, 136.0, 45.083, 136.0);
        ((GeneralPath) shape).curveTo(45.083, 136.0, 47.333, 140.16699, 50.0, 139.917);
        ((GeneralPath) shape).curveTo(52.667, 139.66702, 53.25, 136.917, 53.25, 136.917);
        ((GeneralPath) shape).curveTo(53.25, 136.917, 57.917, 140.666, 60.75, 140.33301);
        ((GeneralPath) shape).curveTo(63.583, 140.00002, 65.417, 138.50002, 65.417, 138.50002);
        ((GeneralPath) shape).curveTo(65.417, 138.50002, 68.333, 143.00102, 70.0, 142.91702);
        ((GeneralPath) shape).curveTo(71.667, 142.83302, 72.139, 142.91803, 72.139, 142.91803);
        ((GeneralPath) shape).curveTo(72.139, 142.91803, 71.0, 138.167, 71.25, 136.5);
        ((GeneralPath) shape).curveTo(71.5, 134.833, 53.667, 119.084, 48.083, 116.5);
        ((GeneralPath) shape).curveTo(42.5, 113.917, 30.0, 112.917, 30.0, 112.917);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x4C53A5), shape);
        TreeNode innerSkirt = new TreeNode("innerSkirt", s2, 3);

        // rightCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.333, 119.917);
        ((GeneralPath) shape).curveTo(78.333, 119.917, 79.109, 118.404, 82.25, 117.0);
        ((GeneralPath) shape).curveTo(85.391, 115.596, 86.667, 115.75, 86.667, 115.75);
        ((GeneralPath) shape).curveTo(86.667, 115.75, 88.417, 117.417, 89.75, 120.75);
        ((GeneralPath) shape).curveTo(91.083, 124.083, 91.25, 125.417, 91.25, 125.417);
        ((GeneralPath) shape).curveTo(91.25, 125.417, 90.0, 128.501, 87.917, 130.16699);
        ((GeneralPath) shape).curveTo(85.834, 131.83298, 83.75, 133.333, 83.75, 133.333);
        ((GeneralPath) shape).curveTo(83.75, 133.333, 80.917, 130.41599, 79.583, 126.58299);
        ((GeneralPath) shape).curveTo(78.249, 122.75, 78.333, 119.917, 78.333, 119.917);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x3E847A), shape);
        TreeNode rightCuff = new TreeNode("rightCuff", s2, 3);

        // leftCuff
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.634, 100.632);
        ((GeneralPath) shape).curveTo(29.634, 100.632, 31.034, 97.741005, 33.653, 96.295006);
        ((GeneralPath) shape).curveTo(36.272, 94.84901, 39.002, 93.52501, 39.002, 93.52501);
        ((GeneralPath) shape).lineTo(43.538, 103.921005);
        ((GeneralPath) shape).lineTo(36.017, 109.729004);
        ((GeneralPath) shape).lineTo(29.634, 100.632);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x3E847A), shape);
        TreeNode leftCuff = new TreeNode("leftCuff", s2, 3);

        // dress
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.833, 82.833);
        ((GeneralPath) shape).curveTo(50.0, 88.667, 50.167, 94.083, 45.0, 99.583);
        ((GeneralPath) shape).curveTo(39.833, 105.083, 26.274, 111.048996, 26.274, 111.048996);
        ((GeneralPath) shape).curveTo(26.274, 111.048996, 30.667, 111.41599, 34.25, 115.33299);
        ((GeneralPath) shape).curveTo(37.833, 119.24999, 42.653, 129.0, 47.153, 128.833);
        ((GeneralPath) shape).curveTo(51.653, 128.66599, 53.833, 127.58299, 56.417, 128.333);
        ((GeneralPath) shape).curveTo(59.001, 129.083, 64.584, 131.66599, 67.167, 132.583);
        ((GeneralPath) shape).curveTo(69.75, 133.5, 71.598, 133.333, 71.598, 133.333);
        ((GeneralPath) shape).curveTo(71.598, 133.333, 69.588, 127.274994, 68.167, 123.315994);
        ((GeneralPath) shape).curveTo(66.520996, 118.732994, 65.167, 113.49999, 65.75, 108.08299);
        ((GeneralPath) shape).curveTo(66.333, 102.66599, 69.725, 95.717995, 70.313, 92.83299);
        ((GeneralPath) shape).curveTo(70.535, 91.75099, 67.91901, 90.885994, 66.438, 84.99999);
        ((GeneralPath) shape).curveTo(60.913, 83.393, 52.833, 82.833, 52.833, 82.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFAF1F6), shape);
        TreeNode dress = new TreeNode("dress", s2, 3);

        // skirtLining
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.167, 113.083);
        ((GeneralPath) shape).curveTo(22.5, 113.75, 25.253, 112.75, 27.793, 113.583);
        ((GeneralPath) shape).curveTo(30.332998, 114.416, 32.083, 114.833, 33.833, 118.5);
        ((GeneralPath) shape).curveTo(35.583, 122.167, 41.333, 131.83301, 47.416, 132.5);
        ((GeneralPath) shape).curveTo(53.499, 133.16699, 51.999, 129.736, 53.416, 130.327);
        ((GeneralPath) shape).curveTo(54.833, 130.91699, 68.582, 135.50099, 69.999, 136.66699);
        ((GeneralPath) shape).curveTo(71.416, 137.833, 71.916, 139.91699, 71.916, 139.91699);
        ((GeneralPath) shape).curveTo(71.916, 139.91699, 72.416, 136.91699, 71.916, 134.66699);
        ((GeneralPath) shape).curveTo(71.416, 132.41699, 71.083, 131.66699, 71.083, 131.66699);
        ((GeneralPath) shape).curveTo(71.083, 131.66699, 63.844, 128.027, 60.0, 126.163994);
        ((GeneralPath) shape).curveTo(56.156, 124.300995, 55.510002, 123.13, 53.588, 123.604996);
        ((GeneralPath) shape).curveTo(51.666, 124.08199, 52.25, 126.80399, 48.833, 126.90199);
        ((GeneralPath) shape).curveTo(45.416, 126.99999, 40.682, 119.18599, 39.332, 117.11299);
        ((GeneralPath) shape).curveTo(37.982002, 115.04099, 36.717, 111.12899, 32.067, 110.64699);
        ((GeneralPath) shape).curveTo(27.417004, 110.164986, 27.083, 110.64699, 27.083, 110.64699);
        ((GeneralPath) shape).lineTo(22.167, 113.083);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF7BE65), shape);
        TreeNode skirtLining = new TreeNode("skirtLining", s2, 3);

        // shirtLining
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.375, 75.5);
        ((GeneralPath) shape).curveTo(56.416, 77.273, 52.583, 81.667, 52.083, 83.333);
        ((GeneralPath) shape).curveTo(51.583, 84.999, 51.75, 86.416, 52.083, 87.75);
        ((GeneralPath) shape).curveTo(52.416, 89.084, 53.416, 90.75, 53.416, 90.75);
        ((GeneralPath) shape).curveTo(53.416, 90.75, 51.499, 92.958, 52.083, 93.313);
        ((GeneralPath) shape).curveTo(52.667, 93.66801, 55.583, 94.417, 56.0, 94.08401);
        ((GeneralPath) shape).curveTo(56.417, 93.751015, 56.333, 91.25101, 56.333, 91.25101);
        ((GeneralPath) shape).curveTo(56.333, 91.25101, 59.583, 90.80801, 60.583, 89.27901);
        ((GeneralPath) shape).curveTo(61.583, 87.75001, 61.59, 85.25101, 61.59, 85.25101);
        ((GeneralPath) shape).lineTo(65.583, 85.75101);
        ((GeneralPath) shape).curveTo(65.583, 85.75101, 66.166, 88.25101, 67.5, 90.25101);
        ((GeneralPath) shape).curveTo(68.834, 92.25101, 70.417, 94.95901, 70.833, 93.31401);
        ((GeneralPath) shape).curveTo(71.249, 91.669014, 69.922, 91.05101, 69.25, 89.280014);
        ((GeneralPath) shape).curveTo(68.578, 87.50901, 66.333, 86.002014, 69.75, 80.335014);
        ((GeneralPath) shape).curveTo(73.167, 74.668015, 75.083, 74.79901, 74.625, 73.70602);
        ((GeneralPath) shape).curveTo(74.167, 72.61302, 72.875, 73.03902, 72.083, 73.70602);
        ((GeneralPath) shape).curveTo(71.518, 74.183014, 69.252, 75.793015, 67.919, 79.043015);
        ((GeneralPath) shape).curveTo(66.586, 82.293015, 65.917, 83.585014, 65.917, 83.585014);
        ((GeneralPath) shape).curveTo(65.917, 83.585014, 60.891, 82.897, 60.0, 82.667);
        ((GeneralPath) shape).curveTo(57.835, 82.106, 56.446, 83.625, 59.583, 84.584);
        ((GeneralPath) shape).curveTo(60.868, 84.977, 58.917, 90.257996, 55.583, 89.279);
        ((GeneralPath) shape).curveTo(52.249, 88.3, 53.422, 83.69, 54.583, 83.834);
        ((GeneralPath) shape).curveTo(57.437, 84.187996, 57.908, 82.172, 56.407, 82.098);
        ((GeneralPath) shape).curveTo(54.437, 82.0, 55.333, 80.834, 55.333, 80.834);
        ((GeneralPath) shape).curveTo(55.333, 80.834, 59.417, 75.708, 61.59, 75.0);
        ((GeneralPath) shape).curveTo(63.817, 74.274, 64.083, 74.4, 64.583, 73.775);
        ((GeneralPath) shape).curveTo(65.083, 73.15, 64.592, 72.466, 63.229, 72.875);
        ((GeneralPath) shape).curveTo(61.908, 73.272, 59.398, 74.574, 58.375, 75.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFBCF76), shape);
        TreeNode shirtLining = new TreeNode("shirtLining", s2, 3);

        root.addChild(torso);
        torso.addChild(rightHand_1_);
        torso.addChild(rightHand);
        torso.addChild(leftArm);
        torso.addChild(innerShirt);
        torso.addChild(innerSkirt);
        torso.addChild(rightCuff);
        torso.addChild(leftCuff);
        torso.addChild(dress);
        torso.addChild(skirtLining);
        torso.addChild(shirtLining);

        // backHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(46.25, 59.667);
        ((GeneralPath) shape).curveTo(46.383, 64.381, 48.75, 69.834, 48.75, 69.834);
        ((GeneralPath) shape).curveTo(48.75, 69.834, 48.833, 68.55, 49.167, 66.692);
        ((GeneralPath) shape).curveTo(49.501, 64.834, 50.834, 63.084, 50.834, 63.084);
        ((GeneralPath) shape).curveTo(50.834, 63.084, 51.334, 66.0, 52.084, 67.917);
        ((GeneralPath) shape).curveTo(52.834, 69.834, 54.767998, 71.688, 54.767998, 71.688);
        ((GeneralPath) shape).curveTo(54.767998, 71.688, 54.619, 70.917, 54.767998, 70.0);
        ((GeneralPath) shape).curveTo(54.916996, 69.083, 55.536, 67.75, 55.536, 67.75);
        ((GeneralPath) shape).curveTo(55.536, 67.75, 56.833, 69.75, 57.667, 70.417);
        ((GeneralPath) shape).curveTo(58.501, 71.084, 60.0, 71.688, 60.0, 71.688);
        ((GeneralPath) shape).curveTo(60.0, 71.688, 59.271, 69.98, 59.417, 68.334);
        ((GeneralPath) shape).curveTo(59.563, 66.687996, 66.667, 68.334, 66.667, 68.334);
        ((GeneralPath) shape).curveTo(66.667, 68.334, 71.915, 70.172, 75.75, 72.584);
        ((GeneralPath) shape).curveTo(79.917, 77.25, 82.25, 85.0, 82.25, 85.0);
        ((GeneralPath) shape).curveTo(82.25, 85.0, 83.167, 81.417, 84.583, 80.667);
        ((GeneralPath) shape).curveTo(85.999, 79.917, 90.75, 81.584, 90.75, 81.584);
        ((GeneralPath) shape).curveTo(90.75, 81.584, 88.75, 78.167, 89.75, 76.167);
        ((GeneralPath) shape).curveTo(90.75, 74.167, 93.25, 73.334, 93.25, 73.334);
        ((GeneralPath) shape).curveTo(93.25, 73.334, 87.25, 72.89, 87.167, 71.112);
        ((GeneralPath) shape).curveTo(87.084, 69.334, 88.417, 67.584, 88.417, 67.584);
        ((GeneralPath) shape).curveTo(88.417, 67.584, 82.962, 68.326996, 81.834, 65.667);
        ((GeneralPath) shape).curveTo(80.706, 63.007004, 71.333, 38.5, 59.25, 37.75);
        ((GeneralPath) shape).curveTo(47.167, 37.0, 46.25, 59.667, 46.25, 59.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x2082A9), shape);
        TreeNode backHair = new TreeNode("backHair", s2, 3);

        // hairtie
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(74.625, 72.025);
        ((GeneralPath) shape).curveTo(74.625, 72.025, 75.833, 72.65, 78.083, 71.129);
        ((GeneralPath) shape).curveTo(80.333, 69.607994, 81.583, 66.690994, 81.583, 66.690994);
        ((GeneralPath) shape).curveTo(81.583, 66.690994, 82.583, 66.814995, 82.916, 67.29499);
        ((GeneralPath) shape).curveTo(83.249, 67.77499, 82.916, 68.274994, 82.916, 68.274994);
        ((GeneralPath) shape).curveTo(82.916, 68.274994, 82.111, 70.69599, 80.348, 72.15199);
        ((GeneralPath) shape).curveTo(78.583, 73.607994, 75.833, 73.774994, 75.833, 73.774994);
        ((GeneralPath) shape).curveTo(75.833, 73.774994, 75.166, 73.44199, 75.0, 73.024994);
        ((GeneralPath) shape).curveTo(74.834, 72.607994, 74.625, 72.025, 74.625, 72.025);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xE69194), shape);
        TreeNode hairtie = new TreeNode("hairtie", s2, 3);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.083, 46.583);
        ((GeneralPath) shape).curveTo(52.083, 46.583, 53.583, 51.583, 53.333, 55.833);
        ((GeneralPath) shape).curveTo(53.083, 60.083, 52.361, 61.75, 52.722, 63.5);
        ((GeneralPath) shape).curveTo(53.083, 65.25, 60.083, 71.583, 63.749, 71.083);
        ((GeneralPath) shape).curveTo(67.415, 70.583, 76.749, 63.833, 76.749, 63.833);
        ((GeneralPath) shape).curveTo(76.749, 63.833, 77.248, 64.521, 78.582, 64.25);
        ((GeneralPath) shape).curveTo(79.916, 63.978996, 83.915, 61.167, 83.749, 55.917);
        ((GeneralPath) shape).curveTo(83.583, 50.667, 82.082, 38.833, 69.416, 36.667);
        ((GeneralPath) shape).curveTo(56.75, 34.501, 52.507, 41.184, 52.083, 46.583);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFCD9B3), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // rightEeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.25, 53.063);
        ((GeneralPath) shape).curveTo(66.25, 53.063, 66.563, 51.375, 69.313, 51.625);
        ((GeneralPath) shape).curveTo(72.063, 51.875, 74.62601, 55.375, 74.62601, 55.375);
        ((GeneralPath) shape).lineTo(72.688, 61.438);
        ((GeneralPath) shape).curveTo(72.688, 61.438, 71.438, 62.626, 69.875, 62.501);
        ((GeneralPath) shape).curveTo(68.312, 62.376, 66.875, 60.938, 66.875, 60.938);
        ((GeneralPath) shape).curveTo(66.875, 60.938, 65.438, 58.563, 66.25, 53.063);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode rightEeWhite = new TreeNode("rightEeWhite", s2, 3);

        // rightIris
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.639, 51.676);
        ((GeneralPath) shape).curveTo(67.807, 51.560997, 67.839, 54.687, 67.92, 56.75);
        ((GeneralPath) shape).curveTo(68.001, 58.813, 68.866, 60.103, 70.314995, 60.25);
        ((GeneralPath) shape).curveTo(71.76199, 60.397, 73.05499, 57.988, 72.934, 55.963);
        ((GeneralPath) shape).curveTo(72.814995, 53.938, 72.625, 53.261, 72.625, 53.261);
        ((GeneralPath) shape).curveTo(72.625, 53.261, 70.713, 51.744, 69.639, 51.676);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x069287), shape);
        TreeNode rightIris = new TreeNode("rightIris", s2, 3);

        // leftEyeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.235, 52.521);
        ((GeneralPath) shape).curveTo(53.235, 52.521, 53.375, 51.325, 55.438, 51.6);
        ((GeneralPath) shape).curveTo(57.501, 51.874996, 57.938, 54.063, 57.938, 54.063);
        ((GeneralPath) shape).curveTo(57.938, 54.063, 58.126, 54.938, 57.938, 56.688);
        ((GeneralPath) shape).curveTo(57.75, 58.438, 57.188, 60.257, 57.188, 60.257);
        ((GeneralPath) shape).curveTo(57.188, 60.257, 55.813, 61.125, 54.625, 61.0);
        ((GeneralPath) shape).curveTo(53.437, 60.875, 52.896, 59.932, 52.896, 59.932);
        ((GeneralPath) shape).curveTo(52.896, 59.932, 53.248, 57.758, 53.304, 56.286);
        ((GeneralPath) shape).curveTo(53.36, 54.814, 53.235, 52.521, 53.235, 52.521);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode leftEyeWhite = new TreeNode("leftEyeWhite", s2, 3);

        // leftIris
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.438, 51.6);
        ((GeneralPath) shape).curveTo(54.25, 53.0, 54.25, 58.875, 56.188, 59.063);
        ((GeneralPath) shape).curveTo(58.126, 59.251, 57.773, 57.806, 57.773, 57.806);
        ((GeneralPath) shape).curveTo(57.773, 57.806, 58.042, 55.938, 58.021, 54.5);
        ((GeneralPath) shape).curveTo(58.0, 53.062, 57.508, 52.609, 56.809, 52.192);
        ((GeneralPath) shape).curveTo(56.11, 51.775, 55.438, 51.6, 55.438, 51.6);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x069287), shape);
        TreeNode leftIris = new TreeNode("leftIris", s2, 3);

        // mouth
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.375, 64.063);
        ((GeneralPath) shape).lineTo(64.688, 64.063);
        ((GeneralPath) shape).curveTo(64.688, 64.063, 65.313, 69.188, 63.688004, 69.313);
        ((GeneralPath) shape).curveTo(62.063004, 69.438, 60.25, 68.0, 59.563, 66.688);
        ((GeneralPath) shape).curveTo(58.876, 65.37601, 58.375, 64.063, 58.375, 64.063);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF6B492), shape);
        TreeNode mouth = new TreeNode("mouth", s2, 3);

        // Earring
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.607, 63.945);
        ((GeneralPath) shape).curveTo(73.25, 63.732998, 74.021, 69.045, 77.187004, 69.42);
        ((GeneralPath) shape).curveTo(80.875, 69.857, 81.734, 64.146, 77.607, 63.945);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF4FCEF), shape);
        TreeNode Earring = new TreeNode("Earring", s2, 3);

        // rightEyeHighlight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.773, 52.708);
        ((GeneralPath) shape).curveTo(70.16901, 52.708, 69.837006, 55.971, 68.773, 55.964);
        ((GeneralPath) shape).curveTo(67.708, 55.957, 67.755, 52.708, 68.773, 52.708);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode rightEyeHighlight = new TreeNode("rightEyeHighlight", s2, 3);

        // leftEyeHighlight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.458, 52.708);
        ((GeneralPath) shape).curveTo(56.666, 52.708, 56.5, 55.708, 55.458, 55.666);
        ((GeneralPath) shape).curveTo(54.416, 55.624, 54.667, 52.708, 55.458, 52.708);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode leftEyeHighlight = new TreeNode("leftEyeHighlight", s2, 3);

        // frontHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.5, 32.375);
        ((GeneralPath) shape).curveTo(59.5, 31.875, 55.0, 31.625, 49.875, 38.625);
        ((GeneralPath) shape).curveTo(44.75, 45.625, 39.375, 56.75, 39.375, 56.75);
        ((GeneralPath) shape).lineTo(43.0, 53.0);
        ((GeneralPath) shape).curveTo(43.0, 53.0, 41.875, 56.0, 41.5, 59.625);
        ((GeneralPath) shape).curveTo(41.125, 63.25, 41.625, 65.625, 41.625, 65.625);
        ((GeneralPath) shape).lineTo(44.625, 57.625);
        ((GeneralPath) shape).curveTo(44.625, 57.625, 44.625, 60.625, 45.75, 63.125);
        ((GeneralPath) shape).curveTo(46.875, 65.625, 48.875, 68.125, 48.875, 68.125);
        ((GeneralPath) shape).curveTo(48.875, 68.125, 47.25, 63.625, 47.625, 58.625);
        ((GeneralPath) shape).curveTo(48.0, 53.625, 50.0, 49.5, 50.0, 49.5);
        ((GeneralPath) shape).curveTo(50.0, 49.5, 50.125, 52.25, 50.375, 54.0);
        ((GeneralPath) shape).curveTo(50.625, 55.75, 51.938, 56.875, 51.938, 56.875);
        ((GeneralPath) shape).curveTo(51.938, 56.875, 50.25, 52.75, 53.375, 47.5);
        ((GeneralPath) shape).curveTo(56.5, 42.25, 58.875, 40.625, 58.875, 40.625);
        ((GeneralPath) shape).curveTo(58.875, 40.625, 58.5, 41.625, 58.25, 43.625);
        ((GeneralPath) shape).curveTo(58.0, 45.625, 58.625, 47.5, 58.625, 47.5);
        ((GeneralPath) shape).curveTo(58.625, 47.5, 59.125, 45.312, 60.563, 43.937);
        ((GeneralPath) shape).curveTo(62.001, 42.562, 63.938, 41.624, 63.938, 41.624);
        ((GeneralPath) shape).curveTo(63.938, 41.624, 63.563, 43.312, 63.875, 45.062);
        ((GeneralPath) shape).curveTo(64.187, 46.812, 65.188, 48.437, 65.188, 48.437);
        ((GeneralPath) shape).curveTo(65.188, 48.437, 65.25101, 46.374, 65.938, 45.062);
        ((GeneralPath) shape).curveTo(66.625, 43.75, 68.188, 42.0, 68.188, 42.0);
        ((GeneralPath) shape).curveTo(68.188, 42.0, 69.938, 43.875, 70.438, 45.688);
        ((GeneralPath) shape).curveTo(70.938, 47.501, 71.313, 49.188, 71.313, 49.188);
        ((GeneralPath) shape).lineTo(72.62601, 45.438);
        ((GeneralPath) shape).curveTo(72.62601, 45.438, 74.68901, 50.438, 72.25101, 58.751);
        ((GeneralPath) shape).curveTo(69.813, 67.063995, 67.938, 71.688995, 67.938, 71.688995);
        ((GeneralPath) shape).curveTo(67.938, 71.688995, 73.37601, 70.063995, 76.313, 62.750996);
        ((GeneralPath) shape).curveTo(79.25101, 55.437996, 79.063, 54.125996, 79.063, 54.125996);
        ((GeneralPath) shape).curveTo(79.063, 54.125996, 78.688, 60.875996, 80.50101, 65.938995);
        ((GeneralPath) shape).curveTo(82.31401, 71.002, 84.12601, 71.688995, 84.12601, 71.688995);
        ((GeneralPath) shape).curveTo(84.12601, 71.688995, 83.50101, 69.91799, 84.12601, 67.33499);
        ((GeneralPath) shape).curveTo(84.75101, 64.75199, 84.66801, 64.16799, 84.66801, 64.16799);
        ((GeneralPath) shape).curveTo(84.66801, 64.16799, 85.66801, 65.33499, 87.16801, 65.91799);
        ((GeneralPath) shape).curveTo(88.66801, 66.50099, 90.66801, 66.50099, 90.66801, 66.50099);
        ((GeneralPath) shape).curveTo(90.66801, 66.50099, 89.16801, 65.16799, 88.33501, 63.66799);
        ((GeneralPath) shape).curveTo(87.50201, 62.16799, 87.58501, 60.25099, 87.58501, 60.25099);
        ((GeneralPath) shape).curveTo(87.58501, 60.25099, 88.58501, 61.41799, 90.08501, 61.66799);
        ((GeneralPath) shape).curveTo(91.58501, 61.91799, 93.83501, 61.66799, 93.83501, 61.66799);
        ((GeneralPath) shape).curveTo(93.83501, 61.66799, 90.08501, 58.33499, 88.83501, 54.25099);
        ((GeneralPath) shape).curveTo(87.58501, 50.166992, 87.41801, 45.333992, 83.83501, 40.50099);
        ((GeneralPath) shape).curveTo(80.25201, 35.66799, 76.0, 33.917, 76.0, 33.917);
        ((GeneralPath) shape).curveTo(76.0, 33.917, 76.833, 29.0, 86.833, 30.0);
        ((GeneralPath) shape).curveTo(96.833, 31.0, 98.166, 36.417, 98.166, 36.417);
        ((GeneralPath) shape).curveTo(98.166, 36.417, 98.499, 33.084, 93.916, 29.084);
        ((GeneralPath) shape).curveTo(89.333, 25.084, 86.916, 23.5, 79.666, 24.167);
        ((GeneralPath) shape).curveTo(72.416, 24.834, 69.666, 31.917, 69.666, 31.917);
        ((GeneralPath) shape).lineTo(68.249, 32.667);
        ((GeneralPath) shape).curveTo(68.249, 32.667, 66.416, 27.501, 72.999, 22.334);
        ((GeneralPath) shape).curveTo(79.582, 17.167, 84.667, 18.0, 84.667, 18.0);
        ((GeneralPath) shape).curveTo(84.667, 18.0, 83.083, 13.75, 75.0, 14.167);
        ((GeneralPath) shape).curveTo(66.917, 14.584, 63.27, 17.889, 62.667, 21.5);
        ((GeneralPath) shape).curveTo(61.417, 29.0, 64.5, 32.375, 64.5, 32.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x95CD62), shape);
        TreeNode frontHair = new TreeNode("frontHair", s2, 3);

        root.addChild(head);
        head.addChild(backHair);
        head.addChild(hairtie);
        head.addChild(face);
        head.addChild(rightEeWhite);
        head.addChild(rightIris);
        head.addChild(leftEyeWhite);
        head.addChild(leftIris);
        head.addChild(mouth);
        head.addChild(Earring);
        head.addChild(rightEyeHighlight);
        head.addChild(leftEyeHighlight);
        head.addChild(frontHair);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Marona(int width, int height) {
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

