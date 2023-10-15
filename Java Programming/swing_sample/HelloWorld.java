package swing_sample;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel text = new JLabel();

        text.setText("Hello World!");
        text.setHorizontalAlignment(JLabel.CENTER);

        frame.add(text);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
