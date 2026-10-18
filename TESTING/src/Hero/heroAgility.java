package Hero;

public class heroAgility extends hero{
    public heroAgility(String name, int health){
        super(name, health);
    }

    @Override
    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
    }
}
