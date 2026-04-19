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
		System.out.println("- Dem am: " + cnt1);
	}

}



















