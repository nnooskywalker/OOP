package tutorial;

public class heroIntel extends Hero {
    String type;

    heroIntel(String name, double health){
        super(name, health);
        this.type = "Intel";
    }

    @Override
    public void display(){
        System.out.println(this.getName() + " is an " + this.type + " Hero");
    }


}
