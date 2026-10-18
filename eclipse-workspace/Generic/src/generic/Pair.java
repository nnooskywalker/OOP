package generic;

public class Pair<T, E>{
	private T key;
	private E value;
	
	public Pair(T key, E value) {
		this.key = key;
		this.value = value;
	}
	
	protected void printData() {
		System.out.println(key + ": " + value);
	}
	public T getKey() {
		return key;
	}
	public E getValue() {
		return value;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public void setValue(E value) {
		this.value = value;
	}
	
	
	
}
