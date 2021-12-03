package day10_selfStudy;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		/*
		 * n’nin asal sayı olup olmadığını 2, 3, 4, 5, 6, ..., n/2 sayıları tam böleni
		 * olup olmadığını kontrol ederek karar verir. Eğer herhangi bir bölen
		 * bulunursa, n’nin asal sayı olmadığına karar verilir. Bunun daha etkili
		 * yöntemi şudur: 2n’ye eşit veya daha küçük olan sayılar içinden tam böleni var
		 * mıdır diye kontrol edilir. Eğer tam böleni yoksa, n asal sayıdır. (2^(2^n))+1
		 * = asal sayi
		 Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int s = scan.nextInt();
		int bolunen = bol(s);
		System.out.println(bolunen);

	}

	

	public static int bol(int s) {
		if(s==0)
			return s;
		int t=2;
		if (s%t==0) 
			return 1;
		else
		return bol(s%t) ;
	*/
	}

}
