/*
Write a program to count no of words in the String.
*/
import java.util.Scanner;
//class {

//}

class CountWords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to count words: ");
		String str = sc.nextLine().toLowerCase();
 
		//String arr[] = 
		int count=1;
		for(int i=0; i<str.length(); i++){
			if(!(str.charAt(i)>='a' && str.charAt(i)<='z') ){
				count++;
			}
		}
		System.out.println(count);
		
	}
}

