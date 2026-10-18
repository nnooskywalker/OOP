package tutorial;


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Esmeralda", 1000);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Ucup", 1500);
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Otong ");
        hero3.display();
    }
}
