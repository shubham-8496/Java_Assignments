/*
Write a program to read the days (eg. 670 days) as integer value using Scanner class.
Now convert the entered days into complete years, months and days and print them.
*/

import java.util.Scanner;

class DaysConv {

	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	int nod = sc.nextInt(); //665 670

	int cyr=0;

	int cmn=0;
	
	while (nod>=365){
		nod-=365; //665-365=>300<--nod
		cyr++;
	}
	while (nod>=30){
		nod-=30;//300-30=>270,270-30=>240,
		cmn++;//1,2
	}
	
	System.out.println(cyr+" years "+cmn+" months "+nod+" days");

	
}
}