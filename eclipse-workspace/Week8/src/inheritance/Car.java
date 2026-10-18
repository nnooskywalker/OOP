package inheritance;


//kalau pakai final si class car ga bisa punya anak
public final class Car extends Vehicle {
	public int seat;
		
	public Car(int roda, String name, int seat) {
		super(roda, name);
		this.seat = seat;
	}
	
	
	@Override
	//nama - roda - seat
	public void printInfo() {
		System.out.println(name + " - " + roda + " - " + seat);
	}
}
