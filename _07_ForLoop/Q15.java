package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {
      int harf = 65;
      for (int baba = 0; baba < 6; baba++) {
		for (int evlat = 0; evlat <= baba ; evlat++) {
			System.out.print((char)(harf+evlat)+" ");
		}
		System.out.println();
	}
      
      
      System.out.println();
      
      
      
      for (int i = 'A'; i <= 'F' ; i++) {
		for (int j = 'A'; j <= i; j++) {
			System.out.print((char)j+" ");
			
		}
		System.out.println();
	}
        
    }
}
