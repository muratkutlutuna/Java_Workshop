package InterviewQuestions;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterviewQuestions11 {

	public static void main(String[] args) {
		/*
		 * Create a function that takes an array and returns the difference between and
		 * the smallest numbers. Ask user to enter array elements.
		 * 
		 * kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının
		 * farkını bulan bir method create ediniz.
		 */
		Scanner s = new Scanner(System.in);
		String flag = null;
		
		do {

			System.out.println("Lutfen girmek istediginiz sayi adedini giriniz");
			int input = s.nextInt();
			int arr[] = new int[input];

			for (int i = 0; i < arr.length; i++) {

				System.out.println(input+" adet sayidan sira "+(i+1)+" girin : ");
				try {
					s.nextLine();
					arr[i] = s.nextInt();

				} catch (InputMismatchException e) {

					System.out.println("sayi girmediniz Lutfen bir sayi giriniz");
					arr[i]=0;
						i--;
					continue;
					
				}
			}
			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("En buyuk sayi ile en kucuk sayinin farki = "+(arr[arr.length - 1] - arr[0]));
			
			flag = s.next();
			try {
				if (flag != null) {

					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				flag = null;
				System.out.println(
						"yeni bir karakter girdiniz\ndevam etmek istiyorsaniz sayi giriniz\nistemiyorsaniz sayi disinda bir karakter giriniz");
				flag = s.next();
			}
		} while (flag.equals(flag.replaceAll("\\D", "")));
		System.out.println("Her seyicin tesekkurler, iyi gunler dileriz");
	}

}
