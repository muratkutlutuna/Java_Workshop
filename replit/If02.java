package replit;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String ad = s.next();
		System.out.println("Lutfen soyadinizi giriniz");
		String soyad = s.next();
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		String kKNo = s.next();
		System.out.println("Name: "+ad.substring(0,1).toUpperCase()+ad.substring(1).trim().replaceAll("\\S", "*")+" "+soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\S", "*"));
		System.out.println("CCN : ** ** **** "+kKNo.substring(13));

	}

}
