
public class Mainchinhnganhang {

	public static void main(String[] args) {
		//taikhoan1
		TaiKhoanNganHang taikhoan1 = new TaiKhoanNganHang();
		taikhoan1.soTaiKhoan = "12345";
		taikhoan1.tenChuTaiKhoan = "Huynh Tan Vu";
		taikhoan1.soDu = 1000000;
		
		taikhoan1.guiTien(100000);
		System.out.println("Tai khoan 1: ");
		taikhoan1.hienSoDu();
		
		//taikhoan2
		TaiKhoanNganHang taikhoan2 = new TaiKhoanNganHang();
		taikhoan2.soTaiKhoan = "123456";
		taikhoan2.tenChuTaiKhoan = "Huynh Tan Anh";
		taikhoan2.soDu = 7500000;
		System.out.println("Tai khoan 2: ");
		taikhoan2.guiTien(100000);
		taikhoan2.hienSoDu();
	}
}
