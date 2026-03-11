public class chuongtrinhchinh {

    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien();
        sv1.ten = "Huynh Tan Vu";
        sv1.tuoi = 21;
        sv1.mssv = "66134543";

        SinhVien sv2 = new SinhVien();
        sv2.ten = "J97";
        sv2.tuoi = 3;
        sv2.mssv = "5000000";

        sv1.HocBai("Toan 2");
        sv2.HocBai("Mon Sinh Hoc");

    }

}