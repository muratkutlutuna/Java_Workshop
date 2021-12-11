package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,   aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..

		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Lutfen sirasi ile iki string giriniz");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		String arr1[]=str1.toLowerCase().split("");
		String arr2[]=str2.toLowerCase().split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1,arr2)) 
			System.out.println("Anagram");
		else System.out.println("Not Anagram");	
		}
}
