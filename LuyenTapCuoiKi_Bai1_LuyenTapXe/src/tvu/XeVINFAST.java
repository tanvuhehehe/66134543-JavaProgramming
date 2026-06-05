package tvu;

import java.time.LocalDate;
import java.util.Scanner;

public class XeVINFAST extends Xe  {

    private String noiDangKy;

    // constructor không tham số
    public XeVINFAST() {

    }

    // constructor có tham số
    public XeVINFAST(String dongXe, int soChoNgoi, LocalDate ngaySanXuat, int giaSan, String noiDangKy) {
    	super(dongXe, soChoNgoi, ngaySanXuat, giaSan);
        this.noiDangKy = noiDangKy;
    }

    // nhập
    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);

;

        System.out.print("Nhap noi dang ky: ");
        noiDangKy = sc.nextLine();
    }


    // tính giá lăn bánh
    public double tinhGiaLanBanh() {

        double phiDangKy;

        if (noiDangKy.equalsIgnoreCase("Ha Noi")) {
            phiDangKy = tinhGiaBan() * 0.12;
        } else {
            phiDangKy = tinhGiaBan() * 0.10;
        }

        return tinhGiaBan()
                + phiDangKy;
    }



    public String getNoiDangKy() {
        return noiDangKy;
    }

    public void setNoiDangKy(String noiDangKy) {
        this.noiDangKy = noiDangKy;
    }

    @Override
    public String toString() {
        return super.toString() + ", noiDangKy=" + noiDangKy + ", giaLanBanh=" + tinhGiaLanBanh();
    }
}