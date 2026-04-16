package tvu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class runMain {

	public static void main(String[] args) throws IOException{
		FileReader fR = new FileReader("SV.csv");
		BufferedReader bufReader = new BufferedReader(fR);
		
		ArrayList<LopSinhVien> ds = new ArrayList<LopSinhVien>();
		
		while(true) {
			String line = bufReader.readLine();
			if (line == null)
				break;
			String[] s = line.split("; ");
			LopSinhVien sv = new LopSinhVien(Integer.parseInt(s[0]), s[1], Integer.parseInt(s[2]), s[3]);
			ds.add(sv);
		}
		
		System.out.printf("%-5s %-20s %-10s %-10s\n", "STT", "Họ tên", "Năm sinh", "Giới tính");
		for (LopSinhVien sv : ds) {
			System.out.println(sv);
		}
	}

}
