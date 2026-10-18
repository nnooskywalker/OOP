package abstraction;

public class Flower extends Plant implements Waterable, Fretilible {
	
	public Flower(String name, String color) {
		super(name, color);
	}
	
	@Override
	public void fertilizing() {
		System.out.println("Fertilizing " + this.name + " flower");
	}
	
	public void watering() {
		System.out.println("Watering " + this.name + " flower");
	}

}
