package hw.Inheritance;
import java.util.Scanner;
import hw.Inheritance.Person;

public class Vehicle {
	Scanner input = new Scanner(System.in);
	private Person owner;
	private String manufacturerName;
	private int cylinderNum;
	
	public Vehicle() {
		manufacturerName = "No Name";
		cylinderNum = 16;
		owner = new Person();
	}
	public Vehicle(String manfacturerName, int clyinderNum, Person owner) {
		this.manufacturerName = manfacturerName;
		this.cylinderNum = clyinderNum;
		this.owner = owner;
	}
	public void setInfo() {
		System.out.println("What is the Manufacturer Name?");
		manufacturerName = input.next();
		System.out.println("What is the Number of Clyinders?");
		cylinderNum = input.nextInt();
		System.out.println("What is the Owner Name?");
		owner.setName(input.next());
	}
	public void showInfo() {
		System.out.println("Manufacturer Name: " + manufacturerName);
		System.out.println("Clyinder Number: " + cylinderNum);
		owner.writeOutput();
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public int getCylinderNum() {
		return cylinderNum;
	}
	public void setCylinderNum(int cylinderNum) {
		this.cylinderNum = cylinderNum;
	}
}
