package d11262021u2243;

public class Y {

	
	
	public static void main(String[] args) {
		
		
		X.yazi2="Y den degistirilen yazi2";

		System.out.println(X.yazi2);

		X obj1 = new X();//System.out.println();==>Kapi
		System.out.println(obj1.sayi1);//0
		System.out.println(obj1.yazi1);//null

		
		X obj2 = new X("Ali");//System.out.println("Ali");==>Kapi
		System.out.println(obj2.sayi1);//0
		System.out.println(obj2.yazi1);//hickimse

		
		X obj3 = new X(20,"Kamil");//---==>Kapi
		System.out.println(obj3.sayi1);//20
		System.out.println(obj3.yazi1);//null
		System.out.println(X.yazi2);//Kamil

		
		
		
		
		
		
		
		
		System.out.println(X.yazi2);
	}

}
