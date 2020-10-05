/*
Create an integer type 2-D array of size [3X3].
Take the elements from the user and then calculate the sum of the elements present in the diagonal.
*/

import java.util.Scanner;

class ArrayDiagonal{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print("Enter a number: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int ldiag=0;
		int rdiag=0;

		for(int i=0; i<=arr.length;i++){
			for(int j=0; j<arr.length; j++){
				
				if(i==j){
					ldiag+=(arr[i][j]);
					rdiag+=(arr[(arr.length-1)-i][j]);
				}
				//(arr.length-1)-i

			}
		}
		System.out.println("Sum of left diagonal: "+ldiag+"\nsum right diagonal: "+rdiag+"\nsum of diagonals: "+(ldiag+rdiag));
	}
}