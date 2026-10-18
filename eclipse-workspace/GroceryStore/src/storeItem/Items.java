package storeItem;

public class Items {
	private String id;
	private String name;
	private String brandName;
	private int price;
	private int quantity;
	
	
	public Items(String id, String name, String brandName, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getID() {
		return this.id;
	}
	
	public void setQuantity( int newQuantity) {
		this.quantity = newQuantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
