
public class PTB1 {
	public static void main(String[] args) {
	       	double a = 2;
	        double b = -4;

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh vo so nghiem");
	            } else {
	                System.out.println("Phuong trinh vo nghiem");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiem x = " + x);
	        }
	}
}
