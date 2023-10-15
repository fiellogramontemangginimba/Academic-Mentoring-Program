package swing_components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        BorderLayout borderLayout = new BorderLayout();
        // basic container for components
        JPanel panel = new JPanel();

        JButton bt1 = new JButton("NORTH");
        JButton bt2 = new JButton("SOUTH");
        JButton bt3 = new JButton("WEST");
        JButton bt4 = new JButton("EAST");
        JButton bt5 = new JButton("CENTER");

        panel.setLayout(borderLayout);
        panel.add(bt1, BorderLayout.NORTH);
        panel.add(bt2, BorderLayout.SOUTH);
        panel.add(bt3, BorderLayout.WEST);
        panel.add(bt4, BorderLayout.EAST);
        panel.add(bt5, BorderLayout.CENTER);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
