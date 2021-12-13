package replit;

import java.util.ArrayList;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */
		List<Integer> list = new ArrayList<Integer>();
		int input = 5;
		boolean dividable = true;
		int counter = 0;
		for (int i = input + 1; counter < 10; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0 || list.contains(i)) {
					dividable = false;
					break;
				} 
			}

			if (dividable) {
				list.add(i);
				counter++;
			}
			dividable = true;

		}
		System.out.println(list);

	}

}
