package ProjectHospital;

import java.util.Arrays;
import java.util.Scanner;

public class HospitalRunner {

	private static Hospital hospital1 = new Hospital();
	String title;
	String patientStatus;
	static int idx;
	static boolean control;
	static String containerStr;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=== Welcome to our Hospital ===");
		do {
			control = true;
			System.out.println(
					"Please enter a number given below\n1- Find Doctor\n2- Find Clinic\n3- Find Patient\n4- Exit");
			int input = scan.nextInt();
			scan.nextLine();
			switch (input) {
			case 1:
				System.out.println(Arrays.toString(hospital1.titels));
				System.out.println("Please enter doctor's title");
				containerStr = scan.nextLine();
				System.out.println(findDoctor(containerStr).toString());
				break;
			case 2:
				System.out.println(Arrays.toString(hospital1.status));
				System.out.println("Please enter your problem");
				containerStr = scan.nextLine();
				System.out.println(doctorTitle(containerStr));
				break;
			case 3:
				System.out.println("Please enter patient's problem");
				containerStr = scan.nextLine();
				System.out.println(findPatient(containerStr).getPatientStatus().toString());
				break;
			case 4:
				System.out.println("Keep yourself healthy! Goodbye!");
				control = false;
				break;
			default:
				break;
			}
		} while (control);
		scan.close();
	}

	public static Doctor findDoctor(String title) {
		idx = (-1);
		for (int i = 0; i < hospital1.titels.length; i++) {
			if (hospital1.titels[i].equals(title))
				idx = i;
		}
		Doctor doctor = new Doctor(hospital1.doctorNames[idx], hospital1.doctorSurnames[idx], title);
		return doctor;
	}

	public static String doctorTitle(String actualStatus) {
		containerStr = "Wrong Title!!";
		idx = (-1);
		for (int i = 0; i < hospital1.status.length; i++) {
			if (hospital1.status[i].equals(actualStatus))
				idx = i;
		}
		if (idx > 0)
			return hospital1.titels[idx];
		else
			return containerStr;
	}

	public static Status findPatientStatus(String actualStatus) {
		idx = (-1);
		for (int i = 0; i < hospital1.status.length; i++) {
			if (hospital1.status[i].equals(actualStatus))
				idx = i;
		}
		switch (idx) {
		case 0:
			control = false;
			break;
		case 1:
			control = false;
			break;
		case 2:
			control = false;
			break;
		case 3:
			control = false;
			break;
		case 4:
			control = true;
			break;
		case 5:
			control = true;
			break;
		default:
			System.out.println("It is not available");
			break;
		}
		Status patientStatus = new Status(actualStatus, control);
		return patientStatus;
	}

	public static Patient findPatient(String actualStatus) {
		idx = (-1);
		for (int i = 0; i < hospital1.status.length; i++) {
			if (hospital1.status[i].equals(actualStatus))
				idx = i;
		}
		Status status = findPatientStatus(actualStatus);
		Patient patient = new Patient(hospital1.patientNames[idx], hospital1.patientSurnames[idx],
				hospital1.patientID[idx], status);
		return patient;
	}

}
