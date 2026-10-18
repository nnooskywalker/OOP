package system;
import main.*;
import notification.*;
import paymentMethod.*;
import product.*;
import shipping.*;
public class MySQL extends DataBase{
	public MySQL(Customer c, Payment p, Shipping s, Notif n, Cart ca) {
		super(c,p,s,n,ca);
	}
	
	
	public void checkout() {
		//Payment
		this.payment.processPayment();
		
		//Shipping
		this.shipping.shippingInfo();
		
		//Notification
		this.notif.showNotif();
		
		this.cart.printInvoice(customer);
		
		System.out.println("Saving Order to MySQL Database...");
	}
	
}
