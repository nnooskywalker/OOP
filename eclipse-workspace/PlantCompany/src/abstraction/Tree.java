package abstraction;

public class Tree extends Plant implements Fretilible, Prunable {
	public Tree(String name, int height) {
		super(name, height);
	}
	
	@Override
	public void fertilizing() {
		System.out.println("Fertilizing " + this.name + " Tree");
	}
	
	public void pruning() {
		System.out.println("Pruning " + this.name + " Tree");
	}
}
