package Main;
import Models.User;
import Models.Book;
import Models.Order;

import Utils.BookManagement;
import Utils.OrderManagement;
import Utils.UserManagement;
import Utils.DisplayData;

import java.util.HashMap;

public class LibraryManagement {

	public static void main(String[] args) {
		HashMap<Integer, Book> books = new HashMap<>();
		HashMap<Integer,User> users = new HashMap<>();
		HashMap<Integer, Order> orders = new HashMap<>();
		
		
		
		UserManagement.addUser(users, 998, "Nino", "reyhan.aliffano@binus.co.id", "nnooskywalker");
		BookManagement.addBook(books, 776,"Tutorial OOP", 2007, "Reyhan Nino Aliffano, S.Kom");
		OrderManagement.addOrder(orders, 1, users.get(998), books.get(776));
		
		
		UserManagement.addUser(users, 778, "Otong", "Otong@gmail.com", "Mr.Otong");
		BookManagement.addBook(books, 54, "Laut Bercerita", 2018, "Laila Khudori");
		
		OrderManagement.addOrder(orders, 2, users.get(778), books.get(54));
		
		DisplayData.displayOrders(orders);
		
		
		
		

	}

}
