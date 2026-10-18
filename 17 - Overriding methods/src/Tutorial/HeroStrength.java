package Tutorial;

public class HeroStrength extends Hero {
    double defencePower;

    //overriding method
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name : " + this.name);
        System.out.println("Defence power : " + this.defencePower);
    }
}
