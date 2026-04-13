package vu;

public class NhanVienVanPhong extends NhanVien {
	private double soGioLamThem;
	private double luongThemMoiGio;

	
	//ham tao
	public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan, double soGioLamThem, double luongThemMoiGio) {
		super(maNV, hoTen, luongCoBan);
		this.soGioLamThem = soGioLamThem;
		this.luongThemMoiGio = luongThemMoiGio;
	}

	//phuongthuc
	@Override
	public double tinhLuong() {
		return super.getLuongCoBan() + soGioLamThem*luongThemMoiGio;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So gio lam them: " + soGioLamThem);
		System.out.println("Luong cho moi gio: " + luongThemMoiGio);
	}
	//geter va setter
	public double getSoGioLamThem() {
		return soGioLamThem;
	}

	public void setSoGioLamThem(double soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}


	public double getLuongThemMoiGio() {
		return luongThemMoiGio;
	}


	public void setLuongThemMoiGio(double luongThemMoiGio) {
		this.luongThemMoiGio = luongThemMoiGio;
	}
	

	
}
