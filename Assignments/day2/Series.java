/*
Calculate  series : 12+22+32+42+.........+n2
*/

import java.util.Scanner;

class Series{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to print series upto that no: ");
		int no = sc.nextInt();
		
		int a=12;
		int sum =12;
		System.out.print(a);
		for(int i=1; i<no; i++){
			
			a+=10;			//
			System.out.print(" + "+a);
			sum+=a;			//
		}
		System.out.println("\n Summ is: "+sum);
			

	}

}