package hw;
import java.util.Scanner;
import hw.TwoDimensionalArrays.A11Q3;
public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Project Average?");
		double projectAvg = input.nextDouble();
		System.out.println("What is the Test Average?");
		double testAvg = input.nextDouble();
		System.out.println("What is the Participation Average?");
		double parAvg = input.nextDouble();
		System.out.println("What is the Assignment Average?");
		double assiAvg = input.nextDouble();
		
		double grade = (projectAvg * .3) + (testAvg * .3) + (parAvg * .1) + (assiAvg * .3);
		System.out.println("Your Grade is: " + grade);
	}
}


