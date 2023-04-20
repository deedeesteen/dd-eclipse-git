package model;

import server.UserType;

public class User {
	private String firstName;
	private String lastName;
	private String id;
	private UserType userType;
	
	public User(String firstName, String lastName, String id, UserType userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.userType = userType;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
}
