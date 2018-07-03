package hw.Classes;
import hw.Classes.Employee;

public class Employee_test {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "Chris", "Xie", "june", "Nowhere", "Nothing", 100000.50);
		Employee e3 = new Employee();
		e1.Display();
		e2.Display();
		e3.input();
		e3.Display();
		
	}
}
