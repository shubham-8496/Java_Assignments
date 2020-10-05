/*
Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  
*/

import java.util.Scanner;

class Max {

	public static void main (String args[]){

	Scanner sc = new Scanner(System.in);
	
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();
	int no3 = sc.nextInt();

	int max = (no1 > no2) ? (no1 > no3 ? no1 : no3) : (no2 > no3 ? no2 : no3);
	
	System.out.println("Maximum is: "+max);

//	if(no1>no2)? ( (no1>no3)?System.out.println(no1): System.out.println(no3) ):( (no2>no3)?System.out.println(no2):System.out.println(no3) );

	}

}