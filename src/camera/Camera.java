package camera;

import camera.movementStrategy.CameraMovementStrategy;
import camera.movementStrategy.LinearMovementStrategy;
import geo.Point;

public class Camera {
	
	private Point position;
	
	private CameraMovementStrategy moveStrategy;
	
	private static final float SPEED = 5.5f;
	
	public Camera() {
		this.moveStrategy = new LinearMovementStrategy();
	}
	
	public Camera(CameraMovementStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public Camera(CameraMovementStrategy moveStrategy, int x, int z) {
		this.moveStrategy = moveStrategy;
		this.position = new Point(x, z);
	}

	public Camera(CameraMovementStrategy moveStrategy, Point position) {
		this.moveStrategy = moveStrategy;
		this.position = position;
	}
	
	public void moveWest() {
		position = moveStrategy.moveWest(position, SPEED);
	}
	
	public void moveEast() {
		position = moveStrategy.moveEast(position, SPEED);
	}
	
	public void moveNorth() {
		position = moveStrategy.moveNorth(position, SPEED);
	}
	
	public void moveSouth() {
		position = moveStrategy.moveSouth(position, SPEED);
	}
	
	public Point getPosition() {
		return position;
	}
	
	public void teleportTo(Point position) {
		this.position = position;
	}
	
	public void setMovementStrategy(CameraMovementStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
	
}
