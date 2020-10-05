import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
		int ocur=0;
		int arr[] = new int[n+1];
		int ele=0;
		
        if(n<1)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
			
           while(ocur!=n+1)
		   {
			   
				for(int i=2;ocur!=n+1;i++)
				{
					count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
							count++;
					}
					if(count==2)
					{
						//System.out.println(" "+i);
						ocur++;
						arr[ele++]=i;
					}
				}
				//System.out.println(" ocur"+ocur);
						
			}
        }
		
		for(int i=n-2;i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
    }
}