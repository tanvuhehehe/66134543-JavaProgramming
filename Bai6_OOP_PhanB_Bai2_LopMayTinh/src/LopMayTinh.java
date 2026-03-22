
public class LopMayTinh {
	
	// thuoc tinh
	
	String hang;
	int ram;
	int oCung;
	double gia;
	
	// phuong thuc 
	
	void kimTraCauHinh() {
		System.out.println("Hang: " + hang);
		System.out.println("Ram: " + ram + " GB");
		System.out.println("O Cung "+ oCung + " GB");
		System.out.println("Gia: " + gia);
	}
	
	boolean coTheChoiGame() {
		return ram >= 8;
	}
}
