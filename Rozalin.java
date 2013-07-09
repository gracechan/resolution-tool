

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
public class Rozalin extends Shape2d implements javax.swing.Icon {

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
    public Rozalin() {
        this(0,0);
        
        Shape shape;
        Shape2d s2;
        
        int x = 20;
        int y = 35;
        
        root = new TreeNode("ROZALIN", null, 0);
        TreeNode bottom = new TreeNode("Section: Bottom", null, 0);
        TreeNode torso = new TreeNode("Section: Torso", null, 0);
        TreeNode head = new TreeNode("Section: Head", null, 0);

        // dressBottomLayer
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(257.0, 289.333);
        ((GeneralPath) shape).curveTo(257.0, 289.333, 266.0, 286.66702, 269.667, 291.0);
        ((GeneralPath) shape).curveTo(273.33398, 295.33298, 270.33398, 295.333, 274.667, 296.333);
        ((GeneralPath) shape).curveTo(279.0, 297.333, 277.667, 306.001, 279.667, 309.667);
        ((GeneralPath) shape).curveTo(281.667, 313.33298, 289.667, 309.0, 289.667, 314.0);
        ((GeneralPath) shape).curveTo(289.667, 319.0, 281.33398, 317.667, 283.0, 323.0);
        ((GeneralPath) shape).curveTo(284.66602, 328.333, 291.0, 326.667, 288.667, 334.0);
        ((GeneralPath) shape).curveTo(286.33398, 341.333, 277.33398, 336.333, 268.667, 341.333);
        ((GeneralPath) shape).curveTo(260.0, 346.333, 260.0, 354.334, 254.0, 356.667);
        ((GeneralPath) shape).curveTo(248.0, 358.99997, 252.333, 347.666, 246.66699, 351.33298);
        ((GeneralPath) shape).curveTo(241.00099, 354.99997, 235.33398, 373.33298, 225.0, 376.33298);
        ((GeneralPath) shape).curveTo(214.66602, 379.33298, 221.333, 369.33298, 213.66699, 369.99997);
        ((GeneralPath) shape).curveTo(206.00099, 370.66696, 200.33398, 380.33298, 184.66699, 383.33298);
        ((GeneralPath) shape).curveTo(169.0, 386.33298, 171.333, 374.0, 161.0, 376.0);
        ((GeneralPath) shape).curveTo(150.667, 378.0, 150.66699, 384.667, 136.66699, 385.0);
        ((GeneralPath) shape).curveTo(122.66699, 385.333, 122.33399, 384.333, 125.66699, 372.0);
        ((GeneralPath) shape).curveTo(129.0, 359.667, 111.333, 337.667, 97.0, 351.0);
        ((GeneralPath) shape).curveTo(82.667, 364.333, 78.0, 373.333, 78.0, 373.333);
        ((GeneralPath) shape).curveTo(78.0, 373.333, 71.333, 374.0, 68.667, 370.0);
        ((GeneralPath) shape).curveTo(66.001, 366.0, 65.334, 361.001, 59.334, 361.667);
        ((GeneralPath) shape).curveTo(53.334, 362.33298, 57.001, 370.667, 51.334, 369.0);
        ((GeneralPath) shape).curveTo(45.667, 367.333, 43.334, 365.333, 41.667, 359.0);
        ((GeneralPath) shape).curveTo(40.0, 352.667, 44.667, 352.999, 40.334, 342.333);
        ((GeneralPath) shape).curveTo(36.001, 331.66702, 33.334, 348.66702, 27.334, 340.66702);
        ((GeneralPath) shape).curveTo(21.334, 332.66702, 21.667, 330.99902, 23.334, 327.333);
        ((GeneralPath) shape).curveTo(25.001, 323.667, 26.334, 329.66702, 30.001, 323.66702);
        ((GeneralPath) shape).curveTo(33.668, 317.66702, 26.001, 314.66702, 32.001, 309.66702);
        ((GeneralPath) shape).curveTo(38.001, 304.66702, 70.334, 285.99902, 108.334, 288.333);
        ((GeneralPath) shape).curveTo(146.334, 290.667, 257.0, 289.333, 257.0, 289.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xAC4559), shape);
        TreeNode dressBottomLayer = new TreeNode("dressBottomLayer", s2, 3);

