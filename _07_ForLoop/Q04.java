package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// Kullanıcıdan 5 adet sayı isteyiniz
		// Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
		// bu soruyu continue kullanarak çözünüz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 5 adet sayi giriniz");

		int toplam = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("sayi " + i + " giriniz : ");
			int s = scan.nextInt();
			if (s > 5 && s < 10) {
				System.out.println("girilen sayi 5 ile 10 arasi isleme alinmadi");
				continue;
			}
			toplam += s;

		}
		System.out.println("sayilarin toplami = " + toplam);

		scan.close();
	}

}
