package menu;
import parent.Beverage;


public class Tea extends Beverage {
	private String teaType;
	
	public Tea(String name, double price, String tea) {
		super(name, price);
		this.teaType = tea;
	}
	
	
	@Override
	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Price : " + getPrice());
		System.out.println("Type : " + this.teaType);
	}
}
