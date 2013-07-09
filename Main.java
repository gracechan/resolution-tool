import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
        // create the window         
        JFrame f = new JFrame("Resolution Tool Canvas"); // jframe is the app window
        LayerList layerbox = new LayerList(null);
        Canvas canvas = new Canvas(layerbox);
        SliderList sliderbox = new SliderList(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 600); // window size
        f.setContentPane(canvas); // add canvas to jframe
        f.setVisible(true); // show the window
        
        f = new JFrame("LayerBox"); 
        // note dispose on close for child windows
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(300, 700); // window size 
        f.setLocation(400, 0);
        f.setContentPane(layerbox);
        f.setVisible(true); // show the window
        
        f = new JFrame("Sliders"); 
        // note dispose on close for child windows
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(300, 300); // window size 
        f.setLocation(700, 0);
        f.setContentPane(sliderbox);
        f.setVisible(true); // show the window
    }
}