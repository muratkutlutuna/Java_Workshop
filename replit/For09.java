package replit;

public class For09 {

	public static void main(String[] args) {
		/*
		 * Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
		 * (Mulakat Sorusu)
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */
		
		int sayi = 123345;
		String sayiStr=""+sayi;
		String yeniSayi="";
		for (int i = 0; i < sayiStr.length(); i++) {
			yeniSayi+=sayi%10;
			sayi/=10;
		}
		System.out.println(yeniSayi);
	}

}
