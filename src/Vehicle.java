import java.util.ArrayList;

public abstract class Vehicle {

	private String brand;
	private String model;
	private int year;
	private int fuelconsumption;
	private String colour;
	
public Vehicle (String brand, String model, int year, int fuelconsumption, String colour) {
	
	this.brand=brand;
	this.model=model;
	this.year=year;
	this.fuelconsumption=fuelconsumption;
	this.colour=colour;
}
	
public String getbrand() {
	return brand;
	
}
public String getmodel() {
	return model;
}
public int getyear() {
	return year;
}

public int getfuelconsumption() {
	return fuelconsumption;
}
public String getcolour() {
	return colour;
}

public static void add() {
	
	
}

public static void add(ArrayList<String> vehiclelist) {
	// TODO Auto-generated method stub
	
}

}