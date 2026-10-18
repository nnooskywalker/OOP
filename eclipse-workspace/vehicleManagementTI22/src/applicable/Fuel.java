package applicable;

public class Fuel {
	private int liter;
	
	public Fuel(int literInput) {
		this.liter = literInput;
	}
	
	public int getFuel() {
		return this.liter;
	}
	
	public void useFuel(int newLiter) {
		this.liter -= newLiter;
	}
}
