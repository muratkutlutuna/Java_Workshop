package replit;

import java.util.Arrays;

public class Array08 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 * 
		 * Input1={1,2,3,4}
		 * 
		 * Input2={5,6}
		 * 
		 * Output={1,2,3,4,5,6}
		 */
		int[] input1={1,2,3,4};
		int[] input2={5,6};
		System.out.println(Arrays.toString(addArray(input1,input2)));;
	}

	private static int[] addArray(int[] input1, int[] input2) {
		int newArray[] = new int[input1.length+input2.length];
		for (int i = 0; i < newArray.length; i++) {
			if(i<input1.length)
			newArray[i]=input1[i];
			else newArray[i]=input2[i-input1.length];
		}
		return newArray;
		
	}

}
