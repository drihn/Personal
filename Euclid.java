package ssss;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class sssa extends JFrame implements ActionListener {
    JLabel userLabel, passLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton, forgotButton;
    ArrayList<String> usernames;
    ArrayList<String> passwords;
    
    public sssa() {
        usernames = new ArrayList<String>();
        usernames.add("Admin_01");
        usernames.add("Admin_02");
        usernames.add("Admin_03");
        passwords = new ArrayList<String>();
        passwords.add("AdminOne");
        passwords.add("AdminTwo");
        passwords.add("AdminThree");
        
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 30);
        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 80, 30);
        userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);
        passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);
        loginButton = new JButton("Login");
        loginButton.setBounds(50, 150, 100, 30);
        loginButton.addActionListener(this);
        forgotButton = new JButton("Forgot Password");
        forgotButton.setBounds(200, 150, 150, 30);
        forgotButton.addActionListener(this);
        
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(loginButton);
        add(forgotButton);
        
        setSize(400, 250);
        setTitle("Login System");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = new String(passText.getPassword());
            int index = usernames.indexOf(username);
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Incorrect Username and Password");
            } else if (!passwords.get(index).equals(password)) {
                JOptionPane.showMessageDialog(this, "Incorrect Password");
            } else {
                JOptionPane.showMessageDialog(this, "Login successful");
            }
        } else if (e.getSource() == forgotButton) {
            String username = JOptionPane.showInputDialog(this, "Enter username:");
            int index = usernames.indexOf(username);
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "Incorrect Username");
            } else {
                JOptionPane.showMessageDialog(this, "Your password is: " + passwords.get(index));
            }
        }
    }
    
    public static void main(String[] args) {
        sssa loginSystem = new sssa();
    }
}
