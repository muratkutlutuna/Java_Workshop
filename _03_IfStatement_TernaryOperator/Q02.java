package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
	 */
		Scanner scan=new Scanner(System.in);

		System.out.println("Lutfen 3 tane pozitif tamsayi giriniz");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		/*if nested
		if (a<=0||b<=0||c<=0 ) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}else if ( (a+b>c && c>a-b) || (a+c>b && b>a-c) || (b+c>a && a>b-c)) {
			
			if (a==b&&b==c) {
				System.out.println("bu sayilardan eskenar ucgen olusturulabilir");
			}else {
				System.out.println("bu sayilardan ucgen olusturulabilir");
			}
			
		}else {
			System.out.println("bu sayilardan ucgen olusturulamaz");
		}
		*/
		
		
		/*normal if else
		if (a<=0||b<=0||c<=0 ) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		}else if (a==b&&b==c) {
			System.out.println("bu sayilardan eskenar ucgen olusturulabilir");
		}else if ( (a+b>c && c>a-b) || (a+c>b && b>a-c) || (b+c>a && a>b-c)) {
			System.out.println("bu sayilardan ucgen olusturulabilir");
		}else {
			System.out.println("bu sayilardan ucgen olusturulamaz");
		}
		*/
		
		/*
		//String Ternary
		String ucgenMi = (a+b>c && c>a-b) || (a+c>b && b>a-c) || (b+c>a && a>b-c) ? "bu sayilardan ucgen olusturulabilir" : "bu sayilardan ucgen olusturulamaz";
		String eskenarMi = a==b&&b==c ? "bu sayilardan eskenar ucgen olusturulabilir" : ucgenMi;
		String tamSayiMi = a>0||b>0||c>0 ? eskenarMi : "Lutfen pozitif bir tamsayi giriniz";
		
		System.out.println(tamSayiMi); 
		*/
		
		//Ternary nested syso
		System.out.println(a>0||b>0||c>0 ? (a==b&&b==c ? "bu sayilardan eskenar ucgen olusturulabilir" : ((a+b>c && c>a-b) || (a+c>b && b>a-c) || (b+c>a && a>b-c) ? "bu sayilardan ucgen olusturulabilir" : "bu sayilardan ucgen olusturulamaz")) : "Lutfen pozitif bir tamsayi giriniz");

				
		scan.close();
	}

}
