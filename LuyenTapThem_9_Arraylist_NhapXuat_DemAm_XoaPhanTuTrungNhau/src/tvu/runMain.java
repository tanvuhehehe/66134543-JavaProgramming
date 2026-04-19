package tvu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//cau a: Nhap so nguyen n va n phan tu vao danh sach
		ArrayList<Integer> ds = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		// nhap n: 
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		
		// nhap mang: 
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i +"] = ");
			Integer tam = sc.nextInt();
			ds.add(tam);
		}
		
		
		//cau b: Dem co bao nhieu so am trong danh sach
		//cach dem 1: 
		int cnt1 = 0;
		for(int i = 0; i < n; i++) {
			Integer tam = ds.get(i);
			if(tam < 0) cnt1++;
		}
		System.out.println("\t- Dem am C1: " + cnt1);
		//cach dem 2: 
		int cnt2 = 0;
		for(Integer x : ds) {
			if(x < 0) cnt2++;
		}
		System.out.println("\t- Dem am C2: " + cnt2);
		
		//cau c: Tim gia tri lon nhat trong danh sach
		//cach 1: 
		int max1 = ds.get(0);
		for(int i = 1; i < n; i++) {
			Integer tam = ds.get(i);
			if(max1 < tam) max1 = tam;
		}
		System.out.println("\t- Max C1: " + max1);
		//cach 2: 
		int max2 = ds.get(0);
		for(Integer x : ds) {
			if(max2 < x) max2 = x;
		}
		System.out.println("\t- Max C2: " + max2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//cau d: Tinh trung binh cong cua cac phan tu chia het cho 3
		//cau e: Xoa tat ca cac phan tu trung nhau ( giu lai xuat hien 1 lan)
	}
}



















