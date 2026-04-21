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
	//getter và setter
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	//tospring
	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width= " + width +", length= " + length + "]";
	}

}
	









