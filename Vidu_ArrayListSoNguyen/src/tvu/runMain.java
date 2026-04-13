
/* De bai: Dung Arraylist
 * Viet chuong trinh
 * a. Nhap vao 10 so nguyen tu ban phim
 * b. In ra man hinh day so vua nhap
 * c. Dem xem co bao nhieu so chan
 * d. Tinh tong cac phan tu co trong danh sach
 */
package tvu;

import java.util.ArrayList;
import java.util.Scanner;
public class runMain {

	public static void main(String[] args) {
		ArrayList<Integer> ds = new ArrayList<Integer>();
		//a.Nhap vao 10 so nguyen tu ban phim
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
//			System.out.println("Nhap phan tu thu " + i + " : ");
			System.out.println("a[" + i + "] = ");
			Integer tam = sc.nextInt();
			ds.add(tam);
		}
		//b. In ra man hinh day so vua nhap
		System.out.println("Danh sach vua nhap la: ");
		
		System.out.println("Cach 1: ");
		for(int i = 0; i<ds.size(); i++) {
			Integer tam = ds.get(i);
			System.out.print(tam +" ");
		}
		System.out.println("\nCach 2: \n");
		for(Integer x: ds) {
			System.out.print(x + " ");
		}
		
		//c. Dem xem co bao nhieu so chan
		int tamDem = 0;
		for(Integer x : ds) {
			if(x % 2 == 0) tamDem ++; 
		}
		System.out.println("\nPhan Tu Chan Trong Mang la: " + tamDem);
		//d. Tinh tong cac phan tu co trong danh sach
		int sum = 0;
		for(Integer x : ds) {
			sum += x;
		}
		System.out.println("Tong cac phan tu la: " + sum);
	}

}





























