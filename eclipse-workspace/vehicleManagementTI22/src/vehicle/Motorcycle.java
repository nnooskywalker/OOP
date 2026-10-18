package vehicle;
import applicable.*;
import requirements.*;
public class Motorcycle extends Vehicle implements Drivable{
	boolean hasHelmetStorage;
	
	public Motorcycle(String name, int year, Fuel fl, Screw sr, Coolant cl, ServiceRequirement sq, boolean helmet) {
		super(name, year, fl, sr, cl, sq);
		this.hasHelmetStorage = helmet;
	}
	
	public void drive() {
		this.getFuel().useFuel(25);
		this.getScrew().useScrew(150);
		this.getCoolant().useCoolant(25);
	}
}
