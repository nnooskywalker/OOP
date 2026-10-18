package game;

public class Weapon {
	private int id;
	private String name;
	private int damage;
	
	public Weapon(int id, String name, int damage) {
		this.id = id;
		this.name = name;
		this.damage = damage;
	}
	public String getName() {
		return name;
	}



	public int getDamage() {
		return damage;
	}


	
	
}
