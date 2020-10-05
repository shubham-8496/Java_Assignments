/*
Initialize one String type of array and print the elements using for each loop.
*/

import java.util.Scanner;

class StringArray{

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();

		String str[] = new String[size];

		for(int i=0; i<str.length; i++){
			str[i]=sc.next();
		}
		System.out.println("Entered String are: ");
		for(String i : str){
			System.out.println(i);
		}
	}
}