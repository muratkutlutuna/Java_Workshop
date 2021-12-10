package _14_Encapsulation.Q02;

public class User {
	private int id;
	private String userName;
	private String password;
	private boolean active;
	private boolean signedIn;
	
	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName (String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword (String password) {
		this.password=password;
	}
	
	public boolean getActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active=active;
	}
	
	public boolean getSignedIn() {
		return signedIn;
	}
	
	public void setSignedIn(boolean signedIn) {
		this.signedIn=signedIn;
	}
	
	User(int id, String userName, String password, boolean active, boolean signedIn){


		
	}
}
