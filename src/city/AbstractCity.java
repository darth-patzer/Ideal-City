package city;

import geo.Location;

public abstract class AbstractCity {

	protected String name;
	protected Location location;
	protected int numInhabitants;
	protected int size;
	
	public String getName() {
		return name;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public int getNumInhabitants() {
		return numInhabitants;
	}
	
	public int getSize() {
		return size;
	}
	
}