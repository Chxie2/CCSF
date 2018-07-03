package hw.Inheritance;
import java.util.Scanner;

public class Employee extends Person {
	Scanner input = new Scanner(System.in);
	private double sal;
	private int yearOfHiring;
	private String iDNum;
	public Employee() {
		super();
		sal = 0.0;
		yearOfHiring = 0;
		iDNum = "0";
	}
	public Employee(String name, double sal, int yearOfHiring, String iDNum) {
		super(name);
		this.sal = sal;
		this.yearOfHiring = yearOfHiring;
		this.iDNum = iDNum;
	}
	public void Record() {
		System.out.println("What is the Employee Name?");
		setName(input.next());
		System.out.println("What is the Salary?");
		sal = input.nextDouble();
		System.out.println("What is the year of Hiring?");
		yearOfHiring = input.nextInt();
		System.out.println("What is the ID number?");
		iDNum = input.next();
	}
	public void showEmployee() {
		writeOutput();
		System.out.println("Salary: " + sal);
		System.out.println("Year of Hiring: " + yearOfHiring);
		System.out.println("Identification Number: " + iDNum);
	}
	public double getSal() {
		return sal;
	}
	public int getYearOf() {
		return yearOfHiring;
	}
	public String identification() {
		return iDNum;
	}
	
}
/*
What is the Employee Name?
Chris
What is the Salary?
60000
What is the year of Hiring?
2001
What is the ID number?
007
Name: Chris
Salary: 60000.0
Year of Hiring: 2001
Identification Number: 007
*/