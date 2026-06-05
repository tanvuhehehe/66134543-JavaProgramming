package tvu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) throws IOException {

//	    Scanner sc = new Scanner(System.in);
//
//	    ArrayList<XeVINFAST> ds = new ArrayList<>();
//
//	    int n;
//
//	    do {
//	        System.out.print("Nhap n (0<n<20): ");
//	        n = sc.nextInt();
//	        sc.nextLine();
//	    } while(n <= 0 || n >= 20);
//
//	    for(int i = 0; i < n; i++) {
//
//	        XeVINFAST xe = new XeVINFAST();
//
//	        System.out.println("\nNhap xe thu " + (i + 1));
//	        xe.nhap();
//
//	        ds.add(xe);
//	    }
//
//	    // sắp xếp
//	    ds.sort((a, b) ->
//	        Double.compare(
//	            b.tinhGiaLanBanh(),
//	            a.tinhGiaLanBanh()));
//
//	    // xuất
//	    System.out.println("\n===== DANH SACH XE =====");
//
//	    for(XeVINFAST x : ds) {
//	        System.out.println(x);
//	    }
//
//	    // thêm
//	    System.out.print("\nNhap vi tri p: ");
//	    int p = sc.nextInt();
//	    sc.nextLine();
//
//	    XeVINFAST xeMoi = new XeVINFAST();
//	    xeMoi.nhap();
//
//	    ds.add(p, xeMoi);
//
//	    // xóa
//	    System.out.print("\nNhap dong xe can xoa: ");
//	    String dongXe = sc.nextLine();
//
//	    ds.removeIf(x ->
//	        x.getDongXe().equalsIgnoreCase(dongXe));
//
//	    // xuất cuối
//	    System.out.println("\n===== DANH SACH CUOI =====");
//
//	    for(XeVINFAST x : ds) {
//	        System.out.println(x);
//	    }
		
		FileReader fr = new FileReader("Danhsachxe.txt");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<XeVINFAST> ds = new ArrayList<>();
		
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			
			String s[] = line.split(";");
			XeVINFAST temp = new XeVINFAST(s[0], Integer.parseInt(s[1]), LocalDate.parse(s[2]), Integer.parseInt(s[3]), s[4]);
			ds.add(temp);
		}
		
		for(XeVINFAST x:ds) {
			System.out.println(x.toString());
		}
		
		// them 1 xe vao danh sach bat ki
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vi tri p: ");
		int p = sc.nextInt();
		sc.nextLine();
		
		XeVINFAST xeMoi = new XeVINFAST();
		xeMoi.nhap();
		
		if(p >= 0 && p <= ds.size()) {
		    ds.add(p, xeMoi);
		} else {
		    System.out.println("Vi tri khong hop le!");
		}
		// xuat sau khi them
		System.out.println("\n===== DANH SACH SAU KHI THEM =====");
		for(XeVINFAST x : ds) {
		    System.out.println(x);
		}
		
		// nhap xe can xoa
		System.out.print("Nhap dong xe can xoa: ");
		String x = sc.nextLine();

		ds.removeIf(xe -> xe.getDongXe().equalsIgnoreCase(x));
		// xuat lai
		System.out.println("\n===== DANH SACH SAU KHI XOA =====");

		for(XeVINFAST xe : ds) {
		    System.out.println(xe);
		}
		
//		// nhap dong xe can xoa cach 2
//		System.out.print("Nhap dong xe can xoa: ");
//		String x = sc.nextLine();
//
//		// xoa
//		for(int i = ds.size() - 1; i >= 0; i--) {
//
//		    if(ds.get(i).getDongXe().equalsIgnoreCase(x)) {
//		        ds.remove(i);
//		    }
//		}
//
//		// xuat lai
//		System.out.println("\n===== DANH SACH SAU KHI XOA =====");
//
//		for(XeVINFAST xe : ds) {
//		    System.out.println(xe);
//		}
	}

}






