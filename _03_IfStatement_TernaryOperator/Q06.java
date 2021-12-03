package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bulundugunuz yerin enlem koordinatini giriniz");
		
		double enlem = scan.nextDouble();
		
		System.out.println("Bulundugunuz yerin hangi kutup bolgesinde oldugunu giriniz \nK\nG");
		char kN = scan.next().charAt(0);
		
		
		
		if (enlem<(-90)||enlem>90) {
			System.out.println("Lutfen koordinatlari dogru giriniz");
		}
		if (kN!='K'&& kN!='G') {
			System.out.println("Lutfen Kutup bolgesini dogru giriniz");
		}else if (enlem == 0) {
			System.out.println("ekvator cizgisindesiniz");
		}else if (Math.abs(enlem)<23.27&&kN=='K') {
			System.out.println("Ekvator ile Yengec Donencesi arasindasiniz");
		}else if (Math.abs(enlem)<23.27&&kN=='G') {
			System.out.println("Ekvator ile Oglak Donencesi arasindasiniz");
		}else if (Math.abs(enlem)<66.33&&kN=='K') {
			System.out.println("Yengec Donencesi ile Kuzey Kutup Dairesi arasindasiniz");
		}else if (Math.abs(enlem)<66.33&&kN=='G') {
			System.out.println("Oglak Donencesi ile Guney Kutup Dairesi arasindasiniz");
		}else if (Math.abs(enlem)>=66.33&&kN=='K') {
			System.out.println("Kuzey Kutup Dairesindesiniz");
		}else if (Math.abs(enlem)>=66.33&&kN=='G') {
			System.out.println("Guney Kutup Dairesindesiniz");
		}
		
       scan.close();
    }
}
