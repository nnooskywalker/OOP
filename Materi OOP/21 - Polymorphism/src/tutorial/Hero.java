package tutorial;

public class Hero {
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    public void display(){
        System.out.println("Name \t: " + this.nama );
    }

    public void attack(Hero enemy){
        System.out.println( this.nama + "Serang " + enemy);
    }
}
