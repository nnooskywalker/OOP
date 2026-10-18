package sensor;

public class Humidity extends Sensor implements Threshold{
	private int thres;
	public Humidity(String name, String type, int threshold) {
		super(name, type);
		this.thres = threshold;
	}
	
	public int getThreshold() {
		return this.thres;
	}
}
