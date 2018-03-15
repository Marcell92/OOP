
public class Car extends Vehicle {

	private int doors; 
	public Car(String brand, String model, int year, int fuelconsumption, String colour, int doors) {
		super(brand, model, year, fuelconsumption, colour);
		this.doors=doors;
		
		// TODO Auto-generated constructor stub
	}

	
	public int getdoors() {
		return doors;
}
	
	public String toString () {
		return "brand: " + getbrand() + " model: " + getmodel() + " year: " + getyear() + " fuelconsumption: " + getfuelconsumption() + " colour: " + getcolour() + " doors: " + doors;
	}

}