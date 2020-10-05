/*
Sort a ten element array in descending order.
*/

import java.util.Scanner;
import java.util.Arrays;

class ArrSort{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++){
		
			System.out.println("Enter a number");
			arr[i]=sc.nextInt();
			
		}

		//Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1;i++){
			
			for(int j=i+1; j<=arr.length-1;j++){
				
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}

		System.out.println("Array in descending order: ");

		for(int i : arr){
		System.out.print(i+" ");
		}				
		
						

	}

}