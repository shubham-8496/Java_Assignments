class A
{

	A()
	{
		
	System.out.println("A constructor");
	}

	void m1()
	{
	System.out.println("inside m1 of A");
	}


}
class B extends A
{
	B()
	{
		System.out.println("B constructor");

	}
	
	void m1()
	{
	
	System.out.println("inside m1of B");
	}

	void m2()
	{
	System.out.println("inside m2of B");
	}

	
}

class Upcast{
	public static void main (String args[]){
		/*A b =  new A();
		b.m1();*/
		B b = new B();
		b = (B) new A();
		b.m1();
		//b.m1();
		

		
		
		
	}
}

