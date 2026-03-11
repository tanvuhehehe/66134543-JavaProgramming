
public class maincircle2 {

	public static void main(String[] args) {
		circle c1 = new circle(3.3);
	    System.out.println(c1);   
	    circle c2 = new circle();
	    System.out.println(c2);
	    
	    c1.setRadius(2.2);
	    System.out.println(c1);      
	    System.out.println("Ban kinh: " + c1.getRadius());
	    
	    System.out.printf("Dien tich: %.2f%n", c1.getArea());
	    System.out.printf("Chu vi: %.2f%n", c1.getCircumference());
	}

}
