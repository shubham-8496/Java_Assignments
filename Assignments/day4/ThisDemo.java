/*
Write a program to demonstrate functionalities of this keyword in java. 
*/

import java.util.Scanner;

class Student{
	private int sRollNo;
	private String sName;
	public static int objCount;

	void setData(int sRollNo, String sName){
		this.sRollNo = sRollNo;
		this.sName = sName;
		ObjCounter();
	}
	
	void ObjCounter(){
		objCount++;
	}
	
	int getObjCounter(){
		return objCount;
	}
	

	void showData(){
		System.out.println("Roll no: "+sRollNo+" Name: "+sName);
		//System.out.println("object count: "+getObjCounter());
	}

}

class ThisDemo{

	public static void main (String args[]){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student's name: ");
		String sName = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollNo = sc.nextInt();

		Student s =new Student();
		
		s.setData(rollNo,sName);

		System.out.print("Enter Student's name: ");
		sName = sc.next();

		System.out.print("Enter roll number: ");
		rollNo = sc.nextInt();

		Student s1 =new Student();
		
		s1.setData(rollNo,sName);

		s.showData();
		s1.showData();
		System.out.println("object counter: "+s.objCount);
	}
}