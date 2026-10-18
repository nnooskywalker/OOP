package tutorial;

public class Hero{
    //attribute
    String name;
    double defencePower;

    //constructor
    Hero(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    //overloading
    Hero(String name){
        this.name = name;
    }

    //method
    void display(){
        System.out.println("Name = " + this.name);
    }
}