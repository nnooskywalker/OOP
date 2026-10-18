package people;
import java.util.ArrayList;

public class Student {
	private String StudentId;
	public String name;
	private Faculty faculty;
	private ArrayList<CourseClass> enrolledClasses = new ArrayList<>();
	
	public Student(String StudentId, String name) {
		this.StudentId = StudentId;
		this.name = name;
	}
	
	
	public void setFaculty(Faculty f) {
		this.faculty = f;
	}
	
	public void takeClass(CourseClass c) {
		enrolledClasses.add(c);
		c.addStudent(this);
	}
	
	public ArrayList<CourseClass> getEnrolledClasses() {
		return enrolledClasses;
	}
	
}
