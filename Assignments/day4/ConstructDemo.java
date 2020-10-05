/*
Write a program to demonstrate this() construct functionality.
*/


import java.util.Scanner;
class Person{
	private String name;
	private int age;

	Person(){
		this("default",18);

	}

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void PersonInit(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void DisplayPerson(){
		System.out.println("Name is: "+this.name+" Age is: "+this.age);
	}
	
	
	
}

class ConstructDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person();

		p.DisplayPerson();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		p.PersonInit(name,age);
		p.DisplayPerson();

	}
	
}

