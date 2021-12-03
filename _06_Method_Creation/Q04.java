package _06_Method_Creation;

public class Q04 {
	public static void main(String[] args) {
		/*
		 * girilen String icinde "xyz" dizimi var ise true degilse false return eden
		 * metod yaziniz
		 *
		 * input output axyzm == true xyz == true x.yz == false xyaz == false
		 */
		String str = "sadadfwexyzsad";
		System.out.println(xyzVarMi(str));
		System.out.println(xyzVarMi("axyzm"));
		System.out.println(xyzVarMi("xyz"));
		System.out.println(xyzVarMi("x.yz"));
		System.out.println(xyzVarMi("xyaz"));

	}

	public static boolean xyzVarMi(String str) {
		if (str.contains("xyz")) {
			return true;
		} else {
			return false;
		}

	}

}
