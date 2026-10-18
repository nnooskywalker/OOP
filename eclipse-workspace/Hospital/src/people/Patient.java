package people;
import java.util.ArrayList;


public class Patient {
	private int id;
	private String name;
	private int age;
	private ArrayList<String> medicalRecords;
	private int totalSpent;
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.totalSpent = 0;
		this.medicalRecords = new ArrayList<>();
	}
	
	public void setTotalSpent(int totalSpent) {
		this.totalSpent += totalSpent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void addMedicalrecord(String record) {
		 medicalRecords.add(record);
	}

	public ArrayList<String> getMedicalRecords() {
		return medicalRecords;
	}

	public int getTotalSpent() {
		return totalSpent;
	}
	
	
	
	
}
