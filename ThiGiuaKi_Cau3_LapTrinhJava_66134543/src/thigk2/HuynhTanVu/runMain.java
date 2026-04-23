package thigk2.HuynhTanVu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		 ArrayList<Double> ds = new ArrayList<>();

	        // Đọc file
	        try {
	            BufferedReader br = new BufferedReader(new FileReader("so.txt"));
	            String line;
	            
	            while ((line = br.readLine()) != null) {
	                double so = Double.parseDouble(line);
	                ds.add(so);
	            }
	            br.close();
	        } catch (Exception e) {
	            System.out.println("Loi doc file!");
	        }

	        // In danh sách
	        System.out.println("Danh sach cac so:");
	        for (double x : ds) {
	            System.out.println(x);
	        }

	        // Nhap X (ngay sinh)
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap gia tri X: ");
	        double X = sc.nextDouble();

	        // Kiem tra X co ton tai khong
	        boolean timThay = false;
	        for (double x : ds) {
	            if (x == X) {
	                timThay = true;
	                break;
	            }
	        }

	        if (timThay) {
	            System.out.println("X co trong danh sach");
	        } else {
	            System.out.println("X khong co trong danh sach");
	        }

	}

}
	