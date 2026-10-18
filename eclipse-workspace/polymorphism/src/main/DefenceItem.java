package main;

public class DefenceItem extends Item {
	protected int defense;
	
	public DefenceItem(String name, int price, int defense) {
		super(name, price);
		this.defense = defense;
	}
	
	protected void getDetail() {
		System.out.println(name + " - " + price + " - defense : " + defense);
	}
	
	protected int calDefense(int level) {
		return level*defense+2;
	}
}
