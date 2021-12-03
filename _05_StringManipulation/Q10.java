package _05_StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */
		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
    	Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String is = scan.nextLine();//isim
		System.out.println("Lutfen soyisminizi giriniz");
		String sIs = scan.nextLine();//Soyisim
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		String kkNo = scan.nextLine();//Kredi karti numarasi
		
		String FIs = is.toUpperCase().charAt(0)+is.substring(1).replaceAll("\\w", "*");//Formatli isim
		String FsIs = sIs.toUpperCase().charAt(0)+sIs.substring(1).replaceAll("\\w", "*");//Formatli soyisim
		String FkkNo = kkNo.substring(0,12).replaceAll("\\w", "*")+kkNo.substring(12);//Formatli kredi karti no
		
		if (kkNo.length()!=16) {
			System.out.println("Geçersiz kredi kartı numarası");
		}else {
			System.out.println("Ad : "+FIs+"\nSoyad : "+FsIs+"\nKartNo : "+FkkNo);	
		}
		scan.close();
    }
}
