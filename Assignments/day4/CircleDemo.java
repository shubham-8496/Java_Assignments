/*
Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area.
 Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/


import java.util.Scanner;
class Circle{
	private float radius;
	private double area;
	
	void Init(float radius){
		this.radius = radius;
	}
	
	void CalculateArea(){
		area = Math.PI*(Math.pow(radius,2));
	}

	void Display(){
		System.out.println("Area of circle having radius "+radius+" is: "+String.format("%.2f",area));
	}

	
}

class CircleDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle: ");
		int radius = sc.nextInt();

		Circle c =new Circle();
		
		c.Init(radius);
		c.CalculateArea();
		c.Display();
		
		


	}
	
}
