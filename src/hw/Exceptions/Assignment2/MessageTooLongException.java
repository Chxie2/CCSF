package hw.Exceptions.Assignment2;

public class MessageTooLongException extends Exception{
	public MessageTooLongException() {
		super("Message Too Long!");
	}
	public MessageTooLongException(String a) {
		super(a);
	}
}
