package product;

public abstract class Product {
	 String name;
	 String category;
	 double price;
	
	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public abstract void showInfo();
	
	public String getName() {
		return this.name;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public double getPrice() {
		return this.price;
	}
}
