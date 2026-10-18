package operator;
import java.util.ArrayList;

public class CoffeMachine {
	private int air;
	private int susu;
	private int bijiKopi;
	private int gelas;
	private int uang;
	private ArrayList<Coffee> coff = new ArrayList<>();
	
	public CoffeMachine(int air, int susu, int bijiKopi, int gelas, int uang) {
		this.air = air;
		this.susu = susu;
		this.bijiKopi = bijiKopi;
		this.gelas = gelas;
		this.uang = uang;

	}
	
	public void makeCoffee(Coffee kopi) {
		if (this.air >= kopi.getAir() && this.susu >= kopi.getSusu() && this.bijiKopi >= kopi.getBijiKopi()
			&& this.uang >= kopi.getHarga()) {
			this.air -= kopi.getAir();
			this.susu -= kopi.getSusu();
			this.bijiKopi -= kopi.getBijiKopi();
			this.uang += kopi.getHarga();
			this.gelas--;
			coff.add(kopi);
			
			System.out.println("Enough resources, making you an " + kopi.getName());
		}
		else {
			if (this.air < kopi.getAir()) {
				System.out.println("Sorry, not enough water");
			}
			if (this.susu < kopi.getSusu()) {
				System.out.println("Sorry, not enough milk");
			}
			if (this.bijiKopi < kopi.getBijiKopi()) {
				System.out.println("Sorry, not enough coffe beans");
			}
			if (this.uang < kopi.getHarga()) {
				System.out.println("Sorry, not enough water");
			}
			if (this.gelas == 0) {
				System.out.println("Sorry, not enough glass");
			}
		}
	}
	
	public void fillMachine(int air, int susu, int bijiKopi, int gelas) {
		this.air += air;
		this.susu += susu;
		this.bijiKopi += bijiKopi;
		this.gelas += gelas;
	}
	
	
	public void printContents() {
		System.out.println("The Coffe machine has: ");
		System.out.println(this.air + " ml of water");
		System.out.println(this.susu + " ml of milk");
		System.out.println(this.bijiKopi + " g of coffee beans");
		System.out.println(this.gelas + " disposable cups");
		System.out.println("$ " + this.uang + " of money");
		System.out.println("==================================");
	}
	
	public void emptyCashregister() {
		int total = this.uang;
		
		System.out.println("Withdrawing $ " + total);
		
		this.uang -= total;
		
	}
	
	public void printTransactionHistory() {
		int count = 0;
		System.out.println("== Jump Machine Transaction ==");
		for(Coffee cf : coff) {
			System.out.println(cf.getName() + " - " + cf.getHarga());
			count+= cf.getHarga();
		}
		
		System.out.printf("Total : $%d\n",count);
		System.out.println("==================================");
		
	}
	
}
