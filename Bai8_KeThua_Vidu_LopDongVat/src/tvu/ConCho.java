package tvu;

public class ConCho extends DongVat{
	private String giongCho;
	private boolean coTheTrongNha;
	
	//constructor 
	public ConCho(String ten, int tuoi, double canNang, 
			String giongCho, boolean coTheTrongNha) {
		super(ten, tuoi, canNang);
		this.giongCho = giongCho;
		this.coTheTrongNha = coTheTrongNha;
	}
    public void sua() {
        System.out.println(getTen() + " dang sua: Gau Gau !");
    }
    public void duoiMeo() {
        System.out.println(getTen() + " dang duoi Meo");
    }
    //phuong thuc
    @Override
    public void hienThiThongTin() {
    		super.hienThiThongTin();
    		System.out.println("Giong Cho: " + giongCho);
    		System.out.println("Co the trong nha: " + (coTheTrongNha ? "Co" : "khong"));
    }
}
