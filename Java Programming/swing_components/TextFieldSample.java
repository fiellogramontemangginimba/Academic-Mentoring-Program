package swing_components;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel greetingLabel = new JLabel();
        JTextField nameField = new JTextField();
        final String DEFAULT_TEXT = "Welcome! Please Enter Your Name.";

        greetingLabel.setBounds(0, 100, 500, 100);
        greetingLabel.setText(DEFAULT_TEXT);
        greetingLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(greetingLabel);

        nameField.setBounds(100, 250, 300, 50);
        nameField.addActionListener(e -> {
            greetingLabel.setText("Hello " + nameField.getText() + "!");
            nameField.setText("");
        });
        frame.add(nameField);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
