package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : 
		// output : merve

		System.out.println(concat("m", "e", "r", "v", "e"));
	}

	private static String concat(String...i) {
		String str = "";
		for (String w : i) {
			str=str.concat(w);
		}
		return str;
		
	}

}
