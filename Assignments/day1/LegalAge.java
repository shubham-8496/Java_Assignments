/*
Accept person’s gender (character m for male and f for female), age (integer), as input and
then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;

class LegalAge {

	public static void main (String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	String gender = sc.next();
	int age = sc.nextInt();
	
	int fAge = 18;
	int mAge = 24;
//gender == "female" &&  gender == "male" && 
	if( gender.equals("female") && age >fAge ){
	System.out.println("Valid age for marriage");
	}else if(gender.equals("male") && age >mAge){
	System.out.println("Valid age for marriage");
	}
	else{
	System.out.println("NOT a valid age for marriage");
	}

	}

}