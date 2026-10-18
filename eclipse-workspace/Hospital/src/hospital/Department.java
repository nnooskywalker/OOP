package hospital;
import java.util.ArrayList;
import people.Doctor;
import people.Patient;
import people.Doctor;
public class Department {
	private String name;
	private Doctor headDoctor;
	private ArrayList<Doctor> doctor;
	
	public Department(String name) {
		this.name = name;
		this.doctor = new ArrayList<>();
	}

	public Doctor getHeadDoctor() {
		return headDoctor;
	}

	public String getName() {
		return name;
	}

	public void setHeadDoctor(Doctor d) {
		this.headDoctor = d;
		doctor.add(d);
	}
	
	public ArrayList<Doctor> getListDoctor(){
		return doctor;
	}
	
//	public ArrayList<Patient> getpatients() {
//		retu
//	}
	
	
	
	
}
