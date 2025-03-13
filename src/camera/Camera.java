package camera;

import camera.movement.CameraMovementStrategy;
import camera.movement.LinearMovementStrategy;
import geo.Point;

public class Camera {
	
	private Point position;
	
	private CameraMovementStrategy moveStrategy;
	
	private static final float SPEED = 5.5f;
	
	public Camera() {
		this.moveStrategy = new LinearMovementStrategy();
		this.position = new Point(0, 0);
	}

	public Camera(CameraMovementStrategy moveStrategy, Point position) {
		this.moveStrategy = moveStrategy;
		this.position = position;
	}
	
	public void teleportTo(Point position) {
		this.position = position;
	}
	
	public Point getPosition() {
		return position;
	}
	
	public void setMovementStrategy(CameraMovementStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void move() {
		this.position = moveStrategy.move(position, SPEED);
	}
	
}
