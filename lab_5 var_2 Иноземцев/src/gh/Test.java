package gh;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class Test {

    static {
        String[] a = {"C:\\Users\\Nik\\Desktop\\lab_5 var_2 Иноземцев\\out\\production\\lab_5\\gh\\image.png" , ""};
       Test.main(a);
    }
    public static void main(String[] args) {
        Gui a = new Gui(args[0]);
    }

}

class Gui extends JFrame {
    private JLabel label;

    public Gui(String path) {
        super();
        setTitle("Test");

        this.setSize(new Dimension(400, 400));

        label = new JLabel();
        this.setMinimumSize(new Dimension(400, 400));

        this.add(label);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addComponentListener(new ComponentAdapter() {
                                 public void componentResized(ComponentEvent evt) {


                                     try {
                                         File file = new File(path);
                                         BufferedImage kartinka = ImageIO.read(file);
                                         ImageIcon ico = new ImageIcon(ScaledImage(kartinka, label.getWidth(), label.getHeight()));
                                         label.setIcon(ico);
                                     } catch (Exception ex) {
                                         JOptionPane.showMessageDialog(null, ex);
                                     }
                                 }
                             }
        );


    }
    private Image ScaledImage(Image img, int w, int h) {
        BufferedImage resizedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImage.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();


        return resizedImage;
    }
}
