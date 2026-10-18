package Models;
import java.util.HashMap;

public class Order {
	public int id;
	public User users;
	public Book books;
	
	public Order(int id, User orang, Book buku){
		this.id = id;
		this.users = orang;
		this.books = buku;
	}
 
}
