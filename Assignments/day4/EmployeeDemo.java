/*
38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.

*/


import java.util.Scanner;
class Employee {
	private static int empNo;
	private static float totalSalary;
	private float salary;

	Employee (float salary){
		this.salary = salary;
		empNo++;
		totalSalary+=salary;

	}

	 void Display(){
		System.out.println("Employee id: "+empNo);
		//System.out.println("Employee salary: "+this.salary);
		System.out.println("Total Employee salary: "+totalSalary);
	}
	
	 static void Display1(){
		System.out.println("Total Employee id's: "+empNo);
		
		System.out.println("Total Employee salary: "+totalSalary);
	}
	
}

class EmployeeDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter number of Employess you want to add: ");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++){
			
			System.out.println("Enter salary of employee: ");
			float sal = sc.nextFloat();
	
			Employee e1 = new Employee(sal);
			e1.Display();
			
			
		}
		
		//System.out.println("Enter salary of employee: ");
		//float sal = sc.nextFloat();
	
		//Employee e1 = new Employee(sal);
		Employee.Display1();

//=====================================================================

		//System.out.println("Enter salary of employee: ");
		//sal = sc.nextFloat();
	
		//Employee e2 = new Employee(sal);
		//e2.Display();


	}
	
}
