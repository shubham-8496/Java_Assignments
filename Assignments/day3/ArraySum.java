/*
Create an array of 17 elements in 5 rows.
And calculate sum of all elements.
*/

import java.util.Scanner;

class ArraySum{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int [5][];
		
		
		for(int i=0; i<arr.length;i++){

			System.out.println("Enter number of columns: ");
			int sz =sc.nextInt();
			 arr[i] =new int[sz];

			for(int j=0; j<arr[i].length;j++){
				System.out.print("Enter a number: ");
				arr[i][j]=sc.nextInt();
			}
		}

		int sum = 0;
		for(int a[] : arr){
			for(int i : a){
				System.out.print(i+" ");
				sum+=i;	
			}
			System.out.println("");
		}

		System.out.println("Sum of array is: "+sum);

	}
}