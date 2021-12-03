package d11262021u2243;

public class X {
	
	int sayi1;
	String yazi1;
	static int sayi2;
	static String yazi2;
	
	
	X() {//obj1
		System.out.println();
	}
	
	X(String k){//obj2
		this.yazi1="hickimse";
		System.out.println(k);
	}
	
	X(int s, String t){
		this.sayi1=s;
		X.yazi2=t;
		sayi1=4;
		yazi2="ali";
		
	}
	static {
		System.out.println("bu statictir");
	}
	
	public static void main(String[] args) {
		System.out.println("static olan sayi2 = "+sayi2);
		X obj = new X();
		System.out.println("sayi1 = "+obj.sayi1);
				
		yazi2="X ten degistirilen yazi2";
		
		obj.sayi2();
		System.out.println(yazi2);
	}

	private void sayi2() {
		X.yazi2 = "hoi";
		
		
		
	}
	
	
	
}
