package tvu;

public class MainDongVat {

	public static void main(String[] args) {
		ConCho cho1 = new ConCho("Lucky", 3, 15.5, "Husky", true);
        System.out.println("THÔNG TIN CHÓ:");
        cho1.hienThiThongTin();
        cho1.an();  // Kế thừa từ DongVat
        cho1.sua();  // Phương thức riêng
        cho1.duoiMeo();

        System.out.println();
        
     // Tạo đối tượng Mèo
        ConMeo meo1 = new ConMeo("Mimi", 2, 4.2, "Tam thể", true);
        System.out.println("THÔNG TIN MÈO:");
        meo1.hienThiThongTin();
        meo1.an();  // Phương thức đã ghi đè
        meo1.ngu();  // Kế thừa từ DongVat
        meo1.keu();
        meo1.batChuot();
        
        System.out.println();
        
        
	}

}
