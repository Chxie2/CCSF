package hw.ArrayOfObjects;

import java.util.Scanner;

import hw.ArrayOfObjects.CANDIDATE;

public class canmain {
	static CANDIDATE[] Details;
	static Scanner input = new Scanner(System.in);
	
	
	public static void Enrol() {
		System.out.println("How many Candidates are there?");
		int NumCan = input.nextInt();
		Details = new CANDIDATE[NumCan + 1];
		for (int i = 1; i <= NumCan; i++) {
			Details[i] = new CANDIDATE();
			System.out.println("Input Information About The Candidate :");
			System.out.println();
			Details[i].Enter();
			System.out.println();
		}

	}

	public static void Search() {
		System.out.println("What Score Do You Want To Find?");
		int find = input.nextInt();
		for (int i = 1; i < Details.length; i++) {
			if (Details[i].RScore() == find) {
				System.out.println("Candidate " + (i) + " has the score " + find);
				Details[i].Display();
			} else
				System.out.println("Score " + find + " not found.");

		}

	}

	public static void GetPass() {
		for (int i = 1; i < Details.length; i++) {
			if (Details[i].RScore() >= 33)
				Details[i].Display();
			else {
			System.out.println("Candidate " + i + " didnt pass");
		}
		}
	}

	public static void main(String[] args) {
		Enrol();
		Search();
		GetPass();
	}
}
/*
How many Candidates are there?
1
Input Information About The Candidate :

What is the Candidate Number?
1
What is the Candidate Name?
hi
What is the Score?
60

What Score Do You Want To Find?
60
Candidate 1 has the score 60
Candidate Number = 1
Candidate Name = hi
Score = 60
Candidate Number = 1
Candidate Name = hi
Score = 60
*/