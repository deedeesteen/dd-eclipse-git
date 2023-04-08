package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    private JLabel passwordLabel, userLabel;
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;

    public Login() {

        setTitle("Student Login");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel(new GridLayout(2, 2, 10, 10));
        JPanel panel2 = new JPanel();
        
        
        userLabel = new JLabel("Username");
        //userLabel.setBounds(100, 8, 70, 20);
        panel1.add(userLabel);

        username = new JTextField();
        //username.setBounds(100, 27, 300, 28);
        panel1.add(username);

        passwordLabel = new JLabel("Password");
       // passwordLabel.setBounds(200, 8, 70, 20);
        panel1.add(passwordLabel);

        password = new JPasswordField();
        //password.setBounds(100, 27, 300, 28);
        panel1.add(password);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 110, 90, 25);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLACK);
        loginButton.addActionListener(this); 
        panel2.add(loginButton);

        
        panel.add(panel1, BorderLayout.CENTER);
        panel.add(panel2, BorderLayout.SOUTH);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Username = username.getText();
        String Password = String.valueOf(password.getPassword());

        if (Username.equals("Student") && Password.equals("12345"))
            JOptionPane.showMessageDialog(null, "Login Successful");
        else
            JOptionPane.showMessageDialog(null, "Username or Password is incorrect ");
    }

    public static void main(String[] args) {
        Login signin = new Login();
        signin.setVisible(true);
    }
}
