package model;

public class Supervisor {
	
	private String supervisorId;
	private String firstName;
	private String lastName;
	
	//Constructors
	
	public Supervisor() {
		this.supervisorId = "";
		this.firstName = "";
		this.lastName = "";		
	}
	
	public Supervisor(String id, String firstName, String lastName) {
		this.supervisorId = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//Getters and Setters
	
	public String getId() {
		return supervisorId;
	}

	public void setId(String id) {
		this.supervisorId = id;
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

	@Override
	public String toString() {
		return "Id: " + supervisorId + "First Name: " + firstName + "Last Name: " + lastName + "";
	}
}
