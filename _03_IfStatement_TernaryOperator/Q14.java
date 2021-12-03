package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {  
	/* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
	
    
    public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.\n"
    			+ "\n"
    			+ "ax^2 + bx + c; denkleminin koklerini bulmak icin \n\n"
    			+ "a, b ve c olmak uzere lutfen uc tane sayi giriniz");
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	
    	double delta = (b*b)-(4*a*c);
    	
    	if (delta>0) {
			System.out.println("2 tane kok vardir. \nx1 = "+((-b + Math.sqrt(delta)) / (2*a))+"\nx2 = "+((-b - Math.sqrt(delta)) / (2*a)));
		}else if (delta==0) {
			System.out.println("1 tane kok vardir. \nx = "+(-b)/2*a);	
		}else {
			System.out.println("Kok yoktur.");
		}
    	
    	scan.close();
    	
    }
}
