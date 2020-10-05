/*

36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 


*/

import java.util.Scanner;

class MultiOverload{
	
		int Multiply(int no1, int no2){
			return no1*no2;
		}

		float Multiply(float no1, float no2, float no3){
			return no1*no2*no3;
		}

		double Multiply(double no1, int no2){
			return no1*no2;
		}

		//arr [5]=1,2,3,4,5=>je asel te
		
		public void Multiply( int arr[]){
			int res=arr[0];
			for(int i=1; i<arr.length; i++){
				res*= arr[i];
			}
			
			System.out.println("Multiplication of array elements is: "+res);
		}

	
}

class MultiOverloadDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		
		MultiOverload m = new MultiOverload();
		
		//double x = 24;
		//System.out.println(x);
		
		int arr[] = new int[3];
		
		for(int i=0; i<arr.length; i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Multiplication int int: "+m.Multiply(2,3));
		System.out.println("Multiplication float*3: "+m.Multiply(2,3,4));
		System.out.println("Multiplication double int : "+m.Multiply(2D,3));
		//System.out.println("Multiplication: "+m.Multiply(2,3));
		
		m.Multiply(arr);
		
	}
	
}

