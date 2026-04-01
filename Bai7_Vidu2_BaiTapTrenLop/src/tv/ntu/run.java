package tv.ntu;

import java.util.ArrayList;
import java.util.Scanner;
public class run {

	public static void main(String[] args) {
		LopHocSinh hs1 = new LopHocSinh();
		String tenHS1 = "Ninh thi lung";
		hs1.setTenHocSinh(tenHS1);
		int tuoiHS1 = 10;
		hs1.setTuoiHocSinh(tuoiHS1);
		String lopHS1 = "5A";
		hs1.setLopHocSinh(lopHS1);

		LopHocSinh hs2 = new LopHocSinh("Tran van lan", 10, "5A");

		// In ra
		System.out.println(hs1);
		System.out.println(hs2);

		// 2b. Nhập dữ liệu
		Scanner sc = new Scanner(System.in);

		LopHocSinh hs3 = new LopHocSinh();
		System.out.print("Nhập tên của HS thứ 3: ");
		String tenHS3 = sc.nextLine();
		hs3.setTenHocSinh(tenHS3);

		System.out.print("Nhập tuổi của HS thứ 3: ");
		int tuoiHS3 = sc.nextInt();
		sc.nextLine();
		hs3.setTuoiHocSinh(tuoiHS3);

		System.out.print("Nhập lớp của HS thứ 3: ");
		String lopHS3 = sc.nextLine();
		hs3.setLopHocSinh(lopHS3);

		LopHocSinh hs4 = new LopHocSinh();
		System.out.print("\nNhập tên của HS thứ 4: ");
		String tenHS4 = sc.nextLine();
		hs4.setTenHocSinh(tenHS4);

		System.out.print("Nhập tuổi của HS thứ 4: ");
		int tuoiHS4 = sc.nextInt();
		sc.nextLine();
		hs4.setTuoiHocSinh(tuoiHS4);

		System.out.print("Nhập lớp của HS thứ 4: ");
		String lopHS4 = sc.nextLine();
		hs4.setLopHocSinh(lopHS4);

		System.out.println(hs3);
		System.out.println(hs4);

		// Nhập danh sách N học sinh
		ArrayList<LopHocSinh> ds = new ArrayList<>();

		System.out.print("Nhập N: ");
		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			LopHocSinh hsi = new LopHocSinh();

			System.out.printf("Nhập tên của HS thứ %d: ", i + 1);
			hsi.setTenHocSinh(sc.nextLine());

			System.out.printf("Nhập tuổi của HS thứ %d: ", i + 1);
			hsi.setTuoiHocSinh(sc.nextInt());
			sc.nextLine();

			System.out.printf("Nhập lớp của HS thứ %d: ", i + 1);
			hsi.setLopHocSinh(sc.nextLine());

			ds.add(hsi);
		}

		// In danh sách
		for (LopHocSinh hs : ds) {
			System.out.println(hs);
		}

		// Thêm học sinh
		LopHocSinh hsthem = new LopHocSinh("Huỳnh Gia Kiệt", 10, "5E");
		ds.add(hsthem);

		System.out.println("Danh sách sau khi thêm:");
		for (LopHocSinh hs : ds) {
			System.out.println(hs);
		}

		// Xóa học sinh tên Hoa
		System.out.println("Danh sách sau khi xoá HS tên Hoa:");
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getTenHocSinh().equals("Hoa")) {
				ds.remove(i);
				break;
			}
		}

		for (LopHocSinh hs : ds) {
			System.out.println(hs);
		}
	}

}
