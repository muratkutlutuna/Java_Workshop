package ProjectLibraryTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
	static List<Kitap> kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;

	public static void main(String[] args) {
		menu(kitapListe);
	}

	public static void menu(List<Kitap> liste) {
		System.out.println(
				"============== Kitap Programi =============\n1:Kitap ekle\n"
				+ "2:Numara ile kitap sil\n3:Tum kitaplari listele\n4:cikis");
		System.out.println("isleminizi secin");
		int tercih = scan.nextInt();
		scan.nextLine();
		switch (tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noIleSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("yanlis giris yapildi tekrar deneyiniz!!");
			break;
		}
	}

	private static void bitir() {
		System.out.println("yine bekleriz");
		
	}

	private static void listele(List<Kitap> liste) {
		for (Kitap w : liste) {
			System.out.println(w.toString());
		}
		menu(liste);
	}

	private static void noIleSil(List<Kitap> liste) {
		System.out.println("silinecek kitap no giriniz:");
		int silinecekNo = scan.nextInt();
		for (Kitap w : liste) {
			if (w.getNo()==silinecekNo) {
				liste.remove(w);
				menu(liste);
			}
		}
		System.out.println(silinecekNo+" ait silinecek kitap bulunamadi!!");
		menu(liste);
		
	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("kitap ismi giriniz");
		String kitapAdi = scan.nextLine();
		System.out.println("Kitabin yazar ismi giriniz");
		String yazarAdi = scan.nextLine();
		System.out.println("yayin yilini giriniz");
		int yayinYili = scan.nextInt();
		scan.nextLine();
		System.out.println("fiyatini girniz");
		double fiyat = scan.nextDouble();
		scan.nextLine();
		Kitap kitap = new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);
		liste.add(kitap);
		menu(liste);
	}

}
