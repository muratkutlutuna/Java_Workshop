package ProjectHospital;

public class Status  {
	private String actualStatus;
	private boolean urgency;
	
	public String getActualStatus() {
		return actualStatus;
	}
	public void setActualStatus(String actualStatus) {
		this.actualStatus = actualStatus;
	}
	public boolean isUrgency() {
		return urgency;
	}
	public void setUrgency(boolean urgency) {
		this.urgency = urgency;
	}
	public Status(String actualStatus, boolean urgency) {
		super();
		this.actualStatus = actualStatus;
		this.urgency = urgency;
	}
	public Status() {
		
	}
	@Override
	public String toString() {
		return "Status [actualStatus=" + actualStatus + ", urgency=" + (urgency==true?"Urgent":"not Urgent") + "]";
	}
	
	
	
	
}
