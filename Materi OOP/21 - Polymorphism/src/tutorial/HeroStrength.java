package tutorial;

public class HeroStrength extends Hero {

    String type = "Strength";
    HeroStrength(String nama){
        super(nama);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type\t: " + this.type + "\n");
    }
    
}
