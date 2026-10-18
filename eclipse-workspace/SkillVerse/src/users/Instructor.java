package users;

public class Instructor {
	private int id;
	private String name;
	private String expertise;
	private int fee;
	private Student student;
	
	public Instructor(int id, String name, String expertise, int fee) {
		this.id = id;
		this.name = name;
		this.expertise = expertise;
		this.fee = fee;
	}
	
	public void addStudent(Student s) {
		this.student = s;
	}
	
	public Student getStudent() {
		return this.student;
	}

	public void processEnrollment(Student s, String courseName) {
		
	}

	public int getId() {
		return this.id;
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

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}
