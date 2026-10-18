package tutorial;

import hero.HeroStrength;

public class Main{
    public static void main(String[] args) {
        HeroStrength hero1 = new HeroStrength("Ucup");
        hero1.display();

        hero1.setName("Otong");

        hero1.display();
    }

}