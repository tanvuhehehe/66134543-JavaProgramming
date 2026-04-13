package vu;

public class RunMain {

	public static void main(String[] args) {
		//Nhan vien 1 	
		NhanVien nv1 = new NhanVien("66134543", "Huynh Tan Vu", 13500);
		//nv1.hienThiThongTin();
		System.out.println(nv1.toString());
		
		System.out.println("=======");
		//
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("113NF","Trần Thị Tươi Lắm" , 3500, 12, 15);
//		System.out.println(nvVanPhong1.toString());
		nvVanPhong1.hienThiThongTin();
	}

}
