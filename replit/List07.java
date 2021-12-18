package replit;

import java.util.ArrayList;
import java.util.List;

public class List07 {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array and prints the new array
		 * 
		 * Input :{1,2,3,4,5,6}
		 * 
		 * element:6
		 * 
		 * Output : [1,2,3,4,5]
		 */

		int[] input = { 1, 2, 3, 4, 5, 6 };
		int num = 6;
		List<Integer> list = new ArrayList<>();

		for (int i : input) {
			if (i != num) {
				list.add(i);
			}
		}
		System.out.println(list);

	}

}
