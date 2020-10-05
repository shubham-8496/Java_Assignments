/*
Create a class Student with 2 data members rno and name.
Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name.
Create one more method showData() to print the data member values.
Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/

import java.util.Scanner;

class Student{
	private int sRollNo;
	private String sName;

	void setData(int roll, String name){
		sRollNo = roll;
		sName = name;
	}

	void showData(){
		System.out.println("Roll no: "+sRollNo+" Name: "+sName);
	}

}

class StudentMain{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student's name: ");
		String sName = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollNo = sc.nextInt();

		Student s =new Student();
		
		s.setData(rollNo,sName);
		s.showData();
	}
}