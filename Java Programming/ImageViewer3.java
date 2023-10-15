import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageViewer3 implements ActionListener {
    JFrame frame = new JFrame();
    JFileChooser fileChooser = new JFileChooser();
    JLabel picLabel = new JLabel("No Image Selected");

    public static void main(String[] args) {

        ImageViewer3 iv = new ImageViewer3();
        iv.run();
    }

    public void run() {
        frame.setResizable(false);
        fileChooser.setBounds(0, 0, 500, 450);
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);
        fileChooser.addActionListener(this);

        picLabel.setBounds(525, 25, 400, 400);
        picLabel.setHorizontalAlignment(JLabel.CENTER);

        frame.add(picLabel);
        frame.add(fileChooser);
        frame.setSize(1000, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent action) {
        if (action.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            try {
                picLabel.setText("");
                BufferedImage img = ImageIO.read(fileChooser.getSelectedFile());
                Image resizedImg = img.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH);
                picLabel.setIcon(new ImageIcon(resizedImg));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (action.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
            frame.setVisible(false);
            frame.dispose();
        }
    }
}
