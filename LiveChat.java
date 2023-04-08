package view ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LiveChat extends JFrame implements ActionListener {

    private JTextField textField;
    private JTextArea chatArea;
    private JLabel statusLabel;
    private String username = "Me";
    private boolean isOnline = false;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public LiveChat() {

        // Set up the JFrame
        super("Live Chat");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the chat area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        // Create the input field and button
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        textField = new JTextField();
        inputPanel.add(textField, BorderLayout.CENTER);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        // Create the status label
        statusLabel = new JLabel("Offline");
        statusLabel.setForeground(Color.RED);
        add(statusLabel, BorderLayout.NORTH);

        // Show the JFrame
        setVisible(true);

        // Connect to the server
        try {
            socket = new Socket("localhost",3307 );
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            isOnline = true;
            statusLabel.setText("Online");
            statusLabel.setForeground(Color.GREEN);
            receiveMessages();
        } catch (IOException e) {
            // Failed to connect to server
            chatArea.append("System: Failed to connect to server.\n");
        }

    }

    // Event listener for the send button
    public void actionPerformed(ActionEvent e) {
        String message = textField.getText().trim();
        if (message.equals("")) {
            return;
        }
        if (!isOnline) {
            chatArea.append("System: You can't send messages while offline.\n");
            return;
        }
        try {
            // Send message to server
            out.writeUTF(username + ": " + message);
            textField.setText("");
        } catch (IOException ex) {
            // Failed to send message
            chatArea.append("System: Failed to send message.\n");
        }
    }

    // Method to receive messages from the server
    private void receiveMessages() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (isOnline) {
                    try {
                        // Receive message from the server
                        String message = in.readUTF();
                        // Display message in chat area
                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                chatArea.append(message + "\n");
                            }
                        });
                    } catch (IOException e) {
                        // Lost connection to the server
                        isOnline = false;
                        statusLabel.setText("Offline");
                        statusLabel.setForeground(Color.RED);
                        chatArea.append("System: Lost connection to server.\n");
                        break;
                    }
                }
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        LiveChat chat = new LiveChat();
    }

}

