package day7_selfStudy;

import java.util.Scanner;

public class Exercises_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hey user, enter length, width and heigth of the rectangular prism...");
		
		double length = scan.nextDouble();
		
		double width = scan.nextDouble();
		
		double heigth = scan.nextDouble();
		
		System.out.println("The volume is "+length*width*heigth);
		
		scan.close();
	}

}
