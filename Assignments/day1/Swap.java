/*
Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;

class Swap {

	public static void main (String args[]){

	Scanner sc = new Scanner(System.in);
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();

	no1 = no1 + no2;	//no1: 10 + no2: 5=>15
	no2 = no1 - no2;	//no1: 15 - 5 =>10
	no1 = no1 - no2;	//no2: 10 - 5 => 5
	
	System.out.println("First Number: "+no1+"\n Second number: "+no2);
	}

}