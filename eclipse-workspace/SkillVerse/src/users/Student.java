package users;
import java.util.ArrayList;


public class Student {
	private int id;
	private String name;
	private int age;
	private ArrayList<String> enrollmentRecords;
	private int totalSpent;
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.enrollmentRecords = new ArrayList<>();
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

	public ArrayList<String> getEnrollmentRecords() {
		return enrollmentRecords;
	}

	public void addEnrollmentRecords(String record) {
		enrollmentRecords.add(record);
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent += totalSpent;
	}
	
	
	
}
