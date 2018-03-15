
public class Motorbike extends Vehicle {
	
	private int engine;

	public Motorbike(String brand, String model, int year, int fuelconsumption, String colour, int engine) {
		super(brand, model, year, fuelconsumption, colour);
		this.engine=engine;
		// TODO Auto-generated constructor stub
	}

	public int getengine() {
		return engine;
	
}
	
	public String toString () {
		return "brand: " + getbrand() + " model: " + getmodel() + " year: " + getyear() + " fuelconsumption: " + getfuelconsumption() + " colour " + getcolour() + " engine: " + engine;
	}
	
}	
