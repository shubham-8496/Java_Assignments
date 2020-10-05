/*
Write a program that initializes 2 byte type of variables.
Add the values of these variables and store in a byte type of variable.
 [Note: primitive down casting is required in this program ] .
*/


class ByteVar {

	public static void main (String args[]){



	byte no1 = 4;
	byte no2 = 1;
	
	int op = (no1 + no2);

	System.out.println((byte)op);

	}

}