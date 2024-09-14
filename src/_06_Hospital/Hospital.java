package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	List<Doctor> doctors = new ArrayList<>();
	List<Patient> patients = new ArrayList<>();

	public void addDoctor(Doctor doc) {
doctors.add(doc);		
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void addPatient(Patient patient) {
patients.add(patient);		
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int doctor = 0;
for (int i = 0; i < patients.size(); i++) {
if (doctors.get(doctor).getPatients().size() == 3) {
	doctor++;
}
		try {
			doctors.get(doctor).assignPatient(patients.get(i));
		} catch (DoctorFullException e) {
			e.printStackTrace();
		}

}
	}

}
