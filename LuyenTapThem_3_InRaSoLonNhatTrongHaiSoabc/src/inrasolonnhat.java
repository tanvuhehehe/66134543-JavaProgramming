/*Cho 2 số nguyên a, b và c có sẳn, in ra số lớn nhất ?

Ví dụ

input: 10 20 30

output:30 

input:100 200 500

output:500*/

public class inrasolonnhat {

	public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = a;  // giả sử a là lớn nhất

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("So lon nhat la: " + max);
    }
}

