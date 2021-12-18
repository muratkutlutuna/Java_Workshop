package outomat;

import java.util.Scanner;

public class OtomatRunner {

	static Scanner scan = new Scanner(System.in);
	static Otomat urun = new Otomat();
	static int secim;
	static boolean flag = true;
	static double araToplam;
	static double toplamTutar;
	static int adet;
	static double odeme;
	
	public static void main(String[] args) {
		/*
		 * projemizin adı YIYECEK OTOMATI --15 adet ürün ve bu ürünlerin fiyatlarını
		 * belirleyiniz. Bu ürünler ekranda listelensin --Ürün seçip, para miktarı
		 * giriniz --girdiğiniz para fazla ise üstünü versin, eksik ise ekleme yapmanızı
		 * istesin --Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece, para
		 * kontrolünü de yaparak işlem yapmaya devam etsin...
		 * 
		 * NOT: Otomat sadece 1 tl ,5 tl, 10 tl, 20 tl miktarlarını kabul etsin oop
		 * concepte ait öğrendiklerimizi kullanmaya çalışalım... iyi çalışmalar Kolay
		 * gelsin...
		 * 
		 * 1- ne istedigini sor 2- fiyatini hesabla 3- parasini al 4- cikis
		 */
		System.out.println("======= Yiyecek Otomatina Hosgeldiniz ======");
		menu();
	}

	private static void menu() {
		System.out.print(
				"===  M E N U  ===\n1- Urunlerim\n2- Sipasris\n3- Fiyat Hesaplama\n4- Odeme\n5- Cikis\n\n==> Seciminiz : ");
		secim = scan.nextInt();
		while (!((secim > 0) && (secim < 6))) {
			System.out.println("Lutfen menu seceneklerimizden birini giriniz.Seciminz : ");
			secim = scan.nextInt();
		}
		switch (secim) {
		case 1:
			urunlerim();
			break;
		case 2:
			siparis();
			break;
		case 3:
			fiyatHesapla();
			break;
		case 4:
			odeme();
			break;
		case 5:
			cikis();
			break;

		default:
			break;
		}

	}

	private static void odeme() {
		System.out.println("========= Odeme =========");
		System.out.println("Odenecek Tutariniz : "+toplamTutar
				);
		flag=true;
		while(flag) {
			System.out.println("Odemeyi; 1,5,10,20tl seklinde yapabilirsiniz.\nOdeme Tutariniz : ");
			odeme=scan.nextDouble();
			double kalan = toplamTutar-odeme;
			if (kalan>9) {
				System.out.println("Kalan odeme tutariniz : "+kalan+"\nYeni odemeniz : ");
				odeme=scan.nextDouble();
			}else {
				System.out.println("Alacaginiz para ustu : "+kalan);
				flag=false;
				cikis();
			}
		}
		
	}

	private static void siparis() {
		do {
		System.out.println("======= Siparis =======");
		System.out.println("Seciminiz : ");
		secim = scan.nextInt();
		System.out.println("Kac adet alirsiniz? : ");
		adet = scan.nextInt();
		}while(!((secim>0)&&(secim<16)));
		for (int i = 0; i < urun.getUrun().size(); i++) {
			if (secim==(i+1)) {
				araToplam+=urun.getFiyat().get(i)*adet;
				System.out.println("Siparisiniz : "+urun.getUrun().get(i));
			}
		}
		toplamTutar+=araToplam;
		flag = true;
		while(flag) {
			System.out.println("Yeni bir urun secmek istiyor musunuz?(E/H)");
			char secimC = scan.next().charAt(0);
			if (secimC=='e'||secimC=='E') {
				siparis();
			}else if (secimC=='h'||secimC=='H'){
				odeme();
			}
		}
	}

	private static void fiyatHesapla() {
		System.out.println("Tutar : "+toplamTutar);
		menu();
		
	}

	private static void urunlerim() {
		System.out.println("======= Urunlerimiz =======");
		System.out.println("Sira\t\tUrun\t\t\tFiyat");

		for (int i = 0; i < urun.getUrun().size(); i++) {
			System.out.println((i + 1) + "-\t\t" + urun.getUrun().get(i) + "\t\t\t" + urun.getFiyat().get(i));
		}
		siparis();
//		System.out.println("Yeni urun secmek istiyor musunuz?");
//		char secimC = scan.next().charAt(secim);
//		if (flag) {
//			
//		}

	}

	private static void cikis() {
		System.out.println("---------   Yine Bekleriz   ----------");
		
	}

}
