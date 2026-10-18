package utils;
import java.util.ArrayList;

public class Airport {
	private String name;
	private ArrayList<Flight> flight;
	private int income;
	
	
	public Airport(String name,int income) {
		this.name = name;
		this.income = income;
		this.flight = new ArrayList<>();
	}
	
	public void addFlight(Flight f) {
		flight.add(f);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
