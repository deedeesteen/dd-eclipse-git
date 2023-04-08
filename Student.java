package model;

public class Student {
	
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String telephone;
	
	//Constructors
	
	public Student() {
		this.studentId = "";
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		this.telephone = "";		
	}
	
	public Student(String id, String firstName, String lastName, String email, String telephone) {
		this.studentId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.telephone = telephone;
	}
	
	//Getters and Setters

	public String getId() {
		return studentId;
	}

	public void setId(String id) {
		this.studentId = id;
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

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Id: " + studentId + "First Name: " + firstName + "Last Name: " + lastName + "Email: " + email
				+ "Contact Number: " + telephone + "";
	}	
	

}
