package server;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.io.Serializable;

public class Login implements Serializable{
	
	private String id;
	private String password;
	private UserType userType;
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + ", userType=" + userType + "]";
	}
	
}
