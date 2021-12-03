package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen bir sayi giriniz");
    	int sayi = scan.nextInt();
    	
    	for (int i = sayi; i >0 ; i--) {
			for (int k = 0 ; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = sayi; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
    	
    	for (int i = sayi; i > 0; i--) {
            //for (int j = 0; j <= i; j++) {// bu loop'u yoruma alinca diger sekil olusuyor
            //  System.out.print(" ");
        //  }
            for (int k = sayi; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    	
       for (int i = 0; i < sayi; i++) {
           for (int j = sayi; j >= i; j--) {
               System.out.print(" ");
           }
           for (int k = 0; k <= i; k++) {
               System.out.print("*");
           }
           System.out.println();
       }   
       scan.close();
    	
    	


 
         /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */

        
        
    }
}
