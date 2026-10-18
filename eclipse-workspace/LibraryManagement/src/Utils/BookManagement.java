package Utils;
import Models.Book;
import java.util.HashMap;

public class BookManagement {
	public static void addBook(HashMap<Integer, Book> books, int id, String tittle, int yearPublished, String author) {
		Book buku = new Book(id, tittle, yearPublished, author);
		
		books.put(id, buku);
	}
	
	public static void deleteBook(HashMap<Integer, Book> books, int id) {
		if (books.containsKey(id)) {
			books.remove(id);
			System.out.printf("Book with id %d has been removed\n",id);
		}
		else {
			System.out.println("Book Not Found");
		}
	}
	
	public static void searchBook(HashMap<Integer, Book> books, int id) {
		Book buku = books.get(id);
		
		if (buku != null) {
			System.out.println("Tittle : " + buku.tittle);
			System.out.println("Year Published : " + buku.yearPublished);
			System.out.println("Author : " + buku.author);
		}
		else {
			System.out.println("Book Not Found");
		}
	}
}
