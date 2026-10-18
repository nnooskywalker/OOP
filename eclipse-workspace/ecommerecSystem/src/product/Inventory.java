package product;
import java.util.ArrayList;

public class Inventory {
	ArrayList<Product> inventoryList;
	public Inventory() {
		inventoryList = new ArrayList<>();
	}
	
	public void add(Product p) {
		inventoryList.add(p);
		System.out.println(p.category + " product added : " + p.name);
	}
	
	
	public void showInventory() {
		System.out.println("===== INVENTORY =====");
		for(Product p : inventoryList) {
			p.showInfo();
		}
	}
}
