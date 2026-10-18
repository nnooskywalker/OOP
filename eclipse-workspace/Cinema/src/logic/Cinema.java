package logic;
import java.util.ArrayList;

public class Cinema {
	private String id;
	private String name;
	private  int maxStudios;
	private int count;
	public ArrayList<Movie> movie = new ArrayList<>();
	
	
	public Cinema(String id, String name, int max) {
		this.id = id;
		this.name = name;
		this.maxStudios = max;
		this.count = 0;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMaxStudios() {
		return maxStudios;
	}
	
	public void addMovie(Movie mv) {
		if (this.count <= this.maxStudios) {
			movie.add(mv);
			System.out.println("Movie sucesfully added!");
		}
		else {
			System.out.println("List is full!");
		}
		
		this.count++;
	}
	
	public void display() {
		System.out.printf("======== %s ========\n", this.name);
		if (movie.isEmpty()) {
			System.out.println("No Movie");
		}
		else {
			for(Movie mv : movie) {
				System.out.println("Tittle : " + mv.getTittle());
				System.out.println("Genre : " + mv.getGenre());
				System.out.println("Duration : " + mv.getTime() + " hour(s)");
				System.out.println("Rating : " + mv.getRating());
			}			
		}
	}


	public ArrayList<Movie> getMovie() {
		return movie;
	}



	
	
	
}
