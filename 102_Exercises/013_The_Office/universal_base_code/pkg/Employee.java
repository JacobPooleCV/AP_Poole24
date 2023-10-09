package pkg;
import java.util.Scanner;
import java.util.Random;


public class Employee {
	int ID;					// Stores ID of the Employee
	String firstName;		// Stores first name of the Employee
	String lastName;		// Stores last name of the Employee
	double salary;			// Stores monthly salary of the Employee

	public Employee() {		// Default Constructor
		ID = 9622;
		firstName = new String("Michael");
		lastName = new String("Scott");
		salary = 6583.33;
	}

	public Employee(int i, String fn, String ln, double s){		// int, String, String, int Constructor
		ID = i;
		firstName = fn;
		lastName = ln;
		salary = s;
	}

	public int getID(){						// Returns the ID of the Employee
		return ID;
	}

	public String getFirstName(){			// Returns First Name of the Employee
		return firstName;
	}

	public String getLastName(){			// Returns Last name of the Employee
		return lastName;
	}

	public double getSalary(){				// Returns monthly salary of the Employee
		return salary;
	}

	public double getAnnualSalary(){		// Returns monthly salary * 12 for annual salary
		return salary*12;
	}

	public void raiseSalary(int percent){	// Increases Employee salary by percent percent
		salary = salary + (salary*(percent/100.0));	// Ex: Salary is 50,000 -> 	50,000 + (50,000 * (0.1)) This is a 10% increase
		return;
	}

	public void employeeToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Employee ID: " + ID);
		System.out.println("Employee First Name: " + firstName);
		System.out.println("Employee Last Name: " + lastName);
		System.out.println("Employee Salary: " + salary);
		System.out.println("------------------------------");
		System.out.println("");
	}
}
