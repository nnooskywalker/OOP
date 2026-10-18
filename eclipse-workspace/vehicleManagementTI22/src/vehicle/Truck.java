package vehicle;
import applicable.*;
import requirements.*;
public class Truck extends Vehicle implements Drivable{
	private int cargoCapacity;
	
	public Truck(String name, int year, Fuel fl, Screw sr, Coolant cl, ServiceRequirement sq, int cargo) {
		super(name, year, fl, sr, cl, sq);
		this.cargoCapacity = cargo;
	}
	
	public void drive() {
		this.getFuel().useFuel(100);
		this.getScrew().useScrew(500);
		this.getCoolant().useCoolant(125);
	}
	
	
}
