package day7_selfStudy;

public class E05 {

	public static void main(String[] args) {

		int age = 12;
		System.out.println("Before increment: "+age);//12
		
		//1.Way:
		age = age+5;
		System.out.println("After 1st increment: "+age);//17
		
		age = age + 4;
		System.out.println("After 2nd increment: "+age);//21
		//2.Way:
		
		age+=5;
		System.out.println("After 3rd increment "+age);//26
		
		//3.Way: 
		
		age++;
		System.out.println("After 4th Increment "+age);//27


		
		
		
		
		
		
	}

}
