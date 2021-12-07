package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		ilkiniDigerlerininToplaminaCarp(1, 20000, 3000, 900, 40, 6);
	}

	private static void ilkiniDigerlerininToplaminaCarp(int i, int... j) {
		int sayi = 0;
		for (int k : j) {
			sayi += k;
		}
		sayi *= i;
		System.out.println(sayi);

	}

}
