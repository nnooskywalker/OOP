package tutorial;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.age = 20;
        
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "otong";
        hero2.age = 18;
        
        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Michael";
        hero3.age = 22;

        hero1.display();
        hero2.display();
        hero3.display();

    }
}