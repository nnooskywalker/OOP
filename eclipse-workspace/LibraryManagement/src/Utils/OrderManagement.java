package Utils;
import Models.Order;
import Models.Book;
import Models.User;

import java.util.HashMap;

public class OrderManagement {
	public static void addOrder(HashMap<Integer, Order> orders, int id, User users, Book books){
		Order pesanan = new Order(id, users, books);
		orders.put(id, pesanan);
		
		System.out.println("Order has been created for user " + users.name);
	}
	
	public static void removeOrder(HashMap<Integer, Order> orders, int id) {
		if(orders.containsKey(id)) {
			orders.remove(id);
			System.out.println("Your order sucesfully removed!");
		}
		else {
			System.out.println("Order with ID " + id + " not found");
		}
	}
	
	

}
