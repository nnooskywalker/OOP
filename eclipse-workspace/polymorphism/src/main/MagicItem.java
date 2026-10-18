package main;



public class MagicItem extends Item {
	protected int magicDamage;
		
	public MagicItem(String name, int price, int magicDamage) {
		super(name, price);
		this.magicDamage = magicDamage;
	}
	
	@Override
	protected void getDetail() {
		System.out.println(name + " - " + price + " - damage : " + this.magicDamage);
	}
	
	protected int calDamage(int level) {
		return level*magicDamage;
	}
	
}
	
