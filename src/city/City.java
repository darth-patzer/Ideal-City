package city;

import geo.Location;

public class City extends AbstractCity {
	
	public City(String cityName, Location cityCentre) {
		this.name = cityName;
		this.cityCentre = cityCentre;
		this.numInhabitants = 0;
		this.size = 0;
	}
	
}