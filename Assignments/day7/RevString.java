/*
Write a program to reverse the given String.
*/
import java.util.*;
//class {

//}

class RevString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse it: ");
		String str = sc.nextLine();
		StringBuffer sbr = new StringBuffer(str);
		
		System.out.println(sbr.reverse());
		
		//System.out.println("Enter a string to reverse it: ");
		//String str1 = sc.nextLine();

		//System.out.println(str1.split("").reverse().join(""));
	}
}