package interviewQuestions;

public class QuestionTeam1 {
	int a1;
	
	public static int doProduct(int a) {
		a=a*a;
		return a;
	}
	public static String doString(String s) {
		s=s.concat(" "+s);
		return s;
	}
	
	public static void main(String[] args) {
		QuestionTeam1 item = new QuestionTeam1();
		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		i=doProduct(i);;
		sb=doString(sb);
		item.a1=doProduct(item.a1);
		System.out.println(i+" "+sb+" "+item.a1);
		
		
		

	}

}
