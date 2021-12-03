package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.
		Scanner scan = new Scanner(System.in);

		System.out.println("Cevrilecek birimi giriniz : ");
		String birim = scan.next();

		System.out.println("Cevrilecek birimin degerini giriniz : ");
		double miktar = scan.nextDouble();

		cevirCan(birim, miktar);
		scan.close();
	}

	public static void cevirCan(String birim, double miktar) {

		switch (birim) {
		case "saat":
			System.out.println("girilen saatin saniye degeri : " + miktar * 60 * 60);
			break;
		case "mil":
			System.out.println("girilen milin kilometre degeri : " + miktar * 1.6);
			break;
		case "kg":
			System.out.println("girilen kg'nin gram degeri : " + miktar * 1000);

		default:
			System.out.println("bu saatte kafalar 1500 anca bu deger girilir");
			break;
		}

	}
}
