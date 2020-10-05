/*
Program to show sum and average of 10 element array.
Accept array elements from user. 
*/

import java.util.Scanner;

class AvgArray{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];

		for(int i=0; i<arr.length; i++){ //i=>arr[i]
		
			System.out.println("Enter number: ");
			arr[i]=sc.nextInt();
		}
		
			
		int sum = 0;

		for(int i :arr){
				sum+=i;		
		}
		
		System.out.println("Sum is: "+sum+"\n average is: "+(sum/arr.length));			

	}

}