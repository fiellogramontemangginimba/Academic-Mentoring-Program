import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageViewer2 {
    JFrame frame = new JFrame();
    JFileChooser fileChooser = new JFileChooser();

    public static void main(String[] args) {

        ImageViewer2 iv = new ImageViewer2();
        iv.run();
    }

    public void run() {
        fileChooser.setBounds(0, 0, 500, 450);
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);

        frame.add(fileChooser);
        frame.setSize(1000, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
