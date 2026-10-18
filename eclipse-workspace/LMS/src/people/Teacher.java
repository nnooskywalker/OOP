package people;
import java.util.ArrayList;

public class Teacher {
	private String teacherID;
	public String name;
	private Faculty faculty;
	private ArrayList<CourseClass> teachingClasses = new ArrayList<>();
	
	public Teacher(String teacherId, String name) {
		this.teacherID = teacherId;
		this.name = name;
	}
	
	public void setFaculty(Faculty f) {
		this.faculty = f;
	}
	
	public void teachClass(CourseClass c) {
		teachingClasses.add(c);
		c.setTeacher(this);
	}
	
	public ArrayList<CourseClass> getTeachingClasses(){
		return teachingClasses;
	}
}
