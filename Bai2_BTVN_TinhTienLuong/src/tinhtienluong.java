
public class tinhtienluong {

	public static void main(String[] args) {
			double soGio = 45;        
	        double luongMoiGio = 50000; 
	        double tongLuong;

	        if (soGio > 40) {
	            tongLuong = 40 * luongMoiGio 
	                      + (soGio - 40) * luongMoiGio * 1.5;
	        } else {
	            tongLuong = soGio * luongMoiGio;
	        }

	        System.out.println("Tong luong nhan vien: " + tongLuong);
	}

}
