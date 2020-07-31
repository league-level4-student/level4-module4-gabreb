package _04_hospital;

public class GeneralPractitioner extends Doctor{
	public GeneralPractitioner() {
		performSurgery = false;
		houseCalls = true;
	}
	public boolean performsSurgery() {
		return performSurgery;
	}
	public boolean makesHouseCalls() {
		return houseCalls;
	}
	
}
