package geo;

public class GeoService {

	public static Point to2DCoords(Location location) {
		return new Point(location.getX(), location.getZ());
	}
	
	public static Location to3DCoords(Point point) {
		return new Location(point.getX(), point.getZ());
	}
	
}