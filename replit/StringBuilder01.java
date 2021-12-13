package replit;

public class StringBuilder01 {

	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity) Eg : input : I love Java Output:
		 * "Reversed sentence : avaJ evol I . It is not a palindrome"
		 */
		StringBuilder sB = new StringBuilder("I love Java");
		String str1 = sB.toString();
		
		String str2 = sB.reverse().toString();
		if (str1 == str2) 
			System.out.println("Reversed sentence : "+str2+". It is a Palindrome");
		else System.out.println("Reversed sentence : "+str2+". It is not a Palindrome");
		
	}

}
