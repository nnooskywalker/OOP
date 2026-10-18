package Tutorial;
//Enkapsulasi --> membuat method / object terlindungi

class Data{
    public int intPublic;
    private int intPrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
    }


    //getter
    public int getPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setPrivate(int angka){
        this.intPrivate = angka;
    }
    

}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    //setter
    public void setJari2(double r){
        this.diameter = 2*r;
    }

    //getter
    public double getJari2(){
        return this.diameter/2;
    }

    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Data object = new Data();

        //read and write dengan menggunakan public
        object.intPublic = 5; //write
        System.out.println("Public : " + object.intPublic); //read

        // read only (Getter)
        int angka = object.getPrivate();
        System.out.println("Getter : " + angka);

        // write only (Setter)
        object.setPrivate(250);
        object.display();

        //gabungkan read dan write dgn setter & getter
        Lingkaran object2 = new Lingkaran(5);

        System.out.println("Jari - jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari - jari : " + object2.getJari2());
        System.out.println("Luas : " + object2.getLuas());





    }
}
