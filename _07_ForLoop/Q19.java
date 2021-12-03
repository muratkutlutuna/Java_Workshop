package _07_ForLoop;

public class Q19 {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * * 
               şeklini konsola yazdiriniz.
     */

    public static void main(String[] args) {
    	    	
    	for (int i = 5; i >=1; i--) {
    		for (int j = i-2; j>=0; j--) {
    			System.out.print(" ");
    		}
    		for (int k = i; k<=5; k++) {
        		System.out.print("* ");
			}
    		
    		System.out.println();
		}
    	System.out.println();
    	
    	for (int i =1; i<=5; i++) {
            for(int j =i; j<=4; j++) {
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++) {
                System.out.print("* ");
            }
             System.out.println();
         }
    }
}

