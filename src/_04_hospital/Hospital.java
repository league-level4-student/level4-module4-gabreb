package _04_hospital;

import java.util.List;

public abstract class Hospital {

	public Hospital() {
		
	}

	public abstract void addDoctor(Doctor d);

	protected abstract List<Doctor> getDoctors();
	
		
}
