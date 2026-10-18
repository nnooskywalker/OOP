package abstraction;

public abstract class Plant {
	protected String name;
	protected String color;
	protected int growthHeight;
	
	public Plant(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Plant(String name, int growthHeight) {
		this.name = name;
		this.growthHeight = growthHeight;
	}
	
	public abstract void fertilizing();
	
	
	
}
