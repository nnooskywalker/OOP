package Tutorial;

//visibilty default
class Player {
    private String name;


    Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    void show(){
        System.out.println("Player Name : " + this.name);
  
    }
}
