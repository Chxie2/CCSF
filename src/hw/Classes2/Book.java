package hw.Classes2;

import java.util.Scanner;

public class Book {

	private int Bno;
	private String Bname;
	private String Author;
	private float Price;

	public Book() {
		Bno = 0;
		Bname = "N/A";
		Author = "N/A";
		Price = 1;
		}
	
	public void Enter(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Book Number?");
		Bno = input.nextInt();
		System.out.println("What is the Name of the Book?");
		Bname = input.next();
		System.out.println("What is the Author of the Book?");
		Author = input.next();
		System.out.println("What is the Price of the Book?");
		Price = input.nextFloat();
		input.close();
	}

	public void Display() {
		System.out.println("Book Number = " + Bno);
		System.out.println("Book Name = " + Bname);
		System.out.println("Book Author = " + Author);
		System.out.println("Book Price = " + Price);
		if (Bno > 1000)
			System.out.println(Bname + " is a new Book");
		else
			System.out.println(Bname + " is a old Book");

	}

	public int RBno() {
		return Bno;
	}

	public String RBname() {
		return Bname;
	}
}