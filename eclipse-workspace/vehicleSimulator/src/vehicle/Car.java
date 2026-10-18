package vehicle;
import applicable.*;
import requirements.*;

public class Car extends Vehicle implements Drivable{
	private String type;
	
	public Car(String name, int year, Fuel fuel, Screw screw, Coolant cool, ServiceRequirement sc, String type) {
		super(name, year, fuel, screw, cool, sc);
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void start() {
		this.setStart(true);
		System.out.println(this.getName() + " is driving...");
	}
	
	public void stop() {
		
	}
	
	public void drive() {
		if (this.getStart() == false) {
			System.out.println("This vehicle has not started yet!");
		}
		else {
			System.out.println("This vehicle is already on the road!");
			
			if (this.getFuel().getFuel() <= 0) {
				System.out.println(this.getName() + " is needed for fuel service!");
				return;
			}
			if (this.getScrew().getScrew() <= 0) {
				System.out.println(this.getName() + " is needed for screw service!");
				return;
			}
			if (this.getCoolant().getCoolant() <= 0) {
				System.out.println(this.getName() + " is needed for coolant service!");
				return;
			}
			
			this.getFuel().useFuel(50);
			this.getScrew().useScrew(200);
			this.getCoolant().useCoolant(50);
		}
	}
	
	public void showInfo() {
		System.out.printf("Car - model : %s, Year : %d (%s)\n",this.getName(), this.getYear(), this.getType());
		this.showInfo();
	}
	
	

}
