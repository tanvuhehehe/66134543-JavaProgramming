package tvu;

public class runMain {

	public static void main(String[] args) {
		
		//2a. Tao moi 2 HS in ra man hinh
		//hs1: constructor rong
		HOCSINH hs1 = new HOCSINH();
		hs1.setTenHS("Mai Len Bang");
		hs1.setTuoiHS(19.5);
		hs1.setLopHS("Love1A");
		System.out.println(hs1.toString());
		//hs2: constructor co tham so
		HOCSINH hs2 = new HOCSINH("Mai Len Bang 2", 19.6, "Love2A");
		System.out.println(hs2.toString());
	}

}
