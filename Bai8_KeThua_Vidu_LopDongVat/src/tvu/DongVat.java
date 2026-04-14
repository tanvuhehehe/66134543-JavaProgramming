package tvu;

public class DongVat {
	private String ten;
	private int tuoi;
	private double canNang;
	
	//constructor null
	public DongVat(){
		
	}
	
	//constructor co gia tri
	public DongVat(String ten, int tuoi, double canNang) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.canNang = canNang;
	}
	
	//setter
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	
	//getter
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public double getCanNang() {
		return canNang;
	}
	//phuong thuc 
	public void an() {
		System.out.println(ten + " dang an");
	}
	
	public void ngu() {
		System.out.println(ten + " dang ngu");
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten : " + ten);
		System.out.println("Tuoi: " + tuoi + "nam");
		System.out.println("Can Nang: " + canNang + "kg");
	}
}	

























