package menu;
import parent.Beverage;


public class Coffee extends Beverage {
	private String beanType;
	
	public Coffee(String name, double price, String bean) {
		super(name, price);
		this.beanType = bean;
	}
	
	
	@Override
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Price : " + getPrice());
		System.out.println("Type : " + this.beanType);
	}
	
	
}
