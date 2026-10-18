package tutorial;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Hero hero1 = new Hero("Ucup", 100);
       Hero hero2 = new Hero("Otong", 100);
       AgilityHero heroAgility = new AgilityHero("Dudung", 50);
       IntelHero heroIntel = new IntelHero("Johny", 20);

       ArrayList<Hero> listHero = new ArrayList<>();

       // operasi 1 : menambah member dengan add
       System.out.println("Operasi 1 : add");
       listHero.add(hero1);
       listHero.add(hero2);
       listHero.add(heroAgility);

       System.out.println(listHero);
       System.out.println();

       // operasi 2 : merubah member dengan set
       System.out.println("Operasi 2 : set");
       listHero.set(1, heroIntel);

       System.out.println(listHero);
       System.out.println();
       
       // operasi 3 : menghapus member dengan remove
       System.out.println("Operasi 3 : remove");
       listHero.remove(1);
       System.out.println(listHero);
       System.out.println();

        // operasi 4 : mengakses member
        System.out.println("Operasi 4 : get");
        System.out.println(listHero);
        Hero heroAmbil = listHero.get(0);
        System.out.println(listHero);
        heroAmbil.display();
        System.out.println();
            
        // method pada arrayList
        System.out.println("method2");
        System.out.println("1. size()\t" + listHero.size()); // cek ukuran arraylist
        System.out.println("2. isEmpty()\t: " + listHero.isEmpty()); // cek apakah data kosong atau ngga ?
        System.out.println("3. contains(hero2)\t: " + listHero.contains(hero2)); // cek apakah ada hero2 atau ngga ?
        System.out.println("   contains(heroAgility)\t: " + listHero.contains(heroAgility)); // cek apakah ada heroIntel atau ngga ?
        System.out.println("4. indexOf(hero1)\t: " + listHero.indexOf(hero1)); // cek di index ke berapa ?
        System.out.println("   indexOf(heroAgility)\t: " + listHero.indexOf(heroAgility)); // cek di index ke berapa ?
       


    }
}
