package replit;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 * 
		 */
		String str = "ade1r4d3";
		sumOfTheDigits(str);
		}

	private static void sumOfTheDigits(String str) {
		int c = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				c=Integer.valueOf(str.substring(i,i+1));
				sum+=c;
			}
		}
		System.out.println(sum);
	}

}
