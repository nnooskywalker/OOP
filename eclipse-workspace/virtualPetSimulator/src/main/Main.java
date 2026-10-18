package main;
import pet.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.print("Choose pet: ");
	}
	
	public static void dog() {
		System.out.println("1. Feed");
		System.out.println("2. Groom");
		System.out.println("3. Train");
		System.out.println("4. Sleep");
	}
	
	public static void cat() {
		System.out.println("1. Feed");
		System.out.println("2. Groom");
		System.out.println("3. Sleep");
	}
	
	public static void bird() {
		System.out.println("1. Feed");
		System.out.println("2. Train");
		System.out.println("3. Sleep");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, choose = 0;
		Cat c = new Cat();
		Dog d = new Dog();
		Bird b = new Bird();
		
		
		while(true) {
			menu();
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1:				
				while(true) {
					if (!d.slowDown()) break;
					
					d.displayInfo();
					
					dog();
					System.out.print("Choose : ");
					choose = sc.nextInt();
					sc.nextLine();
					
					switch(choose) {
					case 1:
						d.feed();
						break;
					case 2:
						d.groom();
						break;
					case 3:
						d.train();
						break;
					case 4:
						d.sleep();
						break;
					}		
					
					d.levelUp();
				}
				break;
			case 2:
				choose = 0;
				while(true) {
					if (!c.slowDown()) break;
					c.displayInfo();
					
					cat();
					System.out.println("Choose : ");
					choose = sc.nextInt();
					sc.nextLine();
					
					switch(choose) {
					case 1:
						c.feed();
						break;
					case 2:
						c.groom();
						break;
					case 3:
						c.sleep();
						break;
					}
					
					c.levelUp();
				}
				break;
			case 3:
				choose = 0;
				while(true) {
					if (!b.slowDown()) break;
					b.displayInfo();
					
					bird();
					System.out.println("Choose : ");
					choose = sc.nextInt();
					sc.nextLine();
					
					switch(choose) {
					case 1:
						b.feed();
						break;
					case 2:
						b.train();
						break;
					case 3:
						b.sleep();
						break;
					}
					
					b.levelUp();
				}
				break;
			}
		}

	}

}
