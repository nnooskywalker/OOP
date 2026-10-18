package vehicle;
import applicable.*;
import requirements.*;
public class Truck extends Vehicle implements Drivable{
	private int cargoCapacity;
	
	public Truck(String name, int year, Fuel fuel, Screw screw, Coolant coolant, ServiceRequirement bsc, int capacity) {
		super(name, year, fuel, screw, coolant, bsc);
		this.cargoCapacity = capacity;
	}
	
	public int getCargoCapacity() {
		return this.cargoCapacity;
	}
	
	public void start() {
		this.setStart(true);
	}
	
	public void stop() {
		
	}
	
	public void drive() {
		if (this.getStart() == false) {
			System.out.println("This vehicle has not started yet!");
		}
		else {
			System.out.println("This vehicle is already on the road");
			
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
			
			this.getFuel().useFuel(100);
			this.getScrew().useScrew(500);
			this.getCoolant().useCoolant(125);
		}
	}
	
	public void showInfo() {
		System.out.printf("Truck - model : %s, Year : %d (Capacity : %d)\n",this.getName(), this.getYear(), this.getCargoCapacity());
		this.showInfo();
	}
	

}
