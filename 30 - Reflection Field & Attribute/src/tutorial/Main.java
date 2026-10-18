package tutorial;
import Hero.*;
import java.lang.reflect.Field;
public class Main{
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        HeroAgility hero1 = new HeroAgility("Otong", 100);
        hero1.display();

        // access modifier
        hero1.nickname = "tongtong";
        hero1.display();
        // hero1.heroType = "intel"; --> tidak bisa dilakukan
        // hero1.name = "ucup"; --> tidak bisa dilakukan

        // Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass().getSuperclass();

        System.out.println("\nClass : " + classHero1.getName());
        System.out.println("Parent : " + parentClassHero1.getName());

        // cek attribute dari object hero1
        System.out.println("\nAttribute dari object hero1");
        Field[] hero1Fields = classHero1.getFields();
        
        System.out.println("Jumlah atttribute adalah : " +hero1Fields.length);
        System.out.println("Attribute : " + hero1Fields[0].getName());
        
        // cek attribute semua object hero1
        System.out.println("\nAttribute semua dari object hero1");
        Field[] hero1AllFields = classHero1.getDeclaredFields();
        System.out.println("Jumlah attribute adalah : " + hero1AllFields.length);
        System.out.println("Attribute: ");
        for (Field field : hero1AllFields){
            System.out.println(field.getName());
        }

        System.out.println("\nAttribute semua dari super class : ");
        Field[] heroAllFields = parentClassHero1.getDeclaredFields();
        System.out.println("Jumlah attribute adalah : " + heroAllFields.length);
        System.out.println("Attribute : ");
        for(Field field : heroAllFields){
            System.out.println(field.getName());
        }

       // kita ubah nilainya dengan reflection
       System.out.println("\nKita ubah");
       hero1.display();
       System.out.println("\nMenjadi ");
       // merubah public bisa
       hero1AllFields[0].set(hero1, "tingting");
       // merubah private
       hero1AllFields[1].setAccessible(true);
       hero1AllFields[1].set(hero1, "intel");

       // ubah bagian superclass
       heroAllFields[0].setAccessible(true);
       heroAllFields[0].set(hero1, "Ucup");
       hero1AllFields[1].setAccessible(true);
       hero1AllFields[1].set(hero1, 0);
       hero1.display();


        




    }


}