package geo;

public class Point {
	
	private float x;
	private float z;
	
	public Point(float x, float z) {
		this.x = x;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public float getZ() {
		return z;
	}
	
	public int getXAsInt() {
		return (int) x;
	}
	
	public int getZAsInt() {
		return (int) z;
	}

}
