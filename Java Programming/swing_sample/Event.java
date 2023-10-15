package swing_sample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Event {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        JLabel stateLabel = new JLabel();

        stateLabel.setText("OFF");
        stateLabel.setHorizontalAlignment(JLabel.CENTER);
        stateLabel.setBounds(100, 100, 100, 100);
        frame.add(stateLabel);

        button.setText("Switch");
        button.setBounds(100, 200, 100, 30);
        button.addActionListener(e -> {
            if (stateLabel.getText().equals("OFF")) {
                stateLabel.setText("ON");
            } else {
                stateLabel.setText("OFF");
            }
        });
        frame.add(button);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
