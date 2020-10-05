/*
Write a program to fine the smallest and
greatest number present in the array of integer type.
*/

import java.util.Scanner;

class SmallGreat{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		int min = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] <min){
				min = arr[i];
			}
			else if(arr[i]>max){
				max = arr[i];
			}
		}

		System.out.println("Minimum is: "+min+"\nMaximum is: "+max);
	}
}