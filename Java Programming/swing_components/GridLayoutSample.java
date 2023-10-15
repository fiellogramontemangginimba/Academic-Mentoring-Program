package swing_components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GridLayout gridLayout = new GridLayout(3, 2);
        // basic container for components
        JPanel panel = new JPanel();

        JButton bt1 = new JButton("Button 1");
        JButton bt2 = new JButton("Button 2");
        JButton bt3 = new JButton("Button 3");
        JButton bt4 = new JButton("Button 4");
        JButton bt5 = new JButton("Button 5");

        panel.setLayout(gridLayout);
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        panel.add(bt5);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
