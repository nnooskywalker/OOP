package tutorial;

public class HeroIntelligent extends Hero {
    private String type = "Intelligent";

    HeroIntelligent(String nameInput, double attackInput, double healthInput, double armor){
        super(nameInput, attackInput, healthInput + armor);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Type : " + this.type);
    }

}
