package day7_selfStudy;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		
		 /*
		  * Get 2 numbers from user then swap the numbers
		  * user ==> a=2 and b=5 the a=5 and b=2
		  */
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first integer...");
		int first = scan.nextInt();
		
		System.out.println("Enter the second integer...");
		int second = scan.nextInt();
		
		//1.Way: by using 3rd container...
		//int temporary = 0;
		//temporary = first;
		//first = second;
		//second = temporary;
		//System.out.println("After swap: "+first+" - "+second);
		
		//2.Way: Without using 3rd container...
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("After swap: "+first+" - "+second);
		
		scan.close();
		
		
	}

}
