package gh;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test {
    public static void main(String[] args) {
        Gui a = new Gui();
    }
}

class Gui extends JFrame {
    private JLabel labelCenter;
    private JLabel labelWest;
    private JLabel labelEast;
    private JLabel labelNorth;
    private JLabel labelSouth;

    public Gui() {
        super();
        this.setMinimumSize(new Dimension(400, 400));
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        labelCenter = new JLabel("Center", SwingConstants.CENTER);
        this.add(labelCenter, BorderLayout.CENTER);

        labelWest = new JLabel("West");
        this.add(labelWest, BorderLayout.WEST);

        labelEast = new JLabel("East");
        this.add(labelEast, BorderLayout.EAST);

        labelNorth = new JLabel("North", SwingConstants.CENTER);
        this.add(labelNorth, BorderLayout.NORTH);

        labelSouth = new JLabel("South", SwingConstants.CENTER);
        this.add(labelSouth, BorderLayout.SOUTH);

        labelCenter.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(Gui.this,"Добро пожаловать в ");
            }
        });
        labelWest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(Gui.this,"Добро пожаловать в Джидда");
            }
        });
        labelEast.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(Gui.this, "Добро пожаловать в Дахране");
            }
        });
        labelNorth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(Gui.this, "Добро пожаловать в");
            }
        });
        labelSouth.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(Gui.this, "Добро пожаловать Абха");
            }
        });

    }

}
