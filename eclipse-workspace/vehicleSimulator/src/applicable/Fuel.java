package applicable;
import vehicle.*;
public class Fuel implements Applyable{
	private int fuel;
	
	public Fuel(int fuelInput) {
		this.fuel = fuel;
	}
	
	public void displayInfo() {
		System.out.println("Fuel - " + this.getFuel() + "L");
	}
	
	public void apply(Vehicle v) {
		v.setFuel(fuel);
	}
	
	public int getFuel() {
		return this.fuel;
	}
	
	public void useFuel(int fuel) {
		this.fuel -= fuel;
	}
	
	public void setFuel(int fuel) {
		this.fuel += fuel;
	}
	
	
	
	
	
	
	
}
