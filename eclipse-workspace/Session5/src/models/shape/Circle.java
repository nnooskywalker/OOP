package models.shape;

public class Circle extends Shape {
	static int count;
	 static Circle c;
	
	public static Circle getInstance(){
		if (c == null) c = new Circle();
		
		return c;
	}
	public Circle() {
		getArea();
	}
	
	
	public static void count(){
		Circle.count++;
	}
	
	
	
	
	
}
