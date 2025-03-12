package city;

import geo.Location;

public abstract class AbstractCity {

	protected String name;
	protected Location cityCentre;
	protected int numInhabitants;
	protected int size;
	
	public String getName() {
		return name;
	}
	
	public Location getCityCentre() {
		return cityCentre;
	}
	
	public int getNumInhabitants() {
		return numInhabitants;
	}
	
	public int getSize() {
		return size;
	}
	
}