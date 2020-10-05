/*
Create a program to demonstrate constructor chaining.
*/

class ConstrA{
	ConstrA(){
		this(10);
		System.out.println("Calling constructor A");
	}
	ConstrA(int a){
		System.out.println("Calling constructor A having parameter: "+a);
	}

}

class ConstrB extends ConstrA{
	ConstrB(){
		this(5);
		System.out.println("Calling constructor B");	
	}
	ConstrB(int a){
		System.out.println("Calling constructor B having parameter: "+a);
	}

}


class ChainingMain{
	public static void main(String args[]){
		ConstrB b = new ConstrB();
		
		
	}
}