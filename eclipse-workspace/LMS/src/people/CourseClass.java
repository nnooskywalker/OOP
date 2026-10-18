package people;
import java.util.ArrayList;

public class CourseClass {
	private String classId;
	public String className;
	private Faculty faculty;
	private Teacher teacher;
	private  ArrayList<Student> students = new ArrayList<>();
	
	public CourseClass(String classId, String className, Faculty f) {
		this.classId = classId;
		this.className = className;
		this.faculty = f;
	}
	
	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
		
	public void getStudents() {
		System.out.println("Students : ");
		for(Student st : students) {
			System.out.println("- " + st.name);
		}
	}
	

	
	public Teacher getTeacher() {
		return teacher;
	}
	
	
	

}
