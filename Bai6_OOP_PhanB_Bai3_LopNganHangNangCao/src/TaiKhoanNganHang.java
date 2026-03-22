
public class TaiKhoanNganHang {
	// thuoc tinh
	String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;
    
    // phuong thuc
    
    void guiTien(double soTien) {
    	soDu += soTien;
    }
    
    
    boolean rutTien(double soTien) {
    	if(soDu <= soTien) {
    		soDu -= soTien;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    void chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {
    	if(rutTien(soTien)) {
    		taiKhoanKhac.guiTien(soTien);
    		System.out.println("Chuyen Tien Thanh Cong");
    	}else {
            System.out.println("Khong  Du Tien De Chuyen");	
    	}
    }
    void hienSoDu() {
    	System.out.println("So du: " + soDu);
    }
}




