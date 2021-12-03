package day7_selfStudy;

import java.util.Scanner;

public class E04 {
	/*
	 * Get the first name, middle name, lastname, ssn from user then print them like
	 * the following
	 * 
	 * Ali Mert Can 123456789
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first name...");
		String firstName = scan.next().toUpperCase().substring(0);

		System.out.println("Enter your middle Name...");
		String middleName = scan.next().toUpperCase().substring(0);

		System.out.println("Enter your lastName...");
		String lastname = scan.next().toUpperCase().substring(0);

		System.out.println("Enter your SSN...");
		String ssn = scan.next();

		System.out.println(firstName + " " + middleName + " " + lastname);
		System.out.println(ssn);
		
		scan.close();
	}

}
