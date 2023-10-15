package swing_components;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageIconSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon javaIcon = new ImageIcon("swing_components/images/java.png");
        label.setIcon(javaIcon);

        frame.add(label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
