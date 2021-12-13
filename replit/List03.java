package replit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		/*
		 * Get a sentence from the user. Accept the sentence received from the user as a
		 * parameter, Invert sentence using Array and write a Method that returns the
		 * result as a String to the main method.
		 * 
		 * Note: Upper and lower case letters, spaces and special characters will not be
		 * changed.
		 * 
		 * Input :
		 * 
		 * It is very nice to write code.
		 * 
		 * Output :
		 * 
		 * .edoc etirw ot ecin yrev si tI
		 */
		String str = "It is very nice to write code.";
		String arr[] = str.split("");
		List<String>list = Arrays.asList(arr);
		Collections.reverse(list);
		str = "";
		for (String w : list) {
			str+=w;
		}
		System.out.println(str);
		
		

	}

}
