package Testing;

 class bankAccount{
    public String name;
    private String nomorRekening;
    private double saldo;
    private String pin;

    bankAccount(String name, String nomorRekening, double saldo, String pin){
        this.name = name;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double newSaldo){
        this.saldo = newSaldo;
    }


    public void setPin(String oldPin, String newPin){
        if(this.pin.equals(oldPin)){
            this.pin = newPin;
            System.out.println("PIN berhasil diubah");
        }
    }

    public void setRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }


    public String getRekening(){
        return this.nomorRekening;
    }

    public void show(){
        System.out.println("Nasabah : " + this.name);
        System.out.println("Nomor Rekening : " + this.nomorRekening);
        System.out.println("Saldo : " + this.saldo);
        System.out.println("PIN : " + this.pin);
    }





}

public class Main4 {
    public static void main(String[] args) {
        bankAccount akun1 = new bankAccount("Ucup", "123456", 550000, "73654");

        System.out.println("Old Account : ");
        akun1.show();

        akun1.setSaldo(1000000);
        akun1.setPin("73654", "876532");
        akun1.setRekening("666666");

        System.out.println("New Account : ");
        akun1.show();

    }
    
}
