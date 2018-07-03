package hw.assignment2;
import java.util.Scanner;

public class A2Q3 {

	public static void main(String[] args) {
		int GradeOne, GradeTwo,GradeThree,GradeFour,GradeFive, Avg;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the First Grade?");
		GradeOne = input.nextInt();
		System.out.println("What is the Second Grade?");
		GradeTwo = input.nextInt();
		System.out.println("What is the Third Grade?");
		GradeThree = input.nextInt();
		System.out.println("What is the Fourth Grade?");
		GradeFour = input.nextInt();
		System.out.println("What is the Fifth Grade?");
		GradeFive = input.nextInt();
		Avg = (GradeOne + GradeTwo + GradeThree + GradeFour + GradeFive) / 5;
		if (Avg >= 90)
			System.out.println("E");
		else if ((Avg >= 80) && (Avg <= 89))
			System.out.println("A");
		else if ((Avg >= 70) && (Avg <= 79))
			System.out.println("B");
		else if ((Avg >= 60) && (Avg <= 69))
			System.out.println("C");
		else if ((Avg >= 50) && (Avg <= 59))
			System.out.println("D");
		else if ((Avg <= 50))
			System.out.println("F");
		input.close();
		}
}
