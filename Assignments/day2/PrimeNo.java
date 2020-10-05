/*
Program to check whether number is prime or not.
*/


import java.util.Scanner;

class PrimeNo{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find it is prime or not: ");
		int no = sc.nextInt();

		int count = 0;

		for(int i=1; i<=no; i++){
			if(no%i==0){
				count++;
			}
			
		}
		
		if(count==2){
			System.out.println("Its a prime number");
		}else{
			System.out.println("Its NOT a prime number");
		}
		

			

	}

}


