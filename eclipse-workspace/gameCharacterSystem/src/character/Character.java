package character;
import java.util.*;

public class Character {
	private int id;
	private String name;
	private int level;
	private ArrayList<String> battleRecords;
	private int totalDamage;
	
	public Character(int id, String name, int level) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.battleRecords = new ArrayList<>();
		this.totalDamage = 0;
	}
	
	public void addBattleRecord(String record) {
		battleRecords.add(record);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public void setBattleRecords(ArrayList<String> battleRecords) {
		this.battleRecords = battleRecords;
	}

	public void addDamage(int damage) {
		this.totalDamage += damage;
	}
	
	public ArrayList<String> getBattleRecords() {
		return battleRecords;
	}
	
	public int getTotalDamage() {
		return this.totalDamage;
	}
	
	
	
}
