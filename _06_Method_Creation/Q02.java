package _06_Method_Creation;


public class Q02 {
	public static void main(String[] args) {
		/*
		 * name1 ve name2 degiskenlerini olusturun. name1 degiskeninin karakter sayisi
		 * cift ise kelimenin ortasina name2 yi yerlestirin. name1 degiskeninin karakter
		 * sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
		 * yazdirinan bir method oluşturun e.g: name1= mehmet name2= ahmet Print ==>
		 * mehahmetmet
		 */
		String name1 = "sfdghj 654565h3g";
		String name2 = "45t54er";
		ortasinaYerlestir(name1, name2);

	}

	public static void ortasinaYerlestir(String name1, String name2) {

		if (name1.length() % 2 == 1) {
			System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
		} else {
			name1 = name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2);
			System.out.println(name1);
		}
	}

}
