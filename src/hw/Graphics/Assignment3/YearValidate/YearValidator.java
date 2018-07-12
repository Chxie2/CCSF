package hw.Graphics.Assignment3.YearValidate;
import javax.swing.JOptionPane;

public class YearValidator {

	static String date = "";

	public static void main(String[] args) {
		boolean validDate = false;
		while (!validDate) {
			date = JOptionPane.showInputDialog("Enter date in mm/dd/yyyy format");
			int month;
			int day;
			int year;

			try {
				month = Integer.parseInt(date.substring(0, 2));
				day = Integer.parseInt(date.substring(3, 5));
				year = Integer.parseInt(date.substring(6, 10));
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "please only enter integers.");
				continue;
			}
			if (month < 0 || month > 12) {
				JOptionPane.showMessageDialog(null, "your month must be between 1 and 12");
				continue;
			}
			if (!validDayChecker(month, day, year))
				continue;
			validDate = true;
		}
		JOptionPane.showMessageDialog(null, "the date " + date + " is valid");
	}

	public static boolean validDayChecker(int month, int day, int year) {
		if (day > 31 || day < 1) {
			JOptionPane.showMessageDialog(null, "your day must be between 1 and 31");
			return false;
		} else if (day <= 28 && day >= 0)
			return true;

		int[] thirty = { 4, 6, 9, 11 };
		int[] thirtyOne = { 1, 3, 5, 7, 8, 10, 12 };
		if (day == 30)
			for (int tempMonth : thirty)
				if (tempMonth == month)
					return true;
		if (day == 31)
			for (int tempMonth : thirtyOne)
				if (tempMonth == month)
					return true;

		return checkFebruary(day, year);
	}

	public static boolean checkFebruary(int day, int year) {
		if (!isLeapYear(year)) {
			if (day <= 28)
				return true;
			else {
				JOptionPane.showMessageDialog(null, date + ",\n" + year + " is not a leap year");
				return false;
			}
		} else
			return true;
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
}