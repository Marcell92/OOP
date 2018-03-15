
public class Main {

	public static void main(String[] args) {
	
		
		Car BMW = new Car ("BMW", "i8", 2018, 0, "blue", 2);
		Motorbike Suzuki = new Motorbike ("Suzuki", "GSX-R", 2016, 5, "black", 300);
		Bus Mercedes = new Bus ("Mercedes", "Travego", 2018, 20, "blue", 6);
		
		Garage garage = new Garage();
		
		garage.addVehicle(BMW);
		garage.addVehicle(Suzuki);
		garage.addVehicle(Mercedes);
		garage.money(BMW);
		        
		  
		  
		  System.out.println(garage.getvehiclelist());
		  System.out.println(garage.money(Mercedes));
		  System.out.println(garage.billvehicle(Mercedes));
		  System.out.println(garage.removeVehicle(Mercedes));
		  System.out.println(garage.toString(Mercedes));
		  System.out.println(garage.emptyTheGarage());
	}
	}

