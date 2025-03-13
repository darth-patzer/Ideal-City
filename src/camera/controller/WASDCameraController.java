package camera.controller;

import camera.Camera;
import inputs.Keyboard;

public class WASDCameraController extends CameraController {
	
	@Override
	public void move(Camera camera) {
		if(Keyboard.isKeyPressed('w')) {
			camera.moveNorth();
		}
		if(Keyboard.isKeyPressed('s')) {
			camera.moveSouth();
		}
		if(Keyboard.isKeyPressed('a')) {
			camera.moveWest();
		}
		if(Keyboard.isKeyPressed('d')) {
			camera.moveEast();
		}
	}

}
