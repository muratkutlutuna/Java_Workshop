package replit;

public class Array02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters).
		 * 
		 * Input : Coding is greate.
		 * 
		 * Output : .etaerg si gnidoC
		 */
		String str = "Coding is greate.";
		reverse(str);
		
		
		
	}

	private static void reverse(String str) {
		String arr[] = str.split("");
		String rvrsStr = "";
		for (int i = arr.length-1; i > 0; i--) {
			rvrsStr+=arr[i];
		}
		System.out.println(rvrsStr);
	}

}
