package day7_selfStudy;

public class E07 {
		/*
		 *	if you join 2 or more strings, you can use "+" or "concat()" 
		Note: If you are sure data types of s3 and s4 are same, you can use the fallowing syntex
			String s3 = "Ali",s4 = "Can";
		Note: If you use many method side by side, it is called "Method Chain"
		 */
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "is easy";
		
		//1.Way:
		System.out.println(s1+" "+s2);		
		
		//2.Way:
		System.out.println(s1.concat(" ").concat(s2));
		
		String s3 = "Java";
		int i1 = 5;
		int i2 = 3;
		
		System.out.println(s3 + i1 + i2);//Java53
		
		System.out.println(i1+i2+s3);//8Java
		
		
		
		
		
		
	}

}
