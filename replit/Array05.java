package replit;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * Write a java program that calculates the average value of array elements
		 * 
		 * input[]= {1,2,3,4,5,6,7}
		 * 
		 * Output : 4
		 */
		int input[]= {1,2,3,4,5,6,7};
		int c = 0;
		for (int w : input) {
			c+=w;
		}
		c/=input.length;
		System.out.println(c);
		

	}

}
