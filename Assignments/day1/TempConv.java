/*
Write a program to convert temperature from Fahrenheit to Celsius.
Take Fahrenheit as input using Scanner class.
[ formula : C= 5*(f-32)/9 ]
*/

import java.util.Scanner;

class TempConv {

	public static void main (String args[]){

	Scanner sc = new Scanner(System.in);
	float fah = sc.nextFloat();

	float conv = 5*(fah -32)/9;

	System.out.println("Temperature in Celsius: "+conv);	

	}

}