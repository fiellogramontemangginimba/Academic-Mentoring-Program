package swing_components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordFieldSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel greetingLabel = new JLabel();
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        final String DEFAULT_TEXT = "Welcome! Please Enter Username and Password.";

        greetingLabel.setBounds(0, 50, 500, 100);
        greetingLabel.setText(DEFAULT_TEXT);
        greetingLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(greetingLabel);

        usernameField.setBounds(100, 150, 300, 50);
        frame.add(usernameField);

        passwordField.setBounds(100, 210, 300, 50);
        frame.add(passwordField);

        loginButton.setBounds(100, 270, 300, 50);
        loginButton.addActionListener(e -> {
            if (usernameField.getText().equals("MyUser") && passwordField.getText().equals("MyPassw0rd!")) {
                greetingLabel.setText("Access Granted.");
            } else {
                greetingLabel.setText("Access Denied.");
            }
        });
        frame.add(loginButton);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
