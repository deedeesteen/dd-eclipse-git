package model;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import server.UserType;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private UserType userType;
	
	//Primary Constructor
	public User(String id, String firstName, String lastName, UserType userType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
	}

	//Constructor for Service
	public User(String id) {
		this.id = id;
	}
	
	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
}
