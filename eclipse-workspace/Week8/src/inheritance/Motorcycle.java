package inheritance;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(int roda, String name) {
		super(roda, name);
	}
	
	
	public void standard() {
		System.out.println(name + "sedang di standard");
	}
	
	@Override
	public void printInfo() {
		System.out.println(roda + " - " + name);
	}
}
