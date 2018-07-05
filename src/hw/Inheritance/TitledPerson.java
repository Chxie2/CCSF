package hw.Inheritance;

import java.util.Scanner;

public class TitledPerson extends Person {
	Scanner input = new Scanner(System.in);
	private String title;

	public TitledPerson() {
		super();
		title = "";
	}

	public TitledPerson(String title, String name) {
		super(name);
		this.title = title;
	}

	public void writeOutput() {
		super.writeOutput();
		System.out.println("Title is: " + title);
	}

	public void reset(String newName, String newTitle) {
		super.reset(newName);
		title = newTitle;
	}

	public boolean compare(TitledPerson otherTitledPerson) {
		 return compare((Person)otherTitledPerson ) && (title == otherTitledPerson.title);
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
