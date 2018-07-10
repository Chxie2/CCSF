package hw.Graphics.Assignment2.Name;
import javax.swing.JOptionPane;

public class Graphics2 {

	public static void main(String[] args) {
		String fName = JOptionPane.showInputDialog("What is Your First Name?");
		String mName = JOptionPane.showInputDialog("What is Your Middle Name?");
		String lName = JOptionPane.showInputDialog("What is Your Last Name?");
		JOptionPane.showMessageDialog(null, ("Your Name is : " + fName + " " + mName + " " + lName));
		System.exit(0);
	}
}
