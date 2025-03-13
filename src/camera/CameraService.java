package camera;

import geo.Point;

public class CameraService {
	
	public static Point shiftPointToCameraCoords(Point p) {
		return new Point(p.getX() + Camera.getPosition().getX(), p.getZ() + Camera.getPosition().getZ());
	}

}
