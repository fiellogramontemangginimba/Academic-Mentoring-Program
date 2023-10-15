package swing_components;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageSimple {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();

        button.setBounds(0, 0, 100, 100);

        ImageIcon icon = new ImageIcon("swing_components/images/java.png");
        button.setIcon(icon);

        frame.add(button);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
