package Tutorial;
/*
    Keyword class:
    1. Default --> visible di package yang sama
        - Tidak terlihat oleh file di package yang lain

    2. Public --> visible di semua package
        - harus di IMPORT!!
 */

// ini akan mengimport class console
import Terminal.Console;

//mengimport static method dari console
import static Terminal.Console.log;


class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Otong");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
