package main;

import game.Game;
import game.Weapon;
import character.Character;

public class Main {

	public static void main(String[] args) {
		Game game = new Game("Fantasy Battle");
		
		Weapon sword = new Weapon(101, "Dragon Sword", 150);
		Weapon bow = new Weapon(102, "Elven Bow", 120);
		
		Character char1 = new Character(201, "Arthas", 30);
		Character char2 = new Character(202, "Sylvanas", 28);
		
		game.addWeapon(sword);
		game.addWeapon(bow);
		
		game.registerCharacter(char1);
		game.registerCharacter(char2);
		
		
		game.attack(char1, sword, "Attack Goblin");
		game.attack(char2, bow, "Attack Orc");
		game.attack(char1, sword, "Attack Dragon");
		
		
		game.displayGameInfo();
	}

}
