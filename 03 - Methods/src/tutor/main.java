package tutor;



class students{
    //Data member
    String nama;
    String NIM;

    // constructor
    students(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    // method dengan return tapi tidak ada parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " Juga, nama saya adalah " + this.nama;
    }


}

public class main {
    public static void main(String[] args) {
        students mhs1 = new students("Tutung", "28765432198");
        mhs1.show();
        mhs1.setNama("Nino");
        mhs1.setNIM("2902726864");
        mhs1.show();    

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNIM());

        String newSave = mhs1.sayHi("Jasmine");
        System.out.println(newSave);
    }
}
