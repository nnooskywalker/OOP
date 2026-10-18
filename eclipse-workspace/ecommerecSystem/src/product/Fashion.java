package product;

public class Fashion extends Product{
	String size;
	public Fashion(String name, String category, double price, String size) {
		super(name, category, price);
		this.size = size;
	}
	
	public void showInfo() {
		System.out.println(this.name + " | " + this.category + " | $" + this.price + " | Size : " + this.size);
	}
}
