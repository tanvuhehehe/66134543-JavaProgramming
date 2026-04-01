package tv.ntu;

public class LopHocSinh {
	private String tenHocSinh;
	private int tuoiHocSinh;
	private String lopHocSinh;

	public String getTenHocSinh() {
		return tenHocSinh;
	}

	public void setTenHocSinh(String tenHocSinh) {
		this.tenHocSinh = tenHocSinh;
	}

	public int getTuoiHocSinh() {
		return tuoiHocSinh;
	}

	public void setTuoiHocSinh(int tuoiHocSinh) {
		this.tuoiHocSinh = tuoiHocSinh;
	}

	public String getLopHocSinh() {
		return lopHocSinh;
	}

	public void setLopHocSinh(String lopHocSinh) {
		this.lopHocSinh = lopHocSinh;
	}

	public LopHocSinh() {

	}

	public LopHocSinh(String tenHocSinh, int tuoiHocSinh, String lopHocSinh) {
		this.tenHocSinh = tenHocSinh;
		this.tuoiHocSinh = tuoiHocSinh;
		this.lopHocSinh = lopHocSinh;
	}

	@Override
	public String toString() {
		return "LopHocSinh [tenHocSinh=" + tenHocSinh + ", tuoiHocSinh=" + tuoiHocSinh
				+ ", lopHocSinh=" + lopHocSinh + "]";
	}
}
