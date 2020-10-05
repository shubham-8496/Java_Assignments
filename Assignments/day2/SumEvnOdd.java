/*
Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/

import java.util.Scanner;
//import java.util.Array;

class SumEvnOdd{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		

		for(int i=0; i<size; i++){
			System.out.println("Enter a number: ");
			arr[i]=sc.nextInt();
		}

		int even = 0;
		int odd = 0;

		for (int i=0; i<size; i++){

			if(arr[i] % 2 == 0){
				even+=arr[i];
			}else{
				odd+=arr[i];
			}
		}

		System.out.println("sum of even elements: "+even);
		System.out.println("sum of odd elements: "+odd);
		
			

	}

}