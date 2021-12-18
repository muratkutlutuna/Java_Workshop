package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterviewQuestions10 {

	public static void main(String[] args) {
		/*
		 * Create a list by getting the list elements from user if there is duplicated
		 * elements remove them from the list. ​ 
		 * 
		 * Kullanıcıdan aldıgınız elemanlardan
		 * oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
		 */
		
		Scanner scan= new Scanner(System.in);
		List<String>list = new ArrayList<>();
		do {
		System.out.println("Lutfen liste eklemek icin veri giriniz\nbitirmek icin - girin ");
		list.add(scan.nextLine());
		}
		while (!list.get(list.size()-1).equals("-")) ;
		list.remove(list.size()-1);
		int counter=0;
		for (int i =0; i<list.size();i++) {
			for (int j = 0; j<list.size();j++) {
				if (list.get(i).equals(list.get(j))) {
					counter++;
				}
			}
			if (counter>1) {
				list.remove(i);
				i--;
			}
			counter = 0;
		}
		System.out.println(list);
		
	}

}
