package model;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.io.Serializable;

public class Service extends User implements Serializable {
	private String serviceID;
	private Date date_opened;
	private Date date_resolved;
	
	public Service(String id){
		super(id);
	}
	
	//Default Constructor
	public Service() {
		this.serviceID = "";
		this.id = "";
		this.date_opened = new Date(1,1,2023);
		this.date_resolved = new Date(1,1,2023);
	}
	
	//Primary Constructor
	public Service(String serviceID, String id, Date date_opened, Date date_resolved) {
		this.serviceID = serviceID;
		this.id = id;
		this.date_opened = date_opened;
		this.date_resolved = date_resolved;
	}
	public String getServiceID() {
		return serviceID;
	}
	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
