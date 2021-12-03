package _07_ForLoop;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz");

		String str = scan.next();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(str);

			}
			System.out.println();
		}

		scan.close();
	}
}
