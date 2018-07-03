package hw.Inheritance;
import java.util.Scanner;

public class Doctor extends Person{
	Scanner input = new Scanner(System.in);
	private String specialty;
	private double fee;
	public Doctor() {
		super();
		specialty = "Doctor";
		fee = 100;
	}
	public Doctor(String name, String specialty, double fee) {
		super(name);
		this.specialty = specialty;
		this.fee = fee;
	}
	public void Record() {
		System.out.println("What is the Doctor's Name?");
		setName(input.next());
		System.out.println("What is the Specialty of The Doctor?");
		specialty = input.next();
		System.out.println("What is the office-visit fee?");
		fee = input.nextDouble();
	}
	public void showDoctor() {
		writeOutput();
		System.out.println("Doctor Specialty: " + specialty);
		System.out.println("Office-Visit Fee: " + fee);
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpec(String specialty) {
		this.specialty = specialty;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}

}
/*
What is the Doctor's Name?
Chris
What is the Specialty of The Doctor?
Pediatrician
What is the office-visit fee?
500
Name: Chris
Doctor Specialty: Pediatrician
Office-Visit Fee: 500.0
*/