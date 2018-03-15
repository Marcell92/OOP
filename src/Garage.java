import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehiclelist = new ArrayList<Vehicle>();  //type in the arraylist will be Vehicle so I can add motorbikes and cars and buses and stuff
	
	
	public void addVehicle(Vehicle vehicle) {
		
		vehiclelist.add(vehicle);
	}
	
	
	public int money(Vehicle vehicle) {
		
		return vehicle.getyear()*10;
	}
	
	public ArrayList<Vehicle> getvehiclelist() {
		return vehiclelist;
	}
	
	
	public int billvehicle(Vehicle specificvehicle) {
	
	for(Vehicle vehicle1: vehiclelist){
		
		if(vehicle1==specificvehicle) {
			
        if(vehicle1 instanceof Car) {
        	
        	Car car1 = (Car) vehicle1;
        	return car1.getdoors()*10;
        	
        }
        
       if(vehicle1 instanceof Motorbike) {
        	
        	Motorbike motor1 = (Motorbike) vehicle1;
        	return motor1.getengine()*2;
        	
        }
       
       if(vehicle1 instanceof Bus) {
       	
       	Bus bus1 = (Bus) vehicle1;
       	return bus1.getwheels()*50;
	}
	
	
		}
}
	return 0;
	}
	
	public ArrayList<Vehicle> removeVehicle(Vehicle vehicle) {
		vehiclelist.remove(vehicle);
		return vehiclelist;
	}
	
	public String toString(Vehicle vehicle) {
		return "I removed: " + vehicle + " from the garage because I fixed it" ;
		
	}
	
	
	public ArrayList<Vehicle> emptyTheGarage() {
		vehiclelist.clear();
		return vehiclelist;
	}
	
	
	

}
