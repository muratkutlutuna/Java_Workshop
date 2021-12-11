package replit;

public class Array01 {

	public static void main(String[] args) {
		/*
		 * Write a return method to reverse number.
		 * 
		 * Input : 12345
		 * 
		 * Output : 54321
		 */
		
		int s = 12345;
		reverse(s);
		
	}

	private static void reverse(int s) {
		String sStr = ""+s;
		String arr[] = sStr.split("");
		String sayi = "";
		for (int i = arr.length-1; i >= 0; i--) {
	
			sayi+=arr[i];
		}
		System.out.println(sayi);
	}

}
