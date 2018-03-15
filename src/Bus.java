
public class Bus extends Vehicle {
	
	private int wheels;

	public Bus(String brand, String model, int year, int fuelconsumption, String colour, int wheels) {
		super(brand, model, year, fuelconsumption, colour);
		this.wheels=wheels;
		// TODO Auto-generated constructor stub
	}
	
	public int getwheels() {
		return wheels;

}
	
	public String toString () {
		return "brand: " + getbrand() + " model: " + getmodel() + " year: " + getyear() + " fuelconsumption: " + getfuelconsumption() + " colour: " + getcolour() + " wheels: " + wheels;
	}
}