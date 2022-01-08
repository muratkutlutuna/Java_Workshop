package interviewQuestions;

public class Day33 {

	public static void main(String[] args) {
		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e!=key) {
				continue;
//				count++;
			}
			count++;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i]!=key) {
				continue;
//				count++;
			}
			count++;
		}
		System.out.println(count+" Found");
	}	
}
