package vehicle;
import applicable.*;
import requirements.*;
public class Motorcycle extends Vehicle implements Drivable{
	private boolean hasHelmetStorage;
	
	public Motorcycle(String name, int year, Fuel fuel, Screw screw, Coolant coolant, ServiceRequirement bsc, boolean helmetStorage) {
		super(name, year, fuel, screw, coolant, bsc);
		this.hasHelmetStorage = helmetStorage;
	}
	
	public boolean getHelmetStorage() {
		return this.hasHelmetStorage;
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
			
			this.getFuel().useFuel(25);
			this.getScrew().useScrew(150);
			this.getCoolant().useCoolant(25);
		}
	}
	
	public void showInfo() {
		if (this.getHelmetStorage() == true) {
			System.out.printf("Motorcycle - model : %s, Year : %d (With helmet Storage)\n",this.getName(), this.getYear());
		}
		else {
			System.out.printf("Motorcycle - model : %s, Year : %d (Without helmet Storage)\n",this.getName(), this.getYear());
		}
		this.showInfo();
	}
	
}
