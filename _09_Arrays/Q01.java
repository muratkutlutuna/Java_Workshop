package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gireceginiz sayilarin miktarini belirtiniz");
		int sayi = scan.nextInt();
		int arr[]=new int[sayi];
		//arr[0,0,0,0,0,0] sayi=6
		
		//arr[2,4,7,8,94,5]
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Lutfen arrayin "+i+". indexteki sayisini giriniz");
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("En buyuk sayi = "+arr[sayi-1]+", en kucuk sayi = "+arr[0]);
		
		
		/*Scanner scan =new Scanner(System.in);
		System.out.print("arryinizin boyutunu giriniz :");
		int arrBoyutu =scan.nextInt();

		int arr []=new int[arrBoyutu];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arrayin "+(i+1) +". elemanini giriniz : ");
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("girdiginiz arrayin max - min eleman degeri :"+(arr[arrBoyutu - 1] - arr[0]));

*/
	}

}
