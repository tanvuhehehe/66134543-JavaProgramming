package thigk2.HuynhTanVu;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	private int soLuong; // thuộc tính thêm
	
	// contructor
	public SanPham() {
		
	}
	
	// contructor có tham số
	public SanPham(String maSP, String tenSP, String loaiSP, int soLuong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.soLuong = soLuong;
	}


	//getter setter
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + 
	               ", tenSP=" + tenSP + 
	               ", loaiSP=" + loaiSP + 
	               ", soLuong=" + soLuong + "]";
	}
	
}
