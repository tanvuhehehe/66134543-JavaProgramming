package tv.ntu;

public class MainChinh {

	public static void main(String[] args) {
		System.out.println(SinhVien.TEN_TRUONG);
		SinhVien.sayHi();
		System.out.println();
		SinhVien sv1 = new SinhVien("Huỳnh Tấn Vũ", "CNTT3");
		SinhVien sv2 = new SinhVien("Nguyễn Ngọc Lan Anh", "CNTT100");
		
		sv1.sayHello();
		System.out.println();
		sv2.sayHello();

	}

}
