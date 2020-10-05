/*
Write a program to reverse the array elements.
*/

import java.util.Scanner;
//import java .util

class RevArray{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();

		int arr[]= new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter a number: ");
			arr[i]=sc.nextInt();
		}
		
		int last = arr.length-1;

		for(int i=0;i<arr.length/2;i++){
			
			int temp = arr[i];
			arr[i] = arr[last];
			arr[last] = temp;

			 last--;					
		}

		for(int i : arr ){
			System.out.print(i+" ");
		}

			

	}

}