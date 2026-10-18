package pet;

public abstract class Pet {
	protected int day;
	protected int level;
	protected int skill;
	protected int energy;
	protected int hunger;
	
	
	public Pet() {
		this.day = 1;
		this.level = 1;
		this.skill = 0;
		this.energy = 100;
		this.hunger = 100;
	}
	
	public void feed() {
		this.hunger += 10;
		this.energy -= 10;
		
		System.out.println("Eating...");
		System.out.println("Hunger +" + 10);
		System.out.println("Energy -" + 10);
		System.out.println("\n");
	}
	
	public void sleep() {
		int minHunger = ((int) (Math.random() * (20 - 10 + 1)) + 10);
		this.energy += 100;
		this.day += 1;
		this.hunger = this.hunger - minHunger;
		
		System.out.println("Sleeping...");
		System.out.println("Recover energy");
		System.out.println("Hunger -" + minHunger);
		
	}
	
	public void levelUp() {
		if (this.skill >= 100) {
			this.level += 1;
			this.skill %= 100;
			System.out.println("Skill = " + this.skill);
			System.out.println("Level Up !");
			System.out.println("Current Level = " + this.level);
			System.out.println("Remaining Skill = " + this.skill);
			System.out.println("\n");
			return;
		}
	}
	
	public boolean slowDown() {
		if (this.energy <= 0 || this.hunger <= 0) {
			System.out.println("Game Over");
			System.out.printf("You survive for %d days(s)\n", this.day);
			System.out.println("Last Level : " + this.level);
			System.out.println("\n");
			return false;
		}
		return true;
	}
	
	public void showInfo() {
		System.out.println("Day : " + this.day);
		System.out.println("Level : " + this.level);
		System.out.println("Energy : " + this.energy);
		System.out.println("Hunger : " + this.hunger);
		System.out.println("Skill : " + this.skill);
		System.out.println("\n");
	}
	

	
	
}
