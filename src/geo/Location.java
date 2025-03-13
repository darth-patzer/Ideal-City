package geo;

public class Location {

	private float x;
	private float y;
	private float z;
	
	public Location(float x, float z) {
		this.x = x;
		this.z = z;
		this.y = 0;
	}
	
	public Location(float x, float z, float y) {
		this.x = x;
		this.z = z;
		this.y = y;
	}

	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
}