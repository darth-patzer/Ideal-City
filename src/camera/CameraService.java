package camera;

import camera.controller.CameraController;
import camera.movementStrategy.CameraMovementStrategy;
import geo.Point;

public class CameraService {
	
	private static CameraController cameraController;
	
	private static Camera camera = new Camera();
	
	public static void setCameraController(CameraController controller) {
		cameraController = controller;
	}
	
	public static void setCameraMovementStrategy(CameraMovementStrategy moveStrategy) {
		camera.setMovementStrategy(moveStrategy);
	}
	
	public static void move() {
		cameraController.move(camera);
	}
	
	public static Point getCameraPosition() {
		return camera.getPosition();
	}
	
	public static void setCameraPosition(Point position) {
		camera.teleportTo(position);
	}

}
