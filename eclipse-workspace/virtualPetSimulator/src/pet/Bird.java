package pet;

public class Bird extends Pet implements Train{
	public Bird() {
		super();
	}
	
	public void train() {
		int minHunger = ((int) (Math.random() * (50 - 20 + 1)) + 20);
		int minEnergy = ((int) (Math.random() * (50 - 30 + 1)) + 30);
		int plusSkill = ((int) (Math.random() * (30 - 20 + 1)) + 20);
		this.hunger = this.hunger - minHunger;
		this.energy = this.energy - minEnergy;
		this.skill = this.skill + plusSkill;
		
		System.out.println("Training...");
		System.out.println("Energy -" + minEnergy);
		System.out.println("Hunger -" + minHunger);
		System.out.println("Skill +" + plusSkill);
		System.out.println("\n");
	}
	
	public void displayInfo() {
		System.out.println("--Pet Bird--");
		this.showInfo();
	}
}
