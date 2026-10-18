package Main;
import people.Faculty;
import people.CourseClass;
import people.Student;
import people.Teacher;

public class main {

	public static void main(String[] args) {
		Faculty f1 = new Faculty("F01","Faculty Of Computer Science");
		
		Teacher t1 = new Teacher("T01", "Dr. Andi");
		Teacher t2 = new Teacher("T02", "Dr. Budi");
		
		f1.addTeacher(t1);
		f1.addTeacher(t2);
		
		Student s1 = new Student("S01","Alice");
		Student s2 = new Student("S02","Bob");
		Student s3 = new Student("S03","Charlie");
		
		f1.addStudent(s1);
		f1.addStudent(s2);
		f1.addStudent(s3);
		
		CourseClass c1 = new CourseClass("C01","OOP",f1);
		CourseClass c2 = new CourseClass("C02","Data Structures",f1);
		
		f1.addClass(c1);
		f1.addClass(c2);
		
		t1.teachClass(c1);
		t2.teachClass(c2);
		
		s1.takeClass(c1);
		s1.takeClass(c2);
		s2.takeClass(c1);
		s3.takeClass(c2);
		
		
		
		
		
		f1.printAllClassesDetail();
		
		

	}

}
