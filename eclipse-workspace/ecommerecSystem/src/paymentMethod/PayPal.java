package paymentMethod;
import main.Customer;
import product.Cart;
public class PayPal extends Payment{
	public PayPal(Customer c, Cart cart) {
		super(c, cart);
	}
	
	public void processPayment() {
		System.out.println("Processing PayPal payment for " + c.getName());
		System.out.println("Charged : $" + this.cart.calculateTotal());
	}
}
