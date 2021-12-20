package project_autoRental;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	static List<Car>carList = new ArrayList<>();
	static List<User>userList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		defaultCars();
		menu();
	}


	private static void menu() {
		// TODO Auto-generated method stub
		
	}


	private static void defaultCars() {
		Car c1 = new Car("Opel","astra","diesel","manuel",120.0);
		carList.add(c1);
		c1 = new Car("toyota","corolla","diesel","manuel",100.0);
		carList.add(c1);
		c1 = new Car("volvo","s60","oil","outo",140.0);
		carList.add(c1);	
		carList.stream();
	}

	
}
