/*
Write a program to search an element in the array.
*/

import java.util.Scanner;

class SearchArr{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.print("Enter a number: ");
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter number to search: ");
		int srch = sc.nextInt();

		for(int i=0; i<size; i++){
			if(arr[i]==srch){
				System.out.println("Element "+srch+" found at index "+(i+1));
				break;
			}
		}	
		System.out.println("Element not found");

	}

}