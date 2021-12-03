package replit;

public class F0rWhile2 {

	public static void main(String[] args) {
		// Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve 
		//LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		//Input :
		//30

		//40

//		Beklenen Cikti:
//		Beklenen Cikti:
//		30 ve 40 icin GCD = 10
//		
//		30 ve 40 icin LCM = 120
		int a = 30;
		int b = 40;
		
		int carpim = a*b;
		int ebob = 1;
		int ekok = 1;
		
		for (int i = 0; i < a && i<b; i++) {
			if (a%i==0&&b%i==0) {
				ebob=i;
				ekok=carpim/ebob;
			}
		}
		
		System.out.println("30 ve 40 icin GCD = "+ebob);
		System.out.println("30 ve 40 icin LCM = "+ekok);
	}

}
