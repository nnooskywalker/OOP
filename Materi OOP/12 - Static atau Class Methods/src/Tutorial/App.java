package Tutorial;
import java.util.ArrayList;

class Player{
    private String name;
    private static int numOfPlayers;
    private static ArrayList<String> nameList = new ArrayList<String>();

    Player(String name){
        this.name = name;
        Player.numOfPlayers++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }

    //static method
    static void showNumOfPlayer(){
        System.out.println("Number of Player = " + Player.numOfPlayers);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
       Player player1 = new Player("Saitama");
       Player player2 = new Player("Garou");
       Player player3 = new Player("All Mighty");

       player1.show();
       player2.show();
       player3.show();

       Player.showNumOfPlayer();
       
       System.out.println("Names = " + Player.getNames());
  
    }
}
