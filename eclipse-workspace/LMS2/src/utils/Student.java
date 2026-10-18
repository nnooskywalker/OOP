package utils;

import java.util.*;

public class Student {
	private String studentId;
	private String name;
	private Faculty faculty;
	private ArrayList<CourseClass> enrolledClasses;
	
	public Student(String id, String name) {
		this.studentId = id;
		this.name = name;
		this.enrolledClasses = new ArrayList<>();
	}
	
	public void setFaculty(Faculty f) {
		this.faculty = f;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void takeClass(CourseClass c) {
		enrolledClasses.add(c);
		c.setStudents(this);
	}
	
	public ArrayList<CourseClass> getEnrolledClasses() {
		return enrolledClasses;
	}
	
	
}
