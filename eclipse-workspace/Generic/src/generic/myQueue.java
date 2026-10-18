package generic;
import java.util.ArrayList;
public class myQueue<Data> {
	private ArrayList<Data> q = new ArrayList<>();
	
	public myQueue() {
		q = new ArrayList<Data>();
	}
	
	public void enqueue(Data d) {
		q.add(d);
	}
	
	public Data dequeue() {
		return q.remove(0);
	}
	
	public Data peek() {
		return q.get(0);
	}
}
