package tutor;
// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;
}


public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        //instansi / membuat object
        mahasiswa1.nama = "Nino";
        mahasiswa1.NIM = "2902726864";
        mahasiswa1.Jurusan = "Computer Science";
        mahasiswa1.IPK = 4.00;
        mahasiswa1.umur = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa2.nama = "Ucup";
        mahasiswa2.NIM = "290276543";
        mahasiswa2.Jurusan = "Mobile Application";
        mahasiswa2.IPK = 4.00;
        mahasiswa2.umur = 20;
        


        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.Jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);


    }
}
