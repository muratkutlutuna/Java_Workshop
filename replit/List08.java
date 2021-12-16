package replit;

import java.util.ArrayList;
import java.util.List;

public class List08 {

	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity).Use StringBuilder.
		 * 
		 * Input :
		 * 
		 * I love Java.
		 * 
		 * Output:
		 * 
		 * Reversed sentence : avaJ evol I. It is not a palindrome"
		 */
		List<String> list = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("I love Java.");
		StringBuilder sb2 =new StringBuilder(sb1.subSequence(0, sb1.length()));
		sb1.reverse();
		if (sb1.compareTo(sb2)==0)
			System.out.println(sb1+" It is a palindrome");
		else System.out.println(sb1+" It is not a palindrome");
		
		

	}

}
