package Material;

public class Students {
	private String name, id;
	double GPA;
	
	
	public Students() {
		System.out.println("Ini constructor");
	}
	

	
	public Students(String name, String id, double gPA) {
		this.name = name;
		this.id = id;
		GPA = gPA;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	void displayInfo() {
		System.out.println(id + " - " + name + GPA);
	}

}
