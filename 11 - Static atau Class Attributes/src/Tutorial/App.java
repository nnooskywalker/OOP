package Tutorial;

//Static = variable yang diam dan bisa ada di attributes dan class
class display{
    static String type = "Display";
    private String name;

    display(String name){
        this.name = name;
    }

    void setType(String type){
        display.type =type;
    }
    
    void show(){
        System.out.println("Name : " + this.name);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
    display display1 = new display("Monitor");
    
    display1.show();
    
    display display2 = new display("Handphone");
    display2.show();

    display.type = "Spanduk";
    display1.setType("Tampilan");

    // tampilkan static variable atau class variable
    System.out.println("\nMenampilkan static atau class variable");
        System.out.println(display1.type);
        System.err.println(display2.type);
        System.out.println(display.type);


    }
}