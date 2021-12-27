package Team;
import java.util.ArrayList;
import java.util.List;
public class C03 {

	public static void main(String[] args) {
		List<String>names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		System.out.println(names);
		System.out.println(names.remove("Jon"));
		System.out.println(names);
		System.out.println(names.remove("Bran"));
		System.out.println(names);
	}
}
