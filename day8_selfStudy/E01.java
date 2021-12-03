package day8_selfStudy;

import java.util.Scanner;

public class E01 {
	/*
	 * A 4 digit number is entered through keyboard. Write a program to print a new
	 * number with digits reversed as of orignal one. E.g.- INPUT : 1234 OUTPUT :
	 * 4321 INPUT : 5982 OUTPUT : 2895
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Plese enter a umber");
		int x = scan.nextInt();//1234
		if (x%10 != (x/1000)%10 || (x/10)%10 == (x/100)%10) {
			x/=10;//123
			x=x+(x%10)*1000;//
			
			System.out.println(x);
		}else  {
			
		}
		
		
		int firstD = x%10;
		int secondD = (x/10)%10;
		int thirdD = (x/100)%10;
		int fourthD = (x/1000)%10;
		System.out.println((firstD*1000)+(secondD*100)+(thirdD*10)+fourthD);
		
		scan.close();
	}

}
