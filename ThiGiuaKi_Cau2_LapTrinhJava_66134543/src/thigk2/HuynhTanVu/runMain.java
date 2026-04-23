package thigk2.HuynhTanVu;

import java.util.ArrayList;

public class runMain {

	public static void main(String[] args) {
		// Hardcode 3 sản phẩm
		// cau a: 
		ArrayList<SanPham> ds = new ArrayList<>();
		ds.add(new SanPham("SP01", "Ban phim co RGB Cuc Manh", "Thiet bi gaming", 10));
		ds.add(new SanPham("SP02", "Chuot Khong Day Bay Nhu Gio", "Thiet bi gaming", 15));
		ds.add(new SanPham("SP03", "Man hinh 240Hz Nhin La Dinh", "Thiet bi gaming", 5));
        // In danh sách ban đầu
        System.out.println("Danh sach san pham ban dau:");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
        
	}

}
