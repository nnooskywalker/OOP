package people;
import java.util.ArrayList;

public class Doctor {
	private int id;
	private String name;
	private String speciality;
	private int fee;
	private ArrayList<Patient> patient;
	
		public Doctor(int id, String name, String speciality, int fee) {
			this.id = id;
			this.name = name;
			this.speciality = speciality;
			this.fee = fee;
			this.patient = new ArrayList<>();
		}
		
		public ArrayList<Patient> getPatient() {
			return patient;
		}



		public String getSpeciality() {
			return speciality;
		}

		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}

		public int getFee() {
			return fee;
		}

		public void setFee(int fee) {
			this.fee = fee;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void addPatient(Patient p) {
			patient.add(p);
		}
		
		
		public void processVisit(Patient p, String visitDetails) {
			
		}
	
}
