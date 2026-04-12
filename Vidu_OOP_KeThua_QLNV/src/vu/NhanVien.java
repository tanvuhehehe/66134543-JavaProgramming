package vu;

public class NhanVien {
	//thuoc tinh
	private String maNV;
	private String hoTen;
	private double luongCoBan;
	//getter setter
	
	// Ham tao
	public NhanVien() {
		
	}
	
	public String getMaNV() {
		return maNV;
	}
	
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}

}
