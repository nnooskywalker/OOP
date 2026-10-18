package shipping;
import main.Customer;
public abstract class Shipping {
	Customer c;
	
	public Shipping(Customer orang) {
		this.c = orang;
	}
	
	public abstract void shippingInfo();
	
	
}
