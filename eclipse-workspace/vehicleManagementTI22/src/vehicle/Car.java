package vehicle;
import applicable.*;
import requirements.*;
public class Car extends Vehicle implements Drivable{
	private String type;
	
	public Car(String name, int year, Fuel fl, Screw sr, Coolant cl, ServiceRequirement sq, String type) {
		super(name, year, fl, sr, cl, sq);
		this.type = type;
	}
	
	public void start() {
		this.setOn(true);
		System.out.println(this.getName() + " is driving");
		
	}
	
	public void drive() {
		if (this.getOn() == false) {
			System.out.println("This vehicle has not started yet!");
		}
		else {
			this.getFuel().useFuel(50);
			this.getScrew().useScrew(200);
			this.getCoolant().useCoolant(50);
			System.out.println("This vehicle is already on the road");
		}
		
		
		
	}
	
	
	
	
}
