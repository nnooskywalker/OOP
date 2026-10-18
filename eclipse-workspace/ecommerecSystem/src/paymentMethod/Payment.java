package paymentMethod;
import main.Customer;
import product.Cart;
public abstract class Payment {
	Cart cart;
	Customer c;
	
	public Payment(Customer orang, Cart newCart) {
		this.c = orang;
		this.cart = newCart;
	}
	
	
	public abstract void processPayment();

}
