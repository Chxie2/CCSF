package projects.project1;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("What is your Number?");
		int a = input.nextInt();
		if (a >= 10)
			a = 1;
		else if (a >= 20)
			a = 2;
		
		switch(a) {
			case (1):
			System.out.println("Your Number is Less Than 10");
			case(2): 
				System.out.println("Your Number is Less Than 20 but Greater Than 10");
		}
		
		input.close();
	}
//absence of break in the 1st case will also run the 2nd case if case 1 is run
}
