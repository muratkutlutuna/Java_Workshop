package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		// Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
		// Örn. Ahmet Emin Yılmaz -> A.E.Y. formatıyla yazdırınız.
		//String deneme = "ali veli kirk dokuz";// BSHI=4 v'nin bozisyonu
												// iBSHI=9 k'nin pozisyonu
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc kelimeli isminizi giriniz");
		String iS = scan.nextLine().toLowerCase().replaceAll("\\s+", " ").trim();// isim soyisim
		
		if (iS.lastIndexOf(" ") == iS.replaceFirst(" ", "").indexOf(" ")+1) {
			int bSHI = iS.indexOf(" ") + 1;// bosluktan sonraki harfin indexi
			int iBSHI = iS.indexOf(" ", bSHI) + 1;// ikinci bosluktan sonraki harfin indexi
			String kh1 = iS.substring(0, 1).toUpperCase();// birinci Kelimenin Harfi (Buyuk) A
			String kh2 = iS.substring(bSHI, bSHI + 1).toUpperCase();// ikinci kelimenin Harfi (Buyuk) V
			String kh3 = iS.substring(iBSHI, iBSHI + 1).toUpperCase();// ucuncu kelimenin Harfi (Buyuk) K
			System.out.println(kh1 + iS.substring(1, bSHI) + kh2 + iS.substring(bSHI + 1, iBSHI) + kh3
					+ iS.substring(iBSHI + 1) + " -> " + kh1 + "." + kh2 + "." + kh3 + ".");
		} else {
			System.out.println("Lutfen sadece uc kelime giriniz");

		}
		scan.close();
	}
}
