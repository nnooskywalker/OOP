package Grocery.management;

import java.util.ArrayList;



import Grocery.items.items;

public class Store {
	String id;
	String name;
	int max;
	private ArrayList <items> item;

	public Store() {
		max = 5;
		this.item = new ArrayList<items>();
	}
	public String getName() {
		return name;
	}


	public ArrayList<items> getItem() {
		return item;
	}


	public void setItem(ArrayList<items> item) {
		this.item = item;
	}
	
	
	public void addItem(items i) {
		item.add(i);
	}
	
	public void showAllItems() {
		for(items it : item) {
			System.out.println();
		}
	}
	
	public items getItemByName(String search) {
		
	}
	
	
	
}
