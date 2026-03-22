import java.util.Scanner;

public class mainhinhchunhat {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		HinhChuNhat hcn1 = new HinhChuNhat();
		System.out.print("- Nhap chieu dai cua HCN1: ");
		hcn1.chieudai = nhap.nextDouble();
		System.out.print("- Nhap chieu rong cua HCN1: ");
		hcn1.chieurong = nhap.nextDouble();
		hcn1.hienthongtin();
	}

}
