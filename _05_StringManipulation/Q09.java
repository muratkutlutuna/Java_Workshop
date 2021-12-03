package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		/*
		 * StringMethods: cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak
		 * icin bir Java programi yaziniz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String k = scan.nextLine();
		if (k.length() % 2 == 0) {
			System.out.println("girilen Stringin ilk yarisi : " + k.substring(0, k.length() / 2));
		} else {
			System.out.println("Stringin uzunlugu tektir");
		}

		scan.close();

	}
}
