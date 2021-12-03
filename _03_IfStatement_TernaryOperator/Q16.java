package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16 {
	/*
	 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
	 * olanlarini konsola yazdiriniz int num1 int num2 int num3
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 sayi giriniz");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int eb,ek;
		eb=s1;
		if (s2>eb) {
			eb=s2;
		}
		if (s3>eb) {
			eb=s3;
		}
		System.out.println("En buyuk sayi : "+eb);
		ek=s1;
		if (s2<ek) {
			ek=s2;
		}
		if (s3<ek) {
			ek=s3;
		}
		ek=s3;
		System.out.println("En kucuk sayi : "+ek);
		
		
		/*

		System.out.println("buyuk sayi : " + 
		(s1>s2 && s1>s3 ? s1 : (s2>s1 && s2>s3 ? s2 : s3)) + 
		"\nKucuk Sayi : " + (s1<s2 && s1<s3 ? s1 : (s2<s1 && s2<s3 ? s2 : s3)));
*/
	}
}
