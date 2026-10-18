package product;
import java.util.ArrayList;
import main.Customer;
public class Cart {
	public ArrayList<Product> cartList;
	Inventory i;
	
	public Cart(Inventory inv) {
		cartList = new ArrayList<>();
		this.i = inv;
	}
	
	public void addToCart(String productName) {
		for(Product p : this.i.inventoryList) {
			if (p.name.equalsIgnoreCase(productName)) {
				cartList.add(p);
				System.out.println(productName + " added to cart.");
				return;
			}
		}
		System.out.println("Product not found.");
	}
	
	public void removeFromCart(String productName) {
		for(Product p : this.i.inventoryList) {
			if (p.name.equalsIgnoreCase(productName)) {
				cartList.remove(p);
				System.out.println(productName + " removed from cart.");
				return;
			}
		}
		
		System.out.println("Product not found in cart.");		
	}
	
	public void showCart() {
		System.out.println("===== CART =====");
		for(Product p : cartList) {
			System.out.println(p.name + " -$" + p.price);
		}
	}
	
	public double calculateTotal() {
		double total = 0;
		for(Product p : cartList) {
			total += p.price;
		}
		
		return total;
	}
	
	public void printInvoice(Customer c) {
		System.out.println("===== INVOICE =====");
		System.out.println("Customer : " + c.getName());
		for (Product p : cartList) {
			System.out.println(p.name + " -$" + p.price);
		}
		
		System.out.println("TOTAL : $" + this.calculateTotal());	
	}
	
	public void printSalesReport() {
		System.out.println("===== SALES REPORT =====");
		System.out.println("Total items sold: " + cartList.size());
		System.out.println("Revenue : $" + this.calculateTotal());
	}
	
	
	
	

	
	
}
