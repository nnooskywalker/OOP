package menu;

public class Plants {
	private String type;
	private String scientificname;
	private String name;
	private int growthTime;
	
	public Plants(String type, String scName, String oriName, int growthTime) {
		this.type = type;
		this.scientificname = scName;
		this.growthTime = growthTime;
		this.name = oriName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setGrowthTime() {
		this.growthTime--;
	}
	
	public void display() {
		System.out.printf("%s - %s - %s - ",this.type, this.name, this.scientificname);
		
		if (this.growthTime <= 0) {
			System.out.println(" was mature\n");
		}
		else {
			System.out.printf(" mature in %d day(s)\n",this.growthTime);
		}
	}
	
}


