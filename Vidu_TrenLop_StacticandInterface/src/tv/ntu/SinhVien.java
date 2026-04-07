package tv.ntu;

public class SinhVien {
	private String hoTen;
	private String lop;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	//  static : tĩnh
	public static String TEN_TRUONG = "ĐẠI HỌC NHA TRANG";
	
	public static void sayHi() {
		System.out.println("Hi, I am a NTU student!");
	}
	
	public void sayHello() {
		System.out.println("Hellooooooo, I am a NTU student: \nName: " + hoTen + "\nClass: " + lop);
	}
	public SinhVien(String hoTen, String lop) {
		this.hoTen = hoTen;
		this.lop = lop;
	}
}
