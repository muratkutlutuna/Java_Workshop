package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
	/*
	 * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
	 * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
	 * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
	 * harfi büyük yada küçüklüğüne duyarlıdır.)
	 * 
	 * Sesli harfler: a,e,i,o,u
	 * 
	 * Test Data: a
	 * 
	 * Beklenen Çıktı: a harfi sesli harfdir.
	 * 
	 * Test Data: d
	 * 
	 * Beklenen Çıktı: d harfi sesiz harftir.
	 * 
	 * Test Data: we yada %
	 * 
	 * Beklenen Çıktı: Yanlis karakter girdiniz!
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen harf giriniz");
		String harf = scan.next(); // e
		String harfler = "bcdfghijklmnopqrstzyxwAEIOU";// sesli ve sessiz olma durumunu tek havuzda kontrol etmek icin
		boolean sessizFlag = false; // seslileri buyuk yaptim, bu havuzu ayni zamanda dogru karakter
		boolean sesliFlag = false;// girip girmedigini ogrenmek icin kullanacagim
		

		if (harf.length() != 1) {
			System.out.println("Lutfen sadece bir karakter giriniz");// once en kotu ihtimali test ediyoruz
		} else {
			for (int i = 0; i <= harfler.length() - 1; i++) {// loop'umuz burda sadece harfleri teker teker sinamak icin

				if (harf.toUpperCase().contains(harfler.substring(i, i + 1))) {
					sesliFlag = true;
				}

				if (harf.toLowerCase().contains(harfler.substring(i, i + 1))) {
					sessizFlag = true;
				}
			}

			// basta asagidaki if'lerin hepsini ayri ayri basit ifle yaptim sonra deneyerek
			// hepsini birlestirdim
			
			if (sessizFlag) {
				System.out.println("Sessiz harf vardir");
				if (sesliFlag) {
					System.out.println("Sesli harf vardir");
				} else {
					System.out.println("Sesli harf yoktur");
				}
			} else {		
				if (sesliFlag) {
					System.out.println("Sesli harf vardir");
					System.out.println("Sessiz harf yoktur");
				} else {
					System.out.println("yanlis karakter girdiniz");
				}
			}	
		}
		scan.close();
	}
}
