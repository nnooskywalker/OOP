package main;
import people.Employee;
import people.Manager;
import stuffs.Company;
import stuffs.Project;
public class Main {

	public static void main(String[] args) {
		//Company
		Company cmp = new Company("C01", "TechNova Solutions");
		
		//manager
		Manager m1 = new Manager("M01", "Sarah");
		Manager m2 = new Manager("M02", "Michael");
		
		// add manager to company
		cmp.addManager(m1);
		cmp.addManager(m2);
		
		//create Employee
		Employee e1 = new Employee("E01", "Diana");
		Employee e2 = new Employee("E02", "Ethan");
		Employee e3 = new Employee("E03", "Fiona");
		
		//add Employee to company
		cmp.addEmployee(e1);
		cmp.addEmployee(e2);
		cmp.addEmployee(e3);
		
		//Create Project
		Project p1 = new Project("P01", "Website Redesign", cmp);
		Project p2 = new Project("P02", "Mobile App Development", cmp);
		
		//add Project to company
		cmp.addProject(p1);
		cmp.addProject(p2);
		
		m1.manageProject(p1);
		m2.manageProject(p2);
		
		//Employee join to project
		e1.joinProject(p1);
		e1.joinProject(p2);
		e2.joinProject(p1);
		e3.joinProject(p2);
		
		
		cmp.printAllProjectsDetail();
	}

}
