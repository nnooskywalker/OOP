package applicable;

public class Screw {
	public int unit;
	
	public Screw(int unitInput) {
		this.unit = unitInput;
	}
	
	public int getScrew() {
		return this.unit;
	}
	
	public void useScrew(int newUnit) {
		this.unit -= newUnit;
	}
}
