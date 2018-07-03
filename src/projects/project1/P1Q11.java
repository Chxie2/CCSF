//Sky 6264262185

package projects.project1;
import java.util.Scanner;

public class P1Q11 {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
	int a, evenTotal = 0, oddTotal = 0, numEven = 0, numOdd= 0;
	System.out.println("What is You Number");
	a = input.nextInt();
	String charNums = "" + a;
	for(int i = 0; i < charNums.length(); ++i) {
		Character.getNumericValue(charNums.charAt(i) % 2);
		if((charNums.charAt(i) % 2) == 0) {
			evenTotal += charNums.charAt(i);
			numEven++;
		}
			else {
				oddTotal += charNums.charAt(i);
				numOdd++;
			}
	}
	System.out.println("Sum of Even Numbers Are " + evenTotal);
	System.out.println("Sum of Odd Numbers Are " + oddTotal);
	System.out.println("Number of Even Numbers Are " + numEven);
	System.out.println("Numer of Odd Numbers Are " + numOdd);
}
}


