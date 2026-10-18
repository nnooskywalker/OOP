package main;


public class Item {
	protected String name;
	protected int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	protected  void getDetail() {
		System.out.println(this.name + " - " + this.price);
	}
}
