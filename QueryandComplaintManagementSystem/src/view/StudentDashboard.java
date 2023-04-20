package view;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class StudentDashboard extends JFrame {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public StudentDashboard() {
        // Set up the main frame
        setTitle("Student Dashboard");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the panels
        JPanel servicesPanel = new JPanel(new GridLayout(3, 2));
        JPanel complaintsPanel = new JPanel(new GridLayout(2, 1));
        JPanel detailsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // Add components to the services panel
        JLabel servicesLabel = new JLabel("Services");
        servicesPanel.add(servicesLabel);
        
        JLabel resolvedLabel = new JLabel("Resolved");
        servicesPanel.add(resolvedLabel);
        
        JLabel outstandingLabel = new JLabel("Outstanding");
        servicesPanel.add(outstandingLabel);
        
        JLabel queryLabel = new JLabel("Queries");
        servicesPanel.add(queryLabel);
        
        JLabel resolvedQueries = new JLabel("10");
        servicesPanel.add(resolvedQueries);
        
        JLabel outstandingQueries = new JLabel("5");
        servicesPanel.add(outstandingQueries);
        
        // Add components to the complaints panel
        JLabel complaintsLabel = new JLabel("Complaints/Queries by Category");
        complaintsPanel.add(complaintsLabel);
        
        JTextArea complaintsArea = new JTextArea();
        JScrollPane complaintsScrollPane = new JScrollPane(complaintsArea);
        complaintsPanel.add(complaintsScrollPane);
        
        // Add components to the details panel
        JLabel detailsLabel = new JLabel("Complaint/Query Details:");
        detailsPanel.add(detailsLabel);
        
        JTextArea detailsArea = new JTextArea(10, 50);
        JScrollPane detailsScrollPane = new JScrollPane(detailsArea);
        detailsPanel.add(detailsScrollPane);
        
        // Add all panels to the main frame
        setLayout(new BorderLayout());
        add(servicesPanel, BorderLayout.NORTH);
        add(complaintsPanel, BorderLayout.CENTER);
        add(detailsPanel, BorderLayout.SOUTH);
        
        // Show the GUI
        setVisible(true);
		}
}
