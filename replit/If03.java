package replit;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute and print sum of two given numbers (more than
		 * or equal to zero).
		 * 
		 * If given integers or the sum have more than 10 digits, print "overflow".
		 * 
		 * EXAMPLE:
		 * 
		 * INPUT : Input two integers:
		 * 
		 * 25
		 * 
		 * 46
		 * 
		 * OUTPUT :
		 * 
		 * Sum of the numbers: 71
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Input two integers:");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		if (num1+num2>1000000000) {
			System.out.println("overflow");
		}else {
			System.out.println("Sum of the numbers: "+(num1=num2));
			
		}
		s.close();

	}

}
