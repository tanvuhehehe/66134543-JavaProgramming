
public class HinhChuNhat {
	double chieudai;
	double chieurong;
	
	double tinhdientich() {
		return chieudai * chieurong;
	}
	
	double tinhchuvi() {
		return (chieudai + chieurong) * 2;
	}
	
	boolean hople() {
	    return chieudai > 0 && chieurong > 0;
	}
	
	void hienthongtin() {
		System.out.println("Du kien hop le: " + (hople() ? "Co" : "Khong"));
		System.out.println("Chieu dai cua ban nhap la: " + chieudai +" cm");
		System.out.println("Chieu rong cua ban nhap la: " + chieurong + " cm");
		System.out.println("Dien tich cua hinh chu nhat la: " + tinhdientich() + " cm^2");
		System.out.println("Chu vi cua hinh chu nhat la: " + tinhchuvi() + " cm");
	}
}
