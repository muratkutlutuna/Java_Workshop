package Team;

import java.util.ArrayList;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		 /* If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7} {3, 6, 18, 17}
         */
		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7, 4, 5, 6, 3, 9 };
		

		List<String> list = new ArrayList<String>();
		int p = 0;
		String c = "";
		int s = 0;
		for (int i = 0; i < arr.length && p < arr.length; i++) {
			for (p = i; p <= i; p++) {
				for (int j = s; j <= s + p && j < arr.length; j++) {
					c += Integer.toString(arr[j])+"+";
				}

			}
			c=c.substring(0,c.length()-1);
			s += p;
			if (c.equals("")) {
				break;
			}
			list.add(c);
			c = "";

		}
		
		
		
		
		//====================================================

//		List<Integer> list = new ArrayList<>();
//		int p = 0;
//		int c = 0;
//		int s = 0;
//		for (int i = 0; i < arr.length && p < arr.length; i++) {
//			for (p = i; p <= i; p++) {
//				for (int j = s; j <= s + p && j < arr.length; j++) {
//					c += arr[j];
//					System.out.println(arr[j]);
//					System.out.println("c=" + c);
//				}
//
//			}
//			s += p;
//			if (c == 0) {
//				break;
//			}
//			System.out.println();
//			list.add(c);
//			c = 0;
//
//		}

		System.out.println(list);
	}

}
