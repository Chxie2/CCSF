package hw.Inheritance;

public class Truck extends Vehicle{
	private double loadCapacity, towingCapacity;
	
	public Truck() {
		super();
		loadCapacity = 0.0;
		towingCapacity = 0.0;
	}
	public Truck(double loadCapacity, double towingCapacity, String manfacturerName, int cylinderNum, Person owner) {
		super(manfacturerName, cylinderNum, owner);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	public void getStats() {
		setInfo();
		System.out.println("What is the Load Capacity?");
		loadCapacity = input.nextDouble();
		System.out.println("What is the Towing Capacity?");
		towingCapacity = input.nextDouble();
	}
	public void showStats() {
		showInfo();
		System.out.println("Load Capacity: " + loadCapacity);
		System.out.println("Towing Capacity: " + towingCapacity);
	}
	public double getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public double getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
}
/*
What is the Manufacturer Name?
Toyota
What is the Number of Cylinders?
12
What is the Owner Name?
Lucas
What is the Load Capacity?
5000
What is the Towing Capacity?
10000
Manufacturer Name: Toyota
Cylinder Number: 12
Name: Lucas
Load Capacity: 5000.0
Towing Capacity: 10000.0
*/