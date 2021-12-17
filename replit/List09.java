package replit;

import java.util.ArrayList;
import java.util.List;

public class List09 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 * 
		 * Input : Learning java is easy
		 * 
		 * Output: maximum occurring character is : a
		 */
		String input = "Learning java is easy";
		List<String>harf = new ArrayList<>();
		List<Integer>harfSayisi = new ArrayList<>();
		int counter = 0;
		int max = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				if (input.substring(i,i+1).equalsIgnoreCase(input.substring(j,j+1))&&input.substring(i,i+1)////////////////////////) {
					counter++;
				}
			}
			if (counter>max) {
				max=counter;
			}
			harf.add(input.substring(i,i+1));
		}
		System.out.println("maximum occurring character is : "+harf);
		
		
		
	}

}
