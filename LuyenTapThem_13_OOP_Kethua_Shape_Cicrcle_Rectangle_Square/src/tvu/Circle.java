package tvu;

public class Circle extends Shape {
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
	
}
