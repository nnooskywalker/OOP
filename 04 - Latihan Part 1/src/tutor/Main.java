package tutor;

// player
class player{
    String nama;
    double health;
    int level;

    //object member
    weapon weapon;
    armor armor;

    player(String name, double health){
        this.nama = name;
        this.health = health;
    }

    void attack(player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.nama + " attacking " + opponent.nama + " with damage " + attackPower);

        process(attackPower);
    }

    void process(double attackPower){
        double damage;

        if (attackPower > this.armor.defencePower){
            damage = attackPower - this.armor.defencePower;
        }
        else{
            damage = 10;
        }

        this.health -= damage;

        System.out.println(this.nama + " gets damage " + damage);
    }







    void equipWeapon(weapon dordor){
        this.weapon = dordor;
    }

    void equipArmor(armor armor){
        this.armor = armor;
    }

    void show(){
        System.out.println("\nName : " + this.nama);
        System.out.println("Health : " + this.health);
        this.weapon.show();
        this.armor.display();
    }


}

// weapon

class weapon{
    double attackPower;
    String name;

    weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void show(){
        System.out.println("Weapon : " + this.name);
        System.out.println("Attack : " + this.attackPower);
    }
}


// armor
class armor{
    double defencePower;
    String name;

    armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name);
        System.out.println("Defence : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat object player
        player player2 = new player("Otong", 120);
        player player1 = new player("Ucup", 100);
        
        //membuat object weapon
        weapon pedang = new weapon("Pedang", 20);
        weapon ketapel = new weapon("Ketapel", 1000);

        //membuat armor
        armor bajuBesi = new armor("Baju besi", 100.50);
        armor kaos = new armor("Kaos", 1.5);

        player1.equipWeapon(pedang);
        player2.equipWeapon(ketapel);

        player1.equipArmor(kaos);
        player2.equipArmor(bajuBesi);

        System.out.println("\nChapter 1 : The punishment\n");
        player1.attack(player2);
        player2.show();

        System.out.println("\n");

        player2.attack(player1);
        player1.show();


        

    }
}
