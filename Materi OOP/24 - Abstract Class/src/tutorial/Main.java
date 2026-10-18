package tutorial;

import hero.*;

public class Main {
    public static void main(String[] args) {
        // membuat object dari kelas non - abstract
        HeroIntel hero1 = new HeroIntel("Otong");
        hero1.display();

        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();

        //membuat object dari kelas abstract (TIDAK BISA)
        // Hero hero2 = new Hero("Mario");

        // hero2.display();
    }
}
