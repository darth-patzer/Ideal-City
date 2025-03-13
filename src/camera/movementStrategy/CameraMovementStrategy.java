package camera.movementStrategy;

import geo.Point;

public abstract class CameraMovementStrategy {
	
	public abstract Point moveNorth(Point cameraPosition, float speed);
	
	public abstract Point moveSouth(Point cameraPosition, float speed);
	
	public abstract Point moveWest(Point cameraPosition, float speed);
	
	public abstract Point moveEast(Point cameraPosition, float speed);

}
