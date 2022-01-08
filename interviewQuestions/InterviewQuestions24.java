package interviewQuestions;

import java.util.Scanner;

public class InterviewQuestions24 {

	public static void main(String[] args) {
		  /*
        1
        2 3 2
        3 4 5 4 3
        4 5 6 7 6 5 4

Kullanıcının  girdigi satır sayısı kadar yukarıdaki yarım piramid sekli yazdıran bir program create ediniz.
         */
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
			for (int j = 1; j < i; j++) {
				System.out.print(i+j+" ");
			}
			for (int k = i+i-2; k > i-1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
