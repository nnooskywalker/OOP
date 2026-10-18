package product;

public class Electronic extends Product{
	int warrantyMonths;
	public Electronic(String name, String category, double price, int warrantyMonths) {
		super(name, category, price);
		this.warrantyMonths = warrantyMonths;
	}
	
	public void showInfo() {
		System.out.println(this.name + " | " + this.category + " | $" + this.price + " | Warranty : " + this.warrantyMonths);
	}
}
