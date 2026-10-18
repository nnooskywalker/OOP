package applicable;

public class Coolant {
	private int liter;
	
	public Coolant(int literInput) {
		this.liter = literInput;
	}
	
	public int getCoolant() {
		return this.liter;
	}
	
	public void useCoolant(int newLiter) {
		this.liter -= newLiter;
	}
	
	
}
