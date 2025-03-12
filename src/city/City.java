package city;

import geo.Location;

public class City extends AbstractCity {
	
	public City(String cityName, Location cityLocation) {
		this.name = cityName;
		this.cityCentre = cityLocation;
		this.numInhabitants = 0;
		this.size = 0;
	}
	
}