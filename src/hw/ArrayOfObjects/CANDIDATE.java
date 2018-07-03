package hw.ArrayOfObjects;

import java.util.Scanner;

public class CANDIDATE {
	private int Cno;
	private String Cname;
	private int Score;
	private Scanner input = new Scanner(System.in);
	public CANDIDATE() {
		Cno = 0;
		Cname = "N/A";
		Score = 0;
	}

	public CANDIDATE(int newCno, String newCname, int newScore) {
		Cno = newCno;
		Cname = newCname;
		Score = newScore;
	}

	public void Enter() {
		System.out.println("What is the Candidate Number?");
		Cno = input.nextInt();
		System.out.println("What is the Candidate Name?");
		Cname = input.next();
		System.out.println("What is the Score?");
		Score = input.nextInt();
	}

	public void Display() {
		System.out.println("Candidate Number" + " = " + Cno);
		System.out.println("Candidate Name" + " = " + Cname);
		System.out.println("Score " + "= " + Score);
	}

	public int RScore() {
		return Score;
	}
}
