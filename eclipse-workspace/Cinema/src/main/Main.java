package main;
import logic.Cinema;
import logic.Movie;
import java.util.ArrayList;
import java.util.Scanner;

/*
	Case bisa dibuat seperti ini:
	
	case 1:{
	
		break;
	}
	case 2:{
	
		break;
	}
 */

public class Main {
	public static void main(String[] args) {
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Cinema> cinema = new ArrayList<>();
		
		
		
		while(choose != 8) {
			System.out.println("======CINEMA======");
			System.out.println("1. Register New Cinema");
			System.out.println("2. Add Movie to Cinema");
			System.out.println("3. Display all cinema and movies");
			System.out.println("4. Edit cinema name");
			System.out.println("5. Update movie details");
			System.out.println("6. Remove movie from cinema");
			System.out.println("7. Unregister Cinema");
			System.out.println("8. Exit");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				String idCin = null, cinName = null;
				int max = 0;
				boolean isValid = false;
				
				
				while(true) {
					System.out.print("ID : ");
					idCin = sc.nextLine();
					
					for(Cinema cn : cinema) {
						if (cn.getId().equals(idCin)) {
							isValid = true;
							break;
						}
					}
					
					if (isValid == true) {
						System.out.println("ID Has Been Used");
					}
					else {
						break;
					}		
				}
				
				System.out.println("Cinema Name : ");
				cinName = sc.nextLine();
				
				System.out.println("Max Studio : ");
				max = sc.nextInt();
				sc.nextLine();
				
				Cinema cnm = new Cinema(idCin, cinName, max);
				cinema.add(cnm);
				break;
			case 2:
				idCin = null;
				String idMovie = null, title = null, genre = null;
				Cinema temp = null;
				int time = 0;
				double rating = 0.0;
				
				
				while(true){
					System.out.print("ID Cinema : ");
					idCin = sc.nextLine();
					
					for(Cinema cn : cinema) {
						if (cn.getId().equals(idCin)) {
							temp = cn;
							break;
						}
					}
					
					if(temp != null) {
						break;
					}
					else {
						System.out.println("ID " + idCin + " Not Found");
					}
				}
				
				System.out.print("ID Movie : ");
				idMovie = sc.nextLine();
				
				System.out.print("Tittle : ");
				title = sc.nextLine();
				
				System.out.print("Genre : ");
				genre = sc.nextLine();
				
				System.out.print("Duration : ");
				time = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Rating : ");
				rating = sc.nextDouble();
				
				Movie mv = new Movie(idMovie, title, genre, time, rating);
				temp.addMovie(mv);
				System.out.println("Sucesfully Added a Movie");
				break;
			case 3:
				int num = 0;
				if (cinema.isEmpty()) {
					System.out.println("No cinema");
				}
				else {
					for(Cinema cn : cinema) {
						System.out.println(num++ + ". ");
						cn.display();
					}
				}
				
				break;
			case 4:
				temp = null;
				idCin = null;
				String newName = null;
				
				while(true) {
					System.out.println("ID Cinema : ");
					idCin = sc.nextLine();
					
					for(Cinema cn : cinema) {
						if (cn.getId().equals(idCin)) {
							temp = cn;
							break;
						}
					}
					
					if (temp == null) {
						System.out.println("Cinema Not Found");
					}
					else {
						break;
					}
				}
				
				System.out.println("Enter new Name : ");
				newName = sc.nextLine();
				
				temp.setName(newName);
				
				System.out.println("Sucesfully Updated!");
				
				break;
			case 5:
				idCin = null;
				idMovie = null;
				Movie mvie = null;
				String newTittle = null, newGenre = null;
				int newDuration = 0;
				double newRating = 0;
				
				
				while(true) {
					System.out.println("ID Movie : ");
					idMovie = sc.nextLine();
					
					for(Cinema cn : cinema) {
						for(Movie mvi : cn.getMovie()) {
							if (mvi.getId().equals(idMovie)) {
								mvie = mvi;
								break;
							}
						}
					}
					
					if (mvie == null) {
						System.out.println("ID Not Found");
					}
					else {
						break;
					}
				}
					
				System.out.println("New Tittle : ");
				newTittle = sc.nextLine();
				
				System.out.println("New Genre : ");
				newGenre = sc.nextLine();
				
				System.out.println("New Duration : ");
				newDuration = sc.nextInt();
				
				System.out.println("New Rating : ");
				newRating = sc.nextDouble();
				
				mvie.setTittle(newTittle);
				mvie.setGenre(newGenre);
				mvie.setTime(newDuration);
				mvie.setRating(newRating);
				
				System.out.println("Data Sucesfully Updated");
				break;
			case 6:
				idMovie = null;
				isValid = false;
				while(true) {
					System.out.println("ID Movie : ");
					idMovie = sc.nextLine();
					
					for(Cinema cn : cinema) {
						for(Movie mvi : cn.getMovie()) {
							if (mvi.getId().equals(idMovie)) {
								cn.movie.remove(mvi);
								isValid = true;
								break;
							}	
					}	
				}
				if (isValid == true) {
					System.out.println("Movie Sucesfully Removed");
					break;
					}
				else {
					System.out.println("Movie Not Found");
					}
				}
			case 7:
				idCin = null;
				temp = null;
				
				while(true) {
					System.out.println("ID Cinema : ");
					idCin = sc.nextLine();
					
					for(Cinema cn : cinema) {
						if (cn.getId().equals(idCin)) {
							temp = cn;
							break;
						}
					}
					
					if (temp == null) {
						System.out.println("ID Not Found");
					}
					else {
						cinema.remove(temp);
						System.out.println("Cinema & Movie Sucesfully Removed");
						break;
					}
					
				}
				
				
				break;
			case 8:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Input Invalid");
				break;
			}
		}

	}

}
