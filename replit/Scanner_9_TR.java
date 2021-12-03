package replit;

import java.util.Scanner;
public class Scanner_9_TR {

	public static void main(String[] args) {
		String or = "123 yil 11 ay 3 hafta 3 gun 21 saat 33 dakika 45 saniye";//ornek
		int yil = 0;//365*24*60*60*
		int ay = 0;//30*24*60*60*
		int hafta = 0;//7*24*60*60*
		int gun = 0;//24*60*60*
		int saat = 0;//60*60*
		int dakika = 0;//60*
		int saniye = 0;

		
	    String saniyeString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer saniyeSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    String saniyedenKalanString = or.substring(0, or.indexOf(saniyeString)).trim();//123 yil 11 ay 3 hafta 3 gun 21 saat 33 dakika
	    String dakikaString = saniyedenKalanString.substring(saniyedenKalanString.lastIndexOf("\\d+"));//"33 dakika"
	    
	    System.out.println(or);
	    
	    
	    //Integer dakikaSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    /*
	    String saatString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer saatSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    String gunString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer gunSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    String haftaString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer haftaSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    String ayString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer aySayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    String yilString = or.substring(or.lastIndexOf("\\d+"));//"45 saniye"
	    Integer yilSayi = Integer.valueOf(saniyeString.replaceAll("\\D", ""));//45 (int)
	    
	    Scanner scan = new Scanner(System.in);
	    String trh = scan.next().toLowerCase().trim().replaceAll("\\s+", " ");
	
		*/




	  }
}
