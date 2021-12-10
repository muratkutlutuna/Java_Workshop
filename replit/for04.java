package replit;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		/*
		 * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */
		Scanner s =new Scanner(System.in);
		int sayi = s.nextInt();
		int f = 1;
		String str = "";
		for (int i = sayi; i > 0; i--) {
			f*=i;
			str+=i+"*";
		}
		str=str.substring(0,str.length()-1);
		System.out.println(sayi+"!="+str+"="+f);
	}

}
