package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen bir cumle girin");
    	String a = scan.nextLine();
    	String b = a.replaceAll("\\s", "");
    	if (a.equals(b)) {
			System.out.println("Verilen Cumle'in boslugu yoktur");
		}else {
			System.out.println("Verilen Cumle'in boslugu vardir");
		}
    	
        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
       
    	System.out.println("Lutfen bir cumle girin");
    	String c = scan.nextLine();
    	if (c.isEmpty()) {
        	System.out.println("Girilen cumle bostur");
		}else {
        	System.out.println("Girilen cumle bos degildir");
		}
    	
    	scan.close();
    	
    }
}

