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
	//
	public String getMaNV() {
		return maNV;
	}
	
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	//
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	//
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	
	//
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	
	//
	public double tinhLuong() {
		return luongCoBan;
	}
	
	public String toString() {
		String chuoiXuat = "";
		chuoiXuat = chuoiXuat + "Ma NV: " + this.maNV;
		chuoiXuat = chuoiXuat + "\nHo ten NV: : " + this.hoTen;
		chuoiXuat = chuoiXuat + "\nLuong co ban: " + this.luongCoBan;
		return chuoiXuat;
		// hai cai nhu nhau
//		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongCoBan=" + luongCoBan + "]";
	}
	
	//
	public void hienThiThongTin() {
		System.out.println("Ma NV: " + maNV);
		System.out.println("Ten NV: " + hoTen);
		System.out.println("Luong co ban: " + luongCoBan);
	}
}










