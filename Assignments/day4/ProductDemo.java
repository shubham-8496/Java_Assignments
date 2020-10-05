/*
Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )

*/


import java.util.Scanner;
class Product{
	private int pid;
	private float price;
	private int quant;

	Product(int pid, float price, int quant){
		this.pid = pid;
		this.price = price;
		this.quant = quant;

	}

	void DispProd(){
		System.out.println("Product Id: "+this.pid+" price "+this.price+" quantity: "+this.quant);
	}	

	public static void ArrProducts(Product []p){
		float total =0f;
		for(int i=0; i<p.length; i++){
			total += p[i].quant * p[i].price; 
		}
		//return total;
		System.out.println("Total price: "+total);
	}

	public static void hsPrice(Product []p){
		Product max=p[0];
		for(int i=1; i<p.length; i++){
			if(max.price < p[i].price){
				max = p[i];
			}
		}
		System.out.println("Product id with higest price: "+max.pid);
	}
	
	
}

class ProductDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Product p[] = new Product[5];	//product array
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter product id: ");
			int pid = sc.nextInt();
			System.out.print("Enter product price: ");
			float price = sc.nextFloat();
			System.out.print("Enter product quantity: ");
			int quant = sc.nextInt();
			
			System.out.print("\n\n");

			Product pObj = new Product(pid,price,quant); //class object
			p[i]=pObj;
		}

		//for (Product i :p){
		//		i.DispProd();
		//}

		Product.hsPrice(p);
		Product.ArrProducts(p);

		

	}
	
}
