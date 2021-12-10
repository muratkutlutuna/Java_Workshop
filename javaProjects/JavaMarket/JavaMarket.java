package javaProjects.JavaMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaMarket {
static List <String> urunlerin = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma","Muz", "Cilek", "Kavun", "Uzum", "Limon"));
static List<Double>fiyatlar= new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
static List<String>sepetUrunlerin = new ArrayList<>();
static List<Double>sepetKg=new ArrayList<>();
static List<Double>sepetFiyatlar = new ArrayList<>();
static Scanner scan = new Scanner(System.in);	
	public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */
	
	String devam="";
	double toplamFiyat = 0;
	do {
		urunListesi();
		System.out.println("sectiginiz urunun kodunu giriniz");
		int urunNo = scan.nextInt();
		System.out.println("kac kilo alacaksiniz");
		double kg = scan.nextDouble();
		sepetEkle(urunNo,kg);
		sepetTutari();
		System.out.println("devam edecek misiniz e yaziniz");
		devam=scan.nextLine();
		
	} while (devam.equalsIgnoreCase("e"));
	odeme(toplamFiyat);
	
	}

	private static double sepetTutari() {
		
		
		double sepetTutari = 0;
		double sptKg = 0;
		for (int i = 0; i < sepetUrunlerin.size(); i++) {
			sepetTutari+=sepetFiyatlar.get(i);
			sptKg+=sepetKg.get(i);
		}
		System.out.println("Toplam odemeniz gereken miktar : "+sepetTutari+"aldiginiz urun miktari : "+sptKg);
		return sepetTutari;
		
	}

	private static void odeme(double toplamFiyat) {
		
		System.out.println("odemeniz gereken ekler : "+toplamFiyat);
		double nakit=0;
		do {
			System.out.println("Lutfen nakit odemenizi giriniz : ");
			nakit+=scan.nextDouble();
			
			
			
		} while (nakit<toplamFiyat);
		double paraustu = nakit-toplamFiyat;
		if (paraustu>0) {
			System.out.println("para ustunuz "+paraustu);
		}
		
		System.out.println("yine bekleriz iyi gunler");
	}

	private static void sepetEkle(int urunNo, double kg) {
		sepetUrunlerin.add(urunlerin.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
		
		
		
	}

	private static void urunListesi() {
		System.out.println("No\tUrunler\tFiyatlar");
		System.out.println("**\t*******\t********");
		
		for (int i = 0; i < urunlerin.size(); i++) {
			System.out.println(" "+i+"\t"+urunlerin.get(i)+"\t\t"+fiyatlar.get(i));
		}
	}
}
