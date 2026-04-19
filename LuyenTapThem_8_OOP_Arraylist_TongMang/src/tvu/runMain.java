package tvu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		 ArrayList<Integer> ds = new ArrayList<Integer>();
		 Scanner sc = new Scanner(System.in);
		 
		 // nhap danh sach tu ban phim
		for(int i = 0; i < 10; i++) {
			 System.out.print("a[" + i + "]= ");
			 Integer tam = sc.nextInt();
			 ds.add(tam);
		}
		
		// xuat ban phim
		System.out.print("- Cac phan tu ban nhap la: ");
		for(int i = 0; i < 10; i++) {
			Integer tam = ds.get(i);
			System.out.print(tam + " ");
		}
	}

}
	







