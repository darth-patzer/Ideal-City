package graphics;

import java.awt.Canvas;

import javax.swing.JFrame;

public class WindowManager {

	private static Canvas canvas;
	private static JFrame frame;
	
	public static void InitializeWindow() {
		canvas = new Canvas();
		frame = new JFrame("application");
		handleFrameDefaults(frame);
		frame.add(canvas);
	}
	
	private static void handleFrameDefaults(JFrame frame) {
		frame.setVisible(true);
		frame.setSize(960, 640);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
