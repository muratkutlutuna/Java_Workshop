package _05_StringManipulation;

public class Q11 {
	public static void main(String[] args) {
		/*
		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz. String
		 * pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String a = pickName.substring(0, 1);
		char b = pickName.charAt(pickName.indexOf("L"));
		String c = Character.toString(pickName.charAt(pickName.indexOf("I"))).toLowerCase();

		System.out.println(a + " " + b + " " + c);
		
		char d = pickName.charAt(pickName.indexOf("A"));
		char e = pickName.charAt(pickName.indexOf("L"));
		char f = pickName.toLowerCase().charAt(pickName.toLowerCase().indexOf("i"));

		System.out.println(d + " " + e + " " + f);
	}

}
