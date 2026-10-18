package tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Otong");
        // hero1.display();
        System.out.printf("\n");
        // hero2.display();

        //Polymorphic
        Hero hero3 = new HeroStrength("Maria");
        // hero3.display();


        HeroIntel hero4 = new HeroIntel("Mahmud");
        // hero4.display();
        
        HeroAgility hero5 = new HeroAgility("Baban");

        //Array List
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; //casting
        kumpulanHero[4] = hero5;

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        //method calls
      //  kumpulanHero[4].showOff(); // ini tidak bisa
        
        

        hero5.showOff();

        // aplikasi
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero2.attack(hero3);



    }
}
