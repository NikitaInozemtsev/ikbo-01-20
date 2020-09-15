package gh;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test {
    public static void main(String[] args) {
        Gui a = new Gui();
    }
}

class Gui extends JFrame {
    private JPanel panel;
    private JButton buttonMadrid;
    private JButton buttonMilan;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private int md = 0;
    private int ml = 0;

    public Gui() {
        super();
        setupUi();
        this.setTitle("Match");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private void setupUi(){

        buttonMilan = new JButton("AC Milan");
        buttonMadrid = new JButton("Real Madrid");
        label1 = new JLabel("Result: " + ml + "X" + md, SwingConstants.CENTER);
        label2 = new JLabel("Last scorer: N/A", SwingConstants.CENTER);
        label3 = new JLabel("Winner: Draw", SwingConstants.CENTER);
        this.setSize(new Dimension(300, 300));
        this.setMinimumSize(new Dimension(300, 300));
        this.setVisible(true);

        this.add(buttonMadrid, BorderLayout.EAST);
        this.add(buttonMilan, BorderLayout.WEST);
        this.add(label1, BorderLayout.NORTH);
        this.add(label2, BorderLayout.SOUTH);
        this.add(label3, BorderLayout.CENTER);

        buttonMadrid.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                md++;
                label1.setText("Result: " + ml + "X" + md);
                label2.setText("Last scorer: Real Madrid");
                if (md > ml) {
                    label3.setText("Winner: Real Madrid");
                }
                else if (md < ml) {
                    label3.setText("Winner: AC Milan");
                }
                else {
                    label3.setText("Winner: Draw");
                }
            }
        });
        buttonMilan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                ml++;
                label1.setText("Result: " + ml + "X" + md);
                label2.setText("Last scorer: AC Milan");
                if (md > ml) {
                    label3.setText("Winner: Real Madrid");
                }
                else if (md < ml) {
                    label3.setText("Winner: AC Milan");
                }
                else {
                    label3.setText("Winner: Draw");
                }
            }
        });
    }
}
