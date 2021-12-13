package replit;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */
		String name = "John";
		
		System.out.println(Arrays.toString(charArray(name)));	
	}

	private static char[] charArray(String name) {
		char []arr = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			arr[i]=name.charAt(i);
		}
		return arr;
		
	}

}