        // backBow
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(104.333, 201.667);
        ((GeneralPath) shape).curveTo(112.0, 197.0, 103.667, 170.0, 109.667, 166.0);
        ((GeneralPath) shape).curveTo(115.667, 162.0, 115.0, 169.0, 128.66699, 173.0);
        ((GeneralPath) shape).curveTo(142.33398, 177.0, 157.0, 178.0, 161.0, 182.0);
        ((GeneralPath) shape).curveTo(165.0, 186.0, 168.33301, 190.0, 168.33301, 190.0);
        ((GeneralPath) shape).curveTo(168.33301, 190.0, 198.66602, 178.0, 217.33301, 174.0);
        ((GeneralPath) shape).curveTo(236.0, 170.0, 264.333, 169.33301, 267.0, 172.667);
        ((GeneralPath) shape).curveTo(269.667, 176.001, 258.667, 179.33401, 257.0, 189.0);
        ((GeneralPath) shape).curveTo(255.33301, 198.66599, 253.0, 199.0, 249.0, 202.0);
        ((GeneralPath) shape).curveTo(245.0, 205.0, 245.667, 211.66699, 244.66699, 217.66699);
        ((GeneralPath) shape).curveTo(243.66698, 223.66699, 241.0, 225.333, 241.0, 225.333);
        ((GeneralPath) shape).curveTo(241.0, 225.333, 276.667, 223.0, 286.0, 228.0);
        ((GeneralPath) shape).curveTo(295.333, 233.0, 292.0, 235.66699, 301.333, 238.0);
        ((GeneralPath) shape).curveTo(310.66602, 240.33301, 315.333, 241.0, 315.333, 241.0);
        ((GeneralPath) shape).curveTo(315.333, 241.0, 298.667, 243.0, 291.0, 242.0);
        ((GeneralPath) shape).curveTo(283.333, 241.0, 271.667, 239.667, 271.667, 239.667);
        ((GeneralPath) shape).curveTo(271.667, 239.667, 267.0, 241.001, 268.667, 245.667);
        ((GeneralPath) shape).curveTo(270.33398, 250.33301, 283.0, 255.667, 284.667, 264.0);
        ((GeneralPath) shape).curveTo(286.33398, 272.333, 286.33398, 272.333, 286.33398, 272.333);
        ((GeneralPath) shape).curveTo(286.33398, 272.333, 300.0, 284.0, 307.667, 293.0);
        ((GeneralPath) shape).curveTo(315.33398, 302.0, 322.667, 307.667, 319.33398, 309.667);
        ((GeneralPath) shape).curveTo(316.00098, 311.667, 304.0, 298.667, 293.667, 292.0);
        ((GeneralPath) shape).curveTo(283.33398, 285.333, 228.0, 246.667, 228.0, 246.667);
        ((GeneralPath) shape).lineTo(104.333, 201.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x78355B), shape);
        TreeNode backBow = new TreeNode("backBow", s2, 3);

        // dressTopLayer
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(194.0, 211.333);
        ((GeneralPath) shape).curveTo(194.0, 211.333, 205.33301, 214.66599, 215.0, 231.333);
        ((GeneralPath) shape).curveTo(224.66699, 248.0, 244.0, 281.999, 249.33301, 285.333);
        ((GeneralPath) shape).curveTo(254.66602, 288.66702, 259.333, 283.999, 265.333, 284.333);
        ((GeneralPath) shape).curveTo(271.333, 284.66702, 275.66602, 288.66702, 275.66602, 288.66702);
        ((GeneralPath) shape).curveTo(275.66602, 288.66702, 263.333, 282.66602, 264.66602, 291.333);
        ((GeneralPath) shape).curveTo(265.99902, 300.0, 272.333, 299.667, 269.0, 305.0);
        ((GeneralPath) shape).curveTo(265.667, 310.333, 258.0, 308.334, 259.333, 311.667);
        ((GeneralPath) shape).curveTo(260.66602, 314.99997, 257.66602, 329.00098, 246.66602, 335.33398);
        ((GeneralPath) shape).curveTo(235.66602, 341.667, 240.33301, 333.667, 235.33301, 334.667);
        ((GeneralPath) shape).curveTo(230.33301, 335.667, 229.99901, 352.00098, 216.66602, 350.33398);
        ((GeneralPath) shape).curveTo(203.33302, 348.667, 214.66602, 339.0, 209.33301, 338.667);
        ((GeneralPath) shape).curveTo(204.0, 338.33398, 183.33301, 359.333, 177.33301, 357.667);
        ((GeneralPath) shape).curveTo(171.33301, 356.00098, 179.33301, 349.0, 171.66602, 348.667);
        ((GeneralPath) shape).curveTo(163.99902, 348.33398, 157.66602, 356.667, 146.66602, 352.33398);
        ((GeneralPath) shape).curveTo(135.66602, 348.00098, 145.66602, 343.33298, 137.99902, 335.667);
        ((GeneralPath) shape).curveTo(130.33203, 328.001, 124.66602, 302.668, 110.66602, 299.00098);
        ((GeneralPath) shape).curveTo(96.66602, 295.33395, 78.00002, 306.66797, 77.33302, 314.00098);
        ((GeneralPath) shape).curveTo(76.66602, 321.33398, 81.33302, 321.99997, 80.00002, 329.667);
        ((GeneralPath) shape).curveTo(78.66702, 337.334, 74.00002, 340.00098, 68.00002, 337.001);
        ((GeneralPath) shape).curveTo(62.000023, 334.00104, 66.66702, 328.001, 60.667023, 322.334);
        ((GeneralPath) shape).curveTo(54.667023, 316.66702, 43.000023, 311.334, 43.000023, 319.334);
        ((GeneralPath) shape).curveTo(43.000023, 327.334, 37.667023, 320.001, 33.667023, 316.334);
        ((GeneralPath) shape).curveTo(29.667023, 312.66702, 20.0, 313.001, 30.0, 305.001);
        ((GeneralPath) shape).curveTo(40.0, 297.001, 33.0, 296.334, 34.0, 287.334);
        ((GeneralPath) shape).curveTo(35.0, 278.334, 60.0, 235.333, 87.0, 222.0);
        ((GeneralPath) shape).curveTo(114.0, 208.667, 122.333, 213.0, 149.0, 220.0);
        ((GeneralPath) shape).curveTo(175.66699, 227.0, 194.0, 211.333, 194.0, 211.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x453559), shape);
        TreeNode dressTopLayer = new TreeNode("dressTopLayer", s2, 3);

        // leftBowRibbon
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(96.25, 212.25);
        ((GeneralPath) shape).lineTo(98.75, 220.75);
        ((GeneralPath) shape).curveTo(98.75, 220.75, 67.25, 236.0, 55.5, 250.75);
        ((GeneralPath) shape).curveTo(43.75, 265.5, 58.0, 262.5, 67.0, 251.75);
        ((GeneralPath) shape).curveTo(76.0, 241.0, 83.5, 226.0, 83.5, 226.0);
        ((GeneralPath) shape).lineTo(104.25, 225.25);
        ((GeneralPath) shape).curveTo(104.25, 225.25, 91.75, 250.25, 84.75, 270.5);
        ((GeneralPath) shape).curveTo(77.75, 290.75, 77.25, 307.75, 76.0, 308.5);
        ((GeneralPath) shape).curveTo(74.75, 309.25, 67.0, 296.25, 68.25, 290.75);
        ((GeneralPath) shape).curveTo(69.5, 285.25, 79.0, 279.0, 80.0, 275.25);
        ((GeneralPath) shape).curveTo(81.0, 271.5, 80.5, 256.25, 80.5, 256.25);
        ((GeneralPath) shape).curveTo(80.5, 256.25, 61.0, 278.0, 54.0, 280.75);
        ((GeneralPath) shape).curveTo(47.0, 283.5, 38.25, 283.0, 42.0, 270.25);
        ((GeneralPath) shape).curveTo(45.75, 257.5, 40.75, 260.5, 51.0, 250.25);
        ((GeneralPath) shape).curveTo(61.25, 240.0, 65.25, 229.5, 76.25, 223.0);
        ((GeneralPath) shape).curveTo(87.25, 216.5, 96.25, 212.25, 96.25, 212.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xD6AE6E), shape);
        TreeNode leftBowRibbon = new TreeNode("leftBowRibbon", s2, 3);

        // rightBowRibbon
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(117.5, 216.75);
        ((GeneralPath) shape).curveTo(117.5, 216.75, 124.0, 230.5, 123.0, 236.0);
        ((GeneralPath) shape).curveTo(122.0, 241.5, 117.75, 242.75, 118.25, 248.75);
        ((GeneralPath) shape).curveTo(118.75, 254.75, 125.25, 254.75, 126.5, 260.5);
        ((GeneralPath) shape).curveTo(127.75, 266.25, 115.25, 269.0, 124.0, 289.75);
        ((GeneralPath) shape).curveTo(132.75, 310.5, 136.5, 311.0, 136.5, 311.0);
        ((GeneralPath) shape).curveTo(136.5, 311.0, 128.75, 277.25, 128.0, 268.25);
        ((GeneralPath) shape).curveTo(127.25, 259.25, 125.0, 234.75, 125.0, 234.75);
        ((GeneralPath) shape).curveTo(125.0, 234.75, 140.0, 281.25, 149.75, 290.0);
        ((GeneralPath) shape).curveTo(159.5, 298.75, 183.0, 312.25, 213.25, 300.75);
        ((GeneralPath) shape).curveTo(243.5, 289.25, 248.75, 272.0, 238.75, 255.5);
        ((GeneralPath) shape).curveTo(228.75, 239.0, 214.0, 227.5, 214.0, 227.5);
        ((GeneralPath) shape).curveTo(214.0, 227.5, 229.0, 243.5, 229.0, 254.25);
        ((GeneralPath) shape).curveTo(229.0, 265.0, 225.25, 272.5, 197.0, 271.5);
        ((GeneralPath) shape).curveTo(168.75, 270.5, 140.0, 234.25, 140.0, 234.25);
        ((GeneralPath) shape).lineTo(117.5, 216.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xD6AE6E), shape);
        TreeNode rightBowRibbon = new TreeNode("rightBowRibbon", s2, 3);

        // frontSash
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(109.0, 212.667);
        ((GeneralPath) shape).lineTo(121.667, 213.33301);
        ((GeneralPath) shape).curveTo(121.667, 213.33301, 114.0, 245.0, 119.667, 284.0);
        ((GeneralPath) shape).curveTo(125.334, 323.0, 128.66699, 338.333, 129.334, 352.333);
        ((GeneralPath) shape).curveTo(130.001, 366.333, 126.334, 370.333, 126.334, 370.333);
        ((GeneralPath) shape).curveTo(126.334, 370.333, 123.334, 367.999, 119.001, 370.333);
        ((GeneralPath) shape).curveTo(114.668, 372.66702, 112.334, 375.001, 109.001, 371.66702);
        ((GeneralPath) shape).curveTo(105.668, 368.33304, 105.0, 362.0, 99.667, 364.0);
        ((GeneralPath) shape).curveTo(94.334, 366.0, 86.0, 365.0, 86.0, 365.0);
        ((GeneralPath) shape).curveTo(86.0, 365.0, 89.667, 351.333, 88.667, 341.0);
        ((GeneralPath) shape).curveTo(87.667, 330.667, 88.667, 298.0, 93.667, 274.0);
        ((GeneralPath) shape).curveTo(98.667, 250.0, 109.0, 212.667, 109.0, 212.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xB0C4D5), shape);
        TreeNode frontSash = new TreeNode("frontSash", s2, 3);

        root.addChild(bottom);
        bottom.addChild(dressBottomLayer);
        bottom.addChild(backBow);
        bottom.addChild(dressTopLayer);
        bottom.addChild(leftBowRibbon);
        bottom.addChild(rightBowRibbon);
        bottom.addChild(frontSash);

        // backWing
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(86.667, 100.0);
        ((GeneralPath) shape).curveTo(88.167, 99.5, 95.334, 105.167, 99.167, 109.5);
        ((GeneralPath) shape).curveTo(103.0, 113.833, 101.667, 113.833, 104.5, 114.0);
        ((GeneralPath) shape).curveTo(107.333, 114.167, 105.0, 109.5, 106.667, 109.5);
        ((GeneralPath) shape).curveTo(108.334, 109.5, 118.667, 124.833, 124.0, 125.0);
        ((GeneralPath) shape).curveTo(129.33301, 125.167, 143.5, 121.333, 155.5, 128.333);
        ((GeneralPath) shape).curveTo(167.5, 135.33298, 177.5, 136.5, 184.33301, 134.333);
        ((GeneralPath) shape).curveTo(191.16602, 132.16599, 210.5, 116.49999, 210.33301, 117.33299);
        ((GeneralPath) shape).curveTo(210.16602, 118.16599, 204.66602, 142.333, 204.66602, 142.333);
        ((GeneralPath) shape).curveTo(204.66602, 142.333, 157.33301, 159.16599, 137.83301, 151.66599);
        ((GeneralPath) shape).curveTo(118.33301, 144.16599, 99.5, 134.5, 94.0, 121.167);
        ((GeneralPath) shape).curveTo(88.5, 107.834, 86.667, 100.0, 86.667, 100.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x393343), shape);
        TreeNode backWing = new TreeNode("backWing", s2, 3);

        // scarfBack
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(157.625, 122.875);
        ((GeneralPath) shape).curveTo(161.25, 119.0, 171.125, 111.75, 175.375, 109.75);
        ((GeneralPath) shape).curveTo(179.625, 107.75, 187.875, 107.375, 187.875, 107.375);
        ((GeneralPath) shape).curveTo(187.875, 107.375, 188.625, 112.125, 187.375, 114.75);
        ((GeneralPath) shape).curveTo(186.125, 117.375, 183.75, 124.0, 185.25, 127.875);
        ((GeneralPath) shape).curveTo(186.75, 131.75, 191.5, 133.5, 190.625, 135.375);
        ((GeneralPath) shape).curveTo(189.75, 137.25, 182.875, 137.25, 181.0, 138.375);
        ((GeneralPath) shape).curveTo(179.125, 139.5, 178.75, 140.375, 178.75, 140.375);
        ((GeneralPath) shape).curveTo(178.75, 140.375, 185.375, 145.75, 185.125, 147.375);
        ((GeneralPath) shape).curveTo(184.875, 149.0, 184.125, 151.875, 185.25, 153.5);
        ((GeneralPath) shape).curveTo(186.375, 155.125, 189.25, 156.625, 189.75, 158.875);
        ((GeneralPath) shape).curveTo(190.25, 161.125, 193.75, 165.75, 194.75, 167.25);
        ((GeneralPath) shape).curveTo(195.75, 168.75, 201.25, 171.625, 200.5, 172.0);
        ((GeneralPath) shape).curveTo(199.75, 172.375, 191.75, 167.875, 189.5, 164.5);
        ((GeneralPath) shape).curveTo(187.25, 161.125, 183.75, 157.75, 183.75, 157.75);
        ((GeneralPath) shape).lineTo(175.0, 157.875);
        ((GeneralPath) shape).lineTo(156.75, 133.0);
        ((GeneralPath) shape).lineTo(157.625, 122.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x9D3A50), shape);
        TreeNode scarfBack = new TreeNode("scarfBack", s2, 3);

        // chest
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(162.833, 145.333);
        ((GeneralPath) shape).curveTo(164.517, 151.349, 165.66599, 160.333, 159.5, 167.66599);
        ((GeneralPath) shape).curveTo(153.33401, 174.99898, 144.83301, 173.33298, 138.5, 171.83298);
        ((GeneralPath) shape).curveTo(132.16699, 170.33298, 127.667, 158.5, 127.667, 158.5);
        ((GeneralPath) shape).curveTo(127.667, 158.5, 117.0, 149.0, 124.5, 142.833);
        ((GeneralPath) shape).curveTo(132.0, 136.66599, 130.581, 141.08199, 136.33301, 135.333);
        ((GeneralPath) shape).lineTo(141.33301, 125.99999);
        ((GeneralPath) shape).lineTo(151.0, 125.66699);
        ((GeneralPath) shape).curveTo(151.0, 125.66699, 151.333, 131.33398, 154.833, 131.5);
        ((GeneralPath) shape).curveTo(158.333, 131.66602, 162.16599, 131.0, 162.16599, 131.0);
        ((GeneralPath) shape).curveTo(162.16599, 131.0, 161.667, 141.167, 162.833, 145.333);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFEEE7), shape);
        TreeNode chest = new TreeNode("chest", s2, 3);

        // rightShoulder
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(158.167, 131.833);
        ((GeneralPath) shape).curveTo(162.0, 131.0, 165.33401, 127.83299, 171.167, 133.5);
        ((GeneralPath) shape).curveTo(177.0, 139.167, 176.83401, 145.33301, 176.83401, 156.83301);
        ((GeneralPath) shape).curveTo(176.83401, 168.33301, 174.50002, 167.33301, 172.16702, 168.0);
        ((GeneralPath) shape).curveTo(169.83403, 168.66699, 164.33401, 163.66699, 163.00003, 156.33301);
        ((GeneralPath) shape).curveTo(161.66605, 148.99902, 158.167, 131.833, 158.167, 131.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFEEE7), shape);
        TreeNode rightShoulder = new TreeNode("rightShoulder", s2, 3);

        // rightHand
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(183.0, 239.667);
        ((GeneralPath) shape).curveTo(183.833, 242.0, 185.167, 244.33301, 187.33301, 245.0);
        ((GeneralPath) shape).curveTo(189.49901, 245.66699, 190.50002, 247.501, 191.83301, 247.667);
        ((GeneralPath) shape).curveTo(193.166, 247.83301, 194.33301, 246.167, 194.33301, 246.167);
        ((GeneralPath) shape).lineTo(191.33301, 242.667);
        ((GeneralPath) shape).curveTo(191.33301, 242.667, 195.166, 243.001, 197.16602, 244.167);
        ((GeneralPath) shape).curveTo(199.16603, 245.33301, 201.83301, 248.667, 201.83301, 248.667);
        ((GeneralPath) shape).lineTo(204.00002, 248.83301);
        ((GeneralPath) shape).curveTo(204.00002, 248.83301, 204.66702, 249.83401, 205.50002, 249.667);
        ((GeneralPath) shape).curveTo(206.33301, 249.5, 206.00002, 248.667, 206.00002, 247.0);
        ((GeneralPath) shape).curveTo(206.00002, 245.333, 205.50002, 241.5, 205.50002, 241.5);
        ((GeneralPath) shape).curveTo(205.50002, 241.5, 206.33301, 242.167, 207.00002, 241.167);
        ((GeneralPath) shape).curveTo(207.66702, 240.167, 208.00002, 237.83301, 207.00002, 236.33301);
        ((GeneralPath) shape).curveTo(206.00002, 234.83301, 193.16702, 231.667, 193.16702, 231.667);
        ((GeneralPath) shape).lineTo(183.0, 239.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFEEE7), shape);
        TreeNode rightHand = new TreeNode("rightHand", s2, 3);

        // leftShoulder
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(142.833, 127.667);
        ((GeneralPath) shape).curveTo(139.70099, 124.536, 136.16599, 125.167, 132.333, 127.167);
        ((GeneralPath) shape).curveTo(128.5, 129.16699, 118.0, 134.833, 118.0, 134.833);
        ((GeneralPath) shape).curveTo(118.0, 134.833, 112.167, 141.5, 117.0, 143.5);
        ((GeneralPath) shape).curveTo(121.833, 145.5, 139.5, 135.83301, 139.5, 135.83301);
        ((GeneralPath) shape).curveTo(139.5, 135.83301, 145.667, 130.5, 142.833, 127.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF7DAD0), shape);
        TreeNode leftShoulder = new TreeNode("leftShoulder", s2, 3);

        // leftGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(118.0, 133.5);
        ((GeneralPath) shape).curveTo(118.0, 133.5, 120.333, 135.833, 120.833, 139.5);
        ((GeneralPath) shape).curveTo(121.333, 143.167, 119.666, 146.66699, 119.666, 146.66699);
        ((GeneralPath) shape).lineTo(102.166, 154.66699);
        ((GeneralPath) shape).curveTo(102.166, 154.66699, 105.833, 159.66699, 107.333, 165.5);
        ((GeneralPath) shape).curveTo(108.833, 171.33301, 112.0, 182.833, 114.0, 186.667);
        ((GeneralPath) shape).curveTo(116.0, 190.50102, 122.0, 196.5, 122.0, 196.5);
        ((GeneralPath) shape).curveTo(122.0, 196.5, 119.833, 201.83301, 115.167, 202.5);
        ((GeneralPath) shape).curveTo(110.501, 203.16699, 108.0, 204.0, 105.5, 202.0);
        ((GeneralPath) shape).curveTo(103.0, 200.0, 103.0, 198.667, 103.0, 198.667);
        ((GeneralPath) shape).curveTo(103.0, 198.667, 105.0, 197.001, 105.833, 193.33401);
        ((GeneralPath) shape).curveTo(106.666, 189.66702, 96.5, 172.0, 95.167, 169.167);
        ((GeneralPath) shape).curveTo(93.834, 166.33401, 86.167, 153.167, 87.5, 149.83401);
        ((GeneralPath) shape).curveTo(88.833, 146.50102, 118.0, 133.5, 118.0, 133.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x6A4E67), shape);
        TreeNode leftGlove = new TreeNode("leftGlove", s2, 3);

        // corset
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(125.833, 140.0);
        ((GeneralPath) shape).curveTo(125.833, 140.0, 114.666, 148.33301, 118.666, 154.5);
        ((GeneralPath) shape).curveTo(122.666, 160.66699, 127.499, 162.0, 127.499, 162.0);
        ((GeneralPath) shape).curveTo(127.499, 162.0, 135.332, 177.66699, 127.832, 186.83301);
        ((GeneralPath) shape).curveTo(120.332, 195.99902, 105.332, 203.66602, 105.332, 203.66602);
        ((GeneralPath) shape).curveTo(105.332, 203.66602, 121.25, 228.5, 145.25, 228.0);
        ((GeneralPath) shape).curveTo(169.25, 227.5, 187.0, 215.5, 187.0, 215.5);
        ((GeneralPath) shape).curveTo(187.0, 215.5, 181.25, 203.0, 169.25, 196.25);
        ((GeneralPath) shape).curveTo(157.25, 189.5, 158.0, 181.5, 159.25, 175.5);
        ((GeneralPath) shape).curveTo(160.5, 169.5, 163.167, 162.16699, 163.167, 162.16699);
        ((GeneralPath) shape).lineTo(161.5, 158.334);
        ((GeneralPath) shape).curveTo(161.5, 158.334, 162.5, 153.16699, 162.0, 150.66699);
        ((GeneralPath) shape).curveTo(161.5, 148.16699, 160.833, 145.33398, 160.833, 145.33398);
        ((GeneralPath) shape).curveTo(160.833, 145.33398, 158.0, 143.33398, 151.5, 148.00099);
        ((GeneralPath) shape).curveTo(145.0, 152.668, 140.5, 157.33398, 140.5, 157.33398);
        ((GeneralPath) shape).lineTo(137.0, 156.83398);
        ((GeneralPath) shape).curveTo(137.0, 156.83398, 134.333, 150.50098, 131.83301, 146.83398);
        ((GeneralPath) shape).curveTo(129.33302, 143.16699, 125.833, 140.0, 125.833, 140.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x453559), shape);
        TreeNode corset = new TreeNode("corset", s2, 3);

        // corsetMiddle
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(136.958, 156.5);
        ((GeneralPath) shape).lineTo(140.75, 157.25);
        ((GeneralPath) shape).curveTo(140.75, 157.25, 143.792, 171.66699, 140.792, 183.66699);
        ((GeneralPath) shape).curveTo(137.938, 195.08398, 130.125, 207.83398, 130.125, 207.83398);
        ((GeneralPath) shape).lineTo(125.458, 205.99898);
        ((GeneralPath) shape).curveTo(125.458, 205.99898, 134.45801, 192.83298, 136.45801, 182.99898);
        ((GeneralPath) shape).curveTo(138.714, 171.911, 136.958, 156.5, 136.958, 156.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x783A5B), shape);
        TreeNode corsetMiddle = new TreeNode("corsetMiddle", s2, 3);

        // bottomBroochGold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(136.5, 161.667);
        ((GeneralPath) shape).lineTo(133.333, 157.167);
        ((GeneralPath) shape).lineTo(131.66599, 161.83401);
        ((GeneralPath) shape).curveTo(131.66599, 161.83401, 121.665985, 160.83401, 122.665985, 161.667);
        ((GeneralPath) shape).curveTo(123.665985, 162.5, 130.33298, 169.5, 130.33298, 169.5);
        ((GeneralPath) shape).lineTo(127.83298, 174.5);
        ((GeneralPath) shape).lineTo(137.83298, 171.167);
        ((GeneralPath) shape).lineTo(144.49997, 176.33401);
        ((GeneralPath) shape).lineTo(149.333, 166.0);
        ((GeneralPath) shape).lineTo(141.333, 160.16699);
        ((GeneralPath) shape).lineTo(139.5, 162.16699);
        ((GeneralPath) shape).lineTo(136.5, 161.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF4D28C), shape);
        TreeNode bottomBroochGold = new TreeNode("bottomBroochGold", s2, 3);

        // dressTopRibbon
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(140.25, 211.25);
        ((GeneralPath) shape).curveTo(142.5, 208.25, 153.5, 218.0, 163.0, 218.0);
        ((GeneralPath) shape).curveTo(172.5, 218.0, 185.0, 203.0, 183.5, 202.5);
        ((GeneralPath) shape).curveTo(182.0, 202.0, 177.0, 200.0, 177.0, 200.0);
        ((GeneralPath) shape).curveTo(177.0, 200.0, 190.0, 193.25, 194.25, 198.5);
        ((GeneralPath) shape).curveTo(198.5, 203.75, 193.0, 203.0, 196.5, 207.5);
        ((GeneralPath) shape).curveTo(200.0, 212.0, 204.25, 217.25, 204.25, 217.25);
        ((GeneralPath) shape).curveTo(204.25, 217.25, 201.5, 227.5, 189.0, 230.5);
        ((GeneralPath) shape).curveTo(176.5, 233.5, 158.75, 230.5, 146.5, 219.5);
        ((GeneralPath) shape).curveTo(134.25, 208.5, 140.25, 211.25, 140.25, 211.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xAB465E), shape);
        TreeNode dressTopRibbon = new TreeNode("dressTopRibbon", s2, 3);

        // rightGlove
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(165.0, 162.833);
        ((GeneralPath) shape).curveTo(165.0, 162.833, 167.333, 164.16599, 171.5, 163.833);
        ((GeneralPath) shape).curveTo(175.667, 163.5, 177.5, 161.0, 177.5, 161.0);
        ((GeneralPath) shape).curveTo(177.5, 161.0, 177.333, 169.66699, 177.833, 173.33301);
        ((GeneralPath) shape).curveTo(178.333, 176.99902, 182.16599, 183.66602, 183.5, 188.0);
        ((GeneralPath) shape).curveTo(184.83401, 192.33398, 185.833, 215.834, 189.83301, 224.16699);
        ((GeneralPath) shape).curveTo(193.83302, 232.49998, 197.5, 231.833, 197.5, 231.833);
        ((GeneralPath) shape).curveTo(197.5, 231.833, 194.5, 235.16599, 189.16699, 236.833);
        ((GeneralPath) shape).curveTo(183.83398, 238.5, 183.66699, 242.333, 183.66699, 242.333);
        ((GeneralPath) shape).curveTo(183.66699, 242.333, 179.66699, 237.50099, 180.49998, 235.66699);
        ((GeneralPath) shape).curveTo(181.33298, 233.833, 183.33298, 228.0, 179.49998, 217.5);
        ((GeneralPath) shape).curveTo(175.66699, 207.0, 169.83298, 192.0, 170.49998, 186.0);
        ((GeneralPath) shape).curveTo(171.16699, 180.0, 167.167, 165.833, 165.0, 162.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x6A4E67), shape);
        TreeNode rightGlove = new TreeNode("rightGlove", s2, 3);

        // rightWing
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(151.5, 159.167);
        ((GeneralPath) shape).curveTo(151.5, 159.167, 167.16699, 150.0, 176.16699, 147.667);
        ((GeneralPath) shape).curveTo(185.16699, 145.33401, 194.0, 143.0, 199.333, 135.833);
        ((GeneralPath) shape).curveTo(204.66599, 128.66599, 211.16599, 116.16599, 211.16599, 116.16599);
        ((GeneralPath) shape).curveTo(211.16599, 116.16599, 208.49898, 122.66599, 213.66599, 124.49899);
        ((GeneralPath) shape).curveTo(218.833, 126.33199, 238.33298, 123.49899, 245.499, 118.83199);
        ((GeneralPath) shape).curveTo(252.66501, 114.16499, 257.666, 109.33199, 257.666, 109.33199);
        ((GeneralPath) shape).curveTo(257.666, 109.33199, 250.333, 126.5, 236.0, 134.667);
        ((GeneralPath) shape).curveTo(221.667, 142.83401, 198.5, 151.5, 189.0, 152.5);
        ((GeneralPath) shape).curveTo(179.5, 153.5, 169.5, 151.333, 151.5, 159.167);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x59475D), shape);
        TreeNode rightWing = new TreeNode("rightWing", s2, 3);

        // leftWing
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.0, 85.5);
        ((GeneralPath) shape).curveTo(84.0, 85.5, 81.833, 97.333, 82.667, 102.5);
        ((GeneralPath) shape).curveTo(83.501, 107.667, 83.667, 120.333, 99.667, 134.66699);
        ((GeneralPath) shape).curveTo(115.667, 149.00098, 119.0, 154.83398, 120.167, 154.33398);
        ((GeneralPath) shape).curveTo(121.334, 153.83398, 113.0, 141.33398, 107.667, 133.50098);
        ((GeneralPath) shape).curveTo(102.334, 125.66797, 105.0, 118.66798, 92.667, 103.83398);
        ((GeneralPath) shape).curveTo(81.363, 90.24, 87.5, 84.833, 84.0, 85.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x59475D), shape);
        TreeNode leftWing = new TreeNode("leftWing", s2, 3);

        // bottomBroochJewel
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(138.125, 162.625);
        ((GeneralPath) shape).curveTo(143.375, 163.125, 142.02, 172.102, 138.5, 171.83301);
        ((GeneralPath) shape).curveTo(134.125, 171.5, 134.017, 162.234, 138.125, 162.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x83B3DB), shape);
        TreeNode bottomBroochJewel = new TreeNode("bottomBroochJewel", s2, 3);

        // scarfFront
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(133.125, 125.375);
        ((GeneralPath) shape).curveTo(133.125, 125.375, 136.375, 125.875, 138.625, 127.125);
        ((GeneralPath) shape).curveTo(140.875, 128.375, 142.25, 129.875, 142.25, 129.875);
        ((GeneralPath) shape).curveTo(142.25, 129.875, 136.125, 132.875, 138.375, 134.25);
        ((GeneralPath) shape).curveTo(140.625, 135.625, 140.375, 133.875, 145.0, 133.5);
        ((GeneralPath) shape).curveTo(149.625, 133.125, 150.0, 136.0, 150.375, 137.75);
        ((GeneralPath) shape).curveTo(150.75, 139.5, 149.5, 141.125, 150.75, 141.375);
        ((GeneralPath) shape).curveTo(152.0, 141.625, 156.25, 137.25, 158.875, 134.375);
        ((GeneralPath) shape).curveTo(161.5, 131.5, 162.25, 127.0, 162.125, 124.25);
        ((GeneralPath) shape).curveTo(162.0, 121.5, 159.125, 113.625, 159.125, 113.625);
        ((GeneralPath) shape).lineTo(133.25, 116.875);
        ((GeneralPath) shape).lineTo(133.125, 125.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x9D3A50), shape);
        TreeNode scarfFront = new TreeNode("scarfFront", s2, 3);

        // topBroochGold
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(134.875, 132.5);
        ((GeneralPath) shape).lineTo(137.5, 136.875);
        ((GeneralPath) shape).lineTo(134.0, 140.75);
        ((GeneralPath) shape).lineTo(137.875, 143.125);
        ((GeneralPath) shape).lineTo(139.875, 148.75);
        ((GeneralPath) shape).lineTo(143.75, 143.875);
        ((GeneralPath) shape).lineTo(148.5, 144.875);
        ((GeneralPath) shape).lineTo(146.75, 139.375);
        ((GeneralPath) shape).lineTo(151.0, 133.25);
        ((GeneralPath) shape).lineTo(146.0, 133.75);
        ((GeneralPath) shape).lineTo(144.5, 127.75);
        ((GeneralPath) shape).lineTo(139.875, 133.375);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF4D28C), shape);
        TreeNode topBroochGold = new TreeNode("topBroochGold", s2, 3);

        // topBroochJewel
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(142.875, 134.625);
        ((GeneralPath) shape).curveTo(145.848, 135.175, 145.75, 141.875, 142.0, 141.625);
        ((GeneralPath) shape).curveTo(138.25, 141.375, 139.5, 134.0, 142.875, 134.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x83B3DB), shape);
        TreeNode topBroochJewel = new TreeNode("topBroochJewel", s2, 3);

        // bowSides
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(113.5, 206.0);
        ((GeneralPath) shape).lineTo(123.0, 206.75);
        ((GeneralPath) shape).curveTo(123.0, 206.75, 130.25, 198.5, 138.5, 197.5);
        ((GeneralPath) shape).curveTo(146.75, 196.5, 156.5, 198.75, 156.5, 198.75);
        ((GeneralPath) shape).curveTo(156.5, 198.75, 156.25, 211.25, 151.75, 217.75);
        ((GeneralPath) shape).curveTo(147.25, 224.25, 147.5, 224.5, 149.0, 229.0);
        ((GeneralPath) shape).curveTo(150.5, 233.5, 151.0, 243.0, 141.0, 247.25);
        ((GeneralPath) shape).curveTo(131.0, 251.5, 134.0, 248.75, 134.0, 248.75);
        ((GeneralPath) shape).curveTo(134.0, 248.75, 126.5, 233.75, 124.25, 229.25);
        ((GeneralPath) shape).curveTo(122.0, 224.75, 118.25, 220.0, 118.25, 220.0);
        ((GeneralPath) shape).lineTo(113.75, 218.25);
        ((GeneralPath) shape).curveTo(113.75, 218.25, 109.75, 218.75, 106.0, 225.75);
        ((GeneralPath) shape).curveTo(102.25, 232.75, 97.25, 236.75, 94.75, 237.0);
        ((GeneralPath) shape).curveTo(92.25, 237.25, 84.5, 232.25, 84.5, 232.25);
        ((GeneralPath) shape).curveTo(84.5, 232.25, 83.0, 221.5, 80.25, 215.5);
        ((GeneralPath) shape).curveTo(77.5, 209.5, 83.5, 210.25, 80.0, 206.0);
        ((GeneralPath) shape).curveTo(76.5, 201.75, 75.25, 193.25, 75.25, 193.25);
        ((GeneralPath) shape).curveTo(75.25, 193.25, 94.25, 194.75, 100.25, 197.25);
        ((GeneralPath) shape).curveTo(106.25, 199.75, 113.5, 206.0, 113.5, 206.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF6DDAA), shape);
        TreeNode bowSides = new TreeNode("bowSides", s2, 3);

        // bowMiddle
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(113.5, 206.0);
        ((GeneralPath) shape).curveTo(113.5, 206.0, 110.0, 207.75, 110.25, 211.75);
        ((GeneralPath) shape).curveTo(110.5, 215.75, 112.5, 219.25, 112.5, 219.25);
        ((GeneralPath) shape).lineTo(119.25, 221.5);
        ((GeneralPath) shape).curveTo(119.25, 221.5, 119.0, 216.0, 120.0, 212.75);
        ((GeneralPath) shape).curveTo(121.0, 209.5, 121.0, 209.5, 121.0, 209.5);
        ((GeneralPath) shape).lineTo(123.0, 206.75);
        ((GeneralPath) shape).lineTo(113.5, 206.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xEAB575), shape);
        TreeNode bowMiddle = new TreeNode("bowMiddle", s2, 3);

        root.addChild(torso);
        torso.addChild(backWing);
        torso.addChild(scarfBack);
        torso.addChild(chest);
        torso.addChild(rightShoulder);
        torso.addChild(rightHand);
        torso.addChild(leftShoulder);
        torso.addChild(leftGlove);
        torso.addChild(corset);
        torso.addChild(corsetMiddle);
        torso.addChild(bottomBroochGold);
        torso.addChild(dressTopRibbon);
        torso.addChild(rightGlove);
        torso.addChild(rightWing);
        torso.addChild(leftWing);
        torso.addChild(bottomBroochJewel);
        torso.addChild(scarfFront);
        torso.addChild(topBroochGold);
        torso.addChild(topBroochJewel);
        torso.addChild(bowSides);
        torso.addChild(bowMiddle);

        // backHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(126.5, 78.833);
        ((GeneralPath) shape).curveTo(129.167, 75.666, 132.5, 70.0, 138.16699, 68.5);
        ((GeneralPath) shape).curveTo(143.83398, 67.0, 145.16699, 66.0, 145.16699, 66.0);
        ((GeneralPath) shape).curveTo(145.16699, 66.0, 142.66699, 65.667, 141.0, 64.0);
        ((GeneralPath) shape).curveTo(139.33301, 62.333, 137.0, 59.667, 137.0, 59.667);
        ((GeneralPath) shape).curveTo(137.0, 59.667, 139.667, 62.0, 142.66699, 62.167);
        ((GeneralPath) shape).curveTo(145.66698, 62.334, 147.16699, 61.5, 147.16699, 61.5);
        ((GeneralPath) shape).curveTo(147.16699, 61.5, 142.66699, 56.833, 141.33398, 52.5);
        ((GeneralPath) shape).curveTo(140.00098, 48.167, 139.50099, 42.5, 139.50099, 42.5);
        ((GeneralPath) shape).curveTo(139.50099, 42.5, 144.168, 43.167, 146.168, 46.833);
        ((GeneralPath) shape).curveTo(148.168, 50.499, 154.168, 55.0, 154.168, 55.0);
        ((GeneralPath) shape).curveTo(154.168, 55.0, 152.668, 52.333, 152.50099, 49.667);
        ((GeneralPath) shape).curveTo(152.33398, 47.001, 152.50099, 45.0, 152.50099, 45.0);
        ((GeneralPath) shape).curveTo(152.50099, 45.0, 154.00099, 49.5, 156.00099, 52.167);
        ((GeneralPath) shape).curveTo(158.00099, 54.834, 160.5, 56.0, 160.5, 56.0);
        ((GeneralPath) shape).curveTo(160.5, 56.0, 156.33301, 45.167, 159.333, 40.167);
        ((GeneralPath) shape).curveTo(162.33298, 35.167, 168.333, 32.667, 172.16599, 30.0);
        ((GeneralPath) shape).curveTo(175.99898, 27.333, 181.16599, 22.0, 181.16599, 22.0);
        ((GeneralPath) shape).curveTo(181.16599, 22.0, 179.833, 31.833, 177.66599, 34.333);
        ((GeneralPath) shape).curveTo(175.49898, 36.833, 171.833, 51.5, 171.833, 51.5);
        ((GeneralPath) shape).curveTo(171.833, 51.5, 171.66599, 55.167, 176.5, 54.167);
        ((GeneralPath) shape).curveTo(181.33401, 53.167, 181.83301, 45.834, 181.83301, 45.834);
        ((GeneralPath) shape).curveTo(181.83301, 45.834, 183.666, 50.917, 182.08301, 53.167);
        ((GeneralPath) shape).curveTo(180.50002, 55.417, 180.166, 55.167, 180.166, 55.167);
        ((GeneralPath) shape).curveTo(180.166, 55.167, 185.749, 56.167, 191.58301, 53.5);
        ((GeneralPath) shape).curveTo(197.41702, 50.833, 198.66602, 46.583, 198.66602, 46.583);
        ((GeneralPath) shape).curveTo(198.66602, 46.583, 201.08302, 53.0, 196.66602, 57.833);
        ((GeneralPath) shape).curveTo(192.24901, 62.666, 192.08301, 61.5, 190.16602, 63.75);
        ((GeneralPath) shape).curveTo(188.24902, 66.0, 188.33302, 66.833, 188.33302, 66.833);
        ((GeneralPath) shape).curveTo(188.33302, 66.833, 192.25003, 64.666, 198.66602, 64.916);
        ((GeneralPath) shape).curveTo(205.082, 65.166, 210.08301, 70.416, 210.08301, 70.416);
        ((GeneralPath) shape).curveTo(210.08301, 70.416, 205.91602, 70.916, 200.83301, 74.999);
        ((GeneralPath) shape).curveTo(195.75, 79.082, 192.41602, 79.166, 192.41602, 79.166);
        ((GeneralPath) shape).curveTo(192.41602, 79.166, 200.5, 81.875, 203.5, 83.5);
        ((GeneralPath) shape).curveTo(206.5, 85.125, 212.5, 88.75, 216.0, 88.625);
        ((GeneralPath) shape).curveTo(219.5, 88.5, 221.875, 85.625, 221.875, 85.625);
        ((GeneralPath) shape).curveTo(221.875, 85.625, 215.25, 95.375, 208.75, 95.75);
        ((GeneralPath) shape).curveTo(202.25, 96.125, 199.375, 96.375, 194.375, 94.625);
        ((GeneralPath) shape).curveTo(189.375, 92.875, 186.875, 89.625, 186.875, 89.625);
        ((GeneralPath) shape).curveTo(186.875, 89.625, 188.625, 95.0, 188.0, 98.625);
        ((GeneralPath) shape).curveTo(187.375, 102.25, 185.75, 103.75, 185.75, 103.75);
        ((GeneralPath) shape).curveTo(185.75, 103.75, 187.625, 101.0, 185.125, 97.75);
        ((GeneralPath) shape).curveTo(182.625, 94.5, 180.625, 90.0, 180.625, 90.0);
        ((GeneralPath) shape).curveTo(180.625, 90.0, 178.0, 97.375, 170.0, 100.0);
        ((GeneralPath) shape).curveTo(162.0, 102.625, 126.5, 78.833, 126.5, 78.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xEBC070), shape);
        TreeNode backHair = new TreeNode("backHair", s2, 3);

        // leftEarring
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(131.0, 109.625);
        ((GeneralPath) shape).curveTo(129.125, 112.25, 128.0, 119.375, 130.5, 121.5);
        ((GeneralPath) shape).curveTo(133.0, 123.625, 135.25, 121.75, 135.25, 118.625);
        ((GeneralPath) shape).curveTo(135.25, 115.5, 131.0, 109.625, 131.0, 109.625);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x5B6A82), shape);
        TreeNode leftEarring = new TreeNode("leftEarring", s2, 3);

        // face
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(125.167, 96.667);
        ((GeneralPath) shape).curveTo(125.167, 96.667, 129.66699, 113.0, 131.16699, 114.5);
        ((GeneralPath) shape).curveTo(132.66699, 116.0, 145.33398, 124.167, 145.33398, 124.167);
        ((GeneralPath) shape).curveTo(145.33398, 124.167, 159.50098, 117.0, 160.83398, 115.167);
        ((GeneralPath) shape).curveTo(162.16699, 113.334, 165.83398, 108.167, 165.83398, 108.167);
        ((GeneralPath) shape).curveTo(165.83398, 108.167, 171.16699, 105.501, 173.66699, 102.334);
        ((GeneralPath) shape).curveTo(176.16699, 99.167, 178.16699, 96.167, 178.16699, 96.167);
        ((GeneralPath) shape).curveTo(178.16699, 96.167, 173.33398, 94.5, 169.66699, 95.667);
        ((GeneralPath) shape).curveTo(166.0, 96.834, 164.16699, 97.334, 164.16699, 97.334);
        ((GeneralPath) shape).curveTo(164.16699, 97.334, 168.66699, 74.0, 146.66699, 74.667);
        ((GeneralPath) shape).curveTo(124.66699, 75.334, 125.167, 90.5, 125.167, 96.667);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFEEE7), shape);
        TreeNode face = new TreeNode("face", s2, 3);

        // rightEyeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(146.125, 104.5);
        ((GeneralPath) shape).curveTo(146.125, 104.5, 149.625, 100.0, 152.625, 99.375);
        ((GeneralPath) shape).curveTo(155.625, 98.75, 159.875, 98.375, 159.875, 98.375);
        ((GeneralPath) shape).curveTo(159.875, 98.375, 161.25, 109.625, 156.875, 110.375);
        ((GeneralPath) shape).curveTo(152.5, 111.125, 148.875, 111.25, 148.875, 111.25);
        ((GeneralPath) shape).curveTo(148.875, 111.25, 147.5, 108.375, 147.125, 107.5);
        ((GeneralPath) shape).curveTo(146.75, 106.625, 146.125, 104.5, 146.125, 104.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode rightEyeWhite = new TreeNode("rightEyeWhite", s2, 3);

        // leftEyeWhite
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(129.125, 96.75);
        ((GeneralPath) shape).curveTo(129.125, 96.75, 132.625, 98.375, 134.625, 101.625);
        ((GeneralPath) shape).curveTo(136.625, 104.875, 137.5, 107.25, 137.5, 107.25);
        ((GeneralPath) shape).lineTo(136.375, 111.5);
        ((GeneralPath) shape).curveTo(136.375, 111.5, 133.875, 112.0, 132.625, 111.625);
        ((GeneralPath) shape).curveTo(131.375, 111.25, 130.75, 111.125, 130.75, 111.125);
        ((GeneralPath) shape).curveTo(130.75, 111.125, 129.5, 107.375, 129.25, 104.25);
        ((GeneralPath) shape).curveTo(129.0, 101.125, 129.125, 96.75, 129.125, 96.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xFFFFFF), shape);
        TreeNode leftEyeWhite = new TreeNode("leftEyeWhite", s2, 3);

        // rightIris
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(147.875, 102.5);
        ((GeneralPath) shape).curveTo(147.875, 102.5, 147.75, 105.125, 148.875, 107.25);
        ((GeneralPath) shape).curveTo(150.0, 109.375, 150.375, 110.5, 152.5, 110.125);
        ((GeneralPath) shape).curveTo(154.625, 109.75, 156.25, 107.75, 155.875, 103.625);
        ((GeneralPath) shape).curveTo(155.5, 99.5, 154.75, 99.0, 154.75, 99.0);
        ((GeneralPath) shape).curveTo(154.75, 99.0, 152.125, 98.875, 150.375, 100.25);
        ((GeneralPath) shape).curveTo(148.625, 101.625, 147.875, 102.5, 147.875, 102.5);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x87445F), shape);
        TreeNode rightIris = new TreeNode("rightIris", s2, 3);

        // leftIris
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(130.875, 97.75);
        ((GeneralPath) shape).curveTo(132.375, 98.5, 133.125, 99.625, 134.0, 100.75);
        ((GeneralPath) shape).curveTo(134.875, 101.875, 135.875, 103.75, 135.875, 103.75);
        ((GeneralPath) shape).curveTo(135.875, 103.75, 136.5, 108.75, 135.125, 109.875);
        ((GeneralPath) shape).curveTo(133.75, 111.0, 130.625, 108.125, 130.625, 103.625);
        ((GeneralPath) shape).curveTo(130.625, 99.125, 130.875, 97.75, 130.875, 97.75);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x87445F), shape);
        TreeNode leftIris = new TreeNode("leftIris", s2, 3);

        // nose
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(136.25, 114.417);
        ((GeneralPath) shape).curveTo(136.25, 114.417, 137.0, 114.5, 137.833, 113.5);
        ((GeneralPath) shape).curveTo(138.66599, 112.5, 139.0, 111.333, 139.0, 111.333);
        ((GeneralPath) shape).curveTo(139.0, 111.333, 139.083, 112.666, 138.75, 113.833);
        ((GeneralPath) shape).curveTo(138.417, 115.0, 137.833, 115.5, 137.833, 115.5);
        ((GeneralPath) shape).lineTo(136.25, 114.417);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xE1A68D), shape);
        TreeNode nose = new TreeNode("nose", s2, 3);

        // mouth
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(140.333, 118.0);
        ((GeneralPath) shape).curveTo(140.60199, 117.539, 140.91599, 118.667, 143.0, 118.833);
        ((GeneralPath) shape).curveTo(145.08401, 118.999, 146.917, 117.75, 147.08301, 118.416);
        ((GeneralPath) shape).curveTo(147.24901, 119.082, 144.75, 120.0, 143.5, 119.75);
        ((GeneralPath) shape).curveTo(142.25, 119.5, 139.75, 119.0, 140.333, 118.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xE87C67), shape);
        TreeNode mouth = new TreeNode("mouth", s2, 3);

        // rightEarring
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(166.0, 106.125);
        ((GeneralPath) shape).curveTo(166.0, 106.125, 163.625, 112.875, 166.875, 116.625);
        ((GeneralPath) shape).curveTo(170.125, 120.375, 172.375, 120.125, 172.625, 115.25);
        ((GeneralPath) shape).curveTo(172.875, 110.375, 169.5, 107.375, 166.0, 106.125);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0x5B6A82), shape);
        TreeNode rightEarring = new TreeNode("rightEarring", s2, 3);

        // rightEyeHighlight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(150.375, 101.25);
        ((GeneralPath) shape).curveTo(151.875, 101.25, 152.625, 105.875, 151.25, 106.0);
        ((GeneralPath) shape).curveTo(149.875, 106.125, 149.125, 101.25, 150.375, 101.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xEFCACF), shape);
        TreeNode rightEyeHighlight = new TreeNode("rightEyeHighlight", s2, 3);

        // leftEyeHighlight
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(132.25, 100.875);
        ((GeneralPath) shape).curveTo(133.894, 100.875, 134.125, 105.625, 132.75, 105.625);
        ((GeneralPath) shape).curveTo(131.375, 105.625, 130.875, 100.875, 132.25, 100.875);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xEFCACF), shape);
        TreeNode leftEyeHighlight = new TreeNode("leftEyeHighlight", s2, 3);

        // midHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(171.5, 89.833);
        ((GeneralPath) shape).lineTo(179.0, 83.333);
        ((GeneralPath) shape).curveTo(181.0, 95.5, 166.33301, 108.666, 166.33301, 108.666);
        ((GeneralPath) shape).curveTo(166.33301, 108.666, 166.83301, 83.666, 155.5, 78.833);
        ((GeneralPath) shape).curveTo(144.16699, 74.0, 135.333, 70.0, 135.333, 70.0);
        ((GeneralPath) shape).curveTo(142.0, 62.333, 156.583, 59.583, 166.5, 60.667);
        ((GeneralPath) shape).lineTo(155.75, 71.834);
        ((GeneralPath) shape).lineTo(175.91699, 65.834);
        ((GeneralPath) shape).lineTo(164.66699, 79.751);
        ((GeneralPath) shape).lineTo(178.08398, 75.418);
        ((GeneralPath) shape).lineTo(171.5, 89.833);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF2D28B), shape);
        TreeNode midHair = new TreeNode("midHair", s2, 3);

        // hairClip2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(157.167, 64.583);
        ((GeneralPath) shape).curveTo(155.615, 66.914, 156.667, 68.583, 158.667, 68.75);
        ((GeneralPath) shape).curveTo(160.667, 68.917, 164.75, 64.0, 162.0, 62.833);
        ((GeneralPath) shape).curveTo(159.25, 61.666, 157.5, 64.083, 157.167, 64.583);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xB98387), shape);
        TreeNode hairClip2 = new TreeNode("hairClip2", s2, 3);

        // hairClip1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(173.667, 80.0);
        ((GeneralPath) shape).curveTo(175.84001, 78.914, 178.0, 81.333, 178.0, 83.5);
        ((GeneralPath) shape).curveTo(178.0, 85.667, 175.908, 87.425, 173.5, 84.917);
        ((GeneralPath) shape).curveTo(171.5, 82.833, 172.667, 80.5, 173.667, 80.0);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xB98387), shape);
        TreeNode hairClip1 = new TreeNode("hairClip1", s2, 3);

        // frontHair
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(141.0, 69.25);
        ((GeneralPath) shape).curveTo(134.44, 68.781, 126.5, 77.0, 125.0, 77.75);
        ((GeneralPath) shape).curveTo(123.5, 78.5, 120.5, 78.0, 120.5, 78.0);
        ((GeneralPath) shape).curveTo(120.5, 78.0, 117.0, 101.25, 119.0, 111.25);
        ((GeneralPath) shape).curveTo(121.0, 121.25, 123.0, 126.25, 126.5, 129.75);
        ((GeneralPath) shape).curveTo(130.0, 133.25, 137.0, 138.0, 137.0, 138.0);
        ((GeneralPath) shape).curveTo(137.0, 138.0, 127.5, 131.0, 126.75, 125.25);
        ((GeneralPath) shape).curveTo(126.0, 119.5, 126.5, 110.75, 126.5, 110.75);
        ((GeneralPath) shape).curveTo(126.5, 110.75, 125.75, 112.0, 129.0, 116.25);
        ((GeneralPath) shape).curveTo(132.25, 120.5, 135.5, 123.25, 135.5, 123.25);
        ((GeneralPath) shape).curveTo(135.5, 123.25, 127.5, 108.0, 126.75, 102.75);
        ((GeneralPath) shape).curveTo(126.0, 97.5, 127.25, 87.75, 127.25, 87.75);
        ((GeneralPath) shape).lineTo(137.75, 99.0);
        ((GeneralPath) shape).curveTo(137.75, 99.0, 140.25, 102.0, 141.0, 104.25);
        ((GeneralPath) shape).curveTo(141.75, 106.5, 141.75, 109.5, 141.75, 109.5);
        ((GeneralPath) shape).curveTo(141.75, 109.5, 146.0, 103.5, 146.75, 98.75);
        ((GeneralPath) shape).curveTo(147.5, 94.0, 144.5, 83.5, 144.5, 83.5);
        ((GeneralPath) shape).curveTo(144.5, 83.5, 149.25, 96.5, 152.0, 98.0);
        ((GeneralPath) shape).curveTo(154.75, 99.5, 158.75, 103.5, 158.75, 103.5);
        ((GeneralPath) shape).curveTo(158.75, 103.5, 157.25, 110.0, 154.25, 113.25);
        ((GeneralPath) shape).curveTo(151.25, 116.5, 149.5, 116.5, 149.5, 116.5);
        ((GeneralPath) shape).lineTo(157.25, 115.5);
        ((GeneralPath) shape).curveTo(157.25, 115.5, 155.75, 124.5, 152.5, 129.75);
        ((GeneralPath) shape).curveTo(149.25, 135.0, 146.75, 137.25, 146.75, 137.25);
        ((GeneralPath) shape).curveTo(146.75, 137.25, 152.5, 135.0, 157.75, 127.5);
        ((GeneralPath) shape).curveTo(163.0, 120.0, 167.25, 109.0, 167.25, 102.25);
        ((GeneralPath) shape).curveTo(167.25, 95.5, 167.794, 92.358, 166.5, 86.75);
        ((GeneralPath) shape).curveTo(165.0, 80.25, 155.0, 70.25, 141.0, 69.25);
        ((GeneralPath) shape).closePath();
        s2 = new Shape2d.Path(x, y, new Color(0xF6E1AD), shape);
        TreeNode frontHair = new TreeNode("frontHair", s2, 3);

        root.addChild(head);
        head.addChild(backHair);
        head.addChild(leftEarring);
        head.addChild(face);
        head.addChild(rightEyeWhite);
        head.addChild(leftEyeWhite);
        head.addChild(rightIris);
        head.addChild(leftIris);
        head.addChild(nose);
        head.addChild(mouth);
        head.addChild(rightEarring);
        head.addChild(rightEyeHighlight);
        head.addChild(leftEyeHighlight);
        head.addChild(midHair);
        head.addChild(hairClip2);
        head.addChild(hairClip1);
        head.addChild(frontHair);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Rozalin(int width, int height) {
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

