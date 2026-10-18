package Tutorial;


//======================this===========================================
//this.name akan mengakses atribut/method name kalau ada di kelas ini
// jika tidak ada maka akan mengakses atribut/method name dari super class

//======================super===========================================
//super.name akan selalu mengakses atribut/method superclass

public class HeroStrength extends Hero {
    public String name = "Class Strength";

    void display(){
        System.out.println("Ini adalah " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }


    void dummyMethod(){
        System.out.println("Method ini ada di sub class");
    }
}
