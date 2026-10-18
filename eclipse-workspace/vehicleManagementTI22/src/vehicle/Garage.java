package vehicle;
import java.util.ArrayList;
import applicable.*;

public class Garage {
	private ArrayList<Vehicle> vehicle;
	
	public Garage(String name) {
		this.vehicle = new ArrayList<>();
		System.out.println(name + " is operating....");	
	}
	
	public void addVehicle(Vehicle vh) {
		this.vehicle.add(vh);
	}
	
	public void service(Vehicle vh, Coolant cl) {
	}
	
	public void service(Vehicle vh, Fuel fl) {
		
	}
	
	public void service(Vehicle vh, Screw sr) {
		
	}
	
	public void displayVehicles() {
		
	}
}
