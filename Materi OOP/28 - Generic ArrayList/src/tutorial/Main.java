package tutorial;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero("Ucup", 100);
        Hero hero2 = new Hero("Otong", 20);
        AgilityHero agilityHero = new AgilityHero("Johny", 500);
        IntelHero intelHero = new IntelHero("Smith", 5);

        // Array Sederhana
        Hero[] kumpulanHero = new Hero[3];

        //masukkan anggota
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = agilityHero;
        // kumpulanHero[3] = intelHero; karena array fix

        for (Hero hero : kumpulanHero){
            hero.display();
        }

        //Array List
        ArrayList<Hero> listhero = new ArrayList<Hero>();

        listhero.add(hero1);
        listhero.add(hero2);
        listhero.add(agilityHero);
        listhero.add(intelHero);
        
        System.out.println("\nArrayList\n");
        for (Hero hero: listhero){
            hero.display();
        }
        
        // reference
        agilityHero.setName("Dudung");

        System.out.println("\nArrayList (Name change)\n");
        for (Hero hero : listhero){
            hero.display();
        }


        System.out.println("\nArray (Name Change)\n");
        for(Hero hero : kumpulanHero){
            hero.display();
        }
    }

}