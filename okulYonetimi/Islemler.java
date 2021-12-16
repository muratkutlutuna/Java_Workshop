package okulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
	/*
	BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.
	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
		Kayıtlarda şu bilgiler olabilmelidir.
		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
		Aşağıdaki gibi bir menü gösterilsin.
	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ
	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
 */
	List<Kisi>ogrenciList = new ArrayList<>();
	List<Kisi>ogretmenList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static String kisiTuru;
	
	public static void anaMenu() {
		System.out.println("====================================\n"
                + "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n"
                + "    ====================================\n"
                + "     1- ÖĞRENCİ İŞLEMLERİ\n"
                + "     2- ÖĞRETMEN İŞLEMLERİ\n"
                + "     Q- ÇIKIŞ\n"
                + "");
		System.out.println("isleminizi seciniz : ");
		String secim = scan.next().toUpperCase();
		switch (secim) {
		case "1":
			kisiTuru = "Ogrenci";
			islemMenusu();
			break;
		case "2":
			kisiTuru= "Ogretmen";
			islemMenusu();
			break;
		case "Q":
			cikis();
			break;
		default:
			System.out.println("Hatali giris yaptiniz!!");
			break;
		}
	}

	private static void cikis() {
		System.out.println("uygulamayi kullandiginiz icin tesekkur ederiz");
		
	}

	private static void islemMenusu() {
		System.out.println("3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.\r\n"
		        + "============= İŞLEMLER =============\r\n"
		        + "     1-EKLEME\r\n"
		        + "     2-ARAMA\r\n"
		        + "     3-LİSTELEME\r\n"
		        + "     4-SİLME\r\n"
		        + "     0-ÇIKIŞ");
		System.out.println("islem tercihiniz giriniz");
		int islemTercihi = scan.nextInt();
		switch (islemTercihi) {
		case 0:
			anaMenu();
			break;
		case 1:
			ekleme();
			islemMenusu();
			break;
		case 2:
			arama();
			islemMenusu();
			break;
		case 3:
			listeleme();
			islemMenusu();
			break;
		case 4:
			silme();
			islemMenusu();
			break;
		
		default:
			System.out.println("hatali giris yaptiniz");
			islemMenusu();
			break;
		}
		
	}

	private static void eklemeOgretmen() {
		System.out.println("============= Eleme Menusu =============");
			Kisi Otm = new Ogretmen();
			System.out.println("Sicil numaranizi giriniz : ");
			String sicilNo = scan.nextLine();
			System.out.println("Lutfen bolumunuzu giriniz : ");
			String bolum = scan.nextLine();
			
		
		
		
		
	}
	private static void eklemeOgrenci() {
		System.out.println("============= Eleme Menusu =============");
			
			Kisi Onc = new Ogrenci();
			System.out.println("Numaranizi giriniz : ");
			Ogrenci numara = scan.nextLine();
			System.out.println("Lutfen sinifinizi giriniz : ");
			String sinif = scan.nextLine();
		
		
		
		
	}
	
	
}
