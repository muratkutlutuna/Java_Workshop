package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
	
	ArrayList <User>kullanicilar = new ArrayList<>();//bos list
	
	public List<User>register(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz : ");
		String name = scan.nextLine();
		User user = new User(name, LocalDateTime.now());
		kullanicilar.add(user);
		return kullanicilar;

	}
	public void printHappyUsers(ArrayList<User>users) {
		for (User each : users) {
			if (each.registerDate.getSecond()<10) {
				System.out.println("Sansli kisisiniz "+each.name+" agam 5 kilo bal kazandin");
			}else System.out.println("maalesef "+each.name+" ballar balini buldunuz kovaniz yagmalandi");
			
		}
	}
	public void listele(ArrayList<User>users) {
		for (User each : users) {
			System.out.println("Adi : "+each.name+" kayit zamani : "+each.registerDate);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
