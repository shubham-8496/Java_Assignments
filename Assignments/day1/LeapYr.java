/*
Program to check that entered year is a leap year or not.
*/

import java.util.Scanner;

class LeapYr{

	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int yr = sc.nextInt();

	if(yr % 4==0 && yr % 100 !=0 || yr %400 ==0){
	
	System.out.println("It is a leap year");
	}else{

	System.out.println("It is a NOT leap year");

	}

	}

}