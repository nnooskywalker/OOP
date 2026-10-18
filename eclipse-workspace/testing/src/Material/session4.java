package Material;

/*
 * Pilar OOP / OOP Concepts :
  1. Encapsulation
  2. Inheritance
  3. Polymorphism
  4. Abstraction
  
  
- Encapsulation (Public (+), Private (-), Protected (#), etc)
- Inheritance (Parent Class / Super Class & Child Class / Sub Class)
- Polymorphism (1 method bisa punya banyak implementasi)
- Abstraction (hiding complex implementation)
	a.) pisah class
	b.) Abstract Class

Constructor
	1. Method yg pertama kali dipanggil saat buat objek pakai keyword new
	2. Namanya harus sama kayak kelas nya
	3. Tidak ada return  type, tapi bisa punya parameter
	4. Defaultnya tanpa parameter (kalau ga didefine constructornya)
	

*/

import java.util.Scanner;
import java.util.ArrayList;

public class session4 {
	
	public session4(){
		Students st1 = new Students();
		Students st2 = new Students("Budi", "2902726864", 3.99);
		
//		st1.name = "Jojo";
//		st1.id = "ST001";
		st1.setName("Jojo");
		
		st1.GPA = 3.96;
		st1.displayInfo();
		
		st2.displayInfo();
		
		ArrayList<Students> students = new ArrayList<Students>();
		students.add(st1);
		students.add(st2);
		students.add(new Students("Evan","ST003",4.00));
		for(Students student : students) {
			student.displayInfo();
		}
		
	}
	
	public static void main(String[] args) {
		 new session4();
	}
	
	public void display(Students siswa) {
		System.out.println("Halo " + siswa.name);
		
	}
	
	
}


