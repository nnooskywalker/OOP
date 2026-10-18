package applicable;
import vehicle.*;
public class Coolant implements Applyable{
	private int coolant;
	
	
	public Coolant(int cool) {
		this.coolant = cool;
	}
	
	public void displayInfo() {
		System.out.printf("Screw - %dL\n", this.getCoolant());
	}
	
	public void apply(Vehicle v) {
		v.setCoolant(coolant);
	}
	
	public int getCoolant() {
		return this.coolant;
	}

	
	public void useCoolant(int cool) {
		this.coolant -= cool;
	}
	
	public void setCoolant(int cool) {
		this.coolant += cool;
	}
}
