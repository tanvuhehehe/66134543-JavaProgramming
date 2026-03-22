
public class LopNganHang {
	String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;
    
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
}
