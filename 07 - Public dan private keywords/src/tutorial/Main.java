package tutorial;

class player{
    String name; // default, bisa dibaca dan ditulis dari luar class
    public int exp; // public, bisa dibaca dan ditulis dari luar class
    private int health; //private, hanya bisa dibaca dan ditulis di dalam class saja

    player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    //default modifier access
    void display(){
        tambahExp(); //contoh akses private method
        System.out.println("\nName\t:" + this.name);
        System.out.println("exp\t: " + this.exp);
        System.out.println("health\t: " + this.health);
    }

    //public
    public void ubahNama(String newName){
        this.name = newName;
    }

    //private
    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main{
    public static void main(String[] args) {
        player player1 = new player("Marni", 0,100);

        //default
        System.out.println(player1.name);//membaca data
        player1.name = "Surti";
        System.out.println(player1.name);//membaca data

        //public 
        System.out.println(player1.exp); //membaca data
        player1.exp = 100; //menulis data
        System.out.println(player1.exp);

        //private (tidak bisa diakses)
        // System.out.println(player1.health);
        // player1.health = 200;
        // System.out.println(player1.health);

        //methods

        //default
        player1.display();

        //public
        player1.ubahNama("Tejo");
        player1.display();

        //private (tidak bisa)

        //player1.tambahExp();
    


    }
}
