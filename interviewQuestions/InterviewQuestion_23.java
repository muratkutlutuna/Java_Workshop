package interviewQuestions;

import java.util.Arrays;

public class InterviewQuestion_23 {

	public static void main(String[] args) {
				   // 0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27     length 28
		int[] arr = { 3, 0, 0, 3, 4, 4, 6, 5, 0, 0, 0, 0, 4, 0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 8, 9, 0 };
		boolean flag = false;
		int idx = 0;
		int counter = 0;
		for (int each : arr) {
			if (each==0) {
				counter++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {// 1. index i 0 olan
				for (int j = 0; j + i < arr.length; j++) {
					if (arr[i + j] != 0) {
						idx = i + j;
						break;
					} else {
						idx = i;
					}
				}
				for (int k = 0; k + idx < arr.length; k++) {
					arr[i + k] = arr[idx + k];
				}
			}
			
		}
		for (int j = 1; j <= counter; j++) {
			arr[arr.length - j] = 0;
		}
		System.out.println(Arrays.toString(arr));

	}

}
/*
 * Ebay Interview Question: Put all zeros to end in a integer array Bir tamsayı
 * dizisinde tüm sıfırları sona koyan bir program create ediniz.
 * 
 * input : {3, 0, 4, 2, 0} output: {3, 4, 2, 0, 0}
 */