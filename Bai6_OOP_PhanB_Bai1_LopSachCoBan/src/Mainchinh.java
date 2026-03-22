
public class Mainchinh {

	public static void main(String[] args) {
		
		// doi tuong 1	
		hamsach sach1 = new hamsach();
		sach1.tieuDe = "He Quan Tri Co So Du Lieu";
		sach1.tacGia = "Pham Thi Thu Thuy";
		sach1.Gia = 68000;
		sach1.soTrang = 300;
		sach1.hienThiThongTin();
		
		
		System.out.println("\n\n\n");
		// doi tuong 2
		hamsach sach2 = new hamsach();
		sach2.tieuDe = "Thiet Ke Web";
		sach2.tacGia = "Nguyen Dinh Hoang Son";
		sach2.Gia = 300000;
		sach2.soTrang = 400;
		sach2.hienThiThongTin();
		
		
		
		System.out.println("\n\n\n");
		// doi tuong 3
		hamsach sach3= new hamsach();
		sach3.tieuDe = "Lap Trinh Java";
		sach3.tacGia = "Mai Cuong Tho";
		sach3.Gia = 0;
		sach3.soTrang = 234;
		sach3.hienThiThongTin();

	}

}
