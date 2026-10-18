package sensor;
import java.util.ArrayList;
public abstract class Sensor {
	private String name;
	private String type;
	private ArrayList<Integer> history;
	
	public Sensor(String name, String type) {
		this.name = name;
		this.type = type;
		history = new ArrayList<>();
	}
	
	public void addData(int newData) {
		history.add(newData);
		
		if (history.size() > 5) {
			history.remove(0);
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public ArrayList<Integer> getHistory(){
		return this.history;
	}
	
	
	
	
}
