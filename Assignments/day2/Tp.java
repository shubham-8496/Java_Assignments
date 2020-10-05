/*
TP
*/

import java.util.Scanner;

class Tp{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of 2D");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int arr[][] = new int [r][c];
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.println("Enter number: ");
				int no = sc.nextInt();
				arr[i][j] = no;

			}		
	
		}

		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(arr[i][j]+" ");
				
			}
		System.out.println("");		
	
		}

			

	}

}