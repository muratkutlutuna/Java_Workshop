package replit;

public class Array07 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array Then print the result in the main method.
		 * 
		 * Eg :
		 * 
		 * input : {1,2,3,4,5,6,7,8};
		 * 
		 * output: 36
		 */
		int []input = {1,2,3,4,5,6,7,8};
		sumOf(input);
		

	}

	private static void sumOf(int[] input) {
		int sum = 0;
		for (int w : input) {
			sum+=w;
		}
		System.out.println(sum);
	}

}
