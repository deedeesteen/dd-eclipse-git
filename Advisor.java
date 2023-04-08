package model;

public class Advisor {
	
	private String advisorId;
	private String firstName;
	private String lastName;
	private String supervisorId;
	
	public Advisor() {
		this.advisorId = "";
		this.firstName = "";
		this.lastName = "";
		this.supervisorId = "";
	}
	
	public Advisor(String id, String firstName, String lastName, String supervisorId) {
		this.advisorId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.supervisorId = supervisorId;
	}
	
	//Getters and Setters

	public String getId() {
		return advisorId;
	}

	public void setId(String id) {
		this.advisorId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSupId() {
		return supervisorId;
	}

	public void setSupId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	@Override
	public String toString() {
		return "Id: " + advisorId + "First Name: " + firstName + "Last Name: " + lastName + "Supervisor: " + supervisorId + "";
	}
}
