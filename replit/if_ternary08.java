package replit;

import java.util.Scanner;

public class if_ternary08 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
		 * oluşan yeni bir String yazdırın
		 * 
		 * Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */
		Scanner s=new Scanner (System.in);
		System.out.println("Lutfen bir string giriniz");
		String str = s.next();
		String yeniStr = str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
		System.out.println(yeniStr);
		
	}

}
