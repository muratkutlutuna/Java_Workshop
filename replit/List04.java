package replit;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 */
		List<String>list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		for (int i = list1.size()-1; i >= 0; i--) 
			if (list1.get(i).toLowerCase().contains("a")) 
				list1.remove(i);
		System.out.println(list1);
		}

}
