package Main;
import platform.Category;
import platform.SkillVerse;
import users.Instructor;
import users.Student;
import java.text.NumberFormat;
import java.util.Locale;
public class main {
	public static void main(String[] args) {
		//create platform
		SkillVerse platform = new SkillVerse("SkillVerse Online Learning");
		
		
		//create categories
		Category programming = new Category("Programming");
		Category design = new Category("Design");
		
		//Add categories to platform
		platform.addCategory(programming);
		platform.addCategory(design);
		
		//Create instructors
		Instructor inst1 = new Instructor(101, "Budi Santoso", "Java Developer", 5000000);
		Instructor inst2 = new Instructor(102, "Siti Aminah", "UI/UX Designer", 4500000);
		
		
		//Assign instructors
		programming.setLeadInstructor(inst1);
		design.setLeadInstructor(inst2);
		
		
		//create Student
		Student student1 = new Student(201, "Andi", 20);
		Student student2 = new Student(202, "Rina", 22);
		
		inst1.addStudent(student1);
		inst2.addStudent(student2);
		
		//register
		platform.registerStudent(student1);
		platform.registerStudent(student2);
		
		//take course
		platform.processEnrollment(student1, inst1, "Matering OOP in Java");
		platform.processEnrollment(student2, inst2, "Figma for Beginners");
		platform.processEnrollment(student1, inst1, "Advanced Data Structures");
		
		//Display
		platform.displayPlatformInfo();

		
	}
	
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
		
		return formatter.format(amount);
	}
	
}
