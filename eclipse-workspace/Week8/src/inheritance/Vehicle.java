package inheritance;

public class Vehicle {
	public int roda;
	public String name;
	
	public Vehicle(int roda, String name) {
		this.roda = roda;
		this.name = name;
	}
	
	public void gas() {
		System.out.println(name + " jalan....");
	}
	
	public void rem() {
		System.out.println(name + " berhenti");
	}
	
	public void printInfo() {
		System.out.println(name + " - " + roda);
	}
}
