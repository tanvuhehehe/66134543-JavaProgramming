package tvu;

public class SinhVien {
	private int STT;
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	
	//constructor no tham so
	public SinhVien() {
		
	}
	
	// constructor  co tham so
	public SinhVien(int 	STT, String hoTen, int namSinh, String gioiTinh) {
		super();
		this.STT = STT;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	

	
	// getter va setter
	public int getSTT() {
		return STT;
	}

	public void setSTT(int sTT) {
		STT = sTT;
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
	//TOSTRING
	@Override
	public String toString() {
		
		return "SinhVien [STT=" + STT + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + "]";
	}
}
