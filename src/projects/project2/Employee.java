package projects.project2;
/*
  Student ID: @00300456
  Name: TIANYU (SKY) LU And Chris Xie
  */
import java.util.Scanner;

public class Employee {
  Scanner keyboard = new Scanner(System.in);
  
  //Fields
  private int Eno; //Employee number
  private String Ename; //Employee Name
  private double[] Hours = new double[7]; //Number of hours worked for each day
  private double[] Salary = new double[7]; //Salary for each day
  private double rate; //Per hour salary
  private double Gross_Salary;// Gross Salary
  
  //Constructor
  public Employee() {
    Eno = 0;
    Ename = " ";
    rate = 0.0;
    Gross_Salary = 0.0;
  }
  
  //Method - input
  public void Input() {
    System.out.println("Enter Employee number: ");
    Eno = keyboard.nextInt();
    System.out.println("Enter Employee name: ");
    Ename = keyboard.next();
    System.out.println("Enter one hour salary: ");
    rate = keyboard.nextDouble();
    
    
    
    for (int i = 0; i < 7; i++)
    {  
      System.out.println("Enter number of hours worked for" + " day " + (i + 1) + ": ");
      Hours[i] = keyboard.nextDouble(); 
      
      //Validate the number of hours have a valid input for each day (>=0 and <=24)
      while ((Hours[i] < 0) || (Hours[i] > 24)) 
      {
        System.out.println("Invalid Number! Try number from 0 to 24"
                           +"\nEnter a number: ");
        Hours[i] = keyboard.nextDouble(); 
      }
      
    }  
  }
  
  //Method - 
  public void Calculate() {
    for (int date = 0; date < 7; date++)
    {
      double workingHours = Hours[date]; //Assign each day's working hour to workingHours 
      switch(date+1) 
      {
        case 1:
          Salary[date] = CalculateWorkkdaySalary(workingHours);
          break;
        case 2:
          Salary[date] = CalculateWorkkdaySalary(workingHours);
          break;
        case 3:
          Salary[date] = CalculateWorkkdaySalary(workingHours);
          break;
        case 4:
          Salary[date] = CalculateWorkkdaySalary(workingHours);
          break;
        case 5:
          Salary[date] = CalculateWorkkdaySalary(workingHours);
          break;  
        case 6:
          Salary[date] = CalculateWeekendSalary(workingHours);
          break;
        case 7:
          Salary[date] = CalculateWeekendSalary(workingHours);
        break;
        default: System.out.println("Invalid number!");
      }
      //Calculate Gross Salary
      Gross_Salary += Salary[date];
    }
    
    
  }
  
  //Method
  public double CalculateWorkkdaySalary(double workingHours) {
    double total = 0.0;
    if (workingHours > 8)
      if (workingHours > 12)
      {
        total += (workingHours - 12) * (2 * rate);
        total += 4 * (1.5 * rate);
        total += 8 * rate;
      }
      else
      {
        total += 4 * (1.5 * rate);
        total += 8 * rate;
      }
    else 
    {
      total += 8 * rate;
    }
    return total;
  }
  
  //Method
  public double CalculateWeekendSalary(double workingHours) {
    double total = workingHours * (2 * rate);
    return total;
  }
  
  
  //Method - display the contents of all fields
  public void Display() {
    System.out.println("Employee name: " + Ename
                      +"\nEmployee number: " + Eno
                      +"\nEmployee one hour salary: $" + rate);
    //Display working hours for each day
    System.out.print("Seven Days' working hour: ");
    for (int i = 0; i < 7; i++){
      System.out.print(Hours[i] + " / ");
    }
    System.out.println();
    
    System.out.print("Each days' salary is: ");
    for (int i = 0; i < 7; i++){
      System.out.print("$" + Salary[i] + " / ");
    }
    System.out.println("\nGross salary is " + Gross_Salary);
    
  } 
}

/*
OUTPUT:
Enter Employee number:
23455
Enter Employee name:
Sky
Enter one hour salary:
10
Enter number of hours worked for day 1:
8
Enter number of hours worked for day 2:
8
Enter number of hours worked for day 3:
8
Enter number of hours worked for day 4:
8
Enter number of hours worked for day 5:
6
Enter number of hours worked for day 6:
3
Enter number of hours worked for day 7:
0
Employee name: Sky
Employee number: 23455
Employee one hour salary: $10.0
Seven Days' working hour: 8.0 / 8.0 / 8.0 / 8.0 / 6.0 / 3.0 / 0.0 /
Each days' salary is: $80.0 / $80.0 / $80.0 / $80.0 / $80.0 / $60.0 / $0.0 /
Gross salary is 460.0
-bash-4.2$ java Project2ClassesAndArrays
Enter Employee number:
34459993
Enter Employee name:
Jack
Enter one hour salary:
14
Enter number of hours worked for day 1:
12
Enter number of hours worked for day 2:
12
Enter number of hours worked for day 3:
12
Enter number of hours worked for day 4:
12
Enter number of hours worked for day 5:
12
Enter number of hours worked for day 6:
8
Enter number of hours worked for day 7:
8
Employee name: Jack
Employee number: 34459993
Employee one hour salary: $14.0
Seven Days' working hour: 12.0 / 12.0 / 12.0 / 12.0 / 12.0 / 8.0 / 8.0 /
Each days' salary is: $196.0 / $196.0 / $196.0 / $196.0 / $196.0 / $224.0 / $224.0 /
Gross salary is 1428.0
*/