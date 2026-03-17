
public class xehoi {
	// thuoc tinh
	String hangXe;
	String mauSac;
	int tocDoHienTai;
	// phuong thuc hanh dong
	void tangToc(int km) {
		tocDoHienTai += km;
		System.out.println(hangXe + " tang toc len " + tocDoHienTai + "km/h");
	}
    void phanh() {
        tocDoHienTai = 0;
        System.out.println(hangXe + " da dung lai");
    }
    void hienThiThongTin() {
        System.out.println("Hang xe: " + hangXe);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Toc do hien tai: " + tocDoHienTai + " km/h");
    }
}
