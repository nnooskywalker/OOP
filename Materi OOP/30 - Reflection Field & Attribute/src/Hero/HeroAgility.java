package Hero;

public class HeroAgility extends Hero{
    public String nickname;
    private String heroType = "Agility";

    public HeroAgility(String name, double health){
        super(name, health);
    }

    public void display(){
        super.display();
        System.out.println("HeroType: " + this.heroType);
        System.out.println("Nickname : " + this.nickname);
    }

    private void setHeroType(String heroType){
        this.heroType = heroType;
    }
}
