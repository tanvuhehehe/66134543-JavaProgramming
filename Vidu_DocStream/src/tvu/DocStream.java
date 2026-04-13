package tvu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fInput = new FileInputStream("baitho.txt");
		
		//Khai báo biến đối tượng InputStreamReader
//		InputStreamReader ipReader = new InputStreamReader(System.in);
		InputStreamReader ipReader = new InputStreamReader(fInput);
		//Khai báo biến đối tượng buffer 
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//In một câu hướng dẫn để biết User cần làm gì
		System.out.println("Nhap mot chuoi bat ki: ");
		
		//Đọc dữ liệu từ bàn phím, cất vào biến chuỗi
		String lineDocDuoc = bufReader.readLine(); 
		
		//In ra dòng đọc được
		System.out.print(lineDocDuoc);
		System.out.println();
		String lineDocDuoc1 = bufReader.readLine(); 
		System.out.print(lineDocDuoc1);
		
		
	}

}
