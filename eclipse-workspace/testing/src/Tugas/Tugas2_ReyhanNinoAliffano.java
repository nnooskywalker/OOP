package Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2_ReyhanNinoAliffano {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int choose = 0, num = 0, flag = 0;
		String inputName = null, inputRemove, inputSearch;
		boolean isTrue = false;
		
		while(choose != 5) {
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Search Item");
			System.out.println("4. View List");
			System.out.println("5. Exit");
			System.out.print(">>");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			 case 1:
				 
				 while(true) {
					 System.out.println("Enter item name : ");
					 inputName = sc.nextLine();
					 
					 if(stuff.contains(inputName) == true) {
						 System.out.println("Item already exists!");
					 }
					 else {
						 stuff.add(inputName);
						 System.out.println("Item Added!");
						 flag++;
						 break;		 
					 }
					 
				 }
				 break;
			 case 2:
				 System.out.println("Enter Item to remove: ");
				 inputRemove = sc.nextLine();
				 
				 if(stuff.contains(inputRemove) == true) {
					 stuff.remove(inputRemove);
					 flag--;
					 System.out.println(inputRemove + " removed!");
				 }
				 else {
					 System.out.println("Item not found!");
					 continue;
				 }
				 break;
			 case 3:
				 System.out.println("Enter search keyword: ");
				 inputSearch = sc.nextLine();
				 System.out.println("Search results: ");
				 
				 for(String item : stuff) {
					 if (item.startsWith(inputSearch) == true) {
						 System.out.println("- " + item);
						 isTrue = true;
					 }
			
				 }
				 
				 if(!isTrue) {
					 System.out.println("No items match your search.");
					 break;
				 }
				 break;
			 case 4:
				 System.out.println("Your Grocery List:");
				 if (flag == 0) {
					 System.out.println("Empty");
				 }
				 else {
					 for(int i = 0; i < stuff.size(); i++) {
						 System.out.println(i+1 + ". " + stuff.get(i));
					 }					 
				 }
				 
				 System.out.println("Total items: " + flag);
				 break;
			 case 5:
				 System.out.println("Exiting....");
				 break;
			 default:
				 System.out.priln("Invalid");
				 break;
				
			}
			
		}
		
		
	}
}
