package menu;
import system.mahasiswa;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<mahasiswa> mhs = new ArrayList<>();
		int choose = 0, count = 1;
		
		
		while(choose != 5) {
			System.out.println("==== STUDENT MENU =====");
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				String nim = null, name = null, major = null;
				double gpa = 0.0;
				System.out.print("NIM : ");
				nim = sc.nextLine();
				
				
				System.out.print("Name : ");
				name = sc.nextLine();
				
				do {
					System.out.print("Major (Computer Science / Game Development / Kedokteran) : ");
					major = sc.nextLine();					
				}while(!major.equals("Computer Science") && !major.equals("Game Development") && !major.equalsIgnoreCase("Kedokteran"));
				
				do {
					System.out.println("GPA : ");
					gpa = sc.nextDouble();
					sc.nextLine();
					
				}while (gpa < 0.0 || gpa > 4.0);
				
				mahasiswa orang = new mahasiswa(nim, name, major, gpa);
				
				mhs.add(orang);
				
				System.out.println("Data Sucesfully Inserted");
				break;
			case 2:
				if (mhs.isEmpty()) {
					System.out.println("List is empty");
				}
				else {
					
					for(mahasiswa siswa : mhs) {
						System.out.print(count ++ + ". ");
						siswa.display();
					}
				}
				break;
			case 3:
				if (mhs.isEmpty()) {
					System.out.println("List is empty");
				}
				else {
					nim = null;
					mahasiswa temp = null;
					
					System.out.println("Enter NIM : ");
					nim = sc.nextLine();
					
					for(mahasiswa siswa : mhs) {
						if (siswa.getNim().equals(nim)) {
							temp = siswa;
							break;
						}
					}
					
					if (temp == null) {
						System.out.println("Data Not Found");
					}
					else {
						String newMajor = null;
						double newGPA = 0;
						
						do {
							System.out.println("Enter New Major (Computer Science / Game Development / Kedokteran) : ");
							newMajor = sc.nextLine();
						}while(!newMajor.equals("Computer Science") && !newMajor.equals("Game Development") && !newMajor.equals("Keodkteran"));
						
						do {
							System.out.println("Enter new GPA : ");
							newGPA = sc.nextDouble();
							sc.nextLine();
						}while(newGPA < 0 || newGPA > 4);
						
						temp.setMajor(newMajor);
						temp.setGpa(newGPA);
						
						
						System.out.println("Data has been changed!");
					}
				}
				break;
			case 4:
				if(mhs.isEmpty()) {
					System.out.println("List is empty");
				}
				else {
					nim = null;
					mahasiswa temp = null;
					System.out.println("Enter NIM : ");
					nim = sc.nextLine();
					
					for(mahasiswa siswa : mhs) {
						if (siswa.getNim().equals(nim)) {
							temp = siswa;
							break;
						}
					}
					
					if (temp == null) {
						System.out.println("Data Not Found");
					}
					else {
						mhs.remove(temp);
						System.out.println("Data Sucesfully Removed!");
					}
				}
				break;
			case 5:
				System.out.println("Exiting....");
				break;
			default:
				System.out.println("Invalid");
				break;
			}
		}
		

	}

}
