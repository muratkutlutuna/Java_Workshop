package _07_ForLoop;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// 1 x 1 = 1
		// 1 x 2 = 2
		// 1 x 3 = 3
		// 1 x 4 = 4
		// 1 x 5 = 5
		// 1 x 6 = 6
		// 1 x 7 = 7
		// 1 x 8 = 8
		// 1 x 9 = 9
		// 1 x 10 = 10
		// Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		int num = scan.nextInt();
		addDigits(num);

		scan.close();
	}

	private static int addDigits(int num) {
		nasil("agam kolay gelsin method run oluyor");

		for (int i = 0; i < 5; i++) {
			num = sum(num);

			if (num < 10) {
				break;
			}
		}
		return num;

	}

	private static int sum(int num) {
		int toplam = 0;
		int rakam = 0;

		while (num > 0) {
			rakam = num % 10;
			toplam += rakam;
			num /= 10;
		}
		System.out.println("girdiginiz sayinin rakamlari toplami : " + toplam);

		return toplam;
	}

	private static void nasil(String mesaj) {
		System.out.println("nasil methodu calisti : " + mesaj);

		gozunAydin("helal olsun bu method calisti ise devamkee");
	}

	private static void gozunAydin(String goygoy) {
		System.out.println("gozun aydin calisti " + goygoy);
	}
}
