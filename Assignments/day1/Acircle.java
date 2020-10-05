/*
Write a program that takes radius of a circle as input.
Read the entered radius using Scanner class.
Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;
//import java.lang.*;

class Acircle {

	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	double radius = sc.nextFloat();
	
	double result = Math.PI*(Math.pow(radius,2));
	System.out.println(result);

	}

}