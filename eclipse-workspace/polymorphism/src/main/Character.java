package main;


public class Character {
	protected String name, type;
	
	public Character(String nameInput, String typeInput) {
		this.name = nameInput;
		this.type = typeInput;
	}
	
	//Overloading
	void showInfo() {
		System.out.println(this.name + " - " + this.type);
	}
	
	String showInfo(int level) {
		return this.name + " - " + this.type + "- level: " + level;
	}
}
