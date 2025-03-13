package camera.movement;

import geo.Point;
import inputs.Keyboard;

public class VelocityMovementStrategy extends CameraMovementStrategy {

	private float velocityX = 0;
	private float velocityZ = 0;
	
	private static final float FRICTION_COEFFICIENT = 0.84f;
	
	@Override
	public Point move(Point cameraPosition, float speed) {
		if(Keyboard.isKeyPressed('w')) {
			velocityZ += speed;
		}
		if(Keyboard.isKeyPressed('s')) {
			velocityZ -= speed;
		}
		if(Keyboard.isKeyPressed('a')) {
			velocityX += speed;
		}
		if(Keyboard.isKeyPressed('d')) {
			velocityX -= speed;
		}
		return applyVelocities(cameraPosition);
	}
	
	private Point applyVelocities(Point cameraPosition) {
		Point newPosition = new Point(cameraPosition.getX() + velocityX, cameraPosition.getZ() + velocityZ);
		velocityX *= FRICTION_COEFFICIENT;
		velocityZ *= FRICTION_COEFFICIENT;
		return newPosition;
	}

}
