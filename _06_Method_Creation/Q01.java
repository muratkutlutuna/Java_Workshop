package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		/*
		 * StringMethods String girildiginde ilk iki karakteri haric string return eden
		 * java programi yaziniz Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu
		 * karakterler de return edilsin 
		 * ORNEK: INPUT : goat 
		 * 					photo 
		 * 					ghost 
		 * 					kalem 
		 * OUTPUT :
		 * 				gat 
		 * 				hoto 
		 * 				ghost 
		 * 				lem
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str = scan.next();
		System.out.println(ilkIkiHaric(str));
		scan.close();
	}

	public static String ilkIkiHaric(String str) {

		if (str.toLowerCase().charAt(0) == 'g' && str.toLowerCase().charAt(1) == 'h') {
			return str;
		} else if (str.toLowerCase().charAt(0) == 'g') {
			return str.substring(0, 1) + str.substring(2);
		} else if (str.toLowerCase().charAt(1) == 'h') {
			return str.substring(1);
		} else {
			return str.substring(2);
		}

	}
}
