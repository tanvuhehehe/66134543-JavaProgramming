

	/*Đề Bài: Viết chương trình có sẳn số n, kiểm tra số nhập vào có phải là số chẵn không, nếu là số chẵn in ra màn hình là "So chan", 
	 ngược lại in ra màn hình số lẻ "So le".

	Ví dụ

	input: 21

	ouput: So le

	input: 300

	output: So chan */
public class checklevachan {

	public static void main(String[] args) {
	    	int n = 21;   

	     	if (n % 2 == 0) {
	            System.out.println("So " + n + " la so chan");
	        } else {
	            System.out.println("So " + n + " la so le");
	        }
	}

}
