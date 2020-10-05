/*
Create a program to demonstrate the use of instanceof operator or secure reference down casting.
*/

import java.util.Scanner;
class Parent{
	void Show(){
		System.out.println("in parent");
	}




}

class Child extends Parent{
	void Show(){
		System.out.println("in Child");
	}
	void ShowChild(){
		System.out.println("in CHILD CHILD");
	}
}

class InstOF{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Parent p = new Child();	//updcasting
		//p.Show();



		if ( p instanceof Child ){
			Child c = (Child) p;
			c.ShowChild(); 
		}
		else{
			System.out.println("Error");
		}
		
	}
	
}
