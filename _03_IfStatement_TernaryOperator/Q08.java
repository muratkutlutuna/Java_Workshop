package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen aldiginiz urunun adedini giriniz");
		int adet = scan.nextInt();
		System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
		double listeFiyati = scan.nextDouble();
		System.out.println("Musteri kartiniz var mi?\nvar\nyok");
		String kart = scan.next();
		
		if (kart=="var") {
			if (adet>10) {
				System.out.println("Urun Fiyati = "+listeFiyati*80/100+"TL");
			} else {
				System.out.println("Urun Fiyati = "+listeFiyati*85/100+"TL");
			}
		}else {
			if (adet>10) {
				System.out.println("Urun Fiyati = "+listeFiyati*85/100+"TL");
			} else {
				System.out.println("Urun Fiyati = "+listeFiyati*90/100+"TL");
			}
		}
		
		scan.close();
	}

}
