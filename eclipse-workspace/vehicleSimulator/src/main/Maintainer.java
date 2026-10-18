package main;
import vehicle.*;
import applicable.*;

public interface Maintainer {
	void service(Vehicle vehicle, Applyable serviceAppliant);
	void displayVehicles();
}
