package hw.Inheritance;
import hw.Inheritance.Undergraduate;
import java.util.Scanner;
public class Inheritance_Main {
	
	public static void main(String[] args) {
		Undergraduate u1 = new Undergraduate();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Name?");
		String n = input.next();
		System.out.println("What is the Student Number?");
		int num = input.nextInt();
		System.out.println("What is the Level?");
		int l = input.nextInt();
		u1.reset(n, num, l);
		u1.writeOutput();
		input.close();
	}

}
//5 Yes
//6 Types that Undergraduate has access to
//7 to specify a calling to the parent's method, and to call a constructor from the parent class
//8 this calls the methods within that class and super calls the parent class
