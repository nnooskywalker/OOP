package game;
import java.util.*;
import character.Character;

public class Game {
	private String name;
	private ArrayList<Weapon> weapon;
	private ArrayList<Character> character;
	
	public Game(String name) {
		this.name = name;
		this.weapon = new ArrayList<>();
		this.character = new ArrayList<>();
	}
	
	public void addWeapon(Weapon wp) {
		weapon.add(wp);
	}
	
	public void registerCharacter(Character ch) {
		character.add(ch);
	}
	
	public void attack(Character ch, Weapon wp, String action) {
		String recap = "- Used " + wp.getName() + action + "(Damage : " + wp.getDamage() + " )" ;
		ch.addBattleRecord(recap);
		ch.addDamage(wp.getDamage());
		
	}
	
	public void displayGameInfo() {
		System.out.println("Game : " + this.name);
		System.out.printf("\n");
		System.out.println("Weapons : ");
		for(Weapon wp : weapon) {
			System.out.printf("- %s (Damage: %d)\n",wp.getName(), wp.getDamage());
		}
		System.out.printf("\n");
		System.out.println("Characters : ");
		for(Character ch : character) {
			System.out.printf("- %s (ID : %d, Level : %d\n", ch.getName(), ch.getId(), ch.getLevel());
			for(String br : ch.getBattleRecords()) {
				System.out.printf("\t%s\n",br);
			}
			System.out.println("Total Damage: " + ch.getTotalDamage());
		}
		System.out.printf("\n");
		
	}
	
}
