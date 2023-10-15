package swing_components;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();

        button.setBounds(0, 0, 100, 100);

        try {
            File imgFile = new File("swing_components/images/java.png");
            BufferedImage img = ImageIO.read(imgFile);
            Image resizedImg = img.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);

            ImageIcon resizedImgIcon = new ImageIcon(resizedImg);
            button.setIcon(resizedImgIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.add(button);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
