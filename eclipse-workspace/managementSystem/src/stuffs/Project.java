package stuffs;
import people.Manager;
import people.Employee;
import java.util.*;
public class Project {
	private String projectId;
	private String projectName;
	private Company company;
	private Manager manager;
	private ArrayList<Employee> employees;
	
	
	public Project(String id, String name, Company company) {
		this.projectId = id;
		this.projectName = name;
		this.company = company;
		this.employees = new ArrayList<>();
	}
	
	
	public void setManager(Manager m) {
		this.manager = m;
	}
	
	public void setEmployee(Employee e) {
		employees.add(e);
	}
	
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}


	public Manager getManager() {
		return this.manager;
	}


	public String getProjectName() {
		return projectName;
	}
}
