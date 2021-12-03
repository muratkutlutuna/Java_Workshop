package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye
		// ayırınız,
		// ad ayrı soyad ayrı sekilde ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi ve soy isminizi te satirda giriniz");
		String iS = scan.nextLine();// isim soyisim
		int bI = iS.trim().lastIndexOf(" ");// boslugun indexi
		System.out.println("Isim = " + iS.substring(0, bI) + "\nSoyisim = " + iS.substring(bI + 1));

		scan.close();

	}
}
