package abstraction;

public class HousePlant extends Plant implements Waterable, Prunable, Fretilible {
	public HousePlant(String name, int growthTime) {
		super(name, growthTime);
	}
	
	@Override
	public void fertilizing() {
		System.out.println("Fertilizing " + this.name + " House Plant");
	}
	
	public void watering() {
		System.out.println("Watering " + this.name + " House Plant");
	}
	
	public void pruning() {
		System.out.println("Pruning " + this.name + " House Plant");
	}
}
