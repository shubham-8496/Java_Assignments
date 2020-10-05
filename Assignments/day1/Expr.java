/*

Find the result of following expressions.
You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/

class Expr {

	public static void main (String args[]){

	int x = 2;

//=================1===========================	
	int y = (x*x)+3*x-7;
	System.out.println(y); //3
//==================2==========================
	int y1 = x++ + ++x;	
	System.out.println(y1); //6

//==================3==========================

int xx=2;
int yy=3;

	int z = xx++ - --yy - --xx + xx++;	
//			2/3		2/2		2/2		2/3
	
	System.out.println("x:-> "+xx);
	System.out.println("y:-> "+yy);
	System.out.println("z:-> "+z);
	
//==================4==========================
	boolean x2 = true;
	boolean y2 = true;	

	boolean z1 = x2 && y2 || !(x2 || y2);
	System.out.println("z1:-> "+z1);		

	}

	

}