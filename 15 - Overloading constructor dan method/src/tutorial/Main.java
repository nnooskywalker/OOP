package tutorial;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Asta");
        Player player2 = new Player("Zoro");
        Player player3 = new Player();
        Player player4 = new Player();

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overloading pada method
        double a = Matematika.kali(10, 2.5);
        int b = Matematika.kali(10, 2);

        System.out.println(a);
        System.out.println(b);
        
        
    }
}
