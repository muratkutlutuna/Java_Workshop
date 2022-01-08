package interviewQuestions;

import java.util.Scanner;

public class InterviewQuestions1_2 {

	public static void main(String[] args) {

		int sayi1 = 10;//sayi1=10
		int sayi2 = 20;//sayi2=20

		//InterviewQuestion1
		
		sayi2=sayi2-sayi1;
		sayi1=sayi1+sayi1;

		System.out.println("sayi1 = "+sayi1);//sayi1=20
		System.out.println("sayi2 = "+sayi2);//sayi2=10
		
		//InterviewQuestion2
		
		sayi1 = sayi1-5;
		sayi2 = sayi2+15;
		
		System.out.println("sayi1 = "+sayi1);//sayi1=15
		System.out.println("sayi2 = "+sayi2);//sayi2=25
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi yazin");
		String isim= scan.next();
		System.out.println("isminiz  "+isim);
		
		//Scan bir scanner objesidir
		//isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		//Scan bir obje oldugu icin data turu non-primitive`dir
		//primitive data turleri sadece deger icerirken
		//non/primitive data turleri degerin yaninda method`lari barindirir
		//scan.  dedigimizde kullanabilecegimiz bu methodlari gorebiliriz
		
		 scan.close();
		
	}

}
