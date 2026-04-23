
/*Đầu tiên em tạo danh sách ArrayList<Double> để lưu các số thực.
Sau đó em sử dụng FileReader và BufferedReader để đọc dữ liệu từ file.
Em đọc từng dòng trong file bằng vòng lặp while.
Mỗi dòng em chuyển sang kiểu double bằng Double.parseDouble().
Em thêm từng số vào danh sách.
Sau khi đọc xong, em đóng file lại.
Tiếp theo em duyệt danh sách và in các số ra màn hình.
Em sử dụng Scanner để nhập giá trị X từ bàn phím.
Em kiểm tra X có tồn tại trong danh sách bằng cách dùng contains hoặc duyệt.
Cuối cùng em in ra kết quả X có hoặc không có trong danh sách.
 * */
package thigk2.HuynhTanVu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args) throws IOException {
		ArrayList<Double> ds = new ArrayList<>();

        // Đọc file
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            ds.add(Double.parseDouble(line));
        }
        br.close();

        // In danh sách
        System.out.println("Danh sach cac so:");
        for (double x : ds) {
            System.out.println(x);
        }

        // Nhap X
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap X: ");
        double X = sc.nextDouble();

        // Kiem tra X
        if (ds.contains(X)) {
            System.out.println("X co trong danh sach");
        } else {
            System.out.println("X khong co trong danh sach");
        }

	}

}
	