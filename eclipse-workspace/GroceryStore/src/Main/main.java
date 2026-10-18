package Main;
import java.util.Scanner;
import java.util.ArrayList;

import storeItem.Store;
import storeItem.Items;

public class main {

	public static void main(String[] args) {
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Store> stores = new ArrayList<>();
		
		
		while(choose != 7) {
			System.out.println("1. Insert new Grocery");
			System.out.println("2. Insert new item to Grocery ");
			System.out.println("3. Update Grocery Name");
			System.out.println("4. Update item information");
			System.out.println("5. Remove Item and Store");
			System.out.println("6. Display Item and Store");
			System.out.println("7. Exit");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			
			switch(choose) {
			case 1:
				String idStore = null, storeName = null;
				boolean isFull = false;
				int maxItems = 0;
				
				
				while(true) {
					System.out.println("Input ID (Store) : ");
					idStore = sc.nextLine();
					
					boolean isValid = false;
					
					for(Store st : stores) {
						if (st.getID().equals(idStore)) {
							isValid = true;
						}
					}
					
					
					if (isValid) {
						System.out.println("ID Has Been Used");
					}
					else {
						break;
					}
				}
	
				System.out.print("Store Name : ");
				storeName = sc.nextLine();
				
				System.out.print("Max Items : ");
				maxItems = sc.nextInt();
				sc.nextLine();
				
				Store toko = new Store(idStore, storeName, maxItems);
				
				stores.add(toko);
				isFull = true;
				
				System.out.println("Grocery Sucesfully Created");
				
				break;
			case 2:
				idStore = null;
				String idItem = null, nameItem = null, brandName = null;
				int quantity = 0, price = 0;
				
				while(true) {
					System.out.println("Input ID (Item) : ");
					idItem = sc.nextLine();
					
					boolean isValid = false;
					
					for(Store st : stores) {
						for(Items it : st.getItem()) {
							if (it.getID().equals(idItem)) {
								isValid = true;
								break;
							}
						}
						
						if(isValid) {
							break;
						}
					}
					
					if (isValid) {
						System.out.println("ID Has been used");
					}
					else {
						break;
					}
				}
				
			
				
				System.out.print("Name : ");
				nameItem = sc.nextLine();
				
				System.out.print("Brand Name : ");
				brandName = sc.nextLine();
				
				System.out.print("Price : ");
				price = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Quantity : ");
				quantity = sc.nextInt();
				sc.nextLine();
				
				Items item = new Items(idItem, nameItem, brandName, price, quantity);
				
				
				System.out.println("Input ID Store : ");
				idStore = sc.nextLine();
				
				Store tempStore = null;
				
				for(Store st : stores) {
					if (st.getID().equals(idStore)) {
						tempStore = st;
					}
				}
				
				if (tempStore == null) {
					System.out.println("Store Not Found");
				}
				else {
					tempStore.validateisFull(item);
				}
				break;
			case 3:
				tempStore = null;
				idStore = null;
				String newName = null;
				
				System.out.print("Input Store ID : ");
				idStore = sc.nextLine();
				
				for(Store st : stores) {
					if (st.getID().equals(idStore)) {
						tempStore = st;
					}
				}
				
				if (tempStore == null) {
					System.out.println("ID Not Found");
				}
				else {
					System.out.println("Input new name : ");
					newName = sc.nextLine();
					
					tempStore.setName(newName);
					System.out.println("Sucesfully Updated name!");
				}
				break;
			case 4:
				idItem = null;
				String newBrandName = null, newItemName = null;
				int newPrice = 0, newQuantity = 0;
				Items tempItem = null;
				
				System.out.print("Input ID Item : ");
				idItem = sc.nextLine();
				
				for(Store st : stores) {
					for(Items it : st.getItem()) {
						if (it.getID().equals(idItem)) {
							tempItem = it;
						}
					}
				}
				
				if (tempItem == null) {
					System.out.println("ID Not Found");
				}
				else {
					System.out.println("New Name : ");
					newItemName = sc.nextLine();
					
					System.out.println("New Brand Name : ");
					newBrandName = sc.nextLine();
					
					System.out.println("New Price : ");
					newPrice = sc.nextInt();
					
					System.out.println("New Quantity : ");
					newQuantity = sc.nextInt();
					
					tempItem.setName(newItemName);
					tempItem.setBrandName(newBrandName);
					tempItem.setPrice(newPrice);
					tempItem.setQuantity(newQuantity);
					
					System.out.println("Sucesfully Updated Item Information!");
				}
				
				break;
			case 5:
				idStore = null;
				tempStore = null;
				System.out.println("Input ID (Store) : ");
				idStore = sc.nextLine();
				
				for(Store st : stores) {
					if (st.getID().equals(idStore)) {
						tempStore = st;
					}
				}
				
				if(tempStore == null) {
					System.out.println("ID Not Found\n");
				}
				else {
					stores.remove(tempStore);
					
					System.out.println("Store and Items sucesfully removed");
				}
				
				
				break;
			case 6:
				if (stores.isEmpty()) {
					System.out.println("List is Empty\n");
				}
				else {
					int count = 1;
					for(Store st : stores) {
						System.out.println(count++ + ". ");
						System.out.println("Name : " + st.getName());
						System.out.println("ID : " + st.getID());
						System.out.println("Max Items : " + st.getMaxItems());
						System.out.println("===========ITEMS==============");
						st.displayItems();	
					}
				}

				break;
			case 7:
				System.out.println("Exiting....");
				break;
			}
		}

	}

}
