package HalukHoca._10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
    	
    	List<Integer>notlar = new ArrayList<Integer>();
    	Scanner scan = new Scanner(System.in);
    	String yeterlilik="";
    	do {
    		System.out.println("Lutfen bir not giriniz");
    		notlar.add(scan.nextInt());
    		System.out.println("baska girmek istemiyorsaniz \"H\" giriniz ya da baska bir girdi yapip devam ediniz");
    		yeterlilik=scan.next();
    		
    		
    	}
    	while (!yeterlilik.equalsIgnoreCase("H")); 
		int ortalamayiGecenOgrenciSayisi=0;
		for (Integer w : notlar) {
			if (w>ortalama(notlar)) {
				ortalamayiGecenOgrenciSayisi++;
			}
		}

		System.out.println("Ortalamayi gecen ogrenci sayisi : " + ortalamayiGecenOgrenciSayisi);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	

//        List<Integer> listNotlar = new ArrayList<>();
//        Scanner scan = new Scanner(System.in);
//        String dewamkee;
//        //ortalamasi alinacak iist elemanlri kullanicidan alindi
//        do {
//            System.out.print("not giriniz : ");
//            int ogrNot = scan.nextInt();
//            System.out.println("dewamkeee : E/H");
//            dewamkee = scan.next();
//            listNotlar.add(ogrNot);
//        } while (dewamkee.equalsIgnoreCase("E"));
//
//        //ortlama hesaplanmasi..
//        int toplam = 0;
//        for (int i = 0; i < listNotlar.size(); i++) {
//
//            toplam += listNotlar.get(i);
//        }
//        double ortalama = toplam / listNotlar.size();
//
//        //ortlamayi geçen ogr sayisi
//
//        int ortlamaGecenSayisi = 0;
//        for (int i = 0; i < listNotlar.size(); i++) {
//            if (listNotlar.get(i) > ortalama) {
//                ortlamaGecenSayisi++;
//            }
//
//        }
//        System.out.println("girilen notlarin ortaqlamasi  :" + ortalama);
//        System.out.println("ortalama gecen ogr sayisi : " + ortlamaGecenSayisi);
    }

	private static int ortalama(List<Integer> notlar) {
		int ortalama = 0;
		for (Integer w : notlar) {
			ortalama+=w;
		}
		ortalama/=notlar.size();
		return ortalama;
		
	}
}
