package testing;

class KTP{
	String nama;
	int umur;
	String GolDar;
	
	void show() {
		System.out.println("Nama : " + this.nama);
		System.out.println("Umur : " + this.umur);
		System.out.println("Blood Type : " + this.GolDar);
	}

}

class nino extends KTP{
	//hampa
}


class otong extends KTP{
	//hampa
}

public class test {
   public static void main(String[] args) {
	   nino nnoo = new nino();
	   
	   nnoo.nama = "nino";
	   nnoo.umur = 18;
	   nnoo.GolDar = "unknown";
	   
	   nnoo.show();
   }
}
