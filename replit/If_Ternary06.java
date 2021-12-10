package replit;

import java.util.Scanner;

public class If_Ternary06 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından,
		 * adın aynı karakterlere sahip olup olmadığını kontrol edin.
		 * 
		 * Eger aynı karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni kaakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */
		Scanner s=new Scanner (System.in);
		System.out.println("Lutfen 3 karakterli bir string giriniz");
		String str = s.next();
		String result= str.substring(0,1).equalsIgnoreCase(str.substring(1,2))||str.substring(1,2).equalsIgnoreCase(str.substring(2))||str.substring(0,1).equalsIgnoreCase(str.substring(2))?"isim ayni karakterlere sahiptir":"Dizenin benzersiz karakterleri var";
		
		System.out.println(result);
	s.close();	
	}

}
