package main;
import notification.*;
import paymentMethod.*;
import product.*;
import shipping.*;
import system.*;
public class Main {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Cart cart = new Cart(inventory);
		
		//Available product
		Product electronic = new Electronic("Gaming Laptop", "Electronics", 1500, 24);
		Product food = new Food("Bengbeng", "Food", 5, "2027-01-01");
		Product fashion = new Fashion("Jacket", "Fashion", 120, "L");
		
		// Add Products
		inventory.add(electronic);
		inventory.add(food);
		inventory.add(fashion);
		
		//show inventory
		inventory.showInventory();
		
		//Customer
		Customer customer = new Customer("Bibi", "bibi@email.com","08123456789", "Jakarta, Indonesia");
		
		
		// shopping cart
		cart.addToCart("Gaming Laptop");
		cart.addToCart("Premium Jacket");
		cart.showCart();
		
		// Available Payment
		Payment credit = new Credit(customer, cart);
		Payment PayPal = new PayPal(customer, cart);
		Payment Transfer = new Transfer(customer, cart);
		
		// Available Shipping
		Shipping jne = new JNE(customer);
		Shipping jnt = new JNT(customer);
		Shipping sicepat = new SiCepat(customer);
		
		//Available notif
		Notif email = new Email(customer);
		Notif SMS = new SMS(customer);
		Notif WA = new WA(customer);
				
		//checkout
		DataBase db = new MySQL(customer, credit, jne, email, cart);
		db.checkout();
		
		//Reporting
		db.printSalesReport();
		
		
		
	
		

	}

}
