/*
Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor.
Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/


import java.util.Scanner;
class Tile{
	private int length;

	public int getTile(){
		return this.length;
	}

	public void setTile(int length){
		this.length = length;
	}

	public int  TileArea(){
		return (this.length)*(this.length);
	}
	
	
}

class Floor {
	private int length;
	private int width;

	void totalTiles(Tile t){
		//setFloor()
		//System.out.println(t.TileArea()+" "+FloorArea());
		double sqArea = t.TileArea();
		double flArea = FloorArea();

		System.out.println("Tiles required are: "+(flArea/sqArea));
					
	}

	void setFloor(int length, int width){

		this.length = length;
		this.width = width;

	}

	public int FloorArea(){
 		return this.length * this.width; 
	}
	

	


}

class CoverFloor{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side of square: ");
		int sq = sc.nextInt();
		
		System.out.println("Enter length of rectangle: ");
		int len = sc.nextInt();
		System.out.println("Enter width of rectangle: ");
		int wid = sc.nextInt();

		Tile t =new Tile();
		t.setTile(sq);

		Floor f = new Floor();
		f.setFloor(len, wid);

		f.totalTiles(t);

	}
	
}
