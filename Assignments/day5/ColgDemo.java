/*
Create a class Student with two members : rollno and percentage.
 Create default and parameterized constructors.
 Create method show() to display information.
 Create another class CollegeStudent inherits Student class.
 Add a new member semester to it.
 Create default and parameterized constructors.
 Also override show() method that calls super class show() method and displays semester.
 Create another class SchoolStudent inherits Student class.
 Add a new member className(eg 12th ,10th etc.) to it.
 Create default and parameterized constructors.
 Also override show() method that calls super class show() method and displays className.
 Create a class( say Demo) with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. 

*/

import java.util.Scanner;
class Student{
	private static int rno;
	private  int rollno;
	private int percentage;
	
	Student(){
		this.rollno = ++rno;	
	}

	Student(int percentage ){
		this.rollno = ++rno;
		this.percentage = percentage;
	}

	void show(){
		System.out.println(" Rollno: "+rollno+" percentage: "+this.percentage);
	}
	
	int getRollNo(){
		return this.rollno;
	}
	
	int getPercentage(){
		return this.percentage;
	}


}




class CollegeStudent extends Student{
	private int sem;
	
	CollegeStudent(){
		this.sem = 1;	
	}

	CollegeStudent(int percentage ,int sem){
		super(percentage);
		this.sem =sem;
	}

	void show(){
		super.show();
		System.out.println(" Semester: "+this.sem);
	}


}

class SchoolStudent extends Student{
	private int className;

	SchoolStudent (){
		this.className = 1;
	}

	SchoolStudent (int cent,int className){
		super(cent);
		this.className = className;
	}

	void show(){
		super.show();
		System.out.println(" Class name: "+this.className);
	}

}
class ColgDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[4];

		for(int i=0; i<2; i++){//0 1

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter Semseter: ");
			int sem = sc.nextInt();

			Student s1 = new CollegeStudent(cent,sem);
			
			s[i]= s1;
			//s[i].show();
			 
		}

		for(int i=2; i<4; i++){// 2 3

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter class Name: ");
			int className = sc.nextInt();

			
			Student s1 = new SchoolStudent(cent,className);
			s[i]= s1;
			
			//s[i].show();
			 
		}
		
		int count75=0;
		System.out.println(s.length);
		for(int i=0; i<s.length; i++){
			
			if(s[i].getPercentage() >75){
				count75++;
			}
			s[i].show();
		}
		
		System.out.println("Enter a roll no to search: ");
		int srch = sc.nextInt();
		
		for(int i=0; i<s.length; i++){
			if(srch == s[i].getRollNo()){
				System.out.println("Enter a roll no to search: ");
				s[i].show();
			}
		}
		
		for(int i=0; i<s.length; i++){
			if(s[i] instanceof SchoolStudent){
				System.out.println("School type: ");
				s[i].show();
			}
			else{
				System.out.println("College type: ");
				s[i].show();
			}
		}
		
		/*for(int i=0; i<s.length; i++){
			if(srch == s[i].get){
				System.out.println("Enter a roll no to search: ");
				s[i].show();
			}
		}*/
		
		System.out.println("\n\n"+"Students with grade A as a score: "+count75);
		
		
		
		

			
		
	}
	
}
