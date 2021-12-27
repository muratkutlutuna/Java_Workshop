package takeaway;

import javax.swing.JOptionPane;

public class Main {
	//variables for set methods 
	public static String fullName;
	public static int contactDetails;
	public static double price;
	public static double fullPrice=0;
	
	//Menu items Cost
	
	//Food
	public static double burger = 18.50;
	public static double pasta = 20.00;
	public static double taco = 25.00;
	
	//Drinks
	public static double cokeCan=13.50;
	public static double botCoke=15.00;
	public static double water=10.00;
	public static double pepsi=7.10;
	public static double Monstar=16.25;
	
	//Sides
	public static double chips=9.00;
	public static double salad=10.05;
	public static double onionRings=14.55;
	public static double breadSticks=5.30;
	
	
	
	
	static MainClass mc = new MainClass();
	
	
	public static void main(String[] args) {
		fullName = JOptionPane.showInputDialog(null,"Please Enter Your Full Name");
		contactDetails = Integer.valueOf(JOptionPane.showInputDialog(null,"Please Enter Your Contact Number"));
		mc.setFullname(fullName);
		mc.setContactNumber(contactDetails);
		System.out.println(mc.getFullname());
		System.out.println(mc.getContactNumber());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
