package utils;
import java.util.*;
public class Faculty {
	private String facultyId;
	private String facultyName;
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<CourseClass> classes;
	
	public Faculty(String id, String name) {
		this.facultyId = id;
		this.facultyName = name;
		this.teachers = new ArrayList<>();
		this.classes = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public ArrayList<CourseClass> getClasses() {
		return classes;
	}

	public void addStudents(Student s) {
		students.add(s);
	}

	public void addTeachers(Teacher t) {
		teachers.add(t);
	}

	public void addClasses(CourseClass c) {
		classes.add(c);
	}
	
	public void printAllClassesDetail() {
		System.out.println("Faculty : " + this.facultyName);
		
		for(CourseClass c : classes) {
			System.out.println("Class : " + c.getClassName());
			System.out.println("Teacher : " + c.getTeacher().getName());
			System.out.println("Students : ");
			for(Student st : c.getStudents()) {
				System.out.println("- " + st.getName());
			}
			System.out.printf("\n");
		}
		
	}
}
