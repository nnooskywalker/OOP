package parent;

public class Beverage {
	private String name;
	private double price;
	
	public Beverage(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public void display() {
		System.out.println("Display Beverages");
	}
	
	
	
}
