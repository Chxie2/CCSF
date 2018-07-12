package hw.Graphics.Assignment3.Adult;
import javax.swing.JOptionPane;

public class Adult {
private static void Adult() {
	String ageAsk = JOptionPane.showInputDialog("What is Your Age?");
	int age = Integer.parseInt(ageAsk);
	if(age >= 18) {
		JOptionPane.showMessageDialog(null, "You Are An Adult");
		boolean Adult = true;
	}
	else {
		JOptionPane.showMessageDialog(null, "You Are Not An Adult");
		boolean Adult = false;
	}
}

public static void main(String[] args) {
	Adult();
}
}
