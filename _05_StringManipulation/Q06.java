package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email adresi giriniz");
		String m = scan.nextLine();
		if (m.contains("hotmail")) {
			System.out.println(m.substring(0, m.lastIndexOf("hotmail")).concat(m.substring(m.lastIndexOf("hotmail")).replace("hotmail", "gmail")));
		}
     scan.close();  
    }
}
