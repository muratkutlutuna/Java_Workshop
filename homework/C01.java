package homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C01 {
	public static void main(String[] args) {
		//Soru-1) Bir TreeSet ve HashSet’e random 100 sayi ekleyin, islem surelerini kiyaslayin
	
		TreeSet<Integer> rS1 = new TreeSet<>();
		HashSet<Integer> rS2 = new HashSet<>();
		Random rand = new Random();
		
		
		Long treeSetBeginn = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			rS1.add(rand.nextInt());
		}
		Long treeSetEnd = System.currentTimeMillis();
		
		
		Long hashSetBeginn = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			rS2.add(rand.nextInt());
		}
		Long hashSetEnd = System.currentTimeMillis();

		System.out.println("treeSetBeginn = " + treeSetBeginn + "\ntreeSetEnd = " + treeSetEnd
				+ "\nhashSetBeginn = " + hashSetBeginn + "\nhashSetEnd = " + hashSetEnd);

		//Soru-2):	Ilk soruya 3.bir islem ekleyelim, set’i Hashset olarak olusturup elemanlari
		//			ekleyelim ve sonra TreeSet’e cevirip yazdiralim
		
		Set<Integer> rS3 = new HashSet<>();
		for (Integer w : rS1) {
			rS3.add(w);
		}
		
		
		
		
		
	}

}