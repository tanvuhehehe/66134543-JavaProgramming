package tvu;

public class runMain {

	public static void main(String[] args) {
		// tạo hình 1
		Shape s1 = new Shape("riiid",false);
		System.out.println(s1.toString());
		
		// tạo hình 2
		Shape s2 = new Shape();
		System.out.println(s2.toString());
		// tạo hình 3
		Circle c1 = new Circle(3.8, "red", true);
		System.out.println(c1.toString());
		
		// tạo hình 4
		Circle c2 = new Circle();
		System.out.println(c2.toString());
		
		//tạo hình 5
		Rectangle r1 = new Rectangle(5, 10, "black", true);
		System.out.println(r1.toString());
		
		//tạo hình 6
		Rectangle r2 = new Rectangle();
		System.out.println(r2.toString());
		
		//tạo hình 7
		Square s11 = new Square(5, "pink", true);
		System.out.println(s11.toString());
		
		//tạo hình 8
		Square s12 = new Square();
		System.out.println(s12.toString());
	}

}
