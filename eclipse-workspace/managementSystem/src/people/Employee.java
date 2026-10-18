package people;
import stuffs.Company;
import stuffs.Project;
import java.util.*;
public class Employee {
	private String employeeId;
	private String name;
	private Company company;
	private ArrayList<Project> assignedProjects;
	
	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.assignedProjects = new ArrayList<>();
	}
	
	public void setCompany(Company c) {
		this.company = c;
	}
	
	public void joinProject(Project p) {
		assignedProjects.add(p);
		p.setEmployee(this);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Project> getAssignedProjects() {
		return assignedProjects;
	}
	
	
}
