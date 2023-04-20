package model;

public class Service {
	private String serviceID;
	private  String studentID;
	private String advisorId;
	private Date date_opened;
	private Date date_resolved;
	
	
	public Service() {
		super();
		this.serviceID = "";
		this.studentID = "";
		this.advisorId = "";
		this.date_opened = new Date(1,1,2023);
		this.date_resolved = new Date(1,1,2023);
	}
	
	public Service(String serviceID, String studentID, String advisorId, Date date_opened, Date date_resolved) {
		super();
		this.serviceID = serviceID;
		this.studentID = studentID;
		this.advisorId = advisorId;
		this.date_opened = date_opened;
		this.date_resolved = date_resolved;
	}
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getAdvisorId() {
		return advisorId;
	}
	public void setAdvisorId(String advisorId) {
		this.advisorId = advisorId;
	}
	public Date getDate_opened() {
		return date_opened;
	}
	public void setDate_opened(Date date_opened) {
		this.date_opened = date_opened;
	}
	public Date getDate_resolved() {
		return date_resolved;
	}
	public void setDate_resolved(Date date_resolved) {
		this.date_resolved = date_resolved;
	}
	
	
}
