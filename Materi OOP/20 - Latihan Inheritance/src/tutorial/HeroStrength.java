package tutorial;

public class HeroStrength extends Hero {
    String type = "Strength";
    //subclass constructor
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type : " + this.type);
    }

    @Override
    public void takeDamage(double damage){
        System.out.println(getName() + " receive half damage " + damage + " -> " + 0.5*damage);
        setHealth(damage);
    }
}
