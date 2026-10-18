package menu;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String type , scName, oriName, display ;
		int choose = 0, growthTime = 0, flag = 0, del = 0;
		ArrayList<Plants> plants = new ArrayList<>();
		
		while(choose != 5) {
			System.out.println("-- Binus Plant Collection --");
			System.out.println("1. View Plants");
			System.out.println("2. Insert Plants");
			System.out.println("3. Delete Plants");
			System.out.println("4. Water Plants");
			System.out.println("5. Exit");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				display = "";
				
				while(!display.equalsIgnoreCase("All") && !display.equalsIgnoreCase("Flower") && !display.equalsIgnoreCase("Tree") && !display.equalsIgnoreCase("Houseplant")) {
					System.out.print("Choose type (All/Flower/Tree/Houseplant): ");
					display = sc.nextLine();
				}
				
				if(display.equalsIgnoreCase("All")){
					if (plants.isEmpty()) {
						System.out.println("No plants\n");
					}
					else {
						int no = 1;
						for(Plants pl : plants) {
							System.out.print(no++ + ". ");
							pl.display();
						}
					}
				}
				else if (display.equalsIgnoreCase("Flower")) {
						flag = 0;
						int no = 1;
					for (Plants pl : plants) {
						if (pl.getType().equalsIgnoreCase("Flower")) {							
							System.out.print(no++ + ". ");
							pl.display();
							flag++;
						}
					}
					
					if (flag == 0) {
						System.out.println("No plants\n");
					}
			
				}
				else if (display.equalsIgnoreCase("Tree")) {
						int no = 1;
						flag = 0;
					for(Plants pl : plants) {
						if (pl.getType().equalsIgnoreCase("Tree")) {
							System.out.print(no++ + ". ");
							pl.display();
							flag++;
						}
					}
					if (flag == 0) {
						System.out.println("No plants\n");
					}
				}
				else {
					int no = 1;
					flag = 0;
				for(Plants pl : plants) {
					if (pl.getType().equalsIgnoreCase("Houseplant")) {
						System.out.println(no++ + ". ");
						pl.display();
						flag++;
					}
				}
				if (flag == 0) {
					System.out.println("No plants\n");
				}
				}
				break;
			case 2:
				scName = null;
				oriName = null;
				type = "";
				growthTime = 0;
				while(!type.equals("Flower") && !type.equals("Tree") && !type.equals("Houseplant")){
					System.out.print("Type (Flower/Tree/Houseplant): ");
					type = sc.nextLine();
				}
				
				
				while(scName == null || scName.length() < 5 || scName.length() > 30) {
					System.out.print("Scientific name (5-30 characters): ");
					scName = sc.nextLine();
				}
				
				if(type.equals("Flower")) {
					while( oriName == null || oriName.endsWith("Flower") == false) {
						System.out.print("Name (end with Flower): ");
						oriName = sc.nextLine();
					}
				}
				else if (type.equals("Tree")) {
					while( oriName == null || oriName.endsWith("Tree") == false) {
						System.out.print("Name (end with Tree) : ");
						oriName = sc.nextLine();
					}
				}
				else if (type.equals("Houseplant")) {
					while(oriName == null || oriName.endsWith("Houseplant") == false) {
						System.out.print("Name (end with Houseplant) : ");
						oriName = sc.nextLine();
					}
				}
				
				while(growthTime < 1 || growthTime > 10) {
					System.out.print("Growth Time (1 - 10 day(s)): ");
					growthTime = sc.nextInt();
				}
				sc.nextLine();
				
				Plants save = new Plants(type, scName, oriName, growthTime);
				
				plants.add(save);
				
				System.out.println("Plant is sucesfully inserted");
				
				
				break;
			case 3:
				if (plants.isEmpty()) {
					System.out.println("No plants\n");
				}
				else {
					int no = 1;
					for(Plants pl : plants) {
						System.out.print(no++ + ". ");
						pl.display();
					}
					
					while(del <= 0 || del > plants.size()) {
						System.out.printf("Choose plant to delete (%d - %d) : ",1,no);
						del = sc.nextInt();
						sc.nextLine();
					}
					
					plants.remove(del-1);
					
					System.out.println("Plant is removed sucesfully\n");
					
				}
				break;
			case 4:
				for(Plants pl : plants) {
					pl.setGrowthTime();
				}
				
				System.out.println("Sucesfully Watered");
				break;
			case 5:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Input not valid");
				break;
			}
		}
		
		

	}

}
