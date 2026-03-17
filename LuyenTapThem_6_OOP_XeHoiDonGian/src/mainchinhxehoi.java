
public class mainchinhxehoi {

	public static void main(String[] args) {
	       xehoi xe1 = new xehoi();
	        xe1.hangXe = "Toyota";
	        xe1.mauSac = "Do";
	        xe1.tocDoHienTai = 50;
	        
	        xehoi xe2 = new xehoi();
	        xe2.hangXe = "Honda";
	        xe2.mauSac = "Trang";
	        xe2.tocDoHienTai = 0;
	        
	        System.out.println(" THONG TIN XE 1 ");
	        xe1.hienThiThongTin();
	        xe1.tangToc(30);
	        
	        System.out.println("\n THONG TIN XE 2 ");
	        xe2.hienThiThongTin();
	        xe2.tangToc(60);
	        xe2.phanh();
	        xe1.phanh();

	}

}
