

package thigk2.HuynhTanVu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		// Hardcode 3 sản phẩm
		// cau a: 
		ArrayList<SanPham> ds = new ArrayList<>();
		SanPham sanPham1 = new SanPham("SP01", "Ban phim Go La Chay Deadline", "Thiet bi", 10);
		SanPham sanPham2 = new SanPham("SP02", "Chuot Click 1 Cai Len Rank", "Thiet bi", 15);
		SanPham sanPham3 = new SanPham("SP03", "Man hinh Nhin La Het Buon Ngu", "Thiet bi", 5);

		// thêm vào danh sách
		ds.add(sanPham1);
		ds.add(sanPham2);
		ds.add(sanPham3);
		
        // In danh sách ban đầu
        System.out.println("Danh sach san pham ban dau:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
        // THÊM MỚI 1 SẢN PHẨM 
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nNhap pham moi cua cau b:");
        System.out.print("Ma SP: ");
        String ma = sc.nextLine();

        System.out.print("Ten SP: ");
        String ten = sc.nextLine();

        System.out.print("Loai SP: ");
        String loai = sc.nextLine();

        System.out.print("So luong: ");
        int sl = sc.nextInt();

        // tạo thêm đối tượng thêm yêu cầu 
        SanPham sanPham4 = new SanPham(ma, ten, loai, sl);
        ds.add(sanPham4);
        // xuất sản phẩm 4
        System.out.println("San Pham 4: " + sanPham4.toString());
        //  IN RA LẠI TẤT CẢ SẢN PHẨM
        System.out.println("\nDanh sach san pham sau khi them:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
        
        // In ra màn hình các danh sách có tên là thực phẩm chúc năng
        System.out.println("\nDanh sach san pham loai 'thuc pham chuc nang':");
        for (SanPham sp : ds) {
            if (sp.getLoaiSP().equalsIgnoreCase("thuc pham chuc nang")) {
                System.out.println(sp);
            }
        }
        
	}

}
