package shipping;
import main.Customer;
public class SiCepat extends Shipping{
	public SiCepat(Customer c) {
		super(c);
	}
	
	public void shippingInfo() {
		System.out.println("Shipping via SiCepat to " + c.getAddress());
	}
}
