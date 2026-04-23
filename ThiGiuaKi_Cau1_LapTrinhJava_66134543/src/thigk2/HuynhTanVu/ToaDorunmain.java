	/*
	 * ban đầu em khai báo biến của đề bài x1, y1 và x2, y2
	 * sau đó em hỏi người dùng nhập 4 biến này
	 * sau đó em xuất ra màn hình cái thông tin mà người dùng vừa nhập 
	 * sau đó em đi tính chiều dài sẽ bằng trị tuyệt đối của tọa độ x2- x1
	 * chiều rộng cũng vậy là y1-y2
	 * sau đó em tính chu vi bằng cách chiều( dài + cộng chiều rộng) nhân 2 ( dài + rộng )x2
	 * sau đó em tính diện tích là bằng (chiều dài x nhân chiều rộng ) (chiều dài x chiều rộng )
	 * 
	 * 
	 * */

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
	        
	        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
	        System.out.println("Dien tich của hình chữ nhật là: " + dienTich);
	}
}