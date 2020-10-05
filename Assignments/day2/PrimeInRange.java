/*
Print all prime numbers between two given numbers.
[ break continue ]
*/

import java.util.Scanner;

class PrimeInRange{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range of numbers: ");
		int lb = sc.nextInt();
		int ub = sc.nextInt();
		
		int count;
		System.out.print("Prime numbers between "+lb+" and "+ub+" are: ");
		for(int i=lb; i<=ub; i++){
			count=0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		} 			

	}

}

