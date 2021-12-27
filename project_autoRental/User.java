package project_autoRental;

import java.time.LocalDate;

public class User {

	private String pickUpCity;
	private LocalDate pickUpDate;
	private double pickUpTime;
	private String deliverDay;
	private double deliverHour;
	
	public User(){
		
	}
	
	public User(String pickUpCity, LocalDate pickUpDate, double pickUpTime, String deliverDay, double deliverHour) {
		super();
		this.pickUpCity = pickUpCity;
		this.pickUpDate = pickUpDate;
		this.pickUpTime = pickUpTime;
		this.deliverDay = deliverDay;
		this.deliverHour = deliverHour;
	}
	

}
