package thigk2.HuynhTanVu;

import java.util.Scanner;

public class ToaDorunmain {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);

	        double x1, y1, x2, y2; // tạo toạ độ trên trái là x1, y1 và dưới phải x2, y2

	        System.out.print("Nhap x1 (goc tren trai): ");
	        x1 = sc.nextDouble();

	        System.out.print("Nhap y1 (goc tren trai): ");
	        y1 = sc.nextDouble();

	        System.out.print("Nhap x2 (goc duoi phai): ");
	        x2 = sc.nextDouble();

	        System.out.print("Nhap y2 (goc duoi phai): ");
	        y2 = sc.nextDouble();
	        
	        System.out.println("Toa do hinh chu nhat:");
	        System.out.println("Goc tren trai: (" + x1 + ", " + y1 + ")");
	        System.out.println("Goc duoi phai: (" + x2 + ", " + y2 + ")");
	        
	        double chieuDai = Math.abs(x2 - x1);
	        double chieuRong = Math.abs(y1 - y2);

	        // tính chu vi và diện tích
	        double chuVi = 2 * (chieuDai + chieuRong);
	        double dienTich = chieuDai * chieuRong;
	}
}