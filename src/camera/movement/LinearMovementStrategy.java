package camera.movement;

import geo.Point;
import inputs.Keyboard;

public class LinearMovementStrategy extends CameraMovementStrategy {

	@Override
	public Point move(Point cameraPosition, float speed) {
		Point newCameraPosition = cameraPosition;
		if(Keyboard.isKeyPressed('w')) {
			newCameraPosition = moveNorth(newCameraPosition, speed);
		}
		if(Keyboard.isKeyPressed('s')) {
			newCameraPosition = moveSouth(newCameraPosition, speed);
		}
		if(Keyboard.isKeyPressed('d')) {
			newCameraPosition = moveEast(newCameraPosition, speed);
		}
		if(Keyboard.isKeyPressed('a')) {
			newCameraPosition = moveWest(newCameraPosition, speed);
		}
		return newCameraPosition;
	}

	public Point moveNorth(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX(), cameraPosition.getZ() + speed);
	}

	public Point moveSouth(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX(), cameraPosition.getZ() - speed);
	}

	public Point moveWest(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX() + speed, cameraPosition.getZ());
	}

	public Point moveEast(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX() - speed, cameraPosition.getZ());
	}

}
