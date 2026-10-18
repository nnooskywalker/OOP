package Utils;
import Models.Book;
import Models.Order;
import Models.User;

import Utils.OrderManagement;
import Utils.BookManagement;
import Utils.UserManagement;
import java.util.HashMap;
public class DisplayData {
	public static void displayOrders(HashMap<Integer, Order> orders) {
		for(Order pesan : orders.values()) {
			System.out.println("ID : " + pesan.id);
			System.out.println("--------- User -------------");
			System.out.println("Name : " + pesan.users.name);
			System.out.println("Email : " + pesan.users.email);
			System.out.println("Username : " + pesan.users.userName);
			System.out.println("--------- Book -------------");
			System.out.println("Book Tittle : " + pesan.books.tittle);
			System.out.println("Year Published : " + pesan.books.yearPublished);
			System.out.println("Author : " + pesan.books.author);
		}
	}
	
	public static void displayOrderDetail(HashMap<Integer, Order> orders, int id) {
		Order pesan = orders.get(id);
		
		System.out.println("ID : " + pesan.id);
		System.out.println("-------- User -------");
		System.out.println("Name : " + pesan.users.name);
		System.out.println("Email : " + pesan.users.email);
		System.out.println("Username : " + pesan.users.userName);
		System.out.println("--------- Book -------");
		System.out.println("Book Tittle : " + pesan.books.tittle);
		System.out.println("Year Published : " + pesan.books.yearPublished);
		System.out.println("Author : " + pesan.books.author);
	}
	
	public static void displayBooks(HashMap<Integer, Book> books) {
		for(Book buku : books.values()) {
			System.out.println("ID : " + buku.id);
			System.out.println("Book Tittle : " + buku.tittle);
			System.out.println("Year Published : " + buku.yearPublished);
			System.out.println("Author : " + buku.author);
		}
	}
	
	public static void displayBookDetail(HashMap<Integer, Book> books, int id) {
		Book buku = books.get(id);
		
		System.out.println("ID : " + buku.id);
		System.out.println("Book Tittle : " + buku.tittle);
		System.out.println("Year Published : " + buku.yearPublished);
		System.out.println("Author : " + buku.author);
	}
	
	public static void displayUsers(HashMap<Integer,User> users) {
		for(User wongLiyo : users.values()) {
			System.out.println("ID : " + wongLiyo.id);
			System.out.println("Name : " + wongLiyo.name);
			System.out.println("Email : " + wongLiyo.email);
			System.out.println("Username : " + wongLiyo.userName);
		}
	}
	
	public static void displayUserDetail(HashMap<Integer, User> users, int id) {
		User orang = users.get(id);
		
		System.out.println("ID : " + orang.id);
		System.out.println("Name : " + orang.name);
		System.out.println("Email : " + orang.email);
		System.out.println("Username : " + orang.userName);
	}

}
