package shipping;
import main.Customer;
public class JNE extends Shipping{
	public JNE(Customer c) {
		super(c);
	}
	
	public void shippingInfo() {
		System.out.println("Shipping via JNE to " + c.getAddress());
	}
}
