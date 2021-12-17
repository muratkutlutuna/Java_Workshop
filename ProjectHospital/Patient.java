package ProjectHospital;

public class Patient extends Status{

	private String name;
	private String surname;
	private int patientId;
	private Status patientStatus;
	
	public Patient() {
		
	}
	
	public Patient(String name, String surname, int patientId, Status patientStatus) {
		super();
		this.name = name;
		this.surname = surname;
		this.patientId = patientId;
		this.patientStatus = patientStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public Status getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(Status patientStatus) {
		this.patientStatus = patientStatus;
	}
	
	
}
