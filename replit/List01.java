package replit;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string. (Ignore case sensitivity)
		 * 
		 * input :
		 * 
		 * Learning java is easy
		 * 
		 * output:
		 * 
		 * maximum occurring character is : a
		 */
		
		String str = "Learning java is easy";
		List<String> ch = new ArrayList<>();
		List<Integer> counter = new ArrayList<>();
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if(ch.contains(str.substring(i,i+1)))
				continue;
			else ch.add(str.substring(i,i+1));
		}
		for (int i = 0; i < ch.size(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(ch.get(i).equals(str.substring(j,j+1))) {
					c++;
				}
			}
			counter.add(c);
			c=0;
		}

		int max = 0;
		for (Integer w : counter) {
			if (w>max) {
				max=w;
			}
		}
		System.out.println("maximum occurring character is : "+ch.get(counter.indexOf(max)) );
		
		

	}

}
