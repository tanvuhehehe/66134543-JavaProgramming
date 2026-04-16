package tvu;

public class LopSinhVien {
	private int soTT;
	private String hoTen;
	private  int namSinh;
	private String gioiTinh;
	
	//contructor
	public LopSinhVien() {
		
	}
	
	public LopSinhVien(int soTT, String hoTen, int namSinh, String gioiTinh) {
		super();
		this.soTT = soTT;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

	public int getSoTT() {
		return soTT;
	}

	public void setSoTT(int soTT) {
		this.soTT = soTT;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
	
}
