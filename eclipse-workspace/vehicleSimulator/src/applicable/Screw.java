package applicable;
import vehicle.*;
public class Screw implements Applyable{
	private int screw;
	
	public Screw(int screw) {
		this.screw = screw;
	}
	
	public void displayInfo() {
		System.out.printf("Screw - %d\n", this.getScrew());
	}
	
	public void apply(Vehicle v) {
		v.setSrew(screw);
	}
	
	public int getScrew() {
		return this.screw;
	}

	
	public void useScrew(int screw) {
		this.screw -= screw;
	}
	
	public void setScrew(int newScrew) {
		this.screw += newScrew;
	}
}
