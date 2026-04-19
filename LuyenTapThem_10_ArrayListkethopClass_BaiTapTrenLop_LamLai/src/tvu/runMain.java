package tvu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		
		//2a. Tao moi 2 HS in ra man hinh
		//hs1: constructor rong
		HOCSINH hs1 = new HOCSINH();
		hs1.setTenHS("Mai Len Bang");
		hs1.setTuoiHS(19.5);
		hs1.setLopHS("Love1A");
		System.out.println(hs1.toString());
		//hs2: constructor co tham so
		HOCSINH hs2 = new HOCSINH("Mai Len Bang 2", 19.6, "Love2A");
		System.out.println(hs2.toString());
		 
		//2b. DL nhap tu ban phim
		Scanner sc = new Scanner(System.in);
		HOCSINH hs3 = new HOCSINH();
		System.out.print("- Nhap TenHS 3: ");
		String tenhs3 = sc.nextLine();
		System.out.print("- Nhap TuoiHS 3: ");
		double tuoihs3 = sc.nextDouble();
		sc.nextLine(); // xoa bo enter cua tuoihs
		System.out.print("- Nhap LopHS 3: ");
		String lophs3 = sc.nextLine();
		// gan gia tri
		hs3.setTenHS(tenhs3);
		hs3.setTuoiHS(tuoihs3);
		hs3.setLopHS(lophs3);
		System.out.print(hs3.toString());
		
		//3a. Nhap ds N hoc sinh
		ArrayList<HOCSINH> ds = new ArrayList<HOCSINH>();
		System.out.print("\nNhap so luong hoc sinh: ");
		int N = sc.nextInt();
		
		sc.nextLine();// xoa cach
		
		for(int i = 0; i < N; i++) {
			HOCSINH hsi = new HOCSINH();
			System.out.print("- Nhap TenHS " + i + " = ");
			String tenhsi = sc.nextLine();
			System.out.print("- Nhap TuoiHS " + i + " = ");
			double tuoihsi = sc.nextDouble();
			System.out.print("- Nhap LopHS " + i + " = ");
			sc.nextLine();//xoa enter cua tuoi
			String lophsi = sc.nextLine();
			
			hsi.setTenHS(tenhsi);
			hsi.setTuoiHS(tuoihsi);
			hsi.setLopHS(lophsi);
			
			ds.add(hsi);
		}
		
		//3b. In ra HOCSINH vua nhap
		for(HOCSINH hsi : ds) {
			System.out.println(hsi.toString());
		}
		// in cach 2
//		for(int i = 0; i < N; i++) {
//			System.out.println(ds.get(i).toString());
//		}
		
		//4a. Bo sung them 1HS moi
		HOCSINH hs4 = new HOCSINH("LE THI THEM", 20, "love4");
		ds.add(hs4);
		
		//4b. Xuat HOC SINH
		System.out.println("\nDanh sach sau khi them: ");
		for(HOCSINH hsi : ds) {
			System.out.println(hsi.toString());
		}
		
		//5a. Xoa HS co ten Hoa
		for(int i = 0; i < N; i++) {
			HOCSINH hscheck = ds.get(i);
			if(hscheck.getTenHS() == "Hoa") {
				ds.remove(hscheck);
				break;
			}
		}
	}

}




