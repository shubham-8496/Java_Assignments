/*
Write a program to reverse a given number.
*/

import java.util.Scanner;

class ReverseNo{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);

		int reverse=0;

		System.out.print("Enter a number to find its reverse it: ");
		int no = sc.nextInt();

		while(no>0){

			int digit = no%10;
			reverse = reverse * 10 + digit;
			no/=10;
		
		}

		System.out.println("Reverse is: "+reverse);
			

	}

}