/*
Create a class MathOperation that has four static methods.
add() method that takes two integer numbers as parameter and returns the sum of the numbers.
subtract() method that takes two integer numbers as parameter and returns the difference of the numbers.
multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number.
Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/


import java.util.Scanner;

class MathOperation{

//	private int no1;
//	private int no2;
	
	static int Addition(int no1, int no2){
		return no1+no2;
	}

	static int Subtract(int no1, int no2){
		return no1-no2;
	}

	static int Multiply(int no1, int no2){
		return no1*no2;
	}

	static double Power(int no1, int no2){
		return Math.pow(no1,no2);
	}	
	
}

class MathOperationDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int no1 =sc.nextInt();
		System.out.println("Enter second number: ");
		int no2 =sc.nextInt();

//		MathOperation mo = new MathOpertion();

		System.out.println("Addition of two number is: "+MathOperation.Addition(no1,no2));
		System.out.println("Subtraction of two number is: "+MathOperation.Subtract(no1,no2));
		System.out.println("Multipliction of two number is: "+MathOperation.Multiply(no1,no2));
		System.out.println("Power: "+MathOperation.Power(no1,no2));

	}
	
}
