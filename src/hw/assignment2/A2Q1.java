package hw.assignment2;
import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("How much money?");
	double Money = input.nextDouble();
	double Ten = Money / 10;
	System.out.println("$10 = " + (int)Ten);
	Money = Money - ((int)Ten * 10);
	double Five = Money / 5;
	System.out.println("$5 = " + (int)Five);
	Money = Money - ((int)Five * 5);
	double One = Money;
	System.out.println("$1 = " + (int)One);
	Money = Money - ((int)One);
	double Fifty = Money / .50;
	System.out.println("50 cents = " + (int)Fifty);
	Money = Money - ((int)Fifty * .50);
	double Quater = Money / .25;
	System.out.println("Quaters = " + (int)Quater);
	Money = Money - ((int)Quater * .25);
	double Dime = Money / .10;
	System.out.println("Dimes = " + (int)Dime);
	Money = Money - ((int)Dime * .10);
	double Penny = Money / .01;
	System.out.println("Pennies = " + (int)Penny);
	input.close();
	}
}