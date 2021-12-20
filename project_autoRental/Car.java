package project_autoRental;

public class Car {

	private String brand;
	private String model;
	private String fuelType;
	private String gear;
	private double daylyCharge;
	
	public Car() {
		
	}
	
	public Car(String brand, String model, String fuelType, String gear, double daylyCharge) {
		super();
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.gear = gear;
		this.daylyCharge = daylyCharge;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", fuelType=" + fuelType + ", gear=" + gear
				+ ", daylyCharge=" + daylyCharge + "]";
	}
	
	
}
