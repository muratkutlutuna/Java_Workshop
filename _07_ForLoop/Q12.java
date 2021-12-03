package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {

		/*
		 * Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin ve 1'den girilen tam
		 * sayıya kadar olan sayıların karelerinin toplamını hesaplayan kodu yazınız.
		 * 
		 * Örnek Ekran Çıktısı Girilen sayı=4 Kareler toplamı=30
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1'den buyuk bir tamsayi giriniz");
		int sayi = scan.nextInt(); // 67

		int kareleriToplami = 0;
		for (int i = 1; i <= sayi; i++) {
			kareleriToplami += i * i;
		}
		System.out.println("Girilen Sayi: " + sayi + "\nKareler Toplami: " + kareleriToplami);
		scan.close();
	}
}
