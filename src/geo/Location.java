package geo;

public class Location {

	private int x;
	private int y;
	private int z;
	
	public Location(int x, int z) {
		this.x = x;
		this.z = z;
		this.y = 0;
	}
	
	public Location(int x, int z, int y) {
		this.x = x;
		this.z = z;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
}