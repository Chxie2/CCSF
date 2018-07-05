package projects.project2;
import projects.project2.Employee;

public class Project2 {
	
	public static void main(String[] args) {
		Employee newEmployee = new Employee();
		newEmployee.Input();
		newEmployee.Calculate();
		newEmployee.Display();
	}

}
/*2. A well-encapsulated class has its data only accessible by that class by calling it
  and no other class  */
/*3. Make an instance variable private if you want the data assigned to the variable 
 only to be seen in that class. An instance variable public when you want the variable's 
 assigned value to be visible to other classes. */
/* 4. Declare a method private if you want the method to be only accessible to members of
 that class*/
/*5. Yes, it is used to make searching for errors easier and to make the variables in the 
 class to be only accessible to that class alone. */
/*6. No, if it is a method. You call the class and the method. */