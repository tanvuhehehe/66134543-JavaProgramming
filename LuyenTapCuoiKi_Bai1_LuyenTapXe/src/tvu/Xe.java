package tvu;

import java.util.Scanner;
import java.time.LocalDate;
public class Xe {
	private String dongXe;
	private int soChoNgoi;
	private LocalDate ngaySanXuat = LocalDate.of(2019,6,11);
	private int giaSan = 400;
	// contructor ko tham so
	public Xe() {
		
	}
	// contructor co tham so
	public Xe(String dongXe, int soChoNgoi, LocalDate ngaySanXuat, int giaSan) {
		this.dongXe = dongXe;
		this.soChoNgoi = soChoNgoi;
		this.ngaySanXuat = ngaySanXuat;
		this.giaSan = giaSan;
	}
	// nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap dong Xe: ");
		String dx = sc.nextLine();
		setDongXe(dx);
		
		System.out.println("Nhap so Cho Ngoi: ");
		int scn = sc.nextInt();
		setSoChoNgoi(scn);

		sc.nextLine();
		System.out.println("Nhap ngay San Xuat (yyyy-MM-dd): ");
		String nsx = sc.nextLine();
		setNgaySanXuat(LocalDate.parse(nsx));
		
		System.out.println("Nhap gia san: ");
		int gs = sc.nextInt();
		setGiaSan(gs);
	}
	// getter setter
	public String getDongXe() {
		return dongXe;
	}
	public void setDongXe(String dongXe) {
		this.dongXe = dongXe;
	}
	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public int getGiaSan() {
		return giaSan;
	}
	public void setGiaSan(int giaSan) {
		this.giaSan = giaSan;
	}
	// ban
	public double tinhGiaBan() {
	    int soNam = LocalDate.now().getYear() - ngaySanXuat.getYear();
	    if (soNam > 2) {
	        return giaSan * 1.15;
	    } else if (soNam > 1) {
	        return giaSan * 1.3;
	    } else {
	        return giaSan * 1.5;
	    }
	}
	
	
	
	//to string
	@Override
	public String toString() {
		return "Xe [dongXe=" + dongXe + ", soChoNgoi=" + soChoNgoi + ", ngaySanXuat=" + ngaySanXuat + ", giaSan="
				+ giaSan + "]";
	}
	
	
	
}


















