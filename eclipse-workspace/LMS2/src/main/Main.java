package main;
import utils.CourseClass;
import utils.Faculty;
import utils.Student;
import utils.Teacher;

public class Main {

	public static void main(String[] args) {
		//Faculty
		Faculty f1 = new Faculty("F01","Faculty of Computer Science");
		
		//teacher
		Teacher t1 = new Teacher("T01","Dr. Andi");
		Teacher t2 = new Teacher("T02","Dr.Budi");
		
		//Add to faculty
		f1.addTeachers(t1);
		f1.addTeachers(t2);
		
		//Student
		Student s1 = new Student("S01","Alice");
		Student s2 = new Student("S02","Bob");
		Student s3 = new Student("S03","Charlie");
		
		//add to faculty
		f1.addStudents(s1);
		f1.addStudents(s2);
		f1.addStudents(s3);
		
		//make class
		CourseClass c1 = new CourseClass("C01","OOP",f1);
		CourseClass c2 = new CourseClass("C02","Data Structures",f1);
		
		//add to faculty
		f1.addClasses(c1);
		f1.addClasses(c2);
		
		//teacher teach class
		t1.teachClass(c1);
		t2.teachClass(c2);
		
		//Student take class
		s1.takeClass(c1);
		s1.takeClass(c2);
		s2.takeClass(c1);
		s3.takeClass(c2);
		
		//print all
		f1.printAllClassesDetail();
		

	}

}
