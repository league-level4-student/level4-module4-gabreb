package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> Daniel = new ArrayList<Doctor>();
	ArrayList<Patient> Tyler = new ArrayList<Patient>();	
	public void addDoctor(Doctor d) {
		Daniel.add(d);
		
	}

	public ArrayList<Doctor> getDoctors() {
		return Daniel;
	}

	public void addPatient(Patient patient) {
		Tyler.add(patient);
		
	}

	public ArrayList<Patient> getPatients() {
		return Tyler;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int doctors = 0;
		int patients = Tyler.size();
		for (int i = 0; i < patients; i++) {
			if (doctors >= Daniel.size()) {
				doctors = 0;
			}
			Daniel.get(doctors).assignPatient(Tyler.get(i));
			doctors += 1;
		}
	}

	

}
