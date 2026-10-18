package tutorial;

public class Player {
    private String name;
    private static int jumlahPlayer;
    //Overloading constructor

    //opsi 1:
    public Player(String name){
        this.name = name;
        Player.jumlahPlayer++;
    }

    //opsi 2:
    public Player(){
        Player.jumlahPlayer++;
        this.name = "player " + Player.jumlahPlayer;
    }

    public void show(){
        System.out.println("Name : " + this.name);
    }
}
