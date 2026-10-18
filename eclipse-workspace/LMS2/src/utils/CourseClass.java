package utils;
import java.util.*;

public class CourseClass {
	private String classId;
	private String className;
	private Faculty faculty;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	public CourseClass(String id, String name, Faculty f) {
		this.classId = id;
		this.className = name;
		this.faculty = f;
		this.students = new ArrayList<>();
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(Student st) {
		students.add(st);
	}

	public String getClassName() {
		return className;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher T) {
		this.teacher = T;
	}
	



	
	
}
