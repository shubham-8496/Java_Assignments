/*
Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. 
c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
*/

import java.util.Scanner;

interface  Texable {
	float SalesTax = 7;
	float incomeTax = 10.5F;

	abstract void CalcTax();

}

class Employee implements Texable  {
	
	int empId;
	String name;
	float salary;

	Employee(int empId, String name, float salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void CalcTax(){
		//(10.5/100)*salary
		System.out.println("Income Tax is: "+( (incomeTax/100)*salary) );
		//System.out.println("Emp: "+SalesTax+" "+incomeTax);	
	}
	
}

class Product implements Texable  {
	
	int pId;
	float price;
	int quantity;

	Product(int pId, float price, int quantity){
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
		//System.out.println("hey");
	}

	public void CalcTax(){
		System.out.println("\n Sales Tax is: "+( (SalesTax/100)*price) );
		//System.out.println("Prod: "+SalesTax+" "+incomeTax);
	}	
}

class InterfaceMain{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter employee id: ");
		int empid = sc.nextInt();
		System.out.print("Enter salary");
		float sal = sc.nextFloat();


		Employee e = new Employee(empid, name, sal);
		e.CalcTax();

		System.out.print("Enter product id: ");
		int pid = sc.nextInt();
		System.out.print("Enter price");
		float price = sc.nextFloat();
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();

		Product p = new Product(pid, price, quantity);
		p.CalcTax();


	}
}