package storeItem;

import java.util.ArrayList;

public class Store {
	private  String id;
	private String name;
	private final int maxItems;
	private int count;
	private ArrayList<Items> item = new ArrayList<>();
	
	
	public Store(String id, String name, int maxItems) {
		this.id = id;
		this.name = name;
		this.maxItems = maxItems;
		count = 0;
	}
	
	public String getID() {
		return this.id;
	}
	
	public int getMaxItems() {
		return this.maxItems;
	}

	
	
	public void validateisFull(Items it) {
		if (count < this.maxItems) {
			item.add(it);
			System.out.println("Item Sucesfully Added to the Store");
		}
		else {
			System.out.println("Item Was Full");
		}
		count++;
	}
	
	
	public ArrayList<Items> getItem(){
		return this.item;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void displayItems() {
		if (this.item.isEmpty()) {
			System.out.println("No Item in this store\n");
		}
		else {
			for(Items it : item) {
				System.out.println("ID : " + it.getID());
				System.out.println("Name : " + it.getName());
				System.out.println("Brand Name : " + it.getBrandName());
				System.out.println("Price : " + it.getPrice());
				System.out.println("Quantity : " + it.getQuantity());
				System.out.println("\n");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
