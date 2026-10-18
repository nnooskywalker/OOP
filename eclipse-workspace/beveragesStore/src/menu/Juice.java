package menu;
import parent.Beverage;



public class Juice extends Beverage {
	private String fruit;
	
	public Juice(String name, double price, String fruit) {
		super(name, price);
		this.fruit = fruit;
	}
	
	
	@Override
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Price : " + getPrice());
		System.out.println("Fruit : " + this.fruit);
	}
}
