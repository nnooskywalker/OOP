package pet;

public class Dog extends Pet implements Groom, Train{
	public Dog() {
		super();
	}
	
	public void groom() {
		int minHunger = ((int) (Math.random() * (30 - 20 + 1)) + 20);
		int minEnergy = ((int) (Math.random() * (40-30+1)) + 30);
		int plusSkill = ((int) (Math.random() * (20-10+1)) + 10);
		
		this.hunger = this.hunger - minHunger;
		this.energy = this.energy - minEnergy;
		this.skill = this.skill + plusSkill;
		
		System.out.println("Grooming...");
		System.out.println("Energy -" + minEnergy);
		System.out.println("Hunger -" + minHunger);
		System.out.println("Skill +" + plusSkill);
		System.out.println("\n");
	}
	
	public void train() {
		int minHunger = ((int) (Math.random() * (50 - 20 + 1)) + 20);
		int minEnergy = ((int) (Math.random() * (50 - 30 + 1)) + 30);
		int plusSkill = ((int) (Math.random() * (30 - 20 + 1)) + 20);
		this.hunger = this.hunger - minHunger;
		this.energy = this.energy - minEnergy;
		this.skill = this.skill + plusSkill;
		
		System.out.println("\nTraining...");
		System.out.println("Energy -" + minEnergy);
		System.out.println("Hunger -" + minHunger);
		System.out.println("Skill +" + plusSkill);
		System.out.println("\n");
	}
	
	public void displayInfo() {
		System.out.println("--Pet Dog--");
		this.showInfo();
	}
}
