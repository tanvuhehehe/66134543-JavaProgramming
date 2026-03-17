import java.util.Scanner;
public class forsum {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = nhap.nextInt();
		int sumfor = 0;
		for(int i = 0; i < n; i++) {
			sumfor += i;
		}
		System.out.println("Tong tu 1 den n la: " + sumfor);
		
		int sumwhile = 0;
		int i = 1;
		while(i < n) {
			sumwhile += i;
			i++;
		}
		System.out.println("Tong tinh bang while: " + sumwhile);
		
		
		
		
	}

}
