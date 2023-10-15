package swing_components;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckboxSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("OFF");
        JCheckBox checkBox = new JCheckBox();

        label.setBounds(0, 150, 500, 50);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

        checkBox.setBounds(215, 200, 100, 50);
        checkBox.setText("Turn on");
        checkBox.addActionListener(e -> {
            if (checkBox.isSelected()) {
                label.setText("ON");
            } else {
                label.setText("OFF");
            }
        });
        frame.add(checkBox);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
