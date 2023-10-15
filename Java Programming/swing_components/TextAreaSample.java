package swing_components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaSample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel textLabel = new JLabel();
        JTextArea messageField = new JTextArea();
        JButton button = new JButton("Submit");
        final String DEFAULT_TEXT = "Welcome! Please Enter Your Message.";

        textLabel.setBounds(0, 0, 500, 150);
        textLabel.setText(DEFAULT_TEXT);
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(textLabel);

        messageField.setBounds(100, 200, 300, 150);
        messageField.setLineWrap(true);
        frame.add(messageField);

        button.setBounds(200, 400, 100, 50);
        // <html>...</html> wraps text
        button.addActionListener(e -> {
            textLabel.setText("<html>Your message is: " + messageField.getText() + "</html>");
        });
        frame.add(button);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}