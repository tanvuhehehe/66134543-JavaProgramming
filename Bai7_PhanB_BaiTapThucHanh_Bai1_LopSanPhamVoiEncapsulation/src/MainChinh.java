
public class MainChinh {

	public static void main(String[] args) {
	     // Tạo bằng constructor có tham số
		
        LopSanPham sp1 = new LopSanPham("SP001", "Bánh", 10, 3);
        sp1.hienThiThongTin();

        System.out.println("\n---\n");

        // Test validation
        LopSanPham sp2 = new LopSanPham();
        
        sp2.setmaSP("null");
        sp2.setgia(-5);
        sp2.setsoLuong(-2);
        
        System.out.println("\n---\n\n\n");
        
        sp2.hienThiThongTin();
	}

}
