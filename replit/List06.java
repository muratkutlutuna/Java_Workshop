package replit;

import java.util.ArrayList;
import java.util.List;

public class List06 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */
		String [] input1 = {"John","Brad","Ange","Sofia","Emily"};
		String [] input2 = {"sofia","brad","grace","emily","hazel"};
		arrCommonElements(input1,input2);
		
		
		
	}

	private static void arrCommonElements(String[] input1, String[] input2) {
		List<String>list = new ArrayList<>();
		for (String w : input2) 
			for (String x : input1) 
				if (w.equalsIgnoreCase(x)) 
					list.add(w);
		System.out.println(list);
	}

	
}
