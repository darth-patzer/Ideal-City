package main;

import city.City;
import geo.Location;
import graphics.WindowManager;

public class Main {

	public static void main(String[] args) {
		WindowManager.InitializeWindow();
		City c = new City("Klerksdorp", new Location(0, 0));
		System.out.println(c.getName());
	}

}
