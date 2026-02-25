
public class QuyDoiTienTe {

	public static void main(String[] args) {
			int usd = 100;
	        int eur = 100;
	        final int TY_GIA_USD = 23500;
	        final int TY_GIA_EUR = 27000;
	        int vndFromUSD = usd * TY_GIA_USD;
	        int vndFromEUR = eur * TY_GIA_EUR;

	        System.out.println(usd + " USD = " + vndFromUSD + " VND");
	        System.out.println(eur + " EUR = " + vndFromEUR + " VND");
	}

}
