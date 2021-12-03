package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Problem tanimi : Kulanıcıdan aracının hızını alınız Trafik cezasının değerini
		 * hesaplayın. 45 hız sınırıdır. Eğer hızınız 55-74 arasında ise: Ceza 100
		 * $'dır.
		 * 
		 * Eğer hızınız 75 - 84 arasında ise: Ceza 150 $'dır.
		 * 
		 * Eğer hızınız 85 -94 arasında ise: Ceza 320 $'dır.
		 * 
		 * Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
		 * 
		 * ve ayrıca, Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
		 * 
		 * Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
		 * 
		 * -----------------------------------------
		 * 
		 * Örn;
		 * 
		 * currentSpeed(Hızınız) 87 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
		 * true;
		 * 
		 * sonuç 320 olmalıdır.
		 * 
		 * currentSpeed(Hızınız) 65 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
		 * false;
		 * 
		 * sonuç 300 olmalıdır.
		 */

		System.out.println("Lutfen aracinizin hizini giriniz");
		int hiz = scan.nextInt();
		System.out.println("Ehliyetiniz var mi?");
		String ehliyet = scan.next();

		if (hiz < 45) {
			System.out.println("hiz sinirindasiniz");
		} else if (hiz < 55) {
			System.out.println("hiz sinirini gectiniz");
		} else if (hiz < 74) {
			if (ehliyet.equals("var")) {
				System.out.println("ceza 300$'dir");
			} else {
				System.out.println("ceza 100$'dir");
			}
		} else if (hiz < 84) {
			if (ehliyet.equals("var")) {
				System.out.println("ceza 350$'dir");
			} else {
				System.out.println("ceza 150$'dir");
			}
		} else if (hiz < 94) {
			if (ehliyet.equals("var")) {
				System.out.println("ceza 520$'dir");
			} else {
				System.out.println("ceza 320$'dir");
			}
		} else if (hiz > 94) {
			if (ehliyet.equals("var")) {
				System.out.println("ceza 700$'dir");
			} else {
				System.out.println("ceza 500$'dir");
			}
		}

		scan.close();
	}
}
