package Midterm;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Login_GUI_With_FileHandling extends JFrame {

    private JLabel labelUsername;
    private JLabel labelPassword;
    private JTextField textUsername;
    private JPasswordField textPassword;
    private JButton buttonLogin;

    public Login_GUI_With_FileHandling() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        labelUsername = new JLabel("Username:");
        labelUsername.setBounds(20, 20, 80, 25);
        add(labelUsername);

        labelPassword = new JLabel("Password:");
        labelPassword.setBounds(20, 60, 80, 25);
        add(labelPassword);

        textUsername = new JTextField();
        textUsername.setBounds(100, 20, 165, 25);
        add(textUsername);

        textPassword = new JPasswordField();
        textPassword.setBounds(100, 60, 165, 25);
        add(textPassword);

        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(100, 100, 80, 25);
        add(buttonLogin);

        // Event Listener for Login Button
        buttonLogin.addActionListener((ActionEvent e) -> {
            performLogin();
        });
    }

    private void performLogin() {
        String username = textUsername.getText();
        String password = new String(textPassword.getPassword());

        boolean success = false;

        try {
            try ( // Adjust the file path accordingly
                    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GUI.text.txt"))) {
                String line;
                
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String fileUsername = parts[0].trim();
                        String filePassword = parts[1].trim();
                        
                        if (username.equals(fileUsername) && password.equals(filePassword)) {
                            success = true;
                            break;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading users file!");
        }

        if (success) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
            textUsername.setText("");
            textPassword.setText("");
        }
    }

    public static void main(String[] args) {
        Login_GUI_With_FileHandling form = new Login_GUI_With_FileHandling();
        form.setVisible(true);
        form.setLocationRelativeTo(null); // Center the window
    }
}