package shipping;
import main.Customer;
public class JNT extends Shipping {
	public JNT(Customer c) {
		super(c);
	}
	
	public void shippingInfo() {
		System.out.println("Shipping via J&T to " + c.getAddress());
	}
	
	
}
