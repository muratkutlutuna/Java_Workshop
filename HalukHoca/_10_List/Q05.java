package HalukHoca._10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
    	
    	int arr[] = new int[6];
    	Scanner s = new Scanner (System.in);
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println("Lutfen sayi giriniz");
    		arr[i]=s.nextInt();
    		
		}
    	tekEleman(arr);
    	
    	
    	
    	
    	

//        Scanner scan = new Scanner(System.in);
//        int arr[] = new int[6];
//
//        for (int i = 0; i < 6; i++) {
//            System.out.print("sayi giriniz : ");
//            arr[i] = scan.nextInt();
//        }
//        System.out.println(tekEleman(arr));
//    }
//
//    private static ArrayList<Integer> tekEleman(int[] arr) {
//
//        ArrayList<Integer> list = new ArrayList<>();//bos list icine tek elemanlar atanacak
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1) {
//                list.add(arr[i]);
//            }
//
//        }
//        return list;
    }

	private static void tekEleman(int[] arr) {
		ArrayList<Integer>list = new ArrayList<>();
		for (Integer w : arr) {
			if (w%2==1) {
				list.add(w);
			}
		}
		Integer arr1[]=list.toArray(new Integer[list.size()]);
		for (int i = 0; i < arr1.length; i++) {
			arr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arr1));

		
	}


}
