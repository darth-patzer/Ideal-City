package graphics;

import java.awt.Canvas;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import inputs.Keyboard;

public class WindowManager {

	private static Canvas canvas;
	private static JFrame frame;
	
	public static void InitializeWindow() {
		canvas = new Canvas();
		frame = new JFrame("application");
		
		handleFrameDefaults();
		
		frame.add(canvas);
		
		addListeners();
		
		canvas.createBufferStrategy(2);
		
	}
	
	private static void handleFrameDefaults() {
		frame.setVisible(true);
		frame.setSize(960, 640);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private static void addListeners() {
		canvas.requestFocus();
		
		canvas.addKeyListener(Keyboard.getKeyboardTracker());
	}
	
	public static void addWindowListener(WindowListener listener) {
		frame.addWindowListener(listener);
	}
	
	public static void dispose() {
		frame.dispose();
	}
	
	public static BufferStrategy getBufferStrategy() {
		return canvas.getBufferStrategy();
	}

}
