
public class mainrecrangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4.2f, 6.4f);
	    System.out.println(r1);  
	    Rectangle r2 = new Rectangle();  
	    System.out.println(r2);
	    
	    r1.setLength(9.6f);
	    r1.setWidth(12.8f);
	    System.out.println(r1);  
	    System.out.println("Chieu dai: " + r1.getLength());
	    System.out.println("Chieu rong: " + r1.getWidth());
	    
	    System.out.printf("Dien tich: %.2f%n", r1.getArea());
	    System.out.printf("Chu vi: %.2f%n", r1.getPerimeter());
	}

}
