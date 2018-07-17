package hw.Exceptions.Assignment2;

public class CoreBreachException extends Exception {
	public CoreBreachException() {
		super("Core Breach! Evacuate Ship!");
}
	public CoreBreachException(String e) {
		super(e);
	}
}
