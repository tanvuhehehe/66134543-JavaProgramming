package tvu;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		 ArrayList<Integer> ds = new ArrayList<Integer>();
		 Scanner sc = new Scanner(System.in);
		 
		 // a. nhap danh sach tu ban phim
		for(int i = 0; i < 10; i++) {
			 System.out.print("a[" + i + "]= ");
			 Integer tam = sc.nextInt();
			 ds.add(tam);
		}
		
		// b. xuat ban phim
		//cach 1: 
		System.out.print("- Cach 1:  ");
		for(int i = 0; i < ds.size(); i++) {
			Integer tam = ds.get(i);
			System.out.print(tam + " ");
		}	
		//cach 2: 
		System.out.print("\n- Cach 2:  ");
		for(Integer x : ds) {
			System.out.print(x + " ");
		}
		
		//===
		
		// c. dem xem co bao nhieu phan tu chan
		//cach 1: 
		int cnt1 = 0;
		for(int i = 0; i < ds.size(); i++) {
			Integer tam = ds.get(i);
			if(tam % 2 == 0) {
				cnt1++;
			}
		}
		System.out.println("\n- Dem C1: " + cnt1);
		
		//Cach 2:
		int cnt = 0;
		for(Integer x : ds) {
			if(x % 2 == 0) {
				cnt ++;
			}
		}
		System.out.println("- Dem C2: " + cnt);
		
		//===
		
//		d. tinh tong cua cac phan tu cua danh sach
		//cach 1: 
		int sum1 = 0;
		for(int i = 0; i < ds.size(); i++) {
			Integer tam = ds.get(i);
			sum1 += tam;
		}
		System.out.println("- Tong C1: " + sum1);
		
		//cach 2:
		int sum2 = 0;
		for(Integer x : ds) {
			sum2 += x;
		}
		System.out.println("- Tong C2: " + sum2);
	}

}
	







