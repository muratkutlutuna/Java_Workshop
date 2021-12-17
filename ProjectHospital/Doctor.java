package ProjectHospital;

public class Doctor {
	
	private String name;
	private String surname;
	private String title;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String surname, String title) {
		super();
		this.name = name;
		this.surname = surname;
		this.title = title;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", surname=" + surname + ", title=" + title + "]";
	}
	
	
}
