package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		 * hatali giris seklinde kod yazniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		String harf = scan.next();
		if (harf.length() > 1) {
			System.out.println("Lutfen sadece bir karakter giriniz");
		} else {

			if (harf.charAt(0) >= 'A' && harf.charAt(0) <= 'Z') {
				System.out.println("Buyuk Harf");
			} else if (harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z') {
				System.out.println("Kucuk Harf");
			} else {
				System.out.println("Lutfen harf giriniz");
			}
		}

		scan.close();
	}

}
