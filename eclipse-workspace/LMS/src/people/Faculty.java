package people;
import java.util.ArrayList;

public class Faculty {
	private String facultyid;
	public String facultyName;
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Teacher> teachers = new ArrayList<>();
	private ArrayList<CourseClass> classes = new ArrayList<>();
	
	public Faculty(String facultyId, String facultyName) {
		this.facultyid = facultyId;
		this.facultyName = facultyName;
	}
	
	public void addStudent(Student s) {
		students.add(s);
		s.setFaculty(this);
	}
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
		t.setFaculty(this);
	}
	
	public void addClass(CourseClass c) {
		classes.add(c);
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Teacher> getTeacher() {
		return teachers;
	}

	public ArrayList<CourseClass> getClasses() {
		return classes;
	}
	
	public void printAllClassesDetail() {
		System.out.println("Faculty : " + this.facultyName);
		
		for(CourseClass cl : classes) {
			System.out.println("Class : " + cl.className);
			System.out.println("Teacher : " + cl.getTeacher().name);
			cl.getStudents();
			System.out.printf("\n");
		}
	}

	
	
	
	
	
}
