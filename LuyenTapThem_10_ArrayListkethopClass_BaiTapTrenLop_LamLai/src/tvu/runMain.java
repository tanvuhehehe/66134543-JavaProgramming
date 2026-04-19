package tvu;

public class runMain {

	public static void main(String[] args) {
		//2a. Tao moi 2 HS in ra man hinh
		HOCSINH hs1 = new HOCSINH();
		hs1.setTenHS("Mai Len Bang");
		hs1.setTuoiHS(19.5);
		hs1.setLopHS("Lop You");
		System.out.println(hs1.toString());
	}

}
