package _05_StringManipulation;

public class Q05 {
	public static void main(String[] args) {
		/*
		 * String seklinde verilen asagidaki fiyatlarin toplamini bulunuz. String str 1=
		 * %13.99 String str 2= %10.55 ipucu: Double.parseDouble() methodunu
		 * kullanabilirsiniz.
		 * 
		 */

		String str1 = "%13.99";
		String str2 = "%10.55";
		double d1 = Double.parseDouble(str1.substring(1));
		double d2 = Double.valueOf(str2.substring(1));
		System.out.println("str1+str2=%" + (d1 + d2));

	}
}
