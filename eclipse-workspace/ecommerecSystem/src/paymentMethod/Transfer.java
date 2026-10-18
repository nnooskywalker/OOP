package paymentMethod;
import main.Customer;
import product.Cart;
public class Transfer extends Payment{
	public Transfer(Customer c, Cart cart) {
		super(c, cart);
	}
	
	public void processPayment() {
		System.out.println("Processing Bank Transfer for " + c.getName());
		System.out.println("Charged: $" + this.cart.calculateTotal());
	}
}
