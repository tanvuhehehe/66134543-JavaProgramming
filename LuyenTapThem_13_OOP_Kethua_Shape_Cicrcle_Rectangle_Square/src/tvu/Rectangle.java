package tvu;

public class Rectangle extends Shape{
	private double width = 1.0;
	private double length = 1.0;
	//constructor
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
		
	}
	
	
}
	