package Tutorial;

class Mahasiswa{
    private String name;
    private String NIM;

    Mahasiswa(String name, String NIM){
        this.name = name;
        this.NIM = NIM;
    }

    public String getName(){
        return this.name;
    }

    public String getNIM(){
        return this.NIM;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setNIM(String newNIM){
        this.NIM = newNIM;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Ucup", "2902726864");

        System.out.println(mhs1.getName());
        System.out.println(mhs1.getNIM());

        mhs1.setName("Marni");
        mhs1.setNIM("28087964");
        System.out.println(mhs1.getName());
        System.out.println(mhs1.getNIM());
    }
}
