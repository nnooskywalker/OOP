package people;
import stuffs.Company;
import stuffs.Project;
import java.util.*;


public class Manager {
	private String managerId;
	private String name;
	private Company company;
	private ArrayList<Project> managedProjects;
	
	public Manager(String id, String name) {
		this.managerId = id;
		this.name = name;
		this.managedProjects = new ArrayList<>();
	}
	
	public void setCompany(Company c) {
		this.company = c;
	}
	
	public void manageProject(Project p) {
		managedProjects.add(p);
		p.setManager(this);
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Project> getManagedProjects(){
		return managedProjects;
	}
}
