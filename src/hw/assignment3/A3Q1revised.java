package hw.assignment3;

import java.util.Scanner;

public class A3Q1revised {

	public static void main(String[]args) {
		int mi, cl;
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles will you travel?");
		mi = input.nextInt();
		double cost1 = 0;
		double cost2 = 0;
		double cost3 = 0;
		System.out.println("What class do you want to be in?");
		System.out.println("Enter 1 for First Class");
		System.out.println("Enter 2 for Second Class");
		System.out.println("Enter 3 for Third Class");
		cl = input.nextInt();
	
		switch(cl) {
		case 1:
			if(mi > 250) {
				cost1 += (mi - 250) * 2;
				cost1 +=  150 * 2.5;
				cost1 +=  100 * 3;
			}
			else if((mi > 100) && (mi < 250)) {
				cost1 += (mi - 100) * 2.5;
				cost1 +=  mi * 3;
			}
			else {
			cost1 +=  mi * 3;
			}
			System.out.println("First Class Cost is " + cost1 );
			break;
		case 2: 
			if(mi > 250) {
			cost2 += (mi - 250) * 1;
			cost2 +=  150 * 1.5;
			cost2 +=  100 * 2;
			}
			else if((mi > 100) && (mi <250)) {
				cost2 +=  150 * 1.5;
				cost2 +=  100 * 2;
			}
			else 
				cost2 += 100 * 2;
			System.out.println("Second Class Cost is " + cost2);
			break;
		case 3:
			if(mi > 250) {
			cost3 += (mi - 250) * 0.5;
			cost3 +=  150 * 1;
			cost3 +=  100 * 1.5;
			}
			else if ((mi > 250) && (mi < 100)) {
				cost3 +=  150 * 1;
				cost3 +=  100 * 1.5;
			}
			else {
				cost3 += 100 * 1.5;}
			System.out.println("Third Class Cost is " + cost3);	
			break;
		}

	input.close();
		}
}


