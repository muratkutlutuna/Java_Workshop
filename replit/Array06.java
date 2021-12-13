package replit;

public class Array06 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * 
		 * Input : {3,2,5,4,1,6}
		 * 
		 * Output :
		 * 
		 * min: 1
		 * 
		 * max: 6
		 */
		int input[] = {3,2,5,4,1,6};
		maxMin(input);
		}

	private static void maxMin(int[] input) {
		int max = 0;
		int min = input[0];
		for (int w : input) {
			if (w>max) {
				max=w;
			}
			if (w<min) {
				min=w;
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		
		
	}

}
