package Team;

public class C02 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		String str2 = str1;
		String str3 = new String(str1);
		String str4 = sb1.toString();
		String str5 = "Duke";
		System.out.println("str1; == "+(str1==str2));
		System.out.println("str1; equals "+str1.equals(str2));
		System.out.println("new String(str1); == "+(str1==str3));
		System.out.println("new String(str1); equals "+str1.equals(str3));
		System.out.println("sb1.toString(); == "+(str1==str4));
		System.out.println("sb1.toString(); equals "+str1.equals(str4));
		System.out.println("\"Duke\"; == "+(str1==str5));
		System.out.println("\"Duke\"; equals "+str1.equals(str5));
	}

}
