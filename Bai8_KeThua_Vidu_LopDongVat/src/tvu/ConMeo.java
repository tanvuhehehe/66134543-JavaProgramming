package tvu;

public class ConMeo extends DongVat {
	 private String mauLong;
	 private boolean thichLeoTree;
	    
	 public ConMeo(String ten, int tuoi, double canNang, 
	                  String mauLong, boolean thichLeoTree) {
	 		super(ten, tuoi, canNang);
	        this.mauLong = mauLong;
	        this.thichLeoTree = thichLeoTree;
	    }
	 
	 public void batChuot() {
	        System.out.println(getTen() + " đang rình bắt chuột...");
	    }
	    
	    public void keu() {
	        System.out.println(getTen() + " kêu: Meo meo!");
	    }
	    
	
	    @Override
	    public void an() {
	        System.out.println(getTen() + " đang ăn cá một cách nhẹ nhàng...");
	    }
	    
	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Màu lông: " + mauLong);
	        System.out.println("Thích leo trèo: " + (thichLeoTree ? "Có" : "Không"));
	    }
}
