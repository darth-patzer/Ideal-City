package city;

import geo.GeoService;
import geo.Location;
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
		Renderer.drawPoint(GeoService.to2DCoords(cityCentre));
		
	}
	
}