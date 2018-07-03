package hw.Classes2;
import java.util.Scanner;

public class Candidate {
	private int Cno;
	private String Cname;
	private int Score;
	
public void Enter() {
	Scanner input = new Scanner(System.in);
	System.out.println("What is the Candidate Number?");
	Cno = input.nextInt();
	System.out.println("What is the Candidate Name?");
	Cname = input.next();
	System.out.println("What is the Candidate Score?");
	Score = input.nextInt();
	input.close();
}
public void Display() {
	System.out.println("Candidate Number = " + Cno);
	System.out.println("Candidate Name = " + Cname);
	System.out.println("Candidate Score = " + Score);
}
public void CheckScore() {
	if(Score > 90)
		System.out.println("Excellent");
	else if(Score > 80)
		System.out.println("Good");
	else 
		System.out.println("Average");
}

}
