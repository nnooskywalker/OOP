package product;

public class Food extends Product{
	String expiryDate;
	public Food(String name,String category, int price, String expiryDate) {
		super(name, category, price);
		this.expiryDate = expiryDate;
	}
	
	
	public void showInfo() {
		System.out.println(this.name + " | " + this.category + " | $" + this.price + " | Expiry Date : " + this.expiryDate);
		
	}
	
	
	
}
