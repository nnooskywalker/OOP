package Hero;

public class heroIntel extends hero{
    public heroIntel(String name, int health){
        super(name, health);
    }

    @Override
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
    }
}
