package main;

import city.City;
import geo.Location;

public class Main {

	public static void main(String[] args) {
		City c = new City("Klerksdorp", new Location(0, 0));
		System.out.println(c.getName());
	}

}
