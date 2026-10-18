package stuffs;
import java.util.ArrayList;
import people.Employee;
import people.Manager;

public class Company {
	protected String companyId;
	protected String companyName;
	private ArrayList<Employee> employees;
	private ArrayList<Manager> managers;
	private ArrayList<Project> projects;
	
	public Company(String companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.employees = new ArrayList<>();
		this.managers = new ArrayList<>();
		this.projects = new ArrayList<>();
	}
	
	
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void addManager(Manager m) {
		managers.add(m);
	}
	
	public void addProject(Project p) {
		projects.add(p);
	}



	public ArrayList<Employee> getEmployees() {
		return employees;
	}



	public ArrayList<Manager> getManagers() {
		return managers;
	}



	public ArrayList<Project> getProjects() {
		return projects;
	}
	
	
	public void printAllProjectsDetail() {
		System.out.println("Company : " + this.companyName);
		
		for(Project p : projects) {
			System.out.println("Project : " + p.getProjectName());
			System.out.println("Manager : " + p.getManager().getName());
			System.out.println("Employees : ");
			for(Employee e : p.getEmployees()) {
				System.out.println("- " + e.getName());
			}
		}
		System.out.printf("\n");
		
	}
}
