package hw.Classes;

import java.util.Scanner;

public class Employee {// e1
	public int E_No;
	public String E_FName;
	public String E_LName;
	public String E_DOJ;
	public String E_Department;
	public String E_Designation;
	public double E_Salary;

	public Employee() {

		E_No = 0;
		E_FName = "N/A";
		E_LName = "N/A";
		E_DOJ = "N/A";
		E_Department = "N/A";
		E_Designation = "N/A";
		E_Salary = 1.10;

	}

	public Employee(int startE_No, String startE_FName, String startE_LName, String startE_DOJ,
			String startE_Department, String startE_Designation, double startE_Salary) {
		{
			E_No = startE_No;
			E_FName = startE_FName;
			E_LName = startE_LName;
			E_DOJ = startE_DOJ;
			E_Department = startE_Department;
			E_Designation = startE_Designation;
			E_Salary = startE_Salary;
		}
	}

	public void input() {// e3
		setE_No();
		setE_FName();
		setE_LName();
		setE_DOJ();
		setE_Department();
		setE_Designation();
		setE_Salary();
	}

	Scanner input = new Scanner(System.in);

	public void setE_No() {
		System.out.println("What the Employee Number?");
		E_No = input.nextInt();
	}

	public void setE_FName() {
		System.out.println("What is the First Name?");
		E_FName = input.next();
	}

	public void setE_LName() {
		System.out.println("What is the Last Name");
		E_LName = input.next();
	}

	public void setE_DOJ() {
		System.out.println("What is the Date of Joining?");
		E_DOJ = input.next();
	}

	public void setE_Department() {
		System.out.println("What Department Are They In?");
		E_Department = input.next();
	}

	public void setE_Designation() {
		System.out.println("What is Their Designation");
		E_Designation = input.next();
	}

	public void setE_Salary() {
		System.out.println("What is Their Salary?");
		E_Salary = input.nextDouble();
	}

	public void Display() {
		System.out.println("Employee Number = " + E_No);
		System.out.println("Employee First Name = " + E_FName);
		System.out.println("Employee Last Name = " + E_LName);
		System.out.println("Employee Date of Joining = " + E_DOJ);
		System.out.println("Employee Department = " + E_Department);
		System.out.println("Employee Designation = " + E_Designation);
		System.out.println("Employee Salary = " + E_Salary);
	}

}
