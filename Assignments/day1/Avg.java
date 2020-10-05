/*
Write a program to calculate sum of 5 subject’s marks & find percentage.
Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ].
Use concatenation operator here.
*/

import java.util.Scanner;

class Avg {

	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();
	int no3 = sc.nextInt();
	int no4 = sc.nextInt();
	int no5 = sc.nextInt();

	float total = (no1+no2+no3+no4+no5)/5;

	System.out.println( "percentage marks= "+total+"%");


	}

}