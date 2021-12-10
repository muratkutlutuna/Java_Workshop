package replit;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the number of days in a month.(Use Switch Case)
		 * (Interview Question / Leap
		 *  Year)
		 * 
		 * Sample:
		 * 
		 * INPUT:
		 * 
		 * Input a month number: 2
		 * 
		 * Input a year: 2016
		 * 
		 * OUTPUT :
		 * 
		 * February 2016 has 29 days
		 */
		Scanner s=new Scanner(System.in);
		System.out.println("Input a month number: ");
		int m = s.nextInt();
		LocalDateTime t = LocalDateTime.of(1, m, 1, 1, 1);
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("MMMM");
		System.out.println(duzenle.format(t));
		System.out.println("Input a year: ");
		int y = s.nextInt();
		
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(duzenle.format(t)+" "+y+" has 31 days");
			break;
		case 2:
			if (y%4==0) 
				System.out.println(duzenle.format(t)+" "+y+" has 29 days");
			else System.out.println(duzenle.format(t)+" "+y+" has 28 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(duzenle.format(t)+" "+y+" has 30 days");
			break;
		default:
			System.out.println("Lutfen dogru bilgi giriniz");
			break;
		}
		

	}

}
