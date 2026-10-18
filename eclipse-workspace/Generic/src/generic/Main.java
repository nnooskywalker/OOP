package generic;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> cityStrings = new ArrayList<>();
//		myQueue<String> queue = new myQueue<String>();
		Pair<String, Integer> s1 = new Pair<String, Integer>("Lili", 90);
		 s1.printData();
		 
		 myQueue<Pair> queue = new myQueue<Pair>();
		 queue.enqueue(s1);
		 
		 AnotherPair s3 = new AnotherPair("Bibi", 85);
		 
	}

}
