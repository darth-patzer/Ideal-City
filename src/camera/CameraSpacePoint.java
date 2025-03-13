package camera;

import geo.Point;

public class CameraSpacePoint {
	
	private int x;
	private int z;
	
	public CameraSpacePoint(int x, int z) {
		this.x = x;
		this.z = z;
	}
	
	public CameraSpacePoint(float x, float z) {
		this.x = (int) x;
		this.z = (int) z;
	}
	
	public CameraSpacePoint(Point p) {
		CameraSpacePoint cSP = CameraService.shiftPointToCameraCoords(p);
		this.x = cSP.x;
		this.z = cSP.z;
	}

	public int getX() {
		return x;
	}

	public int getZ() {
		return z;
	}

}
