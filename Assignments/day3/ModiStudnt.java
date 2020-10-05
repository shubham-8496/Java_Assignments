/*
Modify the above program (no. 30) to count the no of Student objects created.
[ In this program static variable is required ]
*/

import java.util.Scanner;

class Student{
	private int sRollNo;
	private String sName;
	private static int objCount;

	void setData(int roll, String name){
		sRollNo = roll;
		sName = name;
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

class ModiStudnt{

	public static void main (String args[]){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student's name: ");
		String sName = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollNo = sc.nextInt();

		Student s =new Student();
		
		s.setData(rollNo,sName);
//==================================================================
		System.out.print("Enter Student's name: ");
		sName = sc.next();

		System.out.print("Enter roll number: ");
		rollNo = sc.nextInt();

		Student s1 =new Student();
		
		s1.setData(rollNo,sName);

		s.showData();
		s1.showData();
		System.out.println("object counter: "+s.getObjCounter());
	}
}