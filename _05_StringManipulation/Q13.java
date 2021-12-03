package _05_StringManipulation;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {

		// Klavyeden okuma yapmak i�in Scanner nesnesini olu�tur.
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Sayi Girin: ");
		String yazi = scan.nextLine();
		String cevrilen = cevir(yazi);
		System.out.println("Cevrilen yazi: " + cevrilen);
		System.out.println();
		// System.out.println(yazi.charAt(0));
		// System.out.println(yazi.substring(1));
		// System.out.println(cevir(yazi.substring(1)) + yazi.charAt(0));
		// "ISO-8859-9"

		// System.out.println("frontBack metodu ile"); String
		// cevrilen2=KendimDenemeCevir(yazi); System.out.println(cevrilen2);
		// basarisiz bi deneme 4 harflide sonu ikinciyi ucuncuyu e birinciyi aliyor
		// sirasiyle 4 3 2 1 degil 4 2 3 1 gidiyor
		scan.close();
	}

	public static String cevir(String yazi) {
        if (yazi.isEmpty())
        return yazi;
        //System.out.println(yazi); 
        //String flag="i";
        //System.out.println(flag);
        return cevir(yazi.substring(1)) + yazi.charAt(0);
        
    }
}
