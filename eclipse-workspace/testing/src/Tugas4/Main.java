package Tugas4;

import java.util.ArrayList;
import java.util.Scanner;

class GroceryStore{
	String ID;
	String name;
	final int maxNum;
	ArrayList<Item> barang = new ArrayList<Item>();
	Item stuff;
	
	GroceryStore(String ID, String name, int maxNum){
		this.ID = ID;
		this.name = name;
		this.maxNum = maxNum;
		
		
	}
	
	void addItem(Item item) {
		if (barang.size() < maxNum) {
			barang.add(item);
		}
		else {
			System.out.println("Unable to add item again");
		}
	}
	
	void removeItem(Item item) {
		if(barang.contains(item)) {
			barang.remove(item);
		}
		else {
			System.out.println("Not Found");
		}
	}
	

	
	
	void updateName(String newName) {
		this.name = newName;
	}
	
	
	void display() {
		System.out.printf("Store (%s) : %s\n",this.ID, this.name);
		System.out.println("=================================================");
		
		
		if (barang.isEmpty()) {
			System.out.println("Item is empty");
		}
		else {
			for(Item stuff : barang) {
				System.out.println("ID : " + stuff.id);
				System.out.println("Name : " + stuff.name);
				System.out.println("Brand Name : " + stuff.brandName);
				System.out.println("Price : " + stuff.price);
				System.out.println("Quantity : " + stuff.quantity);
				System.out.printf("\n");							
			}
		}
		
	}
	
	
	
}


class Item{
	String id;
	String name;
	String brandName;
	int price;
	int quantity;
	
	Item(String ID, String name, String brandName, int price, int quantity){
		this.id = ID;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	void updateItemInformation(String newName, String newBrandName, int newPrice, int newQuantity) {
		this.name = newName;
		this.brandName = newBrandName;
		this.price = newPrice;
		this.quantity = newQuantity;
	}
	

	
}


public class Main {

	public static void main(String[] args) {

		ArrayList<GroceryStore>  stores = new ArrayList<GroceryStore>();
		GroceryStore tokoAnyar = null;
		Item stuff = null;
		Scanner sc = new Scanner(System.in);
		int choose = 0, maxItems = 0, priceItem = 0, quantity = 0;
		String id = null, storeName, idItem = null, itemName, brandName, newName, searchId;
		String inputIDStore;
		boolean isValid = true;
		
	
		while(choose != 7) {
			System.out.println("=====Grocery Store=====");
			System.out.println("1. Insert New Grocery");
			System.out.println("2. Insert new item to grocery");
			System.out.println("3. Update Grocery Name");
			System.out.println("4. Update Item Information");
			System.out.println("5. Remove item and store");
			System.out.println("6. Display");
			System.out.println("7. Exit");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:		
				isValid = true;
				while(isValid) {
					isValid = false;
					System.out.print("Input ID : ");
					id = sc.nextLine();
					
					for(GroceryStore g : stores) {
						if (g.ID.equals(id)) {
							System.out.println("ID has been used ! Create another ID !");
							isValid = true;
							break;
						}
					}
				}
				
				System.out.print("Input Store Name : ");
				storeName = sc.nextLine();
				System.out.print("Input Max Items :");
				maxItems = sc.nextInt();	
				sc.nextLine();
				tokoAnyar = new GroceryStore(id, storeName, maxItems);
				stores.add(tokoAnyar);
				break;
			case 2:
				System.out.println("Input grocery's ID : ");
				id = sc.nextLine();
				
				tokoAnyar = null;
				
				for(GroceryStore g : stores) {
					
					if (g.ID.equals(id)) {
						tokoAnyar = g;
						break;
					}
				}
				
				
				if(tokoAnyar == null) {
					System.out.println("Store Not Found");
				}
				else {
					isValid = true;
					while(isValid) {
						isValid = false;
						System.out.print("Input ID item : ");
						idItem = sc.nextLine();
						
						
						for(Item it : tokoAnyar.barang) {
							if(it.id.equals(idItem)) {
								System.out.println("ID has been used ! create another id !");
								isValid = true;
								break;
							}
						}
						
					}
					System.out.print("Input Item Name :");
					itemName = sc.nextLine();
					System.out.print("Input Brand Name : ");
					brandName = sc.nextLine();
					System.out.print("Input Price: ");
					priceItem = sc.nextInt();
					sc.nextLine();
					System.out.println("Input quantity : ");
					quantity = sc.nextInt();
					sc.nextLine();
					
					stuff = new Item(idItem, itemName, brandName, priceItem, quantity);
					
					tokoAnyar.addItem(stuff);
				}
				break;
			case 3:
				System.out.println("Input grocery's id : ");
				String inputID = sc.nextLine();
				tokoAnyar = null;
				
				for(GroceryStore g : stores) {
					
					if(g.ID.contains(inputID)) {
						tokoAnyar = g;
						break;
					}
				}
				
				if(tokoAnyar != null) {
					System.out.println("Input New Name : ");
					newName = sc.nextLine();
					tokoAnyar.updateName(newName);					
				}
				else {
					System.out.println("Store Not Found");
				}
				break;
			case 4:
				System.out.println("Input grocery's id : ");
				inputIDStore = sc.nextLine();
				tokoAnyar = null;
				
				for(GroceryStore g : stores) {
					if(g.ID.contains(inputIDStore)) {
						tokoAnyar = g;
						break;
					}
				}
				
				if(tokoAnyar == null) {
					System.out.println("Store not found");
				}
				else {
					System.out.println("Input Item ID : ");
					idItem = sc.nextLine();
					
					stuff = null;
					
					for(Item I : tokoAnyar.barang) {
						if(I.id.equals(idItem)) {
							stuff = I;
						}
					}
					
					
					if (stuff != null) {
						System.out.println("Input new Name : ");
						String newNama = sc.nextLine();
						System.out.println("Input new Brand Name : ");
						String newBrandName = sc.nextLine();
						System.out.println("input new price :");
						int newPrice = sc.nextInt();
						sc.nextLine();
						System.out.println("Input new quantity : ");
						int newQuantity = sc.nextInt();
						sc.nextLine();
						
						stuff.updateItemInformation(newNama, newBrandName, newPrice, newQuantity);
						
					}
					else {
						System.out.println("Item Not Found");
					}	
				}
				break;
			case 5:
				System.out.println("Input grocery's ID : ");
			    String deleteId = sc.nextLine();
			    
			    boolean removed = stores.removeIf(g->g.ID.equals(deleteId));
			    
			    	if(removed) {
			    		System.out.println("Grocery Sucesfully Deleted");
			    	}
			    	else {
			    		System.out.println("Not Found");
			    	}
				break;
				
			case 6:
				
				if (stores.size() == 0) {
					System.out.println("Store Empty!");
				}
				else {
					for(int i = 0; i < stores.size(); i++) {
						System.out.println((i+1) + ". ");
						stores.get(i).display();
					}
				}
				break;
			case 7:
				System.out.println("Exiting...");
				break;
			default :
				System.out.println("Input Not Valid!");
							 
				}
			}
			
			
		}
		
		
		
		
		
		
		

	}


