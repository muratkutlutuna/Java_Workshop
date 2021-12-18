package geometrikHesaplama_SuatBey;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Runner {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {

		String s = JOptionPane.showInputDialog(
				"****Geometrik Hesaplama Programı****\n1.Cember\n2.Dikdortgen\n3.Kare\n4.Çıkış\n\nSeciminizi Yapın..:");

		switch (s) {
		case "1":
			String yariCap = JOptionPane.showInputDialog("****Cember Hesaplama***\nCemberin Yarıcapını Girin: ");

			Cember yeni = new Cember(Double.parseDouble(yariCap));

			JOptionPane.showMessageDialog(null,
					"Cemberin Cevresi =" + yeni.cevreHesabiCember() + "\n Cemberin Alanı: " + yeni.alanHesabiCember(),
					"Cember Sonucları", JOptionPane.PLAIN_MESSAGE);
			;

			menu();
			break;
		case "2":

			String uzunKenar = JOptionPane.showInputDialog("****Dikdörtgen Bölümü***\nDikdörtgenin 1.Kenarını Girin: ");

			String kisaKenar = JOptionPane.showInputDialog("****Dikdörtgen Bölümü***\nDikdörtgenin 2.Kenarını Girin: ");

			Dikdortgen yeni1 = new Dikdortgen(Double.parseDouble(uzunKenar), Double.parseDouble(kisaKenar));

			JOptionPane.showMessageDialog(null, "Dikdörtgenin Cevresi =" + yeni1.cevreHesabidikdortgen()
					+ "\nDikdörtgenin Alanı: " + yeni1.alanHesabidikdortgen(), "Dikdörtgen Sonucları",
					JOptionPane.PLAIN_MESSAGE);
			;

			menu();

			break;
		case "3":
			String Kenar = JOptionPane.showInputDialog("****Kare Bölümü***\nKarenin Kenar Uzunlugunu Girin: ");

			Kare kare = new Kare(Integer.parseInt(Kenar));

			JOptionPane.showMessageDialog(null,
					"Karenin Cevresi =" + kare.cevreHesabiKare() + "\nKarenin Alanı: " + kare.alanHesabiKare(),
					"Kare Sonucları", JOptionPane.PLAIN_MESSAGE);
			;

			menu();

			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Gene Bekleriz", "Çıkış Bölümü", JOptionPane.PLAIN_MESSAGE);

			break;

		default:
			System.out.println("Hatalı giriş yapıldı.");
			break;
		}

	}

}
