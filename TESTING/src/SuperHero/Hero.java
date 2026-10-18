package SuperHero;

public class Hero {
    public String name;
    public double power, defence;

    Hero(String name, double power, double defence){
        this.name = name;
        this.power = power;
        this.defence = defence;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Power : " + this.power);
        System.out.println("Defence : " + this.defence + "\n");
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " attack " + enemy.name);
    }

    public void attack(HeroIntel enemy){
        System.out.println(this.name + " attack " + enemy.name);
    }

    public void attack(HeroAbstract enemy){
        System.out.println(this.name + " attack " + enemy.name);
    }
}