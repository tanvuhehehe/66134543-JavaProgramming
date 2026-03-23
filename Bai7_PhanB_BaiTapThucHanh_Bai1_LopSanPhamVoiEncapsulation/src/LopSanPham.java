
public class LopSanPham {
	// 1. private: maSP, tenSP, gia, soLuong
		private String maSP;
		private String tenSP;
		private double gia;
		private int soLuong;
		
	// 2. 2 constructor: mặc định và có tham số
		public LopSanPham () {
			this.maSP = "1111";
			this.tenSP = "Chua co ten nha !";
			this.gia = 0;
			this.soLuong = 0;
		}
	// consstructor co tham so
		public LopSanPham ( String maSP, String tenSP, double  gia, int soLuong) {
			this.setmaSP(maSP);
			this.settenSP(tenSP);
			this.setgia(gia);
			this.setsoLuong(soLuong);
		}
	// 3. hàm lấy sản phẩm của private
		public String getmaSP(){
			return maSP;
		}
		public String gettenSP(){
			return tenSP;
		}
		public double getgia(){
			return gia;
		}
		public int getsoLuong(){
			return soLuong;
		}
		
	// setter	
		public void	setmaSP(String maSP) {
			if(maSP != null) {
				this.maSP = maSP;
			}else {
				System.out.println("Ma san pham ko duoc bo trong!");
			}
		}
		
		public void settenSP(String tenSP) {
			if(tenSP != null) {
				this.tenSP = tenSP;
			}else {
				System.out.println("Ma san pham ko duoc bo trong!");
			}
		}
		
		public void setgia(double gia) {
			if(gia > 0) {
				this.gia = gia;
			}else {
				System.out.println("Gia phai lon hon khong. Vui long nhap lai !");
			}
		}
		
		public void setsoLuong(int soLuong) {
			if(soLuong >= 0) {
				this.soLuong = soLuong;
			}else {
				System.out.println("So luong phai >= 0");
				this.soLuong = 0;
			}
		}
		
		// tinhThanhTien soluong * gia
		public double tinhThanhTien() {
			return gia * soLuong;
		}
		
		
		// hien thi thong tin phuong thuc
		
	    public void hienThiThongTin() {
	        System.out.println("---Thong Tin San Pham---");
	        System.out.println("Ma SP: " + maSP);
	        System.out.println("Ten SP: " + tenSP);
	        System.out.println("Gia: " + gia);
	        System.out.println("So Luong: " + soLuong);
	        System.out.println("Thanh Tien: " + tinhThanhTien());
	    }
}























