package hw.Inheritance;

public class Person {
	private String name;

	public Person() {
		name = "No name yet";
	}

	public Person(String initialName) {
		name = initialName;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void writeOutput() {
		System.out.println("Name: " + name);
	}
	public void reset(String newName) {
		name = newName;
	}
	public boolean compare(Person otherPerson) {
		 return hasSameName(otherPerson);
	}
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
}
