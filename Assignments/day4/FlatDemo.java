/*
Create a class OneBHK with instance variables roomArea, hallArea and price.
Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables.
Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area.
Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method.
Also print total amount of all flats. 

*/


import java.util.Scanner;
class OneBHK{

	private int roomArea;
	private int hallArea;
	private float price;
	private static float totPrice;
	
	OneBHK(){
		//price = 0;
		//roomArea = 1;
		//hallArea = 1;
		this(200,200,100f);	
	}

	OneBHK(int roomArea, int hallArea, float price ){
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
		totPrice+= price;
	}

	public void show(){
		System.out.println("Room area: "+this.roomArea+" Hall Area: "+this.hallArea+" price: "+this.price);
	}

	public static void Calculate(){
		System.out.println("Total amount is: "+totPrice);
	}

	

	
	
}

class TwoBHK extends OneBHK {
	private int room2Area;
	
	TwoBHK(){
		super();
		room2Area=200;
	}

	TwoBHK(int roomArea, int hallArea, float price,int room2Area){
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}

	

	public void show(){
		super.show();
		System.out.println("Room 2 area: "+this.room2Area);
	}
	
	
}

class FlatDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++){

			System.out.println("Enter room 1area: ");
			int rm1 = sc.nextInt();
			System.out.println("Enter hall area: ");
			int ha = sc.nextInt();
			System.out.println("Enter room 2 area: ");
			int rm2 = sc.nextInt();
			System.out.println("Enter room price: ");
			float price = sc.nextInt();

			TwoBHK tb = new TwoBHK(rm1, ha, price, rm2);
			tb.show();
		}
		//System.out.println("\n\n");

		//TwoBHK tb1 = new TwoBHK(rm1, ha, price, rm2);
		//tb1.show();
		OneBHK.Calculate();
		

	}
	
}
