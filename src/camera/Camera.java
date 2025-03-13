package camera;

import camera.movement.CameraMovementStrategy;
import camera.movement.LinearMovementStrategy;
import geo.Point;

public class Camera {
	
	private static Point position = new Point(0, 0);
	
	private static CameraMovementStrategy moveStrategy = new LinearMovementStrategy();
	
	private static final float SPEED = 5.5f;

	public static void initializeCamera(CameraMovementStrategy movementStrategy, Point cameraPosition) {
		moveStrategy = movementStrategy;
		position = cameraPosition;
	}
	
	public static void teleportTo(Point newPosition) {
		position = newPosition;
	}
	
	public static Point getPosition() {
		return position;
	}
	
	public static void setMovementStrategy(CameraMovementStrategy newMovementStrategy) {
		moveStrategy = newMovementStrategy;
	}

	public static void move() {
		position = moveStrategy.move(position, SPEED);
	}
	
}
