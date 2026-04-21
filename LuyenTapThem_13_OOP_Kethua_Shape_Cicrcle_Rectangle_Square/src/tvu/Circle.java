package tvu;

public class Circle extends Shape {
	private static final double PI = 0;
	private double radius = 1.0;
	//constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}
	//getter va setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	// phuong thuc
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	
	//tospring
	@Override
	public String toString() {
		return "Circle [" + super.toString() + ", radius= " + radius +"]";
	}

	
	
}














