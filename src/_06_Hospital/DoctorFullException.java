package _06_Hospital;

public class DoctorFullException extends Exception{

	public void full() {
		System.out.println("This doctor has too many patients.");
	}
}
