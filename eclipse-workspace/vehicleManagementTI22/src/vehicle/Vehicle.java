package vehicle;
import applicable.*;
import requirements.*;
public class Vehicle {
	private String name;
	private int year;
	private Fuel fl;
	private Screw sr;
	private Coolant cl;
	private ServiceRequirement sq;
	private boolean isOn;
	
	public Vehicle(String nameInput , int yearInput, Fuel flInput, Screw srInput, Coolant clInput, ServiceRequirement sqInput) {
		this.name = nameInput;
		this.year = yearInput;
		this.fl = flInput;
		this.sr = srInput;
		this.cl = clInput;
		this.sq = sqInput;
		this.isOn = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Fuel getFuel() {
		return this.fl;
	}
	
	public Screw getScrew() {
		return this.sr;
	}
	
	public Coolant getCoolant() {
		return this.cl;
	}
	
	public boolean getOn() {
		return this.isOn;
	}
	
	public void setOn(boolean onoff) {
		this.isOn = onoff;
		
	}
	
}
