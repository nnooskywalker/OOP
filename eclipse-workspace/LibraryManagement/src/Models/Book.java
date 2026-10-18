package Models;

public class Book {
	public final int id;
	public String tittle;
	public int yearPublished;
	public String author;
	
	public Book(int id, String tittle, int yearPublished, String author) {
		this.id = id;
		this.tittle = tittle;
		this.yearPublished = yearPublished;
		this.author = author;
	}

}
