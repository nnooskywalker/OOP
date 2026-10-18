package platform;
import java.util.ArrayList;

import users.Student;
import users.Instructor;
public class SkillVerse {
	private String name;
	private int totalPlatform;
	private ArrayList<Category> categories;
	private ArrayList<Student> students;
	
	
	public SkillVerse(String name) {
		this.name = name;
		this.categories = new ArrayList<>();
		this.students = new ArrayList<>();
		this.totalPlatform = 0;
	}
	
	public void addCategory(Category c) {
		categories.add(c);
	}
	
	public void registerStudent(Student s) {
		students.add(s);
	}
	
	public void processEnrollment(Student s, Instructor i, String courseName) {
		String word = "Enrolled in " + courseName + " with " + i.getName() + " (Cost : " + i.getFee() + " )";
		s.setTotalSpent(i.getFee());
		s.addEnrollmentRecords(word);
		this.totalPlatform += i.getFee();
				
	}
	
	public void displayPlatformInfo() {
		System.out.println("Platform : " + this.name);
		
		System.out.println("Categories : ");
		for(Category ct : categories) {
			System.out.printf(" - %s (Lead Instructor : %s)\n",ct.getName(), ct.getLeadInstructor().getName());
		}
		System.out.printf("\n");
		
		System.out.println("Instructors : ");
		for(Category ct : categories) {
			for(Instructor i : ct.getInstructors()) {
				System.out.printf(" - %s (Expertise : %s, Fee: %d)\n", i.getName(), i.getExpertise(), i.getFee());
				System.out.println("Students : ");
				System.out.printf("  - %s (Age : %d)\n",i.getStudent().getName(), i.getStudent().getAge());
			}
		}
		
		System.out.println("Students : ");
		for(Student st : students) {
			System.out.printf(" - %s (ID : %d, Age : %d)\n",st.getName(), st.getId(), st.getAge());
			System.out.println(" Enrollment Records : ");
			for(String record : st.getEnrollmentRecords()) {
				System.out.printf("  - %s\n",record);
			}
			System.out.println("Total Spent : " + st.getTotalSpent());
		}
		
		System.out.println("Total Platform Revenue : " + this.totalPlatform);
	}
	

}
