package tutorial;

/*
    Visibility :
    
    1. Public : Jika method atau attribute dalam public secara explisit,
                maka subclass tidak boleh mengurangi visibility.

    2. Private : Jika method atau attribute dalam private secara explisit,
                 maka subclass pun tidak dapat mengakses.

    3. Final : method atau attribute dengan final keyword akan diwariskan,
               tetapi tidak bisa di override. Dalam class yang sama bisa di overload.

 */

public class Main {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Ucup", 100);
        intelHero hero2 = new intelHero("Otong", 50);

        hero1.display();
        hero2.display();

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();

        hero1.setHealth("reset");
        hero1.display();


    }
}