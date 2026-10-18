package Testing;

class person{
    String name;
    private int health;
    weapon dordor;
    armor baju;
   


    person(String name, int health){
        this.name = name;
        this.health = health;
    }


    public void show(){
        System.out.println("Name : " + this.name);
        System.out.println("Weapon : " + dordor.name);
        System.out.println("Armor : " + baju.name);
    }

    public void attack(person orang){
        System.out.println(this.name + " attack " + orang.name + " with damage " + dordor.damage);

        health -= accumulation(orang);

        if (health <=0){
            System.out.println(orang.name + "is death");
        }
    }

    private double accumulation(person orang){
        double accumulation = dordor.damage - orang.baju.defence;

        if (orang.baju.defence < dordor.damage){
            System.out.println("Player leave the game...");
        }
      
        
        return accumulation;
    }

    public void equipWeapon(weapon dordor){
        this.dordor = dordor;
    }

    public void equipArmor(armor baju){
        this.baju = baju;
    }


}

class weapon{
    String name;
    double damage;

    weapon(String name, double damage){
        this.name = name;
        this.damage = damage;
    }    
}

class armor{
    String name;
    double defence;


    armor(String name, double defence){
        this.name = name;
        this.defence = defence;
    }
}


public class Main3{
    public static void main(String[] args) {
        person orang1 = new person("Ucup", 1000);
        person orang2 = new person("Marni", 20000);
        weapon M416 = new weapon("M416", 10000);
        weapon scarL = new weapon("SCAR - L", 100);
        armor baju = new armor("Baju besi", 10000);
        armor kaos = new armor("Kaos", 1);

        orang1.equipWeapon(M416);
        orang1.equipArmor(baju);

        orang2.equipWeapon(scarL);
        orang2.equipArmor(kaos);

        System.out.println("--------Episode 1 : The Sorcerer--------");
        orang1.attack(orang2);

        orang2.show();


    }
}
