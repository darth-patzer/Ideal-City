package graphics;

import java.awt.Color;
import java.awt.Graphics;

import camera.CameraService;
import geo.Point;

public class Renderer {
	
	private static Graphics g;
	
	public static void setGraphics(Graphics graphics) {
		g = graphics;
	}
	
	public static void clearGraphics() {
		g = null;
	}
	
	private static final int POINT_RADIUS = 4;
	public static void drawPoint(Point p) {
		verifyGraphics();
		
		Point cSpace = CameraService.shiftPointToCameraCoords(p);
		g.setColor(Color.BLACK);
		
		g.fillOval(cSpace.getXAsInt() - POINT_RADIUS, cSpace.getZAsInt() - POINT_RADIUS, POINT_RADIUS*2, POINT_RADIUS*2);
	}
	
	public static void drawBackground() {
		verifyGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WindowManager.getScreenSize().width, WindowManager.getScreenSize().height);
	}
	
	private static void verifyGraphics() {
		if(g == null) throw new NullPointerException("The Renderer had no Graphics object with which to draw!");
	}

}
