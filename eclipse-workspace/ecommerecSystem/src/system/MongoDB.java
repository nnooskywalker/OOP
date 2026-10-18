package system;
import main.*;
import notification.*;
import paymentMethod.*;
import product.*;
import shipping.*;
public class MongoDB extends DataBase{
	public MongoDB(Customer c, Payment p, Shipping s, Notif n, Cart ca) {
		super(c, p, s, n, ca);
		System.out.println("Saving order to MongoDB database...");
	}
	
	public void checkout() {
		//Payment
		this.payment.processPayment();
		
		//Shipping
		this.shipping.shippingInfo();
		
		//Notification
		this.notif.showNotif();
		
		this.cart.printInvoice(customer);
		System.out.println("Saving Order to MongoDB Database...");
	}
		
}
