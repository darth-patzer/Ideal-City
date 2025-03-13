package camera;

import java.awt.Dimension;

import geo.Point;
import graphics.WindowManager;

public class CameraService {
	
	public static CameraSpacePoint shiftPointToCameraCoords(Point p) {
		Dimension screenSize = WindowManager.getScreenSize();
		float cSpaceX = p.getX() + Camera.getPosition().getX() + screenSize.width/2;
		float cSpaceZ = p.getZ() + Camera.getPosition().getZ() + screenSize.height/2;
		return new CameraSpacePoint(cSpaceX, cSpaceZ);
	}

}
