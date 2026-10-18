package tutorial;

public class HeroAgility extends Hero{
    String type = "Agility";

    HeroAgility(String nama){
        super(nama);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type\t: " + type + "\n");
    }

    public void showOff(){
        System.out.println("Aku adalah agilityyy");
    }
}
