package inheritance;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Car c = new Car(4,"ferrari",2);
		//c.gas();
		
		Vehicle v = new Car(4,"Lamborghini",2);
		if (v instanceof Car) {
			((Car) v).seat = 4;
		}
		
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(c);
		list.add(new Motorcycle(2, "beat"));
		
		for(Vehicle vc : list) {
			vc.printInfo();
		}
		
	}

}
