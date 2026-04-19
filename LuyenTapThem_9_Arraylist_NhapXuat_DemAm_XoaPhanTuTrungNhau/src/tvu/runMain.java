package tvu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		//cau a: Nhap so nguyen n va n phan tu vao danh sach
		ArrayList<Integer> ds = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i +"] = ");
			Integer tam = sc.nextInt();
			ds.add(tam);
		}
	}

}
