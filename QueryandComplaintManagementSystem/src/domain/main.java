package domain;


import server.Server;
import view.AdvisorDashBoard;
import view.LiveChat;
import view.LoginView;
import view.StudentDashboard;
import view.SupervisorDashboard;

public class main {

	public static void main(String[] args) {
		new StudentDashboard();
		new SupervisorDashboard();
		//new AdvisorDashBoard();
		 //LiveChat chat = new LiveChat();
		 LoginView slogin = new LoginView();
	}

}
