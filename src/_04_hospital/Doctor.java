package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	boolean performSurgery;
	boolean houseCalls;
	ArrayList<Patient> list = new ArrayList<Patient>();
	public Doctor() {
		performSurgery = false;
		houseCalls = false;
	}
	public boolean performsSurgery() {
		return performSurgery;
	}
	public boolean makesHouseCalls() {
		return houseCalls;
	}
	public void assignPatient(Patient patient) throws DoctorFullException{
		if (list.size()>=3) {
			throw new DoctorFullException();
		}
		list.add(patient);
		}
	public ArrayList<Patient> getPatients() {
		return list;
	}
	public void doMedicine() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).feelscaredfor = true;
		}
		
	}
	
	
}
