package Material;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.HashMap;

class Item{
	String name;
	int price;
	int qty;
	
}
public class session3 {
	public static void main(String[] args) {
//============================ARRAY LIST================================
	//add = tambah data
	//clear = hapus semua data
	//clone = copy data
	//isEmpty = check kosong atau ngga ?
	// contains = check data ada atau ngga ? (return false : ngga ada, return true : ada)
	// clear = hapus semua isi array list	
		ArrayList<String> cities = new ArrayList<>();
		
		//Insert --> add
		cities.add("Sentul");
		cities.add("Bogor");
		cities.add("Jakarta");
		cities.add(1, "Surabaya"); // insert di index ke n
		
		

		//View --> get / getIndex
		System.out.println(cities.get(1));

		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		//for each
		for(String city : cities) {
			System.out.println(city);
		}
		
		
    	//Delete --> remove 
		String removed = cities.remove(1); //better pakai index
		System.out.println(removed + " is removed");
		cities.remove("Sentul");
		
		//Update --> set
		cities.set(0,"Tangerang");
		
		//Others
	    System.out.println(cities.contains("Sentul")); 
		System.out.println(cities.isEmpty());
		cities.clear();
		
		//Sorting
		System.out.println("Before Sorting : ");
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("After Sorting : ");
		cities.sort(null);
		for(String city : cities) {
			System.out.println(city);
		}
		
		System.out.println("Reverse Sort : ");
		cities.sort(Comparator.reverseOrder());
		for(String city : cities) {
			System.out.println(city);
		}
		
//============================HASH SET================================
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		
		for (Integer num : numbers) {
			System.out.println(num);
		}
//============================HASH MAP================================
		HashMap<Integer, String> students = new HashMap<>();
		students.put(123, "Jojo");
		students.put(123,"jason");
		students.put(120,"Lili");
		
		System.out.println(students.get(123));
		System.out.println(students.keySet());
		
		for(String name : students.values()) {
			System.out.println(name);
		}
		
		for(Integer key : students.keySet()) {
			System.out.println(students.get(key));
		}
	}
	
	//Item --> name, price, quantity
//	ArrayList<Item> items = new ArrayList<>();
//	Item item = new item();
//	items.name = "Sugar";
//	items.price = 10000;
//	items.qty = 2;
//	
//	items.add(item);
//	items.get(0).price = 12000;

	}
	

