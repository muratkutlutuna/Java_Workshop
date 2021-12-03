package day7_selfStudy;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		/*
		 * "If it rains, I will cancel the picnic" in English
		 * "If(it rains){I will cancel the picnic}" in Java
		Note: The code to check if a number is even or not ==>number%2==0
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer...");
		int num = scan.nextInt();
		
		//1.Example: Get a number from user. If the number is even, print "Even" on the console.
		if(num%2==0) {
			System.out.println("Even");
		}
		
		//2.Example: Get a number from user. If the number is odd, print "Even" on the console.
		if(num%2!=0) {
			System.out.println("odd");
		}
		
		
		
		
		scan.close();
		
		
	}

}
