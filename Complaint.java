package model;

public class Complaint {
	private String ComplaintID;
	private String category;
	
	//Primary Constructor
    public Complaint(String ComplaintID, String category) {
        this.ComplaintID = ComplaintID;
        this.category = category;
    }
    
    //Primary Constructor2
    public Complaint(String category) {
        this.category = category;
    }
    
  //Default Constructor
    public Complaint() {
        this.ComplaintID = " ";
        this.category = " ";
    }

    //Setters and Getters
	public String getComplaintID() {
		return ComplaintID;
	}

	public void setComplaintID(String complaintID) {
		ComplaintID = complaintID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	// toString method
	@Override
	public String toString() {
		return "Complaints \nComplaint ID#: " + ComplaintID + "" +
			   "\ncategory=" + category + "";
	}
}
