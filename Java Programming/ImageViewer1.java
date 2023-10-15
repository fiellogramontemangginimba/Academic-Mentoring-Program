import javax.swing.JFrame;

public class ImageViewer1 {
    JFrame frame = new JFrame();

    public static void main(String[] args) {

        ImageViewer1 iv = new ImageViewer1();
        iv.run();
    }

    public void run() {

        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
}
