package view;

/*DEVELOPERS:
 * Dhana Steen, ID# 1803365
 * Sassania Hibbert, ID# 1901202
 */
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class SupervisorDashboard extends JFrame implements ActionListener{
	
	private JLabel titleLabel, serviceLabel, resolvedLabel, outstandingLabel, categoryLabel, detailsLabel;
    private JComboBox<String> serviceComboBox, categoryComboBox;
    private JTextField resolvedTextField, outstandingTextField;
    private JTextArea detailsTextArea;
    private JButton assignBttn, viewBttn;

    public SupervisorDashboard() {
        // Set up the main frame
        setTitle("Student Services Supervisor Dashboard");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panels
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel servicePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel assignPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel viewPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // Add components to the title panel
        titleLabel = new JLabel("Dashboard");
        titlePanel.add(titleLabel);

        // Add components to the service panel
        serviceLabel = new JLabel("Service:");
        servicePanel.add(serviceLabel);

        String[] serviceOptions = {"Grade Review", "Missing Grades", "Test Resit","Course Resit","Advice"}; 
        serviceComboBox = new JComboBox<>(serviceOptions);
        servicePanel.add(serviceComboBox);

        resolvedLabel = new JLabel("Resolved:");
        servicePanel.add(resolvedLabel);

        resolvedTextField = new JTextField(5);
        servicePanel.add(resolvedTextField);

        outstandingLabel = new JLabel("Outstanding:");
        servicePanel.add(outstandingLabel);

        outstandingTextField = new JTextField(5);
        servicePanel.add(outstandingTextField);

        // Add components to the assign panel
        assignBttn = new JButton("Assign");
        assignBttn.addActionListener(this);
        assignPanel.add(assignBttn);

        // Add components to the view panel
        categoryLabel = new JLabel("Category:");
        viewPanel.add(categoryLabel);

        String[] categoryOptions = {"Grades", "Resit", "Advice"}; 
        categoryComboBox = new JComboBox<>(categoryOptions);
        viewPanel.add(categoryComboBox);

        viewBttn = new JButton("View");
        viewBttn.addActionListener(this);
        viewPanel.add(viewBttn);

        // Add components to the status panel
        detailsLabel = new JLabel("Details:");
        statusPanel.add(detailsLabel);

        detailsTextArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(detailsTextArea);
        statusPanel.add(scrollPane);
     // Add all panels to the main frame
        setLayout(new GridLayout(5, 1));
        add(titlePanel);
        add(servicePanel);
        add(assignPanel);
        add(viewPanel);
        add(statusPanel);

        // Show the GUI
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == assignBttn) {
            // Perform complaint or query assignment here
        } else if (e.getSource() == viewBttn) {
            String category = (String) categoryComboBox.getSelectedItem();
            // Retrieve all complaints or queries for the selected category and display them in the details text area
        }
    }

   }
