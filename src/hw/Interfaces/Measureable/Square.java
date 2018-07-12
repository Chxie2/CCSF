package hw.Interfaces.Measureable;
import java.util.Scanner;
public class Square implements Measureable {
	int length, area, perimeter;
	Scanner input = new Scanner(System.in);
	public void Square() {
		System.out.println("What is the Length of Your Square?");
		length = input.nextInt();
	}
	public void calcArea() {
		area = length * length;
		System.out.println("Area of the Square is: " + area);
	}
	public void calcPeri() {
		perimeter = length * 4;
		System.out.println("Perimeter of the Square is: " + perimeter);
	}
	public int getArea() {
		return area;
	}

	public int getPerimeter() {
		return perimeter;
	}

}
