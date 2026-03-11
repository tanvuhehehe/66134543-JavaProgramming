
public class ChuNhat {
	private double dai;
	private double rong;

	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	double getDai() {
		return dai;
	}
	double getRong() {
		return rong;
	}

	void setDai(double dai) {
		this.dai = dai;
	}
	void setRong(double rong) {
		this.rong = rong;
	}	

	public String toString() {
		String s = "Hinh co chieu dai la " + dai + " va chieu rong la " + rong;
		return s;
	}
}
