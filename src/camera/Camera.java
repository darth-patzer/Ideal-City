package camera;

import geo.Point;

public class Camera {
	
	private int x;
	private int z;
	
	public Camera() { }

	public Camera(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	public void moveWest(int moveDist) {
		this.x += moveDist;
	}
	
	public void moveEast(int moveDist) {
		this.x -= moveDist;
	}
	
	public void moveNorth(int moveDist) {
		this.z += moveDist;
	}
	
	public void moveSouth(int moveDist) {
		this.z -= moveDist;
	}
	
	public Point getPosition() {
		return new Point(x, z);
	}
	
}
