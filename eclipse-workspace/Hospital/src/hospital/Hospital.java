package hospital;
import java.util.ArrayList;

import main.Main;
import people.Patient;
import people.Doctor;

public class Hospital {
	private String name;
	private int income;
	private ArrayList<Department> depart;
	private ArrayList<Patient> patient;
	
	public Hospital(String name) {
		this.name = name;
		this.depart = new ArrayList<>();
		this.patient = new ArrayList<>();
		this.income = 0;
	}
	
	public void addDepartment(Department d) {
		depart.add(d);
	}
	
	public void registerPatient(Patient p) {
		patient.add(p);
	}
	
	
	public void processVisit(Patient p, Doctor d, String visitDetails) {
		String record = "Visited " + d.getName() + " for " + visitDetails +" (Cost: " + Main.formatIDR(d.getFee()) + " )";
		p.setTotalSpent(d.getFee());
		this.income += d.getFee();
		p.addMedicalrecord(record);
	}
	
	
	
	public void displayHospitalInfo() {
		System.out.println("Hospital : " + this.name);
		System.out.printf("\n");
		
		System.out.println("Departments : ");
		for(Department d : depart) {
			System.out.printf("- %s (Head Doctor : %s)\n",d.getName(), d.getHeadDoctor().getName());
		}
		System.out.printf("\n");
		
		System.out.println("Doctors : ");
		for(Department d : depart) {
			for(Doctor dr : d.getListDoctor()) {
				System.out.printf("- %s (Speciality : %s, Fee : Rp.%s)\n", dr.getName(), dr.getSpeciality(), Main.formatIDR(dr.getFee()));
				System.out.println("Patients : ");
				for(Patient p : dr.getPatient()) {
					System.out.printf("  - %s (Age : %d)\n",p.getName(), p.getAge());
				}
			}
		}
		System.out.printf("\n");
		
		System.out.println("Patients : ");
		for(Patient p : patient) {
			System.out.printf("- %s (ID : %d, Age : %d)\n",p.getName(), p.getId(), p.getAge());
			System.out.println(" Medical Records : ");
			for(String mr : p.getMedicalRecords()) {
				System.out.println(" - " + mr);
			}
				System.out.println(" Total Spent : " + Main.formatIDR(p.getTotalSpent()));	
		}
		System.out.println("\n");
		
		System.out.println("Total Hospital Income : " + Main.formatIDR(this.income));
		
	}
	
	
}
