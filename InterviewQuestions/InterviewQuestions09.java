package InterviewQuestions;

import java.util.Scanner;

public class InterviewQuestions09 {

	public static void main(String[] args) {
		/*
		 * Ask user enter a positive number and check if it is prime or not
		 * 
		 * Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
		 * kontrol edin
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = s.nextInt();
		boolean dividable = true;

		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				dividable = false;
				break;
			}
		}
		if (dividable) 
			System.out.println("it is prime");
		else System.out.println("it is not prime");
		s.close();
	}

}
