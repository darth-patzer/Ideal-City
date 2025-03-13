package camera;

import inputs.Keyboard;

public class WASDCameraController extends CameraController {

	public static final int SPEED = 10;
	
	@Override
	public void move(Camera camera) {
		if(Keyboard.isKeyPressed('w')) {
			camera.moveNorth(SPEED);
		}
		if(Keyboard.isKeyPressed('s')) {
			camera.moveSouth(SPEED);
		}
		if(Keyboard.isKeyPressed('a')) {
			camera.moveWest(SPEED);
		}
		if(Keyboard.isKeyPressed('d')) {
			camera.moveEast(SPEED);
		}
	}

}
