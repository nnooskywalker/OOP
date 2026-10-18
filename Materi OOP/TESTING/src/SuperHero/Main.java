package SuperHero;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Leon S Kenedy", 2000, 1000);
        HeroIntel hero2 = new HeroIntel("Mr. X", 5000, 2100);
        HeroAbstract hero3 = new HeroAbstract("Ashley Graham", 10000, 100);

        hero1.display();
        hero2.display();
        hero3.display();

        hero1.attack(hero3);
        hero3.attack(hero2);
        hero2.attack(hero3);
    }


}
