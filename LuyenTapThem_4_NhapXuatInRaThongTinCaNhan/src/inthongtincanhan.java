import java.util.Scanner;	
public class inthongtincanhan {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhap  ten: ");
		String name = nhap.nextLine();
		
		System.out.print("Nhap nam sinh: ");
		int age = nhap.nextInt();
		nhap.nextLine(); 
		System.out.print("Nhap Nganh Dang Hoc");
		String nganh = nhap.nextLine();
		System.out.println();
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Khoa dang hoc: " + nganh);

	}

}
