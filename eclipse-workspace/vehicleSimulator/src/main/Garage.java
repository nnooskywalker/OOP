package main;
import vehicle.*;
import applicable.*;
import java.util.ArrayList;
public class Garage implements Maintainer{
	String tittle;
	private ArrayList<Vehicle> vehicle;
	
	public Garage(String tittleInput){
		this.tittle = tittleInput;
		this.vehicle = new ArrayList<>();
		System.out.println("Garage " + this.tittle + " is operating...");
		
	}
	
	public void addVehicle(Vehicle v){
		this.vehicle.add(v);
	}
	
	public void service(Vehicle vh, Applyable service){
		service.apply(vh);
	}
	
	public void displayVehicles() {
		System.out.println("== Garage Vehicle List ==");
		
		for (Vehicle vh : vehicle) {
			vh.showInfo();
		}
	}
	
	
}

