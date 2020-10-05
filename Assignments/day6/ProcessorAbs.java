/*
Create an Abstract class Processor with int member variable data  and method showData to display data value.
 Create abstract method process() to define processing of member data.
 Create a class  Factorial using abstract class Processor  to calculate and print factorial of a number by overriding the process method.
 b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area).
  Also ask data to work upon. Use Processor class reference to achieve this mechanism.
*/

import java.util.Scanner;

abstract class Processor {
	int data;

	void showData(){
		System.out.println("Result is: "+data);	
	}
	abstract void process(int data);	
}

class Factorial extends Processor {
	int result = 1;
	void process(int no){
		
		for(int i=2; i<=no; i++){
			result*=i;
		}
	data = result;
	}
	
}

class Circle extends Processor{
	
	void process(int no){
	data = (int)(Math.PI*(Math.pow(no,2)));	
	
	}
	
}

class ProcessorAbs{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while (true){
		System.out.println("1. Factorial of number: ");
		System.out.println("2. Area of Circle: ");
		System.out.println("3. Exit: ");
		System.out.println("Enter your choice:.. ");
		
		
		
			int ch = sc.nextInt();
//			switch(ch){
//				case 1:
				if(ch == 1) { 
					System.out.print("Enter number to find factorial of number: ");	
					int no = sc.nextInt();

					Processor  f = new Factorial();
					f.process(no);
				
					f.showData();
				}				
					//break;

//				case 2:
				else if(ch ==2 ){
					System.out.println("Enter radius of circle: ");	
					int radius = sc.nextInt();
	
					Processor  f1 = new Circle ();
					f1.process(radius);
					f1.showData();
				}
					//break;

				else if(ch==3){
				//case 3:
					System.exit(0);
				}
				else{
				//default: 
					System.out.println("Invalid choice");
				}
				
//				}		
			}

	}
}