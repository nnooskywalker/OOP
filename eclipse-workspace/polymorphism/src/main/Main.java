package main;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int level = 10;
		Character c = new Character("Leon S Kenedy", "Player 1");
		System.out.println(c.showInfo(level));
		
		
		ArrayList<Item> items = new ArrayList<>();
		
		
		Item item = new MagicItem("Crystal", 1000, 120);
		MagicItem magic = new MagicItem("Immortal", 1000, 2000);
		DefenceItem defence = new DefenceItem("Shield", 90, 5);
		
		items.add(magic);
		items.add(defence);
		
		int totalDamage = 0;
		int totalDefence = 0;
		
		for (Item item2 : items) {
			if (item2 instanceof MagicItem) {
				totalDamage += ((MagicItem) item2).calDamage(level);
			}
			else {
				totalDefence += ((DefenceItem) item2).calDefense(level);
			}
		}
		
		
//		System.out.println(((MagicItem) items.get(0)).calDamage(100));
		
		

	}

}
