package tutorial;

public class heroAgility extends Hero {
    String type;

    heroAgility(String name, double health){
        super(name, health);
        this.type = "Agility";
    }

    @Override
    public void display(){
        System.out.println(this.getName() + " is an " + this.type + " Hero");
    }
}
