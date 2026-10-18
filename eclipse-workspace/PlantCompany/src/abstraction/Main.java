package abstraction;
import java.util.ArrayList;


public class Main {
	public static void main (String[] args) {
		ArrayList<Plant> plants = new ArrayList<>();
		
		plants.add(new Flower("Rose", "Red"));
		plants.add(new Flower("Tulip", "Yellow"));
		plants.add(new HousePlant("Aloe Vera", 180));
		plants.add(new Tree("Red Black", 30));
		
		//1. Watering
		for (Plant plant : plants) {
			if (plant instanceof Waterable w) {
				w.watering();
			}
			else if (plant instanceof Prunable p) {
				p.pruning();
			}
		}
		
	}
}
