package tutorial;

public class Hero {
    //attribute
    private String name;
    private double health, attackPower;

    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    public String getName(){
        return this.name;
    }

    public double getHealth(){
        return this.health;
    }

    public void setHealth(double damage){
        this.health -= 0.5*damage;
    }

    public double getAttackPower(){
        return this.attackPower;
    }

    public void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    public void takeDamage(double damage){
        System.out.println(this.name + " receive damage " + damage);
        this.health -= damage;
    }

    public void display(){
        if (this.health > 0){
            System.out.println("\nName : " + this.name);
            System.out.println("Health : " + this.health);
            System.out.println("Power : " + this.attackPower);
        }
        else if (this.health <= 0){
            System.out.println("\n" + this.name + " left the game");
        }
    }


}
