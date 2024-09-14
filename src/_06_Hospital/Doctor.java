package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	List<Patient> patients = new ArrayList<>();

	public void assignPatient(Patient p) throws DoctorFullException{		
		if (patients.size() == 3) {
			throw new DoctorFullException();
		} else {
			patients.add(p);
		}
	}

	public void doMedicine() {
for (Patient p : patients) {
	p.checkPulse();
}
	}
	
	public List<Patient> getPatients() {
		return patients;
		
	}
	
	public boolean makesHouseCalls() {
		return false;
		
	}
	
	public boolean performsSurgery() {
		return false;
	}
	

}
