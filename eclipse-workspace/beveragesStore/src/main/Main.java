package main;
import java.util.*;


import menu.Juice;
import menu.Tea;
import menu.Coffee;
import parent.Beverage;


public class Main {

	public static void main(String[] args) {
		ArrayList<Beverage> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choose = 0, no = 1;
		double price;
		
		while(choose != 4) {
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. View All");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				String menu = null;
				String bean = null, tea = null, fruit = null;
				price = 0;
				String name = null;
				
				System.out.print("Name : ");
				name = sc.nextLine();
				
				System.out.print("Price : ");
				price = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.print("Coffee / Tea / Juice : ");
				menu = sc.nextLine();
				
				if (menu.equalsIgnoreCase("Coffee")) {
					System.out.print("Bean type : ");
					bean = sc.nextLine();
					Coffee cf = new Coffee(name, price, bean);
					list.add(cf);
				}
				else if (menu.equalsIgnoreCase("Tea")) {
					System.out.print("Tea type : ");
					tea = sc.nextLine();
					Tea t = new Tea(name, price, tea);
					list.add(t);
				}
				else {
					System.out.print("Fruit : ");
					fruit = sc.nextLine();
					Juice jc = new Juice(name, price, fruit);
					list.add(jc);
				}
				
				break;
			case 2:
				if (list.isEmpty()) {
					System.out.println("List is Empty");
				}
				else {
					no = 1;
					for(Beverage bv : list) {
						System.out.print(no + ". ");
						bv.display();
						no++;
						
				}
					System.out.println("Enter the number to delete : ");
					int choice = sc.nextInt();
					sc.nextLine();
					
					list.remove(choice-1);
					
					System.out.println("Delete Sucesfully !");
				}
			
				
				break;
			case 3:
				if (list.isEmpty()) {
					System.out.println("List is Empty");
				}
				else {
					no = 1;
					for(Beverage bv: list) {
						System.out.print(no + " .");
						bv.display();
						no++;
					}
				}
				
				break;
			case 4:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Input Invalid");
				break;
			}
		}
		
		

	}

}
