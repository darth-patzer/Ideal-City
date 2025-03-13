package camera;

import geo.Point;

public class CameraService {
	
	private static CameraController cameraController;
	
	private static Camera camera = new Camera();
	
	public static void setCameraController(CameraController controller) {
		cameraController = controller;
	}
	
	public static void move() {
		cameraController.move(camera);
	}
	
	public static Point getCameraPosition() {
		return camera.getPosition();
	}

}
