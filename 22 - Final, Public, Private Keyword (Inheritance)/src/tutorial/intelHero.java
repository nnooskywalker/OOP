package tutorial;

//public ini akan terbuka semuanya
public class intelHero extends Hero{
   
    intelHero(String name, double health){
        super(name, health);
        //System.out.println(this.health); tidak bisa diakses karena private
    }

    //visibility harus sama dengan superclass, tidak bisa dilakukan
    // private void display(){
    //     System.out.println(this.name + " mempunyai banyak " + this.getHealth());
    // }

    // ini bisa dilakukan
    void setHealth(String newHealth){
        System.out.println("mencoba memasukkan health = " + newHealth);
    }
    
    
}
