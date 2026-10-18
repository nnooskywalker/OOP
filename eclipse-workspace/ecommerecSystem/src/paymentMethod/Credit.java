package paymentMethod;
import main.Customer;
import product.Cart;
public class Credit extends Payment {
	public Credit(Customer c, Cart newCart) {
		super(c, newCart);
	}
	
	public void processPayment() {
		System.out.println("Processing Credit Card payment for " + c.getName());
		System.out.println("Charged : $" + this.cart.calculateTotal());
	}

}
