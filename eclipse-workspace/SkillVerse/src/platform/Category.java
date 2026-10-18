package platform;
import users.Instructor;
import java.util.ArrayList;

public class Category {
	private String name;
	private Instructor leadInstructor;
	private ArrayList<Instructor> instructors;
	
	public Category(String name) {
		this.name = name;
		this.instructors = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getLeadInstructor() {
		return this.leadInstructor;
	}

	public void setLeadInstructor(Instructor leadInstructor) {
		this.leadInstructor = leadInstructor;
		instructors.add(leadInstructor);
	}

	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}
	
	
	
}
