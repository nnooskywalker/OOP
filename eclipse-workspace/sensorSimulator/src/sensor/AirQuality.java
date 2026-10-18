package sensor;

public class AirQuality extends Sensor implements Threshold{
	private int thres;
	public AirQuality(String name, String type, int threshold) {
		super(name, type);
		this.thres = threshold;
	}
	
	public int getThreshold() {
		return this.thres;
	}
}
