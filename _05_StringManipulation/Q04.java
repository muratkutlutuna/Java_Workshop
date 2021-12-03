package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
    	Scanner scan = new Scanner(System.in);
		System.out.println("Dort harfli bir kelime giriniz");
		String k = scan.nextLine().trim();
		if (k.length()!=4||k.contains(" ")||!k.equals(k.replaceAll("\\W", ""))||!k.equals(k.replaceAll("\\d", ""))) {
			System.out.println("girdiginiz dort harfli bir kelime degildir");
		}else {
			String a = k.substring(0,1);
			String b = k.substring(1,2);
			String c = k.substring(2,3);
			String d = k.substring(3,4);
			System.out.println(d+c+b+a);
			
		}
    	 	
       scan.close();
    }
}
