
public class MainChinh {

	public static void main(String[] args) {
		LopMayTinh mt1 = new LopMayTinh();
		mt1.hang = "Gaming";
		mt1.ram = 128;
		mt1.oCung = 512;
		mt1.gia = 20000000;
		
		mt1.kimTraCauHinh();
		
		if(mt1.coTheChoiGame()) {
			System.out.println("\n\n\nChoi game duoc");
		}else {
			System.out.println("\n\n\nKhong choi game duoc");
		}
		
		System.out.printf("\n\n\nThue may tinh cua ban:  %f",mt1.tinhThue());
	}

}
