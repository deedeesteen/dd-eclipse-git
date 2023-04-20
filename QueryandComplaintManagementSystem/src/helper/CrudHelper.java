package helper;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JOptionPane;
import java.io.Serializable;

import server.UserType;

public class CrudHelper {
	private Statement stmt;
	private ResultSet result;
	
	public static Connection dbConn;
	public static Connection getDatabaseConnection() {
		if(dbConn == null) {
			String url ="jdbc:mysql://localhost:3307/studentservices";
			try {
				//get connection to localhost
				dbConn = DriverManager.getConnection(url, "root", "usbw");
				JOptionPane.showMessageDialog(null,"Connected to Database", 
						"Connection Status",JOptionPane.INFORMATION_MESSAGE);
				}catch (Exception e) {
					System.err.println("Connection Error" + e.getMessage());
			}
		}else { 
			JOptionPane.showMessageDialog(null,"Already Connected to Database", 
					"Connection Status",JOptionPane.INFORMATION_MESSAGE);
		}
		
		return dbConn ;
	}

	public CrudHelper() {
		dbConn = getDatabaseConnection();
	}
	
	public void createUser(String id, String firstName, String lastName, UserType userType) {
		String insertSql = "INSERT INTO studentservices.User (id, firstName,lastName, userType)" 
				+"VALUES('"+id+ "', '" +firstName+ "', '" +lastName+ "', '" +userType+ "')";
		
		try {
			stmt = dbConn.createStatement();
			int inserted = stmt.executeUpdate(insertSql);
			if(inserted == 1) {
				JOptionPane.showMessageDialog(null,"Record Inserted", 
						"Record Insertion Status",JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void getUser(String id) {
		String selectSQL = "SELECT * FROM studentservices.User WHERE id = '" +id+ "'";
		try {
			stmt = dbConn.createStatement();
			result = stmt.executeQuery(selectSQL);
			while(result.next()) {
				 String  firstName = result.getString("firstName");
				 String  lastName = result.getString("lastName");
				 String  userType = result.getString("userType");
				 System.out.println("Id: " + id +"\nName: "+ firstName +" "+ lastName +"\nUserType: "+ userType);	 	 
			}
		}catch(SQLException e) {
			System.err.println("SQL EXCEPTION:" +e.getMessage());
			
		}catch(Exception e) {
			
		}
	}
	
	public void createService(String serviceID, String id, Date date_opened, Date date_resolved) {
		String insertCSSql = "INSERT INTO studentservices.Service (serviceID, id, date_opened, date_resolved)" 
				+"VALUES('" +serviceID+ "', '" +id+ "', '" +date_opened+ "', '" +date_resolved+ "')";
		
		try {
			stmt = dbConn.createStatement();
			int inserted = stmt.executeUpdate(insertCSSql);
			if(inserted == 1) {
				JOptionPane.showMessageDialog(null,"Record Inserted", 
						"Record Insertion Status",JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void getService(String serviceID, String id, Date date_opened, Date date_resolved) {
		String selectServSQL = "SELECT * FROM studentservices.Service WHERE id = '" +id+ "'";
		try {
			stmt = dbConn.createStatement();
			result = stmt.executeQuery(selectServSQL);
			while(result.next()) {
				 String  serviceID = result.getString("serviceID");
				 String  id = result.getString("id");
				 Date date_opened = result.getDate("date_opened");
				 Date date_resolved = result.getDate("date_resolved");
				 System.out.println("Service ID: " + serviceID + "\nId: " + id + "\nDate Opened: " + date_opened + "\nDate Resolved: "+ date_resolved);	 	 
			}
		}catch(SQLException e) {
			System.err.println("SQL EXCEPTION:" +e.getMessage());
			
		}catch(Exception e) {
			
		}
	}
	
	public void createComplaint(String ComplaintID, String category) {
		String insertCompSql = "INSERT INTO studentservices.Complaint (ComplaintID, category)" 
				+"VALUES('" +ComplaintID+ "', '" +category+ "')";
		
		try {
			stmt = dbConn.createStatement();
			int inserted = stmt.executeUpdate(insertCompSql);
			if(inserted == 1) {
				JOptionPane.showMessageDialog(null,"Record Inserted", 
						"Record Insertion Status",JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}
