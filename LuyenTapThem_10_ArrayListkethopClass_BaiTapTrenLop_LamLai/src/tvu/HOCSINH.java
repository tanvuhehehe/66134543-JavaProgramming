package tvu;

public class HOCSINH {
	private String tenHS;
	private double tuoiHS;
	private String lopHS;
	
	//getter
	public String getTenHS() {
		return tenHS;
	}
	public double getTuoiHS() {
		return tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	
	//setter
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public void setTuoiHS(double tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	//constructor
	public HOCSINH() {
		
	}
	
	public HOCSINH(String tenHS, double tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}
	
	@Override
	public String toString() {
		return "HOCSINH [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
	
}


















