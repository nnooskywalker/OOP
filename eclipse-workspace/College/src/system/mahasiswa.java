package system;

public class mahasiswa {
	private String nim;
	private String name;
	private String major;
	private double gpa;
	
	public mahasiswa(String nim, String name, String major, double gpa) {
		this.nim = nim;
		this.major = major;
		this.name = name;
		this.gpa = gpa;
	}
	
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("NIM : " + this.nim);
		System.out.println("Major : " + this.major);
		System.out.println("GPA : " + this.gpa );
		System.out.print("\n");
	}


	public String getNim() {
		return nim;
	}


	public void setNim(String nim) {
		this.nim = nim;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
}
