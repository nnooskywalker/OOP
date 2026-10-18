package vehicle;
import requirements.*;

import applicable.*;

public abstract class Vehicle {
	private String name;
	private int year;
	private Fuel fuel;
	private Screw screw;
	private Coolant coolant;
	private ServiceRequirement requir;
	private boolean isStart;
	
	public Vehicle(String nameInput, int yearInput, Fuel fuelInput, Screw screwInput, Coolant coolInput, ServiceRequirement requirInput) {
		this.name = nameInput;
		this.year = yearInput;
		this.fuel = fuelInput;
		this.screw = screwInput;
		this.coolant = coolInput;
		this.requir = requirInput;
		this.isStart = false;
	}
	
	public void setStart(boolean set) {
		this.isStart = set;
	}
	
	
	public boolean getStart() {
		return this.isStart;
	}
	
	public Fuel getFuel() {
		return this.fuel;
	}
	
	public Screw getScrew() {
		return this.screw;
	}
	
	public Coolant getCoolant() {
		return this.coolant;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setFuel(int newFuel) {
		this.getFuel().setFuel(newFuel);
	}
	
	public void setCoolant(int newCoolant) {
		this.getCoolant().setCoolant(newCoolant);
	}
	
	public void setSrew(int newScrew) {
		this.getScrew().setScrew(newScrew);
	}
	
	
	
	public void showInfo() {
		System.out.println("Components : ");
		System.out.println("-> Fuel : " + this.getFuel().getFuel());
		System.out.println("-> Screw : " + this.getScrew().getScrew());
		System.out.println("-> Coolant : " + this.getCoolant().getCoolant());
	}
	
	
}
