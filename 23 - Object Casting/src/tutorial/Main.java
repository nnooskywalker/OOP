package tutorial;

public class Main {
    public static void main(String[] args) {
        
        // object dengan class 
        heroIntel hero1 = new heroIntel("Ucup", 100);

        hero1.display();

        Hero heroUp = (Hero) hero1;

        heroUp.display();
        // ada field dan method yang hilang
        // System.out.println(heroUp.type);

        Hero heroReg = new Hero("Otong", 100);

        heroReg.display();

        // down casting

        // kita coba dari intel ke hero biasa lalu kita balikkan ke intel
        heroIntel hero2 = (heroIntel) heroUp;

        hero2.display();
    }
}
