package replit;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = s.next();
		System.out.println("Litfen bir karakter giriniz");
		char ch = s.next().charAt(0);
		int sayac = 0;
		for (int i = 0; i < isim.length(); i++) {
			if (ch==isim.charAt(i)) {
				sayac++;
			}
		}
		System.out.println("Number of "+ch+" = "+sayac);
		

	}

}
