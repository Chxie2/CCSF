package hw.Interfaces.Measureable;
import java.util.Scanner;

public class Circle implements Measureable {
	int radius;
	double area, perimeter;
	Scanner input = new Scanner(System.in);
	public void Circle() {
		System.out.println("What is the Radius?");
		radius = input.nextInt();
	}
	public void calcArea() {
		area = Math.PI * radius * radius;
		System.out.println("Area of The Circle is: " + area);
	}
	public void calcPerimeter() {
		perimeter = Math.PI * 2 * radius;
		System.out.println("Perimeter of The Circle is: " + perimeter);
	}
	public int getArea() {
		return 0;
	}
	public int getPerimeter() {
		return 0;
	}

}
