package javaProjects.OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIsleriRunner extends OgrenciIsleri {

	static List<OgrenciIsleri> ogrenciList = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	static int no = 1000;
	static String input;

	public static void main(String[] args) {

		/*
		 * 1- Ogrenci isminde bir class create ediniz. fields (encapsuleted) ->
		 * numarasi, adi, soyadi, ortalama olmali. 2- Tum fields'lar için constructor
		 * create ediniz. fields
		 * 
		 * 3- Bir main class'ta Kullaniciya ögr kaydi, ogrc listeleme, ogrc kayit silme
		 * islemlerini yaptiriniz.
		 */

		menu();

	}

	private static void menu() {

		System.out.println("============ Ana Menu =============");
		System.out.println(
				"1- Ogrenci Kaydi\n2- Ogrenci listeleme\n3- Ogrenci Kayit silme\n4- Cikis\nLutfen bir islem giriniz");
		String input = s.nextLine().substring(0, 1).toLowerCase();
		switch (input) {
		case "1":
			kayit();
		case "2":
			listeleme();
		case "3":
			kayitSil();
		case "4":
			System.out.println("Iyi gunler dileriz..");
			break;
		default:
			System.out.println("Lutfen gecerli bir karakter giriniz");
			menu();
			break;
		}

	}

	private static void kayitSil() {
		System.out.println("============ Kayit Silme ==========");
		System.out.println("silinecek kayit icin ogrenci no giriniz");
		input = "" + s.nextLine();
		if (ogrenciList.isEmpty()) {
			System.out.println("Ogrenci Listesi bostur");
		} else {
			for (OgrenciIsleri w : ogrenciList) {
				if (w.getNo() == Integer.parseInt(input)) {
					ogrenciList.remove(w);
					System.out.println(input + " no ya ait silme basarili bir sekilde gerceklesti");
					menu();
				}
			}
			System.out.println(input + " nolu ogrenci kayit bulunamadi!!");
		}
		System.out.println("menuye girmek icin bir karakter giriniz");
		input = s.nextLine();
		menu();
	}

	private static void listeleme() {
		System.out.println("============ Kayit Listeleme ==========");
		if (ogrenciList.isEmpty()) {
			System.out.println("Ogrenci Listesi bostur");
		} else {
			for (OgrenciIsleri w : ogrenciList) {
				System.out.println(w.toString());
			}
		}
		System.out.println("menuye girmek icin bir karakter giriniz");
		input = s.nextLine();
		menu();

	}

	public static void kayit() {
		System.out.println("============= Kayit =============");
		System.out.println("Lutfen isminizi giriniz");
		String adi = s.nextLine();
		System.out.println("Lutfen soyisminizi giriniz");
		String soyadi = s.nextLine();
		System.out.println("Lutfen ortalamanizi giriniz");
		double ortalama = Double.parseDouble(s.nextLine());
		OgrenciIsleri kayit = new OgrenciIsleri(++no, adi, soyadi, ortalama);
		ogrenciList.add(kayit);
		System.out.println("Kayit basari ile tamamlanmistir");
		System.out.println("menuye girmek icin bir karakter giriniz");
		input = s.nextLine();
		menu();
	}
}
