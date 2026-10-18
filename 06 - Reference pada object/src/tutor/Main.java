package tutor;

class buku{
    String judul;
    String penulis;

    buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void show(){
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        buku buku1 = new buku("Laut Bercerita", "Leila Chudori");

        buku1.show();

        // Menampilkan Address 
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));

        System.out.println(addressBuku1);

        // Assignment object
        buku buku2 = buku1;
        buku2.show();

        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada address atau referensi yang sama
        System.out.println("----------------------------------");
        buku2.judul = "Sea tells stories";
        buku1.show();
        buku2.show();
        
        System.out.println("-----------------------------------");
        // kita akan memasukkan object ke dalam methods
        fungsi(buku2);
        buku1.show();
        buku2.show();

        

    }

    public static void fungsi(buku dataBuku){
        String addressdataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressdataBuku);
        dataBuku.penulis = "haruki Mahalkami";
    }
}

