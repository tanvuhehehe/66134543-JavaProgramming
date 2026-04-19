package tvu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class runMain {

	public static void main(String[] args) throws IOException {
		FileReader fR = new FileReader("SV.csv");
		BufferedReader bufRead = new BufferedReader(fR);
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		
		while(true) {
			String line = bufRead.readLine();
			if (line == null) 
				break;
			String[] s = line.split("; "); 
			SinhVien sv1 = new SinhVien(Integer.parseInt(s[0]), s[1], Integer.parseInt(s[2]), s[3]);
			ds.add(sv1);
		}
		
		System.out.printf("%-5s %-20s %-10s %-10s\n", "STT", "Họ tên", "Năm sinh", "Giới tính");

		for(SinhVien x : ds) {
			System.out.println(x.toString());
		}
	}

}
