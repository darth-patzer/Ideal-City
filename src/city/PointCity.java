package city;

import geo.GeoService;
import geo.Location;
import geo.Point;
import graphics.Renderer;

public class PointCity extends AbstractCity {
	
	public PointCity(String cityName, Location cityCentre) {
		this.name = cityName;
		this.cityCentre = cityCentre;
		this.numInhabitants = 0;
		this.size = 0;
	}

	@Override
	public void render() {
		Point cityLocation = GeoService.to2DCoords(cityCentre);
		
		Renderer.drawPoint(cityLocation);
		Renderer.drawCentredTextAsSingleLine(name, new Point(cityLocation.getX(), cityLocation.getZ() - 20));
	}
	
}