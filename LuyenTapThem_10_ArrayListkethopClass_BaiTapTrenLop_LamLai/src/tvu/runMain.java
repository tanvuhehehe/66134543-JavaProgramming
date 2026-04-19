package tvu;

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
	}

}
