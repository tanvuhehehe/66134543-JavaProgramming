
public class conmeokeusao {
	// thuoc tinh
	String tenConMeo;
	int tuoiMeo;
	String mauLong;
	double canNang;
	//phuongthuc
	void HienThongTin() {
		System.out.println("Ten con meo: " + tenConMeo);
		System.out.println("Tuoi con Meo: " + tuoiMeo + " nam");
		System.out.println("Mau Long:  " + mauLong);
		System.out.println("Can Nang: " + canNang + " kg");
	}
	void keu() {
		System.out.println(tenConMeo +" kêu Mèo méo meo mèo meo ");
	}
	void an(String thucAn) {
		System.out.println(tenConMeo + " dang an " + thucAn);
	}
	void ngu() {
		System.out.println(tenConMeo + " dang ngu");
	}
}
