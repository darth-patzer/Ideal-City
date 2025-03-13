package city;

import java.awt.Graphics;

import geo.Location;

public class PointCity extends AbstractCity {
	
	public PointCity(String cityName, Location cityCentre) {
		this.name = cityName;
		this.cityCentre = cityCentre;
		this.numInhabitants = 0;
		this.size = 0;
	}

	@Override
	public void render(Graphics g) {
		
	}
	
}