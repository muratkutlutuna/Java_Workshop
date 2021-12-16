package GuessMovie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessMovieGame {
	/*
	 * 1. Bir tane film isim listesi olusturun 2. Kullanicadan liste uzunlugunda bir
	 * sayi isteyip, o siradaki filmi cagirin.. 3. filmin ismindeki harfleri "-"
	 * olacak sekilde ceviririp kullaniciya gösterin. 4. Kullanicidan bir harf
	 * tahmin etmesini isteyin 5. Bu harfin isimde olup olmadigini kontrol edin. 6.
	 * Girilen harf dogruysa ismin tamaminda bu harfi gösterin. 7. Toplam kac yanlis
	 * harf tahmin edildigini gösterin ve sinir asildiysa kaybettin yazdirin. 8.
	 * Eger hepsi dogru tahmin edildiyse kazandin yazdirin.
	 */

	public static void main(String[] args) {

		List<String> filmListesi = new ArrayList<>();
		filmListesi.add("Titanik");
		filmListesi.add("Yuzuklerin Efendisi");
		filmListesi.add("God Father");
		filmListesi.add("Mucize Doktor");
		filmListesi.add("Cesur yurek");
		filmListesi.add("Zubuk");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 1'den " + filmListesi.size() + "'a kadar bir sayi girin..");
		int sira = scan.nextInt() - 1;
		String filmAdi = filmListesi.get(sira).toLowerCase();
		System.out.println(filmAdi);
		String gizliIsim = filmAdi.replaceAll("\\S", "-");
		System.out.println(gizliIsim);

		List<Integer> indexList = new ArrayList<>();
		int count = 0;
		do {
			System.out.println("Lütfen bir harf tahmin ediniz..");
			char harf = scan.next().toLowerCase().charAt(0);
			String hrf = Character.toString(harf);

			if (!filmAdi.contains(hrf)) {
				count++;
			}

			if (count == 3) {
				System.out.println("Kaybettin!!");
				break;
			}
			System.out.println(count + " kadar hatali girdiniz..\nKalan hakkiniz : " + (3 - count));

			for (int i = 0; i < filmAdi.length(); i++) {
				if (filmAdi.charAt(i) == harf) {
					indexList.add(i);
				}
			}
			for (int i = 0; i < indexList.size(); i++) {
				gizliIsim = gizliIsim.substring(0, indexList.get(i))
						+ filmAdi.substring(indexList.get(i), indexList.get(i) + 1)
						+ gizliIsim.substring(indexList.get(i) + 1);
			}
			System.out.println(gizliIsim);
			if (filmAdi.equalsIgnoreCase(gizliIsim)) {
				System.out.println("Tebrikler... Kazandiniz!!");
			}
		} while (!filmAdi.equalsIgnoreCase(gizliIsim));

//		List<String> filmListesi = new ArrayList<>();
//		filmListesi.add("Titanik");
//		filmListesi.add("Yuzuklerin Efendisi");
//		filmListesi.add("Godfather");
//		filmListesi.add("Mucize Doctor");
//		filmListesi.add("Cesur Yurek");
//		filmListesi.add("Zubuk");
//		Scanner s = new Scanner(System.in);
//	
//		String harf = "";
//		int can = 3;
//		System.out.println("Lutfen 1'den " + filmListesi.size() + "\'a kadar bir sayi girin..");
//		int sira = s.nextInt();
//		String filmAdi = filmListesi.get(--sira);
//		String gizliIsim = filmAdi.replaceAll("[a-zA-Züşğö]", "-");
//
//
//		do {
//
//			
//			System.out.println(filmAdi);
//			System.out.println(gizliIsim);
//			System.out.println("Lutfen bir harf tahmin ediniz");
//			harf = s.next().toLowerCase().substring(0, 1);
//			if (filmAdi.toLowerCase().contains(harf)) {
//				for (int i = 0; i < filmAdi.length(); i++) {
//					if (filmAdi.charAt(i) == harf.charAt(0)) {
//						gizliIsim=gizliIsim.substring(i-1,i)+filmAdi.substring(i,i+1);
//					} else {
//						gizliIsim=gizliIsim.concat("-");
//
//					}
//				}
//				System.out.println("true");
//			}else {
//				can--;
//				System.out.println("bu kadar caniniz kaldi : "+can);
//			}
//		} while (can>0||filmAdi.equalsIgnoreCase(gizliIsim));

	}

}
