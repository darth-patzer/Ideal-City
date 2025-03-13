package camera.movementStrategy;

import geo.Point;

public class LinearMovementStrategy extends CameraMovementStrategy {

	@Override
	public Point moveNorth(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX(), (int)(cameraPosition.getZ() + speed));
	}

	@Override
	public Point moveSouth(Point cameraPosition, float speed) {
		return new Point(cameraPosition.getX(), (int)(cameraPosition.getZ() - speed));
	}

	@Override
	public Point moveWest(Point cameraPosition, float speed) {
		return new Point((int)(cameraPosition.getX() + speed), cameraPosition.getZ());
	}

	@Override
	public Point moveEast(Point cameraPosition, float speed) {
		return new Point((int)(cameraPosition.getX() - speed), cameraPosition.getZ());
	}

}
