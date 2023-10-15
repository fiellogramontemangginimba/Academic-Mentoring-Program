package swing_components;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        FlowLayout flowLayout = new FlowLayout();
        // basic container for components
        JPanel panel = new JPanel();

        JButton bt1 = new JButton("Button 1");
        JButton bt2 = new JButton("Button 2");
        JButton bt3 = new JButton("Button 3");

        panel.setLayout(flowLayout);
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}