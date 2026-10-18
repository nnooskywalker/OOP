package Vehicle;

public class vehicle {
    private String name;
    private int fuel;
    private int kilo;

    public vehicle(String nameInput, int fuelInput, int kiloInput){
        this.name = nameInput;
        this.fuel = fuelInput;
        this.kilo = kiloInput;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Fuel : " + this.fuel + " l");
        System.out.println("Km : " + this.kilo);
    }

    public String getName(){
        return this.name;
    }

    public int getFuel(){
        return this.fuel;
    }

    public int getKm(){
        return this.kilo;
    }

    
}
