package tvu;

public class Square extends Rectangle{
	//constructor
	public Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
		
	}
	public Square(double side, String color, 
			boolean filled) 
	{
		super(color, filled);
	}
}
