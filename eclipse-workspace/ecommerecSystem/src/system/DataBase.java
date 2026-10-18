package system;
import notification.*;
import paymentMethod.*;
import product.*;
import shipping.*;
import main.*;
public abstract class DataBase {
	Customer customer;
	Payment payment;
	Shipping shipping;
	Notif notif;
	Cart cart;
	
	public DataBase(Customer c, Payment p, Shipping s, Notif n, Cart ca) {
		this.customer = c;
		this.payment = p;
		this.shipping = s;
		this.notif = n;
		this.cart = ca;
	}
		
	public abstract void checkout();
	
	public void printSalesReport() {
		System.out.println("===== SALES REPORT =====");
		System.out.println("Total items sold : " + this.cart.cartList.size());
		System.out.println("Revenue: $" + this.cart.calculateTotal());
	}

	

	
	
	

	
	
	
	
	
	
}
