package camera.movement;

import geo.Point;

public abstract class CameraMovementStrategy {
	
	public abstract Point move(Point cameraPosition, float speed);

}
