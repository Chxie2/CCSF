package hw.assignment3;
import static hw.Start.*;

public class A3Q1 {

	public static void main(String[]args) {
		int mi;
		System.out.println("How many miles will you travel?");
		mi = getVara();
		double cost1 = 0;
		double cost2 = 0;
		double cost3 = 0;
		
		int distance;
		if (mi <= 100)
			distance = 1;
		else if (mi <= 250)
			distance = 2;
		else
			distance = 3;
			
		switch (distance) {
		case 3:
			cost1 += (mi - 250) * 2; //solves cost from 250+
			cost2 += (mi - 250) * 1;
			cost3 += (mi - 250) * 0.5;
			mi = 250;
		case 2:
			cost1 +=  (mi - 100) * 2.5; //solves cost from 100 - 250
			cost2 +=  (mi - 100) * 1.5;
			cost3 +=  (mi - 100) * 1;
			mi = 100;
		case 1:
			cost1 +=  mi * 3; //solves cost from 0 - 100
			cost2 +=  mi * 2;
			cost3 +=  mi * 1.5;
		}
	System.out.println("First Class Cost is " + cost1 );
	System.out.println("Second Class Cost is " + cost2);
	System.out.println("Third Class Cost is " + cost3);		
		}
}

