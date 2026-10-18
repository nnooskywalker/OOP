package tutorial;
import hero.*;

public class Main{
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Ucup", 100);
        HeroIntel hero2 = new HeroIntel("Otong", 120);

        hero1.attack(hero2);
        hero2.spell(hero1);
        
    }
}
