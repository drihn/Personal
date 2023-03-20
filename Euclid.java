package SS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class LOLOG extends JFrame implements ActionListener {
    private ArrayList<String> usernames;
    private ArrayList<String> passwords;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LOLOG() {
        super("Login System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the usernames and passwords
        usernames = new ArrayList<String>();
        passwords = new ArrayList<String>();
        usernames.add("Admin_01");
        passwords.add("AdminOne");
        usernames.add("Admin_02");
        passwords.add("AdminTwo");
        usernames.add("Admin_03");
        passwords.add("AdminThree");

        // Create the login form components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        // Set the layout and add the components
        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(usernameLabel);
        getContentPane().add(usernameField);
        getContentPane().add(passwordLabel);
        getContentPane().add(passwordField);
        getContentPane().add(loginButton);

        // Add the login button action listener
        loginButton.addActionListener(this);

        // Show the login form
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        boolean usernameFound = false;
        boolean passwordMatch = false;

        // Check if the username exists
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username)) {
                usernameFound = true;
                if (passwords.get(i).equals(password)) {
                    passwordMatch = true;
                    break;
                }
            }
        }

        // Show the appropriate message
        if (!usernameFound && !passwordMatch) {
            JOptionPane.showMessageDialog(this, "Incorrect Username and Password");
        } else if (!usernameFound) {
            JOptionPane.showMessageDialog(this, "Incorrect Username");
        } else if (!passwordMatch) {
            JOptionPane.showMessageDialog(this, "Incorrect Password");
        } else {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        }
    }

    public static void main(String[] args) {
        new LOLOG();
    }
}
