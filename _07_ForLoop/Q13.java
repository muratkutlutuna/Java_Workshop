package _07_ForLoop;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere
		 * kullanildigini bulup, yazdirin
		 *
		 * ORNEK:
		 *
		 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
		 *
		 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine(); // 67
		System.out.println("Lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);//String harf = scan.next(); // 67

		kacDefa(cumle, harf);
		scan.close();
	}
	public static void kacDefa(String cumle, char harf) {//String harf
		int sayac = 0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==harf) {//cumle.substring(i,i+1)
				sayac++;
			}

		}
		System.out.println("Girdiginiz cumlede " + harf + " harfi " + sayac + " kere kullanilmis.");
	}
}
