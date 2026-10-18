package tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Otong Surotong", 1000, 2500);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Monkey D Luffy", 2500, 1300);
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent("Charlote Linlin", 5000, 10000, 2500);
        hero3.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
        hero2.attack(hero3);
        hero3.attack(hero2);

        hero1.display();
        hero2.display();
        hero3.display();
    }
}
