package logic;

public class Movie {
	private String id;
	private String tittle;
	private String genre;
	private int time;
	private double rating;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTittle() {
		return tittle;
	}


	public void setTittle(String tittle) {
		this.tittle = tittle;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public Movie(String id, String tittle, String genre, int time, double rating) {
		this.id = id;
		this.tittle = tittle;
		this.genre = genre;
		this.time = time;
		this.rating = rating;
	}
	
	
}
