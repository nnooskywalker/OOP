package tutor;

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;


    // //ini adalah constructor
    // Mahasiswa(){
    //     System.out.println("Ini adalah constructor");
    // }

    //Constructor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan){
        nama = inputNama;
        NIM = inputNim;
        jurusan = inputJurusan;
    }
}




public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Nino","2902726864","Computer Science");

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);

  
    }
}